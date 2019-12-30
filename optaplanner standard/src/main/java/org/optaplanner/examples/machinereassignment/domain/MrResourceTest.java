package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrResourceTest 
{
    private int index;
    private boolean transientlyConsumed;
    private int loadCostWeight;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrResource mr = new MrResource();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrResource mr = new MrResource();
		mr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrResource mr = new MrResource();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrResource mr = new MrResource();
		mr = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetIndex() 
	{
        System.out.println(index);
    }

	@Test
    public void testsetIndex() 
	{
        this.index = index;
    }

	@Test
    public void testisTransientlyConsumed() 
	{
		System.out.println(transientlyConsumed);
    }

	@Test
    public void testsetTransientlyConsumed() 
	{
        this.transientlyConsumed = transientlyConsumed;
    }

	@Test
    public void testgetLoadCostWeight() 
	{
        System.out.println(loadCostWeight);
    }

	@Test
    public void testsetLoadCostWeight() 
	{
        this.loadCostWeight = loadCostWeight;
    }
}
