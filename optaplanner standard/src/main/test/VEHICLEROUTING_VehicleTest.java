//package org.optaplanner.examples.vehiclerouting.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class VEHICLEROUTING_VehicleTest 
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
	public void testgetCapacity()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return capacity;
		System.out.println(capacity);
	}
	
	@Test
	public void testsetCapacity()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.capacity = capacity;
	}
	
	@Test
	public void testgetDepot()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return depot;
        System.out.println(depot);
	}
	
	@Test
	public void testsetDepot()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.depot = depot;
	}
	
	@Test
	public void testgetNextCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return nextCustomer;
		System.out.println(nextCustomer);
	}
	
	@Test
	public void testsetNextCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.nextCustomer = nextCustomer;
	}
	
	@Test
	public void testgetVehicle()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return this;
		System.out.println(this);
	}
	
	@Test
	public void testgetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return depot.getLocation();
		//System.out.println(depot.getLocation());
		System.out.println();
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return depot.getDistanceTo(standstill);
		System.out.println(0);
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		/*
        Location location = testgetLocation();
        if (location.getName() == null) 
        {
            return super.toString();
        }
        
        return location.getName() + "/" + super.toString();
        */
        System.out.println();
	}
}
