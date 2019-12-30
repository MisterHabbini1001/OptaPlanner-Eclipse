package org.optaplanner.examples.tennis.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;

public class TennisSolutionTest 
{
    private List<Team> teamList;
    private List<Day> dayList;
    private List<UnavailabilityPenalty> unavailabilityPenaltyList;
    private List<TeamAssignment> teamAssignmentList;
    private HardMediumSoftScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TennisSolution ts = new TennisSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TennisSolution ts = new TennisSolution();
		ts = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TennisSolution ts = new TennisSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		TennisSolution ts = new TennisSolution();
		ts = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	@ValueRangeProvider(id = "teamRange")
    @ProblemFactCollectionProperty
    public void testgetTeamList() 
	{
        System.out.println(teamList);
    }

	@Test
    public void testsetTeamList() 
	{
        this.teamList = teamList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetDayList() 
	{
		System.out.println(dayList);
    }

	@Test
    public void testsetDayList() 
	{
        this.dayList = dayList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetUnavailabilityPenaltyList() 
	{
		System.out.println(unavailabilityPenaltyList);
    }

	@Test
    public void testsetUnavailabilityPenaltyList() 
	{
        this.unavailabilityPenaltyList = unavailabilityPenaltyList;
    }

	@Test
    @PlanningEntityCollectionProperty
    public void testgetTeamAssignmentList() 
	{
		System.out.println(teamAssignmentList);
    }

	@Test
    public void testsetTeamAssignmentList() 
	{
        this.teamAssignmentList = teamAssignmentList;
    }

	@Test
    @PlanningScore
    public void testgetScore() 
	{
		System.out.println(score);
    }

	@Test
    public void testsetScore() 
	{
        this.score = score;
    }
}
