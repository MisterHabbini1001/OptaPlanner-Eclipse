package org.optaplanner.examples.curriculumcourse.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimeslotTest 
{
    private static final String[] TIMES = {"08:00", "09:00", "10:00", "11:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00"};
    private int timeslotIndex;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Timeslot ts = new Timeslot();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Timeslot ts = new Timeslot();
		ts = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Timeslot ts = new Timeslot();
	}

	@After
	public void tearDown() throws Exception 
	{
		Timeslot ts = new Timeslot();
		ts = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetTimeslotIndex() 
    {
        System.out.println(timeslotIndex);
    }

	@Test
    public void testsetTimeslotIndex() 
    {
        this.timeslotIndex = timeslotIndex;
    }

	@Test
    public void testgetLabel() 
    {
        String time = TIMES[timeslotIndex % TIMES.length];
        if (timeslotIndex > TIMES.length) 
        {
        	System.out.println("Timeslot " + timeslotIndex);
        }
        
        System.out.println(time);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(Integer.toString(timeslotIndex));
    }
}
