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
//package org.optaplanner.examples.taskassigning.domain;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.optaplanner.examples.common.domain.AbstractPersistable;
import org.optaplanner.examples.common.swingui.components.Labeled;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;//habbo+-

@XStreamAlias("TaCustomer")
public class Customer_1 extends AbstractPersistable implements Labeled 
{	
    protected Location location;//habbo+-
    private String name;

    public Customer_1() 
    {
    }

    public Customer_1(long id, String name) 
    {
        super(id);
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
    
    //habbo+
    public Location getLocation() 
    {
        return location;
    }

    public void setLocation(Location location) 
    {
        this.location = location;
    }
    //habbo-


    // ************************************************************************
    // Complex methods
    // ************************************************************************

    @Override
    public String getLabel() 
    {
        return name;
    }

    @Override
    public String toString() 
    {
        return name;
    }

}
