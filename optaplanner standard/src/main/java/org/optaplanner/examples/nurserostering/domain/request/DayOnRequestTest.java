package org.optaplanner.examples.nurserostering.domain.request;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.nurserostering.domain.Employee;
import org.optaplanner.examples.nurserostering.domain.ShiftDate;

public class DayOnRequestTest 
{
    private Employee employee;
    private ShiftDate shiftDate;
    private int weight;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		DayOnRequest dor = new DayOnRequest();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		DayOnRequest dor = new DayOnRequest();
		dor = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		DayOnRequest dor = new DayOnRequest();
	}

	@After
	public void tearDown() throws Exception 
	{
		DayOnRequest dor = new DayOnRequest();
		dor = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetEmployee() 
    {
        System.out.println(employee);
    }

	@Test
    public void testsetEmployee() 
    {
        this.employee = employee;
    }

	@Test
    public void testgetShiftDate() 
    {
		System.out.println(shiftDate);
    }

	@Test
    public void testsetShiftDate() 
    {
        this.shiftDate = shiftDate;
    }

	@Test
    public void testgetWeight() 
    {
		System.out.println(weight);
    }

	@Test
    public void testsetWeight() 
    {
        this.weight = weight;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(shiftDate + "_ON_" + employee);
    }
}
