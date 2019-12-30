package org.optaplanner.examples.tennis.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnavailabilityPenaltyTest 
{
    private Team team;
    private Day day;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		UnavailabilityPenalty up = new UnavailabilityPenalty();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		UnavailabilityPenalty up = new UnavailabilityPenalty();
		up = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		UnavailabilityPenalty up = new UnavailabilityPenalty();
	}

	@After
	public void tearDown() throws Exception 
	{
		UnavailabilityPenalty up = new UnavailabilityPenalty();
		up = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
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
    public void testgetDay() 
	{
		System.out.println(day);
    }

	@Test
    public void testsetDay() 
	{
        this.day = day;
    }
}
