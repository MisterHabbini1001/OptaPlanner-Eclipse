package org.optaplanner.examples.conferencescheduling.domain;
import static org.junit.Assert.*;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpeakerTest 
{
    private String name;
    private Set<Timeslot> unavailableTimeslotSet;
    private Set<String> requiredTimeslotTagSet;
    private Set<String> preferredTimeslotTagSet;
    private Set<String> prohibitedTimeslotTagSet;
    private Set<String> undesiredTimeslotTagSet;
    private Set<String> requiredRoomTagSet;
    private Set<String> preferredRoomTagSet;
    private Set<String> prohibitedRoomTagSet;
    private Set<String> undesiredRoomTagSet;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Speaker sp = new Speaker();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Speaker sp = new Speaker();
		sp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Speaker sp = new Speaker();
	}

	@After
	public void tearDown() throws Exception 
	{
		Speaker sp = new Speaker();
		sp = null;
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
    public void testgetUnavailableTimeslotSet() 
    {
        System.out.println(unavailableTimeslotSet);
    }

	@Test
    public void testsetUnavailableTimeslotSet() 
    {
        this.unavailableTimeslotSet = unavailableTimeslotSet;
    }

	@Test
    public void testgetRequiredTimeslotTagSet() 
    {
        System.out.println(requiredTimeslotTagSet);
    }

	@Test
    public void testsetRequiredTimeslotTagSet() 
    {
        this.requiredTimeslotTagSet = requiredTimeslotTagSet;
    }

	@Test
    public void testgetPreferredTimeslotTagSet() 
    {
        System.out.println(preferredTimeslotTagSet);
    }

	@Test
    public void testsetPreferredTimeslotTagSet() 
    {
        this.preferredTimeslotTagSet = preferredTimeslotTagSet;
    }

	@Test
    public void testgetProhibitedTimeslotTagSet() 
    {
        System.out.println(prohibitedTimeslotTagSet);
    }

	@Test
    public void testsetProhibitedTimeslotTagSet() 
    {
        this.prohibitedTimeslotTagSet = prohibitedTimeslotTagSet;
    }

	@Test
    public void testgetUndesiredTimeslotTagSet() 
    {
        System.out.println(undesiredTimeslotTagSet);
    }

	@Test
    public void testsetUndesiredTimeslotTagSet() 
    {
        this.undesiredTimeslotTagSet = undesiredTimeslotTagSet;
    }

	@Test
    public void testgetRequiredRoomTagSet() 
    {
        System.out.println(requiredRoomTagSet);
    }

	@Test
    public void testsetRequiredRoomTagSet() 
    {
        this.requiredRoomTagSet = requiredRoomTagSet;
    }

	@Test
    public void testgetPreferredRoomTagSet() 
    {
        System.out.println(preferredRoomTagSet);
    }

	@Test
    public void testsetPreferredRoomTagSet() 
    {
        this.preferredRoomTagSet = preferredRoomTagSet;
    }

	@Test
    public void testgetProhibitedRoomTagSet() 
    {
        System.out.println(prohibitedRoomTagSet);
    }

	@Test
    public void testsetProhibitedRoomTagSet() 
    {
        this.prohibitedRoomTagSet = prohibitedRoomTagSet;
    }

	@Test
    public void testgetUndesiredRoomTagSet() 
    {
        System.out.println(undesiredRoomTagSet);
    }

	@Test
    public void testsetUndesiredRoomTagSet() 
    {
        this.undesiredRoomTagSet = undesiredRoomTagSet;
    }

	@Test
    public void testwithUnavailableTimeslotSet() 
    {
        System.out.println(this);
    }

	@Test
    public void testwithRequiredTimeslotTagSet() 
    {
        this.requiredTimeslotTagSet = requiredTimeslotTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithPreferredTimeslotTagSet() 
    {
        this.preferredTimeslotTagSet = preferredTimeslotTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithProhibitedTimeslotTagSet() 
    {
        this.prohibitedTimeslotTagSet = prohibitedTimeslotTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithUndesiredTimeslotTagSet() 
    {
        this.undesiredTimeslotTagSet = undesiredTimeslotTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithRequiredRoomTagSet() 
    {
        this.requiredRoomTagSet = requiredRoomTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithPreferredRoomTagSet() 
    {
        this.preferredRoomTagSet = preferredRoomTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithUndesiredRoomTagSet() 
    {
        this.undesiredRoomTagSet = undesiredRoomTagSet;
        System.out.println(this);
    }

	@Test
    public void testwithProhibitedRoomTagSet() 
    {
        this.prohibitedRoomTagSet = prohibitedRoomTagSet;
        System.out.println(this);
    }
}
