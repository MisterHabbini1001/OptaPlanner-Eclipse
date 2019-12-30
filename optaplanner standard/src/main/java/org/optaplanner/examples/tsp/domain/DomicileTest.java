package org.optaplanner.examples.tsp.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.tsp.domain.location.Location;

public class DomicileTest 
{
	private Location location;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Domicile d = new Domicile();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Domicile d = new Domicile();
		d = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Domicile d = new Domicile();
	}

	@After
	public void tearDown() throws Exception 
	{
		Domicile d = new Domicile();
		d = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
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
    public void testgetDistanceTo() 
    {
    	System.out.println(0);
    }

	@Test
    public void testtoString() 
    {
        if (location.getName() == null) 
        {
        	System.out.println(super.toString());
        }
        
        System.out.println(location.getName());
    }
}