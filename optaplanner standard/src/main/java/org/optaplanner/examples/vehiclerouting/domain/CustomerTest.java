package org.optaplanner.examples.vehiclerouting.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class CustomerTest 
{
    protected Location location;
    protected int demand;

    // Planning variables: changes during planning, between score calculations.
    protected Standstill previousStandstill;

    // Shadow variables
    protected Customer nextCustomer;
    protected Vehicle vehicle;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
		c = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
		c = null;
	}
	
	@Test
	public Location testgetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		return location;
	}
	
	@Test
	public void testsetLocation(Location location)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.location = location;
	}
	
	@Test
	public int testgetDemand()
	{
		//assertEquals(2, 2); // For now. Remove later
		return demand;
	}
	
	@Test
	public void testsetDemand(int demand)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.demand = demand;
	}
	
	@Test
	public Standstill testgetPreviousStandstill()
	{
		//assertEquals(2, 2); // For now. Remove later
		return previousStandstill;
	}
	
	@Test
	public void testsetPreviousStandstill(Standstill previousStandstill)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.previousStandstill = previousStandstill;
	}
	
	@Test
	public Customer testgetNextCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		return nextCustomer;
	}
	
	@Test
	public void testsetNextCustomer(Customer nextCustomer)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.nextCustomer = nextCustomer;
	}
	
	@Test
	public Vehicle testgetVehicle()
	{
		//assertEquals(2, 2); // For now. Remove later
		return vehicle;
	}
	
	@Test
	public void testsetVehicle(Vehicle vehicle)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.vehicle = vehicle;
	}
	
	@Test
	public long testgetDistanceFromPreviousStandstill()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (previousStandstill == null) 
        {
            throw new IllegalStateException("This method must not be called when the previousStandstill ("
                    + previousStandstill + ") is not initialized yet.");
        }
        
        return testgetDistanceFrom(previousStandstill);
	}
	
	@Test
	public long testgetDistanceFrom(Standstill standstill)
	{
		//assertEquals(2, 2); // For now. Remove later
		return standstill.getLocation().getDistanceTo(location);
	}
	
	@Test
	public long testgetDistanceTo(Standstill standstill)
	{
		//assertEquals(2, 2); // For now. Remove later
		return location.getDistanceTo(standstill.getLocation());
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (location.getName() == null) 
        {
            return super.toString();
        }
        
        return location.getName();
	}
}
