package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrServiceTest 
{
    private List<MrService> toDependencyServiceList;
    private List<MrService> fromDependencyServiceList;
    private int locationSpread;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrService ms = new MrService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrService ms = new MrService();
		ms = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrService ms = new MrService();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrService ms = new MrService();
		ms = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetToDependencyServiceList() 
	{
        System.out.println(toDependencyServiceList);
    }

	@Test
    public void testsetToDependencyServiceList() 
	{
        this.toDependencyServiceList = toDependencyServiceList;
    }

	@Test
    public void testgetFromDependencyServiceList() 
	{
    	System.out.println(fromDependencyServiceList);
    }

	@Test
    public void testsetFromDependencyServiceList() 
	{
        this.fromDependencyServiceList = fromDependencyServiceList;
    }

	@Test
    public void testgetLocationSpread() 
	{
    	System.out.println(locationSpread);
    }

	@Test
    public void testsetLocationSpread() 
	{
        this.locationSpread = locationSpread;
    }
}
