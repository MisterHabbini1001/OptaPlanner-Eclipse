package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResourceTest 
{
	private int index;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Resource r = new Resource();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Resource r = new Resource();
		r = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Resource r = new Resource();
	}

	@After
	public void tearDown() throws Exception 
	{
		Resource r = new Resource();
		r = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

    public void testgetIndex() 
    {
        System.out.println(index);
    }

    public void testsetIndex() 
    {
        this.index = index;
    }
}
