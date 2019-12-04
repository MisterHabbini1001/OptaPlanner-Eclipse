package org.optaplanner.examples.vehiclerouting.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class VehicleTest 
{
    protected int capacity;
    protected Depot depot;

    // Shadow variables
    protected Customer nextCustomer;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Vehicle veh = new Vehicle();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Vehicle veh = new Vehicle();
		veh = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Vehicle veh = new Vehicle();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Vehicle veh = new Vehicle();
		veh = null;
	}
	
	@Test
	public int testgetCapacity()
	{
		//assertEquals(2, 2); // For now. Remove later
		return capacity;
	}
	
	@Test
	public void testsetCapacity(int capacity)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.capacity = capacity;
	}
	
	@Test
	public Depot testgetDepot()
	{
		//assertEquals(2, 2); // For now. Remove later
		return depot;
	}
	
	@Test
	public void testsetDepot(Depot depot)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.depot = depot;
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
	public VehicleTest testgetVehicle()
	{
		//assertEquals(2, 2); // For now. Remove later
		return this;
	}
	
	@Test
	public Location testgetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		return depot.getLocation();
	}
	
	@Test
	public long testgetDistanceTo(Standstill standstill)
	{
		//assertEquals(2, 2); // For now. Remove later
		return depot.getDistanceTo(standstill);
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
        Location location = testgetLocation();
        if (location.getName() == null) 
        {
            return super.toString();
        }
        
        return location.getName() + "/" + super.toString();
	}
}
