package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.nurserostering.domain.contract.Contract;
import org.optaplanner.examples.nurserostering.domain.request.DayOffRequest;
import org.optaplanner.examples.nurserostering.domain.request.DayOnRequest;
import org.optaplanner.examples.nurserostering.domain.request.ShiftOffRequest;
import org.optaplanner.examples.nurserostering.domain.request.ShiftOnRequest;

public class EmployeeTest 
{
    private String code;
    private String name;
    private Contract contract;

    private Map<ShiftDate, DayOffRequest> dayOffRequestMap;
    private Map<ShiftDate, DayOnRequest> dayOnRequestMap;
    private Map<Shift, ShiftOffRequest> shiftOffRequestMap;
    private Map<Shift, ShiftOnRequest> shiftOnRequestMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Employee em = new Employee();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Employee em = new Employee();
		em = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Employee em = new Employee();
	}

	@After
	public void tearDown() throws Exception 
	{
		Employee em = new Employee();
		em = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetCode() 
	{
        System.out.println(code);
    }

	@Test
    public void testsetCode() 
    {
        this.code = code;
    }

	@Test
    public void testgetName() 
    {
		System.out.println(name);
    }

	@Test
    public void testsetName() 
    {
        this.name = name;
    }

	@Test
    public void testgetContract() 
    {
		System.out.println(contract);
    }

	@Test
    public void testsetContract() 
    {
        this.contract = contract;
    }

	@Test
    public void testgetWeekendLength() 
    {
		System.out.println(0);
    }

	@Test
    public void testgetDayOffRequestMap() 
    {
		System.out.println(dayOffRequestMap);
    }

	@Test
    public void testsetDayOffRequestMap() 
    {
        this.dayOffRequestMap = dayOffRequestMap;
    }

	@Test
    public void testgetDayOnRequestMap() 
    {
		System.out.println(dayOnRequestMap);
    }

	@Test
    public void testsetDayOnRequestMap() 
    {
        this.dayOnRequestMap = dayOnRequestMap;
    }

	@Test
    public void testgetShiftOffRequestMap() 
    {
		System.out.println(shiftOffRequestMap);
    }

	@Test
    public void testsetShiftOffRequestMap()
    {
        this.shiftOffRequestMap = shiftOffRequestMap;
    }

	@Test
    public void testgetShiftOnRequestMap() 
    {
		System.out.println(shiftOnRequestMap);
    }

	@Test
    public void testsetShiftOnRequestMap() 
    {
        this.shiftOnRequestMap = shiftOnRequestMap;
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println("Employee " + name);
    }

	@Test
    public void testtoString() 
    {
        if (name == null) 
        {
        	System.out.println(super.toString());
        }
        
        System.out.println(name);
    }
}
