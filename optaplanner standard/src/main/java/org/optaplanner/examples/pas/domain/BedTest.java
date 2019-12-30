package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BedTest {
    private Room room;
    private int indexInRoom;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Bed b = new Bed();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Bed b = new Bed();
		b = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Bed b = new Bed();
	}

	@After
	public void tearDown() throws Exception 
	{
		Bed b = new Bed();
		b = null;
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
    public void testgetIndexInRoom() 
	{
    	System.out.println(indexInRoom);
    }

	@Test
    public void testsetIndexInRoom() 
	{
        this.indexInRoom = indexInRoom;
    }

	@Test
    public void testgetLabelInRoom() 
	{
        if (indexInRoom > 'Z') 
        {
        	System.out.println(Integer.toString(indexInRoom));
        }
        
        System.out.println(Character.toString((char) ('A' + indexInRoom)));
    }

	@Test
    public void testgetLabel() 
	{
    	System.out.println(room.getDepartment().getName() + " " + room.getName());
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(room + "(" + indexInRoom + ")");
    }
}
