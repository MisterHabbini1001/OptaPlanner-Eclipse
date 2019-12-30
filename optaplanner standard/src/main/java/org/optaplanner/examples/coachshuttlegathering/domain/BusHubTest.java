package org.optaplanner.examples.coachshuttlegathering.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.coachshuttlegathering.domain.location.RoadLocation;

public class BusHubTest 
{
    protected String name;
    protected RoadLocation location;
    protected List<Shuttle> transferShuttleList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		BusHub bh = new BusHub();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		BusHub bh = new BusHub();
		bh = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		BusHub bh = new BusHub();
	}

	@After
	public void tearDown() throws Exception 
	{
		BusHub bh = new BusHub();
		bh = null;
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
    public void testgetLocation() 
    {
    	System.out.println(location);
    }

	@Test
    public void testsetLocation() 
    {
        this.location = location;
    }

	@Test
    public void testgetTransferShuttleList() 
    {
    	System.out.println(transferShuttleList);
    }

	@Test
    public void testsetTransferShuttleList() 
    {
        this.transferShuttleList = transferShuttleList;
    }

	@Test
    public void testgetTransportTimeToHub() 
    {
    	System.out.println(0);
    }

	@Test
    public void testisVisitedByCoach() 
    {
    	System.out.println(true);
    }

	@Test
    public void testtoString() 
    {
    	System.out.println(name);
    }
}
