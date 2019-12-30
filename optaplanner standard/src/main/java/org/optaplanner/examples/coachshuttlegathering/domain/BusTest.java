package org.optaplanner.examples.coachshuttlegathering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.coachshuttlegathering.domain.location.RoadLocation;

public class BusTest 
{
    protected String name;
    protected RoadLocation departureLocation;
    protected int capacity;
    protected int mileageCost;
    protected BusStop nextStop;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetName() 
    {
        System.out.println(name);
    }

	@Test
    public void testsetName() 
    {
        this.name = name;
    }

	@Test
    public void testgetDepartureLocation() 
    {
    	System.out.println(departureLocation);
    }

	@Test
    public void testsetDepartureLocation() 
    {
        this.departureLocation = departureLocation;
    }

	@Test
    public void testgetCapacity() 
    {
    	System.out.println(capacity);
    }

	@Test
    public void testsetCapacity() 
    {
        this.capacity = capacity;
    }

	@Test
    public void testgetMileageCost() 
    {
    	System.out.println(mileageCost);
    }

	@Test
    public void testsetMileageCost() 
    {
        this.mileageCost = mileageCost;
    }

	@Test
    public void testgetNextStop() 
    {
    	System.out.println(nextStop);
    }

	@Test
    public void testsetNextStop() 
    {
        this.nextStop = nextStop;
    }

	@Test
    public void testgetSetupCost()
    {
    	System.out.println(0);
    }

	@Test
    public void testgetLocation() 
    {
    	System.out.println(departureLocation);
    }

	@Test
    public void testgetBus() 
    {
    	System.out.println(this);
    }

	@Test
    public void testgetDistanceFromTo()
    {
    	System.out.println(0);
    }

	@Test
    public void testgetDurationFromTo()
    {
    	System.out.println(0);
    }

	@Test
    public void testgetDestination()
    {
    	System.out.println(0);
    }

	@Test
    public void testtoString() 
    {
    	System.out.println(name);
    }
}
