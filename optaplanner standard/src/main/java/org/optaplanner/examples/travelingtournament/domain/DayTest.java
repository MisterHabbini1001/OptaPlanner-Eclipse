package org.optaplanner.examples.travelingtournament.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DayTest 
{
    private int index;
    private Day nextDay;
    
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
    public void testgetNextDay() 
	{
    	System.out.println(nextDay);
    }

	@Test
    public void testsetNextDay() 
	{
        this.nextDay = nextDay;
    }

	@Test
    public void testgetLabel() 
	{
    	System.out.println(Integer.toString(index));
    }

	@Test
    public void testtoString() 
	{
    	System.out.println("Day-" + index);
    }
}
