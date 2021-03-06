package org.optaplanner.examples.vehiclerouting.domain.location;
import static org.junit.Assert.*;
import org.junit.*;

public class DistanceTypeTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		DistanceType dt_1 = DistanceType.AIR_DISTANCE;
		DistanceType dt_2 = DistanceType.ROAD_DISTANCE;
		DistanceType dt_3 = DistanceType.SEGMENTED_ROAD_DISTANCE;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		DistanceType dt_1 = DistanceType.AIR_DISTANCE;
		DistanceType dt_2 = DistanceType.ROAD_DISTANCE;
		DistanceType dt_3 = DistanceType.SEGMENTED_ROAD_DISTANCE;
		dt_1 = null;
		dt_2 = null;
		dt_3 = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		DistanceType dt_1 = DistanceType.AIR_DISTANCE;
		DistanceType dt_2 = DistanceType.ROAD_DISTANCE;
		DistanceType dt_3 = DistanceType.SEGMENTED_ROAD_DISTANCE;
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		DistanceType dt_1 = DistanceType.AIR_DISTANCE;
		DistanceType dt_2 = DistanceType.ROAD_DISTANCE;
		DistanceType dt_3 = DistanceType.SEGMENTED_ROAD_DISTANCE;
		dt_1 = null;
		dt_2 = null;
		dt_3 = null;
	}
}
