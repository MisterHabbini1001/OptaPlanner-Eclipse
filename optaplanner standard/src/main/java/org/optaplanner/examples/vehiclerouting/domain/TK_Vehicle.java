package org.optaplanner.examples.vehiclerouting.domain;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class TK_Vehicle extends Vehicle 
{
    protected int capacity;
    protected Depot depot;

    // Shadow variables
    protected Customer nextCustomer;

    public int getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    public Depot getDepot() 
    {
        return depot;
    }

    public void setDepot(Depot depot) 
    {
        this.depot = depot;
    }

    @Override
    public Customer getNextCustomer() 
    {
        return nextCustomer;
    }

    @Override
    public void setNextCustomer(Customer nextCustomer) 
    {
        this.nextCustomer = nextCustomer;
    }

    @Override
    public Vehicle getVehicle() 
    {
        return this;
    }

    @Override
    public Location getLocation() 
    {
        return depot.getLocation();
    }

    public long getDistanceTo(Standstill standstill) 
    {
        return depot.getDistanceTo(standstill);
    }

    @Override
    public String toString() 
    {
        Location location = getLocation();
        if (location.getName() == null) 
        {
            return super.toString();
        }
        
        return location.getName() + "/" + super.toString();
    }
}
