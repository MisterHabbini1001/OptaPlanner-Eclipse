package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrGlobalPenaltyInfoTest 
{
    private int processMoveCostWeight;
    private int serviceMoveCostWeight;
    private int machineMoveCostWeight;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrGlobalPenaltyInfo mgpi = new MrGlobalPenaltyInfo();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrGlobalPenaltyInfo mgpi = new MrGlobalPenaltyInfo();
		mgpi = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrGlobalPenaltyInfo mgpi = new MrGlobalPenaltyInfo();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrGlobalPenaltyInfo mgpi = new MrGlobalPenaltyInfo();
		mgpi = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetProcessMoveCostWeight() 
	{
        System.out.println(processMoveCostWeight);
    }

	@Test
    public void testsetProcessMoveCostWeight() 
	{
        this.processMoveCostWeight = processMoveCostWeight;
    }

	@Test
    public void testgetServiceMoveCostWeight() 
	{
    	System.out.println(serviceMoveCostWeight);
    }

	@Test
    public void testsetServiceMoveCostWeight() 
	{
        this.serviceMoveCostWeight = serviceMoveCostWeight;
    }

	@Test
    public void testgetMachineMoveCostWeight() 
	{
    	System.out.println(machineMoveCostWeight);
    }

	@Test
    public void testsetMachineMoveCostWeight() 
	{
        this.machineMoveCostWeight = machineMoveCostWeight;
    }
}
