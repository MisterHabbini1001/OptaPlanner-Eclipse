package org.optaplanner.examples.dinnerparty.domain;
import static org.junit.Assert.*;

import java.util.EnumSet;
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
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;
import org.optaplanner.persistence.xstream.api.score.buildin.simple.SimpleScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class DinnerPartyTest 
{
    private List<Job> jobList;
    private List<Guest> guestList;
    private List<HobbyPractician> hobbyPracticianList;
    private List<Table> tableList;
    private List<Seat> seatList;
    private List<SeatDesignation> seatDesignationList;
    
    @XStreamConverter(SimpleScoreXStreamConverter.class)
    private SimpleScore score;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@ProblemFactCollectionProperty
	@Test
    public void testgetHobbySet() 
	{
        System.out.println(EnumSet.allOf(Hobby.class));
    }

    @ProblemFactCollectionProperty
    @Test
    public void testgetJobList() 
    {
    	System.out.println(jobList);
    }

    @Test
    public void testsetJobList() 
    {
        this.jobList = jobList;
    }

    @ProblemFactCollectionProperty
    @Test
    public void testgetJobSet() 
    {
    	System.out.println(EnumSet.allOf(JobType.class));
    }

    @ProblemFactCollectionProperty
    @Test
    public void testgetGuestList() 
    {
    	System.out.println(guestList);
    }

    @Test
    public void testsetGuestList() 
    {
        this.guestList = guestList;
    }

    @ProblemFactCollectionProperty
    @Test
    public void testgetHobbyPracticianList() 
    {
    	System.out.println(hobbyPracticianList);
    }

    @Test
    public void testsetHobbyPracticianList() 
    {
        this.hobbyPracticianList = hobbyPracticianList;
    }

    @ProblemFactCollectionProperty
    @Test
    public void testgetTableList() 
    {
    	System.out.println(tableList);
    }

    @Test
    public void testsetTableList() 
    {
        this.tableList = tableList;
    }

    @ValueRangeProvider(id = "seatRange")
    @ProblemFactCollectionProperty
    @Test
    public void testgetSeatList() 
    {
    	System.out.println(seatList);
    }

    @Test
    public void testsetSeatList() 
    {
        this.seatList = seatList;
    }

    @PlanningEntityCollectionProperty
    @Test
    public void testgetSeatDesignationList() 
    {
    	System.out.println(seatDesignationList);
    }

    @Test
    public void testsetSeatDesignationList() 
    {
        this.seatDesignationList = seatDesignationList;
    }

    @PlanningScore
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
}
