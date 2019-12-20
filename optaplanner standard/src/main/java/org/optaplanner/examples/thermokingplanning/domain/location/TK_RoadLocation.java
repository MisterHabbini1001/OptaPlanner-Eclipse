package org.optaplanner.examples.thermokingplanning.domain.location;
import java.util.Map;

public class TK_RoadLocation 
{
	  // Prefer Map over array or List because customers might be added and removed in real-time planning.
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

    public long getDistanceTo(Location location) 
    {        
        double distance = travelDistanceMap.get((RoadLocation) location);
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        return (long) (distance * 1000.0 + 0.5);
    }
}
