package org.optaplanner.examples.rocktour.domain;
import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RockBusTest 
{
    private RockLocation startLocation;
    private LocalDate startDate;
    private RockLocation endLocation;
    private LocalDate endDate;
    private RockShow nextShow;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		RockBus rb = new RockBus();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		RockBus rb = new RockBus();
		rb = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		RockBus rb = new RockBus();
	}

	@After
	public void tearDown() throws Exception 
	{
		RockBus rb = new RockBus();
		rb = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetDepartureLocation() 
    {
        System.out.println(startLocation);
    }

	@Test
    public void testgetDepartureDate() 
    {
    	System.out.println(startDate);
    }

	@Test
    public void testgetDepartureTimeOfDay() 
    {
    	System.out.println(RockTimeOfDay.EARLY);
    }

	@Test
    public void testgetHosWeekStart() 
    {
    	System.out.println(this);
    }

	@Test
    public void testgetHosWeekDrivingSecondsTotal() 
    {
    	System.out.println(0L);
    }

	@Test
    public void testgetArrivalLocation() 
    {
    	System.out.println(endLocation);
    }

	@Test
    public void testgetStartLocation() 
    {
    	System.out.println(startLocation);
    }

	@Test
    public void testsetStartLocation() 
    {
        this.startLocation = startLocation;
    }

	@Test
    public void testgetStartDate() 
    {
    	System.out.println(startDate);
    }

	@Test
    public void testsetStartDate() 
    {
        this.startDate = startDate;
    }

	@Test
    public void testgetEndLocation() 
    {
    	System.out.println(endLocation);
    }

	@Test
    public void testsetEndLocation() 
    {
        this.endLocation = endLocation;
    }

	@Test
    public void testgetEndDate() 
    {
    	System.out.println(endDate);
    }

	@Test
    public void testsetEndDate() 
    {
        this.endDate = endDate;
    }

	@Test
    public void testgetNextShow() 
    {
    	System.out.println(nextShow);
    }

	@Test
    public void testsetNextShow() 
    {
        this.nextShow = nextShow;
    }
}
