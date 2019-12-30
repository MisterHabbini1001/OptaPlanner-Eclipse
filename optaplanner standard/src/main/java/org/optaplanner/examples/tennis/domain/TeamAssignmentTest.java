package org.optaplanner.examples.tennis.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.entity.PlanningPin;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class TeamAssignmentTest {
    private Day day;
    private int indexInDay;
    private boolean pinned;

    // planning variable
    private Team team;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TeamAssignment ta = new TeamAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TeamAssignment ta = new TeamAssignment();
		ta = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TeamAssignment ta = new TeamAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		TeamAssignment ta = new TeamAssignment();
		ta = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetDay() 
	{
        System.out.println(day);
    }

	@Test
    public void testsetDay() 
    {
        this.day = day;
    }

	@Test
    public void testgetIndexInDay() 
    {
    	System.out.println(indexInDay);
    }

	@Test
    public void testsetIndexInDay() 
    {
        this.indexInDay = indexInDay;
    }

	@Test
    @PlanningPin
    public void testisPinned() 
    {
    	System.out.println(pinned);
    }

	@Test
    public void testsetPinned() 
    {
        this.pinned = pinned;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"teamRange"})
    public void testgetTeam() 
    {
    	System.out.println(team);
    }

	@Test
    public void testsetTeam() 
    {
        this.team = team;
    }

	@Test
    public void testtoString() 
    {
    	System.out.println("Day-" + day.getDateIndex() + "(" + indexInDay + ")");
    }
}
