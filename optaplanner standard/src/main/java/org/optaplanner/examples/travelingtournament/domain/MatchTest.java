package org.optaplanner.examples.travelingtournament.domain;

import static org.junit.Assert.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class MatchTest 
{
    private Team homeTeam;
    private Team awayTeam;
    private Day day;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Match m = new Match();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Match m = new Match();
		m = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Match m = new Match();
	}

	@After
	public void tearDown() throws Exception 
	{
		Match m = new Match();
		m = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetHomeTeam() 
    {
        System.out.println(homeTeam);
    }

	@Test
    public void testsetHomeTeam() 
    {
        this.homeTeam = homeTeam;
    }

	@Test
    public void testgetAwayTeam() 
    {
    	System.out.println(awayTeam);
    }

	@Test
    public void testsetAwayTeam() 
    {
        this.awayTeam = awayTeam;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"dayRange"})
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
    public void testsolutionEquals() 
    {
    	System.out.println(false);
    }

	@Test
    public void testsolutionHashCode() 
    {
    	System.out.println(new HashCodeBuilder()
                .append(homeTeam)
                .append(awayTeam)
                .append(day)
                .toHashCode());
    }

	@Test
    public void testtoString() 
    {
    	System.out.println(homeTeam + "+" + awayTeam);
    }
}