package org.optaplanner.examples.cloudbalancing.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.examples.cloudbalancing.optional.domain.CloudComputerStrengthComparator;

public class CloudProcessTest 
{
    private int requiredCpuPower; 
    private int requiredMemory; 
    private int requiredNetworkBandwidth; 
    private CloudComputer computer;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		CloudProcess cp = new CloudProcess();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		CloudProcess cp = new CloudProcess();
		cp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		CloudProcess cp = new CloudProcess();
	}

	@After
	public void tearDown() throws Exception 
	{
		CloudProcess cp = new CloudProcess();
		cp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testgetRequiredCpuPower() 
	{
        System.out.println(requiredCpuPower);
    }

	@Test
    public void testsetRequiredCpuPower() 
    {
        this.requiredCpuPower = requiredCpuPower;
    }

	@Test
    public void testgetRequiredMemory() 
    {
    	System.out.println(requiredMemory);
    }

	@Test
    public void testsetRequiredMemory() 
    {
        this.requiredMemory = requiredMemory;
    }

	@Test
    public void testgetRequiredNetworkBandwidth() 
    {
    	System.out.println(requiredNetworkBandwidth);
    }

	@Test
    public void testsetRequiredNetworkBandwidth() 
    {
        this.requiredNetworkBandwidth = requiredNetworkBandwidth;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"computerRange"},
            strengthComparatorClass = CloudComputerStrengthComparator.class)
    public void testgetComputer() 
    {
    	System.out.println(computer);
    }

	@Test
    public void testsetComputer() 
    {
        this.computer = computer;
    }

	@Test
    public void testgetRequiredMultiplicand() 
    {
    	System.out.println(requiredCpuPower * requiredMemory * requiredNetworkBandwidth);
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println("Process");
    }
}
