package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShiftTypeTest 
{
    private String code;
    private int index;
    private String startTimeString;
    private String endTimeString;
    private boolean night;
    private String description;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ShiftType st = new ShiftType();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ShiftType st = new ShiftType();
		st = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ShiftType st = new ShiftType();
	}

	@After
	public void tearDown() throws Exception 
	{
		ShiftType st = new ShiftType();
		st = null;
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
    public void testgetStartTimeString() 
	{
		System.out.println(startTimeString);
    }

	@Test
    public void testsetStartTimeString() 
	{
        this.startTimeString = startTimeString;
    }

	@Test
    public void testgetEndTimeString() 
	{
		System.out.println(endTimeString);
    }

	@Test
    public void testsetEndTimeString() 
	{
        this.endTimeString = endTimeString;
    }

	@Test
    public void testisNight() 
	{
		System.out.println(night);
    }

	@Test
    public void testsetNight() 
	{
        this.night = night;
    }

	@Test
    public void testgetDescription() 
	{
		System.out.println(description);
    }

	@Test
    public void testsetDescription() 
	{
        this.description = description;
    }

	@Test
    public void testgetLabel() 
	{
		System.out.println(code + " (" + description + ")");
    }

	@Test
    public void testtoString() 
	{
		System.out.println(code);
    }
}
