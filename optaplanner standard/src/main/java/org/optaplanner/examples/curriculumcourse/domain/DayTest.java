package org.optaplanner.examples.curriculumcourse.domain;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DayTest 
{
    private static final String[] WEEKDAYS = {"Mo", "Tu", "We", "Th", "Fr", "Sat", "Sun"};
    private int dayIndex;
    private List<Period> periodList;
    
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
    public void testgetPeriodList() 
	{
		System.out.println(periodList);
    }

	@Test
    public void testsetPeriodList() 
	{
        this.periodList = periodList;
    }

	@Test
    public void testgetLabel() 
	{
        String weekday = WEEKDAYS[dayIndex % WEEKDAYS.length];
        if (dayIndex > WEEKDAYS.length) 
        {
        	System.out.println("Day " + dayIndex);
        }
        
        System.out.println(weekday);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(Integer.toString(dayIndex));
    }
}
