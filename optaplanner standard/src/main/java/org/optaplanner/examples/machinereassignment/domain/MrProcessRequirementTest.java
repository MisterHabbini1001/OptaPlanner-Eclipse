package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrProcessRequirementTest {
    private MrProcess process;
    private MrResource resource;
    private long usage;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrProcessRequirement mpr = new MrProcessRequirement();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrProcessRequirement mpr = new MrProcessRequirement();
		mpr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrProcessRequirement mpr = new MrProcessRequirement();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrProcessRequirement mpr = new MrProcessRequirement();
		mpr = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetProcess() 
	{
        System.out.println(process);
    }

	@Test
    public void testsetProcess() 
	{
        this.process = process;
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
    public void testgetUsage() 
	{
    	System.out.println(usage);
    }

	@Test
    public void testsetUsage() 
	{
        this.usage = usage;
    }
}
