package org.optaplanner.examples.vehiclerouting.domain.timewindowed;
import static org.junit.Assert.*;
import org.junit.*; 

public class TimeWindowedDepotTest 
{
    private long readyTime;
    private long dueTime;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedDepot twd = new TimeWindowedDepot();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedDepot twd = new TimeWindowedDepot();
		twd = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedDepot twd = new TimeWindowedDepot();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedDepot twd = new TimeWindowedDepot();
		twd = null;
	}
	
	@Test
	public void testgetReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return readyTime;
		System.out.println(readyTime);
	}
	
	@Test
	public void testsetReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.readyTime = readyTime;
	}
	
	@Test
	public void testgetDueTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return dueTime;
		System.out.println(dueTime);
	}
	
	@Test
	public void testsetDueTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.dueTime = dueTime;
	}
}