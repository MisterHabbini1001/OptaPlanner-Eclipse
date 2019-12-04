package org.optaplanner.examples.vehiclerouting.domain.location.segmented;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class HubSegmentLocationTest 
{
    protected Map<RoadSegmentLocation, Double> nearbyTravelDistanceMap;
    protected Map<HubSegmentLocation, Double> hubTravelDistanceMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		HubSegmentLocation hsl = new HubSegmentLocation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		HubSegmentLocation hsl = new HubSegmentLocation();
		hsl = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		HubSegmentLocation hsl = new HubSegmentLocation();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		HubSegmentLocation hsl = new HubSegmentLocation();
		hsl = null;
	}
	
	@Test
	public Map<RoadSegmentLocation, Double> testgetNearbyTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		return nearbyTravelDistanceMap;
	}
	
	@Test
	public void testsetNearbyTravelDistanceMap(Map<RoadSegmentLocation, Double> nearbyTravelDistanceMap)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.nearbyTravelDistanceMap = nearbyTravelDistanceMap;
	}
	
	@Test
	public Map<HubSegmentLocation, Double> testgetHubTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		return hubTravelDistanceMap;
	}
	
	@Test
	public void testsetHubTravelDistanceMap(Map<HubSegmentLocation, Double> hubTravelDistanceMap)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.hubTravelDistanceMap = hubTravelDistanceMap;
	}
	
	@Test
	public long testgetDistanceTo(Location location)
	{
		//assertEquals(2, 2); // For now. Remove later
        double distance;
        if (location instanceof RoadSegmentLocation) 
        {
            distance = testgetDistanceDouble((RoadSegmentLocation) location);
        } 
        
        else 
        {
            distance = hubTravelDistanceMap.get((HubSegmentLocation) location);
        }
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        return (long) (distance * 1000.0 + 0.5);
	}
	
	@Test
	public double testgetDistanceDouble(RoadSegmentLocation location)
	{
		//assertEquals(2, 2); // For now. Remove later
        Double distance = nearbyTravelDistanceMap.get(location);
        if (distance == null) 
        {
            // location isn't nearby
            distance = testgetShortestDistanceDoubleThroughOtherHub(location);
        }
        
        return distance;
	}
	
	@Test
	public double testgetShortestDistanceDoubleThroughOtherHub(RoadSegmentLocation location) 
	{
		//assertEquals(2, 2); // For now. Remove later
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
