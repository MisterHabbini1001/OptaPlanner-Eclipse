package org.optaplanner.examples.nurserostering.domain.request;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.nurserostering.domain.Employee;
import org.optaplanner.examples.nurserostering.domain.Shift;

public class ShiftOnRequestTest 
{
    private Employee employee;
    private Shift shift;
    private int weight;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ShiftOnRequest sor = new ShiftOnRequest();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ShiftOnRequest sor = new ShiftOnRequest();
		sor = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ShiftOnRequest sor = new ShiftOnRequest();
	}

	@After
	public void tearDown() throws Exception 
	{
		ShiftOnRequest sor = new ShiftOnRequest();
		sor = null;
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
    public void testgetShift() 
	{
		System.out.println(shift);
    }

	@Test
    public void testsetShift() 
	{
        this.shift = shift;
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
		System.out.println(shift + "_ON_" + employee);
    }
}
