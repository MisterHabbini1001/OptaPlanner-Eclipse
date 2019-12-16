package org.optaplanner.examples.conferencescheduling.domain;
import static org.junit.Assert.*;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TalkTypeTest 
{
    private String name;
    private Set<Timeslot> compatibleTimeslotSet;
    private Set<Room> compatibleRoomSet;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TalkType tt = new TalkType();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TalkType tt = new TalkType();
		tt = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TalkType tt = new TalkType();
	}

	@After
	public void tearDown() throws Exception 
	{
		TalkType tt = new TalkType();
		tt = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
    @Test
    public void testtoString() 
    {
        System.out.println(name);
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
    public void testgetCompatibleTimeslotSet() 
    {
    	System.out.println(compatibleTimeslotSet);
    }

    @Test
    public void testsetCompatibleTimeslotSet() 
    {
        this.compatibleTimeslotSet = compatibleTimeslotSet;
    }

    @Test
    public void testgetCompatibleRoomSet() 
    {
    	System.out.println(compatibleRoomSet);
    }

    @Test
    public void testsetCompatibleRoomSet() 
    {
        this.compatibleRoomSet = compatibleRoomSet;
    }
}
