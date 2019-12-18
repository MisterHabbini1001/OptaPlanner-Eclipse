package org.optaplanner.examples.examination.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PeriodTest 
{
    private String startDateTimeString;
    private int periodIndex;
    private int dayIndex;
    private int duration; // in minutes
    private int penalty;
    private boolean frontLoadLast;
	
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
    public void testgetStartDateTimeString() 
    {
        System.out.println(startDateTimeString);
    }

	@Test
    public void testsetStartDateTimeString() 
    {
        this.startDateTimeString = startDateTimeString;
    }

	@Test
    public void testgetPeriodIndex() 
    {
		System.out.println(periodIndex);
    }

	@Test
    public void testsetPeriodIndex() 
    {
        this.periodIndex = periodIndex;
    }

	@Test
    public void testgetDayIndex() 
    {
		System.out.println(dayIndex);
    }

	@Test
    public void testsetDayIndex() 
    {
        this.dayIndex = dayIndex;
    }

	@Test
    public void testgetDuration() 
    {
		System.out.println(duration);
    }

	@Test
    public void testsetDuration() 
    {
        this.duration = duration;
    }

	@Test
    public void testgetPenalty() 
    {
		System.out.println(penalty);
    }

	@Test
    public void testsetPenalty() 
    {
        this.penalty = penalty;
    }

	@Test
    public void testisFrontLoadLast() 
    {
		System.out.println(frontLoadLast);
    }

	@Test
    public void testsetFrontLoadLast() 
    {
        this.frontLoadLast = frontLoadLast;
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println(startDateTimeString);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(startDateTimeString);
    }
}
