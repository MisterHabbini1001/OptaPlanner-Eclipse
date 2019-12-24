package org.optaplanner.examples.meetingscheduling.domain;

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
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;

public class MeetingScheduleTest {

    @ConstraintConfigurationProvider
    private MeetingConstraintConfiguration constraintConfiguration;

    @ProblemFactCollectionProperty
    private List<Meeting> meetingList;
    @ProblemFactCollectionProperty
    private List<Day> dayList;
    @ValueRangeProvider(id = "timeGrainRange")
    @ProblemFactCollectionProperty
    private List<TimeGrain> timeGrainList;
    @ValueRangeProvider(id = "roomRange")
    @ProblemFactCollectionProperty
    private List<Room> roomList;
    @ProblemFactCollectionProperty
    private List<Person> personList;
    @ProblemFactCollectionProperty
    private List<Attendance> attendanceList;

    @PlanningEntityCollectionProperty
    private List<MeetingAssignment> meetingAssignmentList;

    @PlanningScore
    private HardMediumSoftScore score;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MeetingSchedule ms = new MeetingSchedule();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MeetingSchedule ms = new MeetingSchedule();
		ms = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MeetingSchedule ms = new MeetingSchedule();
	}

	@After
	public void tearDown() throws Exception 
	{
		MeetingSchedule ms = new MeetingSchedule();
		ms = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	public MeetingConstraintConfiguration getConstraintConfiguration() 
	{
        return constraintConfiguration;
    }

    public void setConstraintConfiguration(MeetingConstraintConfiguration constraintConfiguration) 
    {
        this.constraintConfiguration = constraintConfiguration;
    }

    public List<Meeting> getMeetingList() 
    {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) 
    {
        this.meetingList = meetingList;
    }

    public List<Day> getDayList() 
    {
        return dayList;
    }

    public void setDayList(List<Day> dayList) 
    {
        this.dayList = dayList;
    }

    public List<TimeGrain> getTimeGrainList() 
    {
        return timeGrainList;
    }

    public void setTimeGrainList(List<TimeGrain> timeGrainList) 
    {
        this.timeGrainList = timeGrainList;
    }

    public List<Room> getRoomList() 
    {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) 
    {
        this.roomList = roomList;
    }

    public List<Person> getPersonList() 
    {
        return personList;
    }

    public void setPersonList(List<Person> personList) 
    {
        this.personList = personList;
    }

    public List<Attendance> getAttendanceList() 
    {
        return attendanceList;
    }

    public void setAttendanceList(List<Attendance> attendanceList) 
    {
        this.attendanceList = attendanceList;
    }

    public List<MeetingAssignment> getMeetingAssignmentList() 
    {
        return meetingAssignmentList;
    }

    public void setMeetingAssignmentList(List<MeetingAssignment> meetingAssignmentList) 
    {
        this.meetingAssignmentList = meetingAssignmentList;
    }

    public HardMediumSoftScore getScore() 
    {
        return score;
    }

    public void setScore(HardMediumSoftScore score) 
    {
        this.score = score;
    }
}
