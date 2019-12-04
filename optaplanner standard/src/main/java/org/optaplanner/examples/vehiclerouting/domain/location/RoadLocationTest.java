package org.optaplanner.examples.vehiclerouting.domain.location;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.*;

public class RoadLocationTest 
{
	protected Map<RoadLocation, Double> travelDistanceMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		RoadLocation rl = new RoadLocation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		RoadLocation rl = new RoadLocation();
		rl = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		RoadLocation rl = new RoadLocation();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		RoadLocation rl = new RoadLocation();
		rl = null;
	}
	
	@Test
	public Map<RoadLocation, Double> testgetTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		return travelDistanceMap;
	}
	
	@Test
	public void testsetTravelDistanceMap(Map<RoadLocation, Double> travelDistanceMap)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.travelDistanceMap = travelDistanceMap;
	}
	
	@Test
	public long testgetDistanceTo(Location location)
	{
		//assertEquals(2, 2); // For now. Remove later
		
        double distance = travelDistanceMap.get((RoadLocation) location);
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        return (long) (distance * 1000.0 + 0.5);
	}
}
