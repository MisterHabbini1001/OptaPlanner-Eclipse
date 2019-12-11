package org.optaplanner.examples.projectjobscheduling.domain.resource;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GlobalResourceTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		GlobalResource gb = new GlobalResource();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		GlobalResource gb = new GlobalResource();
		gb = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		GlobalResource gb = new GlobalResource();
	}

	@After
	public void tearDown() throws Exception 
	{
		GlobalResource gb = new GlobalResource();
		gb = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testisRenewable() 
	{
        //return true;
        System.out.println(true);
    }
}
