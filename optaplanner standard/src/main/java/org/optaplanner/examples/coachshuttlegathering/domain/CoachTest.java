package org.optaplanner.examples.coachshuttlegathering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.coachshuttlegathering.domain.location.RoadLocation;

public class CoachTest 
{
    protected int stopLimit;
    protected BusHub destination;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Coach c = new Coach();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Coach c = new Coach();
		c = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Coach c = new Coach();
	}

	@After
	public void tearDown() throws Exception 
	{
		Coach c = new Coach();
		c = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
    */ 
    
	@Test
	public void testgetStopLimit() 
	{
        System.out.println(stopLimit);
    }

	@Test
    public void testsetStopLimit() 
	{
        this.stopLimit = stopLimit;
    }

	@Test
    public void testsetDestination() 
	{
        this.destination = destination;
    }

	@Test
    public void testgetSetupCost() 
	{
    	System.out.println(0);
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
    	System.out.println(destination);
    }

	@Test
    public void testgetDistanceToDestinationCost() 
	{
    	System.out.println(0);
    }
}
