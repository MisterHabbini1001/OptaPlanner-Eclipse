package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionModeTest 
{
	private Job job;
    private int duration; // In days
    private List<ResourceRequirement> resourceRequirementList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ExecutionMode em = new ExecutionMode();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ExecutionMode em = new ExecutionMode();
		em = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ExecutionMode em = new ExecutionMode();
	}

	@After
	public void tearDown() throws Exception 
	{
		ExecutionMode em = new ExecutionMode();
		em = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
    */
	
	@Test
    public void testgetJob() 
    {
        //return job;
        System.out.println(job);
    }

	@Test
    public void testsetJob() 
    {
        this.job = job;
    }

	@Test
    public void testgetDuration() 
    {
        //return duration;
        System.out.println(duration);
    }

	@Test
    public void testsetDuration() 
    {
        this.duration = duration;
    }

	@Test
    public void testgetResourceRequirementList() 
    {
        //return resourceRequirementList;
		System.out.println(resourceRequirementList);
    }

	@Test
    public void testsetResourceRequirementList() 
	{
        this.resourceRequirementList = resourceRequirementList;
    }
}
