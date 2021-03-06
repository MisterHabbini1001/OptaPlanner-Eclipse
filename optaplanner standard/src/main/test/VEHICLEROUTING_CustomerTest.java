//package org.optaplanner.examples.vehiclerouting.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class VEHICLEROUTING_CustomerTest 
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
	public void testgetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return location;
		System.out.println(location);
	}
	
	@Test
	public void testsetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.location = location;
	}
	
	@Test
	public void testgetDemand()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return demand;
		System.out.println(demand);
	}
	
	@Test
	public void testsetDemand()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.demand = demand;
	}
	
	@Test
	public void testgetPreviousStandstill()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return previousStandstill;
		System.out.println(previousStandstill);
	}
	
	@Test
	public void testsetPreviousStandstill()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.previousStandstill = previousStandstill;
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
		//return vehicle;
		System.out.println(vehicle);
	}
	
	@Test
	public void testsetVehicle()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.vehicle = vehicle;
	}
	
	@Test
	public void testgetDistanceFromPreviousStandstill()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (previousStandstill == null) 
        {
            //throw new IllegalStateException("This method must not be called when the previousStandstill ("
            //        + previousStandstill + ") is not initialized yet.");
            System.out.println("This method must not be called when the previousStandstill ("
                    + previousStandstill + ") is not initialized yet.");
        }
        
        //return testgetDistanceFrom(previousStandstill);
        System.out.println();
	}
	
	@Test
	public void testgetDistanceFrom()
	{
		//assertEquals(2, 2); // For now. Remove later
		//Standstill standstill = new Standstill();
		//return standstill.getLocation().getDistanceTo(location);
		System.out.println();
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return location.getDistanceTo(standstill.getLocation());
		System.out.println();
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		/*
        if (location.getName() == null) 
        {
            //return super.toString();
            System.out.println(super.toString());
        }
        
        //return location.getName();
        else
        {
        	System.out.println(location.getName());
        }
        */
        
        System.out.println();
	}
}
