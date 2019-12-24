package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShiftTest 
{
    private ShiftDate shiftDate;
    private ShiftType shiftType;
    private int index;
    private int requiredEmployeeSize;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Shift s = new Shift();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Shift s = new Shift();
		s = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Shift s = new Shift();
	}

	@After
	public void tearDown() throws Exception 
	{
		Shift s = new Shift();
		s = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

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
    public void testgetShiftType() 
    {
		System.out.println(shiftType);
    }

	@Test
    public void testsetShiftType() 
    {
        this.shiftType = shiftType;
    }

	@Test
    public void testgetIndex() 
    {
		System.out.println(index);
    }

	@Test
    public void testsetIndex() 
    {
        this.index = index;
    }

	@Test
    public void testgetRequiredEmployeeSize() 
    {
		System.out.println(requiredEmployeeSize);
    }

	@Test
    public void testsetRequiredEmployeeSize() 
    {
        this.requiredEmployeeSize = requiredEmployeeSize;
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println(shiftType.getLabel() + " of " + shiftDate.getLabel());
    }

	@Test
    public void testtoString() 
    {
		System.out.println(shiftDate + "/" + shiftType);
    }
}
