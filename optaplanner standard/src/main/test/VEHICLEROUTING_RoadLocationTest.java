//package org.optaplanner.examples.vehiclerouting.domain.location;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.*;

public class VEHICLEROUTING_RoadLocationTest 
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
	public void testgetTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return travelDistanceMap;
		System.out.println(travelDistanceMap);
	}
	
	@Test
	public void testsetTravelDistanceMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.travelDistanceMap = travelDistanceMap;
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2); // For now. Remove later
		
        //double distance = travelDistanceMap.get((RoadLocation) location);
		double distance = 1.31;
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        //return (long) (distance * 1000.0 + 0.5);
        System.out.println((long) (distance * 1000.0 + 0.5));
	}
}
