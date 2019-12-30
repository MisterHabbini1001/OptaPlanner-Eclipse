package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoomSpecialismTest 
{
    private Room room;
    private Specialism specialism;
    private int priority; 
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		RoomSpecialism rs = new RoomSpecialism();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		RoomSpecialism rs = new RoomSpecialism();
		rs = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		RoomSpecialism rs = new RoomSpecialism();
	}

	@After
	public void tearDown() throws Exception 
	{
		RoomSpecialism rs = new RoomSpecialism();
		rs = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetRoom() 
	{
        System.out.println(room);
    }

	@Test
    public void testsetRoom() 
	{
        this.room = room;
    }

	@Test
    public void testgetSpecialism() 
	{
    	System.out.println(specialism);
    }

	@Test
    public void testsetSpecialism() 
	{
        this.specialism = specialism;
    }

	@Test
    public void testgetPriority() 
	{
    	System.out.println(priority);
    }

	@Test
    public void testsetPriority() 
	{
        this.priority = priority;
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(room + "-" + specialism);
    }
}
