package org.optaplanner.examples.curriculumcourse.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoomTest 
{
    private String code;
    private int capacity;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Room ro = new Room();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Room ro = new Room();
		ro = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Room ro = new Room();
	}

	@After
	public void tearDown() throws Exception 
	{
		Room ro = new Room();
		ro = null;
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
    public void testgetCapacity() 
    {
		System.out.println(capacity);
    }

	@Test
    public void testsetCapacity() 
    {
        this.capacity = capacity;
    }

    @Test
    public void testgetLabel() 
    {
    	System.out.println(code);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(code);
    }
}
