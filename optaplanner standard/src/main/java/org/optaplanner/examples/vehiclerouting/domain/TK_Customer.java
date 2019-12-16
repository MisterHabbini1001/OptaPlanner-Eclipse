package org.optaplanner.examples.vehiclerouting.domain;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.AnchorShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableGraphType;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;
import org.optaplanner.examples.vehiclerouting.domain.solver.DepotAngleCustomerDifficultyWeightFactory;
import org.optaplanner.examples.vehiclerouting.domain.timewindowed.TimeWindowedCustomer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamInclude;

@PlanningEntity(difficultyWeightFactoryClass = DepotAngleCustomerDifficultyWeightFactory.class)
@XStreamAlias("VrpCustomer")
@XStreamInclude({
        TimeWindowedCustomer.class
})
public class TK_Customer extends Customer
{
    protected Location location;
    protected int demand;

    // Planning variables: changes during planning, between score calculations.
    protected Standstill previousStandstill;

    // Shadow variables
    protected Customer nextCustomer;
    protected Vehicle vehicle;

    public Location getLocation() 
    {
        return location;
    }

    public void setLocation(Location location) 
    {
        this.location = location;
    }

    public int getDemand() 
    {
        return demand;
    }

    public void setDemand(int demand) 
    {
        this.demand = demand;
    }

    @PlanningVariable(valueRangeProviderRefs = {"vehicleRange", "customerRange"},
            graphType = PlanningVariableGraphType.CHAINED)
    public Standstill getPreviousStandstill() 
    {
        return previousStandstill;
    }

    public void setPreviousStandstill(Standstill previousStandstill) 
    {
        this.previousStandstill = previousStandstill;
    }

    public Customer getNextCustomer() 
    {
        return nextCustomer;
    }

    public void setNextCustomer(Customer nextCustomer) 
    {
        this.nextCustomer = nextCustomer;
    }

    @AnchorShadowVariable(sourceVariableName = "previousStandstill")
    public Vehicle getVehicle() 
    {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) 
    {
        this.vehicle = vehicle;
    }

    public long getDistanceFromPreviousStandstill() 
    {
        if (previousStandstill == null) 
        {
            throw new IllegalStateException("This method must not be called when the previousStandstill ("
                    + previousStandstill + ") is not initialized yet.");
        }
        
        return getDistanceFrom(previousStandstill);
    }

    public long getDistanceFrom(Standstill standstill) 
    {
        return standstill.getLocation().getDistanceTo(location);
    }

    public long getDistanceTo(Standstill standstill) 
    {
        return location.getDistanceTo(standstill.getLocation());
    }

    @Override
    public String toString() 
    {
        if (location.getName() == null) 
        {
            return super.toString();
        }
        
        return location.getName();
    }
}
