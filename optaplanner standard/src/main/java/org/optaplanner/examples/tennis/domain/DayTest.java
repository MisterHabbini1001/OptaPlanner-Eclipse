package org.optaplanner.examples.tennis.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DayTest 
{
	private int dateIndex;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Day d = new Day();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Day d = new Day();
		d = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Day d = new Day();
	}

	@After
	public void tearDown() throws Exception 
	{
		Day d = new Day();
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
    public void testgetDateIndex() 
    {
        System.out.println(dateIndex);
    }

	@Test
    public void testsetDateIndex() 
    {
        this.dateIndex = dateIndex;
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println("day " + dateIndex);
    }
}
