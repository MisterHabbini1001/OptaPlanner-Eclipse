package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrNeighborhoodTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrNeighborhood mn = new MrNeighborhood();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrNeighborhood mn = new MrNeighborhood();
		mn = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrNeighborhood mn = new MrNeighborhood();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrNeighborhood mn = new MrNeighborhood();
		mn = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
}
