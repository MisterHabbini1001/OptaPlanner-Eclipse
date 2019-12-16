package org.optaplanner.examples.vehiclerouting.domain.location;
import java.util.Map;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("VrpRoadLocation")
public class TK_RoadLocation extends RoadLocation
{
    protected Map<RoadLocation, Double> travelDistanceMap;
    double latitude;
    double longitude;

    public TK_RoadLocation() 
    {
    	
    }

    public TK_RoadLocation(double latitude, double longitude) 
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Map<RoadLocation, Double> getTravelDistanceMap() 
    {
        return travelDistanceMap;
    }

    public void setTravelDistanceMap(Map<RoadLocation, Double> travelDistanceMap) 
    {
        this.travelDistanceMap = travelDistanceMap;
    }

    @Override
    public long getDistanceTo(Location location) 
    {
        if (this == location) 
        {
            return 0L;
        }
        
        double distance = travelDistanceMap.get((RoadLocation) location);
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        return (long) (distance * 1000.0 + 0.5);
    }
}
