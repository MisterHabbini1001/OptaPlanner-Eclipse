package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.projectjobscheduling.domain.resource.Resource;

public class ResourceRequirementTest 
{
    private ExecutionMode executionMode;
    private Resource resource;
    private int requirement;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ResourceRequirement rr = new ResourceRequirement();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ResourceRequirement rr = new ResourceRequirement();
		rr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ResourceRequirement rr = new ResourceRequirement();
	}

	@After
	public void tearDown() throws Exception 
	{
		ResourceRequirement rr = new ResourceRequirement();
		rr = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetExecutionMode() 
	{
        //return executionMode;
        System.out.println(executionMode);
    }

	@Test
    public void testsetExecutionMode() 
	{
        this.executionMode = executionMode;
    }

	@Test
    public void testgetResource() 
	{
        //return resource;
        System.out.println(resource);
    }

	@Test
    public void testsetResource() 
	{
        this.resource = resource;
    }

	@Test
    public void testgetRequirement() 
	{
        //return requirement;
		System.out.println(requirement);
    }

	@Test
    public void testsetRequirement() 
	{
        this.requirement = requirement;
    }

	@Test
    public void testisResourceRenewable() 
	{
        //return resource.isRenewable();
        System.out.println(resource.isRenewable());
    }
}
