package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrMachineCapacityTest 
{
    private MrMachine machine;
    private MrResource resource;
    private long maximumCapacity;
    private long safetyCapacity;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrMachineCapacity mmc = new MrMachineCapacity();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrMachineCapacity mmc = new MrMachineCapacity();
		mmc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrMachineCapacity mmc = new MrMachineCapacity();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrMachineCapacity mmc = new MrMachineCapacity();
		mmc = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	/*
	@Test
    public void testgetMachine() 
	{
        System.out.println(machine);
    }
    */

	@Test
    public void testsetMachine() 
	{
        this.machine = machine;
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
    public void testgetMaximumCapacity() 
	{
    	System.out.println(maximumCapacity);
    }

	@Test
    public void testsetMaximumCapacity() 
	{
        this.maximumCapacity = maximumCapacity;
    }

	@Test
    public void testgetSafetyCapacity() 
	{
    	System.out.println(safetyCapacity);
    }

	@Test
    public void testsetSafetyCapacity() 
	{
        this.safetyCapacity = safetyCapacity;
    }

	@Test
    public void testisTransientlyConsumed() 
	{
    	System.out.println(resource.isTransientlyConsumed());
    }
}