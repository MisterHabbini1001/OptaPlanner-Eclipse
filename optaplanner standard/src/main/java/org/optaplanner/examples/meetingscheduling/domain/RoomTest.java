package org.optaplanner.examples.meetingscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoomTest 
{
    private String name;
    private int capacity;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Room r = new Room();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Room r = new Room();
		r = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Room r = new Room();
	}

	@After
	public void tearDown() throws Exception 
	{
		Room r = new Room();
		r = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
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
		System.out.println(name);
    }

	@Test
    public void testtoString() 
	{
		System.out.println(name);
    }
}
