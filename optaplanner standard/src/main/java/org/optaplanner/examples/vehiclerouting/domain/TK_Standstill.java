package org.optaplanner.examples.vehiclerouting.domain;

import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class TK_Standstill implements Standstill
{
	Location location;
	Vehicle vehicle;
    Customer customer;
	
    public Location getLocation()
    {
    	return location;
    }

    public Vehicle getVehicle()
    {
    	return vehicle;
    }

    @InverseRelationShadowVariable(sourceVariableName = "previousStandstill")
    public Customer getNextCustomer()
    {
    	return customer;
    }
    
    public void setNextCustomer(Customer nextCustomer)
    {
    	this.customer = nextCustomer;
    }
}
