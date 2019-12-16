package org.optaplanner.examples.conferencescheduling.domain;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.constraintweight.ConstraintConfigurationProvider;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;

public class ConferenceSolutionTest 
{
    private String conferenceName;
    @ConstraintConfigurationProvider
    private ConferenceConstraintConfiguration constraintConfiguration;

    @ProblemFactCollectionProperty
    private List<TalkType> talkTypeList;

    @ProblemFactCollectionProperty
    private List<Timeslot> timeslotList;

    @ProblemFactCollectionProperty
    private List<Room> roomList;

    @ProblemFactCollectionProperty
    private List<Speaker> speakerList;

    @PlanningEntityCollectionProperty
    private List<Talk> talkList;

    @PlanningScore
    private HardMediumSoftScore score = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ConferenceSolution cs = new ConferenceSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ConferenceSolution cs = new ConferenceSolution();
		cs = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ConferenceSolution cs = new ConferenceSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		ConferenceSolution cs = new ConferenceSolution();
		cs = null;
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
        System.out.println(conferenceName);
    }

    // ************************************************************************
    // Simple getters and setters
    // ************************************************************************

	@Test
    public void testgetConferenceName() 
	{
        System.out.println(conferenceName);
    }

	@Test
    public void testsetConferenceName() 
	{
        this.conferenceName = conferenceName;
    }

	@Test
    public void testgetConstraintConfiguration() 
	{
        System.out.println(constraintConfiguration);
    }

	@Test
    public void testsetConstraintConfiguration() 
	{
        this.constraintConfiguration = constraintConfiguration;
    }

	@Test
    public void testgetTalkTypeList() 
	{
        System.out.println(talkTypeList);
    }

	@Test
    public void testsetTalkTypeList() 
	{
        this.talkTypeList = talkTypeList;
    }

	@Test
    public void testgetTimeslotList() 
	{
        System.out.println(timeslotList);
    }

	@Test
    public void testsetTimeslotList() 
	{
        this.timeslotList = timeslotList;
    }

	@Test
    public void testgetRoomList() 
	{
        System.out.println(roomList);
    }

	@Test
    public void testsetRoomList() 
	{
        this.roomList = roomList;
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
    public void testgetTalkList() 
	{
        System.out.println(talkList);
    }

	@Test
    public void testsetTalkList() 
	{
        this.talkList = talkList;
    }

	@Test
    public void testgetScore() 
	{
        System.out.println(score);
    }

	@Test
    public void testsetScore() 
	{
        this.score = score;
    }

	@Test
    public void testwithConstraintConfiguration() 
	{
        this.constraintConfiguration = constraintConfiguration;
        System.out.println(this);
    }

	@Test
    public void testwithTalkTypeList() 
	{
        this.talkTypeList = talkTypeList;
        System.out.println(this);
    }

	@Test
    public void testwithTimeslotList() 
	{
        this.timeslotList = timeslotList;
        System.out.println(this);
    }

	@Test
    public void testwithRoomList() 
	{
        this.roomList = roomList;
        System.out.println(this);
    }

	@Test
    public void testwithSpeakerList() 
    {
        this.speakerList = speakerList;
        System.out.println(this);
    }

    @Test
    public void testwithTalkList() 
    {
        this.talkList = talkList;
        System.out.println(this);
    }
}
