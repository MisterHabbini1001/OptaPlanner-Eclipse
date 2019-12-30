package org.optaplanner.examples.cloudbalancing.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CloudComputerTest 
{
    private int cpuPower; 
    private int memory; 
    private int networkBandwidth; 
    private int cost; 
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		CloudComputer cc = new CloudComputer();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		CloudComputer cc = new CloudComputer();
		cc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		CloudComputer cc = new CloudComputer();
	}

	@After
	public void tearDown() throws Exception 
	{
		CloudComputer cc = new CloudComputer();
		cc = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetCpuPower() 
    {
        System.out.println(cpuPower);
    }

	@Test
    public void testsetCpuPower() 
    {
        this.cpuPower = cpuPower;
    }

	@Test
    public void testgetMemory() 
    {
    	System.out.println(memory);
    }

	@Test
    public void testsetMemory() 
    {
        this.memory = memory;
    }

	@Test
    public void testgetNetworkBandwidth() 
    {
    	System.out.println(networkBandwidth);
    }

	@Test
    public void testsetNetworkBandwidth() 
    {
        this.networkBandwidth = networkBandwidth;
    }

	@Test
    public void testgetCost() 
    {
    	System.out.println(cost);
    }

	@Test
    public void testsetCost() 
    {
        this.cost = cost;
    }

	@Test
    public void testgetMultiplicand() 
    {
    	System.out.println(cpuPower * memory * networkBandwidth);
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println("Computer");
    }
}
