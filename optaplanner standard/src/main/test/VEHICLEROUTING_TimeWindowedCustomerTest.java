//package org.optaplanner.examples.vehiclerouting.domain.timewindowed;
import static org.junit.Assert.*;
import org.junit.*; 

public class VEHICLEROUTING_TimeWindowedCustomerTest 
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
	
	@Test
	public void testgetServiceDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return serviceDuration;
        System.out.println(serviceDuration);
	}
	
	@Test
	public void testsetServiceDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.serviceDuration = serviceDuration;
	}
	
	@Test
	public void testgetArrivalTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return arrivalTime;
		System.out.println(arrivalTime);
	}
	
	@Test
	public void testsetArrivalTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.arrivalTime = arrivalTime;
	}
	
	@Test
	public void testgetDepartureTime()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (arrivalTime == null) 
        {
            //return null;
            System.out.println();
        }
        
        //return Math.max(arrivalTime, readyTime) + serviceDuration;
        //System.out.println(Math.max(arrivalTime, readyTime) + serviceDuration);
        System.out.println(Math.max(readyTime, readyTime) + serviceDuration);
	}
	
	@Test
	public void testisArrivalBeforeReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
        //return arrivalTime != null && arrivalTime < readyTime;
        System.out.println(arrivalTime != null && arrivalTime < readyTime);
	}
	
	@Test
	public void testisArrivalAfterDueTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return arrivalTime != null && dueTime < arrivalTime;
		System.out.println(arrivalTime != null && dueTime < arrivalTime);
	}
	
	@Test
	public void testgetNextCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return (TimeWindowedCustomer) super.getNextCustomer();
		System.out.println();
	}
	
	@Test
	public void testgetTimeWindowGapTo()
	{
		//assertEquals(2, 2); // For now. Remove later
        // dueTime doesn't account for serviceDuration
        long latestDepartureTime = dueTime + serviceDuration;
        //long otherLatestDepartureTime = other.getDueTime() + other.getServiceDuration();
        
        /*
        if (latestDepartureTime < other.getReadyTime()) 
        {
            return other.getReadyTime() - latestDepartureTime;
        }
        */
        
        /*
        if (otherLatestDepartureTime < readyTime) 
        {
            return readyTime - otherLatestDepartureTime;
        }
        */
        
        if (latestDepartureTime < readyTime) 
        {
            //return readyTime - latestDepartureTime;
            System.out.println(readyTime - latestDepartureTime);
        }
        
        //return 0L;
        System.out.println(0L);
	}
}
