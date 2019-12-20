package org.optaplanner.examples.meetingscheduling.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MeetingTest 
{
    private String topic;
    private List<Person> speakerList;
    private String content;
    private boolean entireGroupMeeting;
    /**
     * Multiply by {@link TimeGrain#GRAIN_LENGTH_IN_MINUTES} to get duration in minutes.
     */
    private int durationInGrains;

    private List<RequiredAttendance> requiredAttendanceList;
    private List<PreferredAttendance> preferredAttendanceList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Meeting me = new Meeting();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Meeting me = new Meeting();
		me = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Meeting me = new Meeting();
	}

	@After
	public void tearDown() throws Exception 
	{
		Meeting me = new Meeting();
		me = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testgetTopic() 
	{
        System.out.println(topic);
    }

	@Test
    public void testsetTopic() 
    {
        this.topic = topic;
    }

	@Test
    public void testgetSpeakerList() 
    {
		System.out.println(speakerList);
    }

	@Test
    public void testsetSpeakerList() 
    {
        this.speakerList = speakerList;
    }

	@Test
    public void testgetContent() 
    {
		System.out.println(content);
    }

	@Test
    public void testsetContent() 
    {
        this.content = content;
    }

	@Test
    public void testisEntireGroupMeeting() 
    {
		System.out.println(entireGroupMeeting);
    }

	@Test
    public void testsetEntireGroupMeeting() 
    {
        this.entireGroupMeeting = entireGroupMeeting;
    }

	@Test
    public void testgetDurationInGrains() 
    {
		System.out.println(durationInGrains);
    }

	@Test
    public void testsetDurationInGrains() 
    {
        this.durationInGrains = durationInGrains;
    }

	@Test
    public void testgetRequiredAttendanceList() 
    {
		System.out.println(requiredAttendanceList);
    }

	@Test
    public void testsetRequiredAttendanceList() 
    {
        this.requiredAttendanceList = requiredAttendanceList;
    }

	@Test
    public void testgetPreferredAttendanceList() 
    {
		System.out.println(preferredAttendanceList);
    }

	@Test
    public void testsetPreferredAttendanceList() 
    {
        this.preferredAttendanceList = preferredAttendanceList;
    }

	@Test
    public void testgetRequiredCapacity() 
    {
		System.out.println(requiredAttendanceList.size() + preferredAttendanceList.size());
    }

	@Test
    public void testgetDurationString() 
    {
		System.out.println((durationInGrains * TimeGrain.GRAIN_LENGTH_IN_MINUTES) + " minutes");
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println(topic);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(topic);
    }
}