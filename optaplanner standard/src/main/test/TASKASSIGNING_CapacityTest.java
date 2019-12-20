//package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;

public class TASKASSIGNING_CapacityTest 
{
	private Integer startTime;
	private Integer endTime;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Capacity c = new Capacity();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Capacity c = new Capacity();
		c = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Capacity c = new Capacity();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Capacity c = new Capacity();
		c = null;
	}
	
	@Test
	public void testsetStartTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.startTime = startTime;
	}
	
	@Test
	public void testgetStartTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return startTime;
		System.out.println(startTime);
	}
	
	@Test
	public void testsetEndTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.endTime = endTime;
	}
	
	@Test
	public void testgetEndTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return endTime;
		System.out.println(endTime);
	}
}
