package org.optaplanner.examples.coachshuttlegathering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.examples.coachshuttlegathering.domain.location.RoadLocation;

public class ShuttleTest 
{
    protected int setupCost;
    protected StopOrHub destination;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Shuttle sh = new Shuttle();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Shuttle sh = new Shuttle();
		sh = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Shuttle sh = new Shuttle();
	}

	@After
	public void tearDown() throws Exception 
	{
		Shuttle sh = new Shuttle();
		sh = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetSetupCost() 
    {
        System.out.println(setupCost);
    }

	@Test
    public void testsetSetupCost() 
    {
        this.setupCost = setupCost;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"stopRange", "hubRange"})
    public void testgetDestination() 
    {
    	System.out.println(destination);
    }

	@Test
    public void testsetDestination() 
    {
        this.destination = destination;
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
    public void testgetDestinationBus() 
    {
        if (destination == null) 
        {
        	System.out.println(0);
        }
        
        if (!(destination instanceof BusStop)) 
        {
        	System.out.println(0);
        }
        
        System.out.println(((BusStop) destination).getBus());
    }
}
