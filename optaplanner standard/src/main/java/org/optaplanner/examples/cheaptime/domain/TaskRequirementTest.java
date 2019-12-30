package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskRequirementTest 
{
    private Task task;
    private Resource resource;
    private int resourceUsage;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TaskRequirement tr = new TaskRequirement();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TaskRequirement tr = new TaskRequirement();
		tr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TaskRequirement tr = new TaskRequirement();
	}

	@After
	public void tearDown() throws Exception 
	{
		TaskRequirement tr = new TaskRequirement();
		tr = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetTask() 
    {
        System.out.println(task);
    }

	@Test
    public void testsetTask(Task task) 
    {
        this.task = task;
    }

	@Test
    public void testgetResource() 
    {
    	System.out.println(resource);
    }

	@Test
    public void testsetResource() 
    {
        this.resource = resource;
    }

	@Test
    public void testgetResourceUsage() 
    {
    	System.out.println(resourceUsage);
    }

	@Test
    public void testsetResourceUsage() 
    {
        this.resourceUsage = resourceUsage;
    }
}
