package org.optaplanner.examples.vehiclerouting.domain.location.segmented;
import java.util.Map;

import org.optaplanner.examples.vehiclerouting.domain.location.Location;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("VrpHubSegmentLocation")
public class TK_HubSegmentLocation extends HubSegmentLocation
{
    protected Map<RoadSegmentLocation, Double> nearbyTravelDistanceMap;
    protected Map<HubSegmentLocation, Double> hubTravelDistanceMap;

    public TK_HubSegmentLocation() 
    {
    }

    public TK_HubSegmentLocation(long id, double latitude, double longitude) 
    {
        super(id, latitude, longitude);
    }

    public Map<RoadSegmentLocation, Double> getNearbyTravelDistanceMap() 
    {
        return nearbyTravelDistanceMap;
    }

    public void setNearbyTravelDistanceMap(Map<RoadSegmentLocation, Double> nearbyTravelDistanceMap) 
    {
        this.nearbyTravelDistanceMap = nearbyTravelDistanceMap;
    }

    public Map<HubSegmentLocation, Double> getHubTravelDistanceMap() 
    {
        return hubTravelDistanceMap;
    }

    public void setHubTravelDistanceMap(Map<HubSegmentLocation, Double> hubTravelDistanceMap) 
    {
        this.hubTravelDistanceMap = hubTravelDistanceMap;
    }

    @Override
    public long getDistanceTo(Location location) 
    {
        double distance;
        if (location instanceof RoadSegmentLocation) 
        {
            distance = getDistanceDouble((RoadSegmentLocation) location);
        } 
        
        else 
        {
            distance = hubTravelDistanceMap.get((HubSegmentLocation) location);
        }
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        return (long) (distance * 1000.0 + 0.5);
    }

    public double getDistanceDouble(RoadSegmentLocation location) 
    {
        Double distance = nearbyTravelDistanceMap.get(location);
        if (distance == null) 
        {
            // location isn't nearby
            distance = getShortestDistanceDoubleThroughOtherHub(location);
        }
        
        return distance;
    }

    protected double getShortestDistanceDoubleThroughOtherHub(RoadSegmentLocation location) 
    {
        double shortestDistance = Double.MAX_VALUE;
        // Don't use location.getHubTravelDistanceMap().keySet() instead because distances aren't always paired
        for (Map.Entry<HubSegmentLocation, Double> otherHubEntry : hubTravelDistanceMap.entrySet()) {
            HubSegmentLocation otherHub = otherHubEntry.getKey();
            Double otherHubNearbyDistance = otherHub.nearbyTravelDistanceMap.get(location);
            if (otherHubNearbyDistance != null) 
            {
                double distance = otherHubEntry.getValue() + otherHubNearbyDistance;
                if (distance < shortestDistance) 
                {
                    shortestDistance = distance;
                }
            }
        }
        
        return shortestDistance;
    }
}
