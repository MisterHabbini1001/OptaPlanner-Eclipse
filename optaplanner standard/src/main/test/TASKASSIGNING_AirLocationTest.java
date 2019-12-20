//package org.optaplanner.examples.taskassigning.domain.location;
import static org.junit.Assert.*;
import org.junit.*;

public class TASKASSIGNING_AirLocationTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		AirLocation al = new AirLocation();
		AirLocation al_2 = new AirLocation(328932, 52.209209, 5.293092);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		AirLocation al = new AirLocation();
		AirLocation al_2 = new AirLocation(328932, 52.209209, 5.293092);
		al = null;
		al_2 = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		AirLocation al = new AirLocation();
		AirLocation al_2 = new AirLocation(328932, 52.209209, 5.293092);
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		AirLocation al = new AirLocation();
		AirLocation al_2 = new AirLocation(328932, 52.209209, 5.293092);
		al = null;
		al_2 = null;
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2); // For now. Remove later

		//double distance = getAirDistanceDoubleTo(location);
		double distance = 1.35;
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        //return (long) (distance * 1000.0 + 0.5);
        System.out.println((long) (distance * 1000.0 + 0.5));
	}
}
