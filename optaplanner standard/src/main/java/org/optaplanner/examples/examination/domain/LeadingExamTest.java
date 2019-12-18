package org.optaplanner.examples.examination.domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class LeadingExamTest 
{
    protected List<FollowingExam> followingExamList;
    protected Period period;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		LeadingExam le = new LeadingExam();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		LeadingExam le = new LeadingExam();
		le = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		LeadingExam le = new LeadingExam();
	}

	@After
	public void tearDown() throws Exception 
	{
		LeadingExam le = new LeadingExam();
		le = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetFollowingExamList() 
    {
        System.out.println(followingExamList);
    }

	@Test
    public void testsetFollowingExamList() 
    {
        this.followingExamList = followingExamList;
    }

    @PlanningVariable(valueRangeProviderRefs = {"periodRange"})
    @Test
    public void testgetPeriod() 
    {
    	System.out.println(period);
    }

    @Test
    public void testsetPeriod() 
    {
        this.period = period;
    }
}
