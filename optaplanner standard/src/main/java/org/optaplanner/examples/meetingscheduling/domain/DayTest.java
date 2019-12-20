package org.optaplanner.examples.meetingscheduling.domain;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DayTest 
{
    private int dayOfYear;
    private static final DateTimeFormatter DAY_FORMATTER
            = DateTimeFormatter.ofPattern("E", Locale.ENGLISH);
    
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
    public void testgetDayOfYear() 
    {
        System.out.println(dayOfYear);
    }

	@Test
    public void testsetDayOfYear() 
    {
        this.dayOfYear = dayOfYear;
    }

	@Test
    public void testgetDateString() 
    {
		System.out.println(0);
    }

	@Test
    public void testtoDate() 
    {
		System.out.println(LocalDate.ofYearDay(LocalDate.now().getYear(), dayOfYear));
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println(0);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(0);
    }
}
