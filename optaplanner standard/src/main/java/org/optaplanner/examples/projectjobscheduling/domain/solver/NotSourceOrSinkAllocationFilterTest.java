package org.optaplanner.examples.projectjobscheduling.domain.solver;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.impl.score.director.ScoreDirector;
import org.optaplanner.examples.projectjobscheduling.domain.Allocation;
import org.optaplanner.examples.projectjobscheduling.domain.JobType;
import org.optaplanner.examples.projectjobscheduling.domain.Schedule;

public class NotSourceOrSinkAllocationFilterTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		NotSourceOrSinkAllocationFilter nsosaf = new NotSourceOrSinkAllocationFilter();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		NotSourceOrSinkAllocationFilter nsosaf = new NotSourceOrSinkAllocationFilter();
		nsosaf = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		NotSourceOrSinkAllocationFilter nsosaf = new NotSourceOrSinkAllocationFilter();
	}

	@After
	public void tearDown() throws Exception 
	{
		NotSourceOrSinkAllocationFilter nsosaf = new NotSourceOrSinkAllocationFilter();
		nsosaf = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testaccept() 
    {
        JobType jobType = JobType.SINK;
        //return jobType != JobType.SOURCE && jobType != JobType.SINK;
        System.out.println(jobType != JobType.SOURCE && jobType != JobType.SINK);
    }
}
