package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrProcessTest {
    private MrService service;
    private int moveCost;
    private List<MrProcessRequirement> processRequirementList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrProcess mp = new MrProcess();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrProcess mp = new MrProcess();
		mp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrProcess mp = new MrProcess();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrProcess mp = new MrProcess();
		mp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetService() 
	{
        System.out.println(service);
    }

	@Test
    public void testsetService() 
	{
        this.service = service;
    }

	@Test
    public void testgetMoveCost() 
	{
    	System.out.println(moveCost);
    }

	@Test
    public void testsetMoveCost() 
	{
        this.moveCost = moveCost;
    }

	@Test
    public void testgetProcessRequirementList() 
	{
    	System.out.println(processRequirementList);
    }

	@Test
    public void testsetProcessRequirementList() 
	{
        this.processRequirementList = processRequirementList;
    }

	@Test
    public void testgetProcessRequirement() 
	{
    	System.out.println(0);
    }

	@Test
    public void testgetUsage() 
	{
    	System.out.println(0);
    }

	@Test
    public void testgetUsageMultiplicand() 
	{
        int multiplicand = 1;
        
        for (MrProcessRequirement processRequirement : processRequirementList) 
        {
            multiplicand *= processRequirement.getUsage();
        }
        
        System.out.println(multiplicand);
    }
}
