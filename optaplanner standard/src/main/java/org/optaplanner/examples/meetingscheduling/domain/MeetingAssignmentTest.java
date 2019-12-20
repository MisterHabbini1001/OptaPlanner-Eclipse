package org.optaplanner.examples.meetingscheduling.domain;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.WordUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class MeetingAssignmentTest 
{
    private Meeting meeting;
    private TimeGrain startingTimeGrain;
    private Room room;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MeetingAssignment ma = new MeetingAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MeetingAssignment ma = new MeetingAssignment();
		ma = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MeetingAssignment ma = new MeetingAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		MeetingAssignment ma = new MeetingAssignment();
		ma = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetMeeting() 
	{
        System.out.println(meeting);
    }

	@Test
    public void testsetMeeting() 
    {
        this.meeting = meeting;
    }

    @PlanningVariable(valueRangeProviderRefs = {"timeGrainRange"})
    @Test
    public void testgetStartingTimeGrain() 
    {
        System.out.println(startingTimeGrain);
    }

    @Test
    public void testsetStartingTimeGrain() 
    {
        this.startingTimeGrain = startingTimeGrain;
    }

    @PlanningVariable(valueRangeProviderRefs = {"roomRange"})
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
    public void testcalculateOverlap() 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetLastTimeGrainIndex() 
    {
        if (startingTimeGrain == null) 
        {
        	System.out.println();
        }
        
        System.out.println(startingTimeGrain.getGrainIndex() + meeting.getDurationInGrains() - 1);
    }

    @Test
    public void testgetStartingDateTimeString() 
    {
        if (startingTimeGrain == null) 
        {
        	System.out.println(0);
        }
        
        System.out.println(startingTimeGrain.getDateTimeString());
    }

    @Test
    public void testgetRoomCapacity() 
    {
        if (room == null) 
        {
        	System.out.println(0);
        }
        
        System.out.println(room.getCapacity());
    }

    @Test
    public void testgetRequiredCapacity() 
    {
    	System.out.println(meeting.getRequiredCapacity());
    }

    @Test
    public void testgetLabel() 
    {
        int wrapLength = Math.max(8 * meeting.getDurationInGrains(), 16);
        System.out.println("<html><center>" + WordUtils.wrap(meeting.getTopic(), wrapLength, "<br/>", false) + "</center></html>");
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(meeting.toString());
    }
}