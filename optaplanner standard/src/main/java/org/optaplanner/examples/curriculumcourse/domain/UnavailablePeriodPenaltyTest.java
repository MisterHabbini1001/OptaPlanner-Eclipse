package org.optaplanner.examples.curriculumcourse.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnavailablePeriodPenaltyTest 
{
    private Course course;
    private Period period;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		UnavailablePeriodPenalty upp = new UnavailablePeriodPenalty();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		UnavailablePeriodPenalty upp = new UnavailablePeriodPenalty();
		upp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		UnavailablePeriodPenalty upp = new UnavailablePeriodPenalty();
	}

	@After
	public void tearDown() throws Exception 
	{
		UnavailablePeriodPenalty upp = new UnavailablePeriodPenalty();
		upp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetCourse() 
    {
        System.out.println(course);
    }

	@Test
    public void testsetCourse() 
    {
        this.course = course;
    }

	@Test
    public void testgetPeriod() 
    {
		System.out.println(period);
    }

	@Test
    public void testsetPeriod() 
    {
        this.period = period;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(course + "@" + period);
    }
}
