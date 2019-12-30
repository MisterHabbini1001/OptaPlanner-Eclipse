package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MachineCapacityTest 
{
    private Machine machine;
    private Resource resource;
    private int capacity;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MachineCapacity mc = new MachineCapacity();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MachineCapacity mc = new MachineCapacity();
		mc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MachineCapacity mc = new MachineCapacity();
	}

	@After
	public void tearDown() throws Exception 
	{
		MachineCapacity mc = new MachineCapacity();
		mc = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetMachine() 
	{
        System.out.println(machine);
    }

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
    public void testgetCapacity() 
	{
    	System.out.println(capacity);
    }

	@Test
    public void testsetCapacity() 
	{
        this.capacity = capacity;
    }
}
