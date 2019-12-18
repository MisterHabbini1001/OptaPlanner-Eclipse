package org.optaplanner.examples.curriculumcourse.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PeriodTest 
{
    private Day day;
    private Timeslot timeslot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Period pe = new Period();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Period pe = new Period();
		pe = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Period pe = new Period();
	}

	@After
	public void tearDown() throws Exception 
	{
		Period pe = new Period();
		pe = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetDay() 
    {
        System.out.println(day);
    }

	@Test
    public void testsetDay() 
    {
        this.day = day;
    }

	@Test
    public void testgetTimeslot() 
    {
		System.out.println(timeslot);
    }

	@Test
    public void testsetTimeslot() 
    {
        this.timeslot = timeslot;
    }

    @Test
    public void testgetLabel() 
    {
    	System.out.println(day.getLabel() + " " + timeslot.getLabel());
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(day + "-" + timeslot);
    }
}
