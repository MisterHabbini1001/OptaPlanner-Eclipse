package org.optaplanner.examples.vehiclerouting.domain;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;
import org.optaplanner.examples.vehiclerouting.domain.timewindowed.TimeWindowedDepot;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamInclude;

@XStreamAlias("VrpDepot")
@XStreamInclude({
        TimeWindowedDepot.class
})
public class TK_Depot extends Depot
{
    protected Location location;

    public Location getLocation() 
    {
        return location;
    }

    public void setLocation(Location location) 
    {
        this.location = location;
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
