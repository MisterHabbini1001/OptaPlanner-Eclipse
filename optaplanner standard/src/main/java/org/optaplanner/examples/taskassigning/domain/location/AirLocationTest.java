package org.optaplanner.examples.taskassigning.domain.location;
import static org.junit.Assert.*;
import org.junit.*;

public class AirLocationTest 
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
	}
}