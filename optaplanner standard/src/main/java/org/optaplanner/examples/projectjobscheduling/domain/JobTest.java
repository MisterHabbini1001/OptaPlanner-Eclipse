package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JobTest 
{
    private Project project;
    private JobType jobType;
    private List<ExecutionMode> executionModeList;
    private List<Job> successorJobList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Job j = new Job();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Job j = new Job();
		j = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Job j = new Job();
	}

	@After
	public void tearDown() throws Exception 
	{
		Job j = new Job();
		j = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetProject() 
    {
        //return project;
        System.out.println(project);
    }

	@Test
    public void testsetProject() 
    {
        this.project = project;
    }

	@Test
    public void testgetJobType() 
    {
        //return jobType;
        System.out.println(jobType);
    }

	@Test
    public void testsetJobType() 
    {
        this.jobType = jobType;
    }

	@Test
    public void testgetExecutionModeList() 
    {
        //return executionModeList;
		System.out.println(executionModeList);
    }

	@Test
    public void testsetExecutionModeList() 
    {
        this.executionModeList = executionModeList;
    }

	@Test
    public void testgetSuccessorJobList() 
    {
        //return successorJobList;
		System.out.println(successorJobList);
    }

	@Test
    public void testsetSuccessorJobList() 
    {
        this.successorJobList = successorJobList;
    }
}
