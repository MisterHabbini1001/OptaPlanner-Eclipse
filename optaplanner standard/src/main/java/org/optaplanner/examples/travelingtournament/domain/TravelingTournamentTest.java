package org.optaplanner.examples.travelingtournament.domain;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.persistence.xstream.api.score.buildin.hardsoft.HardSoftScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class TravelingTournamentTest 
{
    private List<Day> dayList;
    private List<Team> teamList;

    private List<Match> matchList;

    @XStreamConverter(HardSoftScoreXStreamConverter.class)
    private HardSoftScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TravelingTournament tt = new TravelingTournament();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TravelingTournament tt = new TravelingTournament();
		tt = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TravelingTournament tt = new TravelingTournament();
	}

	@After
	public void tearDown() throws Exception 
	{
		TravelingTournament tt = new TravelingTournament();
		tt = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

    @ValueRangeProvider(id = "dayRange")
    @ProblemFactCollectionProperty
    @Test
    public void testgetDayList() 
    {
        System.out.println(dayList);
    }

    @Test
    public void testsetDayList() 
    {
        this.dayList = dayList;
    }

    @ProblemFactCollectionProperty
    @Test
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
    @PlanningEntityCollectionProperty
    public void testgetMatchList() 
    {
    	System.out.println(matchList);
    }

    @Test
    public void testsetMatchList() 
    {
        this.matchList = matchSets;
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

    @Test
    public void testgetN() 
    {
    	System.out.println(teamList.size());
    }

    @Test
    public void testequals() 
    {
    	System.out.println(false);
    }

    @Test
    public void testhashCode() 
    {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        for (Match match : matchList) 
        {
            // Notice: we don't use hashCode()
            hashCodeBuilder.append(match.solutionHashCode());
        }
        
        System.out.println(hashCodeBuilder.toHashCode());
    }
}