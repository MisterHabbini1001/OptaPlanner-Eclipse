package org.optaplanner.examples.vehiclerouting.domain.timewindowed;
import static org.junit.Assert.*;
import org.junit.*; 

public class TimeWindowedCustomerTest 
{
    // Times are multiplied by 1000 to avoid floating point arithmetic rounding errors
    private long readyTime;
    private long dueTime;
    private long serviceDuration;

    // Shadow variable
    private Long arrivalTime;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedCustomer twc = new TimeWindowedCustomer();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedCustomer twc = new TimeWindowedCustomer();
		twc = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedCustomer twc = new TimeWindowedCustomer();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedCustomer twc = new TimeWindowedCustomer();
		twc = null;
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
	
	@Test
	public long testgetServiceDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
		return serviceDuration;
	}
	
	@Test
	public void testsetServiceDuration(long serviceDuration)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.serviceDuration = serviceDuration;
	}
	
	@Test
	public Long testgetArrivalTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return arrivalTime;
	}
	
	@Test
	public void testsetArrivalTime(Long arrivalTime)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.arrivalTime = arrivalTime;
	}
	
	@Test
	public Long testgetDepartureTime()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (arrivalTime == null) 
        {
            return null;
        }
        return Math.max(arrivalTime, readyTime) + serviceDuration;
	}
	
	@Test
	public boolean testisArrivalBeforeReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
        return arrivalTime != null
                && arrivalTime < readyTime;
	}
	
	@Test
	public boolean testisArrivalAfterDueTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return arrivalTime != null
                && dueTime < arrivalTime;
	}
	
	@Test
	public TimeWindowedCustomer testgetNextCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		return (TimeWindowedCustomer) super.getNextCustomer();
	}
	
	@Test
	public long testgetTimeWindowGapTo(TimeWindowedCustomer other)
	{
		//assertEquals(2, 2); // For now. Remove later
        // dueTime doesn't account for serviceDuration
        long latestDepartureTime = dueTime + serviceDuration;
        long otherLatestDepartureTime = other.getDueTime() + other.getServiceDuration();
        if (latestDepartureTime < other.getReadyTime()) 
        {
            return other.getReadyTime() - latestDepartureTime;
        }
        
        if (otherLatestDepartureTime < readyTime) 
        {
            return readyTime - otherLatestDepartureTime;
        }
        return 0L;
	}
}
