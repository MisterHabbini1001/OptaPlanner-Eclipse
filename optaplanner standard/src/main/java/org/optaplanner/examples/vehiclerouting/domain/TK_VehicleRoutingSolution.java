package org.optaplanner.examples.vehiclerouting.domain;
import java.text.NumberFormat;
import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import org.optaplanner.examples.vehiclerouting.domain.location.DistanceType;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;
import org.optaplanner.examples.vehiclerouting.domain.timewindowed.TimeWindowedVehicleRoutingSolution;
import org.optaplanner.persistence.xstream.api.score.buildin.hardsoftlong.HardSoftLongScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamInclude;

@PlanningSolution
@XStreamAlias("VrpVehicleRoutingSolution")
@XStreamInclude({
        TimeWindowedVehicleRoutingSolution.class
})
public class TK_VehicleRoutingSolution extends VehicleRoutingSolution
{
    protected String name;
    protected DistanceType distanceType;
    protected String distanceUnitOfMeasurement;
    protected List<Location> locationList;
    protected List<Depot> depotList;
    protected List<Vehicle> vehicleList;
    protected List<Customer> customerList;

    @XStreamConverter(HardSoftLongScoreXStreamConverter.class)
    protected HardSoftLongScore score;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public DistanceType getDistanceType() 
    {
        return distanceType;
    }

    public void setDistanceType(DistanceType distanceType) 
    {
        this.distanceType = distanceType;
    }

    public String getDistanceUnitOfMeasurement() 
    {
        return distanceUnitOfMeasurement;
    }

    public void setDistanceUnitOfMeasurement(String distanceUnitOfMeasurement) 
    {
        this.distanceUnitOfMeasurement = distanceUnitOfMeasurement;
    }

    @ProblemFactCollectionProperty
    public List<Location> getLocationList() 
    {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) 
    {
        this.locationList = locationList;
    }

    @ProblemFactCollectionProperty
    public List<Depot> getDepotList() 
    {
        return depotList;
    }

    public void setDepotList(List<Depot> depotList) 
    {
        this.depotList = depotList;
    }

    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "vehicleRange")
    public List<Vehicle> getVehicleList() 
    {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) 
    {
        this.vehicleList = vehicleList;
    }

    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "customerRange")
    public List<Customer> getCustomerList() 
    {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) 
    {
        this.customerList = customerList;
    }

    @PlanningScore
    public HardSoftLongScore getScore() 
    {
        return score;
    }

    public void setScore(HardSoftLongScore score) 
    {
        this.score = score;
    }

    public String getDistanceString(NumberFormat numberFormat) 
    {
        if (score == null) 
        {
            return null;
        }
        
        long distance = - score.getSoftScore();
        if (distanceUnitOfMeasurement == null) 
        {
            return numberFormat.format(((double) distance) / 1000.0);
        }
        
        switch (distanceUnitOfMeasurement) 
        {
            case "sec":  // TODO why are the values 1000 larger?
                long hours = distance / 3600000L;
                long minutes = distance % 3600000L / 60000L;
                long seconds = distance % 60000L / 1000L;
                long milliseconds = distance % 1000L;
                return hours + "h " + minutes + "m " + seconds + "s " + milliseconds + "ms";
            case "km": { // TODO why are the values 1000 larger?
                long km = distance / 1000L;
                long meter = distance % 1000L;
                return km + "km " + meter + "m";
            }
            case "meter": 
            {
                long km = distance / 1000L;
                long meter = distance % 1000L;
                return km + "km " + meter + "m";
            }
            default:
                return numberFormat.format(((double) distance) / 1000.0) + " " + distanceUnitOfMeasurement;
        }
    }
}
