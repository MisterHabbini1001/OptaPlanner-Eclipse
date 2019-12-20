//package org.optaplanner.examples.vehiclerouting.domain.location.segmented;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class VEHICLEROUTING_HubSegmentLocationTest 
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
	public void testgetNearbyTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return nearbyTravelDistanceMap;
		System.out.println(nearbyTravelDistanceMap);
	}
	
	@Test
	public void testsetNearbyTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.nearbyTravelDistanceMap = nearbyTravelDistanceMap;
	}
	
	@Test
	public void testgetHubTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return hubTravelDistanceMap;
		System.out.println(hubTravelDistanceMap);
	}
	
	@Test
	public void testsetHubTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.hubTravelDistanceMap = hubTravelDistanceMap;
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2); // For now. Remove later
        double distance = 1.14;
        /*
        if (location instanceof RoadSegmentLocation) 
        {
            distance = testgetDistanceDouble((RoadSegmentLocation) location);
        } 
        
        else 
        {
            distance = hubTravelDistanceMap.get((HubSegmentLocation) location);
        }
        */
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        //return (long) (distance * 1000.0 + 0.5);
        System.out.println((long) (distance * 1000.0 + 0.5));
	}
	
	@Test
	public void testgetDistanceDouble()
	{
		//assertEquals(2, 2); // For now. Remove later
		/*
        Double distance = nearbyTravelDistanceMap.get(location);
        if (distance == null) 
        {
            // location isn't nearby
            distance = testgetShortestDistanceDoubleThroughOtherHub(location);
        }
        */
        
        Double distance = 2.29;
        //return distance;
        System.out.println(distance);
	}
	
	@Test
	public void testgetShortestDistanceDoubleThroughOtherHub() 
	{
		//assertEquals(2, 2); // For now. Remove later
        double shortestDistance = Double.MAX_VALUE;
        // Don't use location.getHubTravelDistanceMap().keySet() instead because distances aren't always paired
        /*
        for (Map.Entry<HubSegmentLocation, Double> otherHubEntry : hubTravelDistanceMap.entrySet()) 
        {
            HubSegmentLocation otherHub = otherHubEntry.getKey();
            //Double otherHubNearbyDistance = otherHub.nearbyTravelDistanceMap.get(location);
            Double otherHubNearbyDistance = 3.91;
            if (otherHubNearbyDistance != null) 
            {
                double distance = otherHubEntry.getValue() + otherHubNearbyDistance;
                if (distance < shortestDistance) 
                {
                    shortestDistance = distance;
                }
            }
        }
        */
        
        //return shortestDistance;
        System.out.println(shortestDistance);
	}
}
