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
	public long testgetReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return readyTime;
	}
	
	@Test
	public void testsetReadyTime(long readyTime)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.readyTime = readyTime;
	}
	
	@Test
	public long testgetDueTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return dueTime;
	}
	
	@Test
	public void testsetDueTime(long dueTime)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.dueTime = dueTime;
	}
}
