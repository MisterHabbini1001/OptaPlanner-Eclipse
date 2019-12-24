package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NurseRosterParametrizationTest 
{
    private ShiftDate firstShiftDate;
    private ShiftDate lastShiftDate;
    private ShiftDate planningWindowStart;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		NurseRosterParametrization nrp = new NurseRosterParametrization();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		NurseRosterParametrization nrp = new NurseRosterParametrization();
		nrp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		NurseRosterParametrization nrp = new NurseRosterParametrization();
	}

	@After
	public void tearDown() throws Exception 
	{
		NurseRosterParametrization nrp = new NurseRosterParametrization();
		nrp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetFirstShiftDate() 
    {
        System.out.println(firstShiftDate);
    }

	@Test
    public void testsetFirstShiftDate() 
    {
        this.firstShiftDate = firstShiftDate;
    }

	@Test
    public void testgetLastShiftDate() 
    {
        System.out.println(lastShiftDate);
    }

	@Test
    public void testsetLastShiftDate() 
    {
        this.lastShiftDate = lastShiftDate;
    }

	@Test
    public void testgetFirstShiftDateDayIndex() 
    {
		System.out.println(firstShiftDate.getDayIndex());
    }

	@Test
    public void testgetLastShiftDateDayIndex() 
    {
		System.out.println(lastShiftDate.getDayIndex());
    }

	@Test
    public void testgetPlanningWindowStart() 
    {
		System.out.println(planningWindowStart);
    }

	@Test
    public void testsetPlanningWindowStart() 
    {
        this.planningWindowStart = planningWindowStart;
    }

	@Test
    public void testisInPlanningWindow() 
    {
		System.out.println(planningWindowStart.getDayIndex()); 
    }

	@Test
    public void testtoString() 
    {
		System.out.println(firstShiftDate + " - " + lastShiftDate);
    }
}
