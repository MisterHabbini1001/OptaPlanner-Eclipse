/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.optaplanner.examples.taskassigning.domain;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.optaplanner.examples.common.swingui.components.Labeled;

@XStreamAlias("TaEmployee")
public class Employee extends TaskOrEmployee implements Labeled 
{
    private String fullName;
    private double latitude;
    private double longitude;
    private Set<Skill> skillSet;
    private Set<Capacity> capacitySet;//habbo+-
    private Map<Customer, Affinity> affinityMap;

    public Employee() 
    {
    }

    public Employee(long id, String fullName, double latitude, double longitude) 
    {
        super(id);
        this.fullName = fullName;
        this.latitude = latitude;
        this.longitude = longitude;
        skillSet = new LinkedHashSet<>();
        capacitySet = new LinkedHashSet<>();//habbo+-
        affinityMap = new LinkedHashMap<>();
    }

    public String getFullName() 
    {
        return fullName;
    }

    public void setFullName(String fullName) 
    {
        this.fullName = fullName;
    }
    
    public void setLatitude(double latitude) 
    {
    	this.latitude = latitude;
    }

    public void setLongitude(double longitude) 
    {
    	this.longitude = longitude;
    }
    
    public Set<Skill> getSkillSet() 
    {
        return skillSet;
    }

    public void setSkillSet(Set<Skill> skillSet) 
    {
        this.skillSet = skillSet;
    }

    //habbo+
    public Set<Capacity> getCapacitySet() 
    {
        return capacitySet;
    }

    public void setCapacitySet(Set<Capacity> capacitySet) 
    {
        this.capacitySet = capacitySet;
    }
    //habbo-
    
    public Map<Customer, Affinity> getAffinityMap() 
    {
        return affinityMap;
    }

    public void setAffinityMap(Map<Customer, Affinity> affinityMap) 
    {
        this.affinityMap = affinityMap;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************
   
    
    @Override
    public Employee getEmployee() 
    {
        return this;
    }
    
    @Override
    public double getLatitude() 
    {
    	return latitude;
    }

    @Override
    public double getLongitude() 
    {
    	return longitude;
    }

    @Override
    public Integer getEndTime() 
    {
        return 0;
    }
      
    /**
     * @param customer never null
     * @return never null
     */
    public Affinity getAffinity(Customer customer) 
    {
        Affinity affinity = affinityMap.get(customer);
        if (affinity == null) {
            affinity = Affinity.NONE;
        }
        return affinity;
    }

    @Override
    public String getLabel() 
    {
        return fullName;
    }

    public String getToolText() 
    {
        StringBuilder toolText = new StringBuilder();
        toolText.append("<html><center><b>").append(fullName).append("</b><br/><br/>");
        toolText.append("Skills:<br/>");
        for (Skill skill : skillSet) {
            toolText.append(skill.getLabel()).append("<br/>");
        }
        toolText.append("</center></html>");
        return toolText.toString();
    }

    @Override
    public String toString() 
    {
        return fullName;
    }
    
    //habbo+
    private int capacityEndTime;
    
    public int getCapacityEndTime() 
    {
    	return capacityEndTime;
    }
    
    public Integer getWorkStart(int startTime) 
    {
    	if (capacitySet == null || capacitySet.isEmpty()) {
    		return getStandardStart(startTime);
    	}
    	//find the first capacity which ends after the start 
    	for (Capacity capacity : capacitySet) {
			capacityEndTime = capacity.getEndTime();    		
    		if (capacity.getEndTime() > startTime) {
    			return capacity.getStartTime();
    		}
    	}
    	//Set the startTime to the beginning of next day (1440) when the employee specific capacities are exceeded
    	//Only do this when the start is less than 8 hours (480)from the last found end time.
    	if (startTime - capacityEndTime < 480 ) {
    		int startOfDay = startTime - (startTime % 1440);
    		startTime = startOfDay + 1440;
    	}
    	return getStandardStart(startTime);
    }
    
    private Integer getStandardStart(int startTime) 
    {
    	//If start is after 16:00 add one day = 1440 minutes
    	if (startTime % 1440 > 960) {
    		startTime += 1440;
    	}
    	int startOfDay = startTime - (startTime % 1440);
    	//we need a standard variable to indicate the day of week;
    	//standard day starts at 08:00 = 480 minutes and ends at 16:00 = 960 minutes
    	capacityEndTime = startOfDay + 960;
    	return startOfDay + 480;
    }
    //habbo-

}
