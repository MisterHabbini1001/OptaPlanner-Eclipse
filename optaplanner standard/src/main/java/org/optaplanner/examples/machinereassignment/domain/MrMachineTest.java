package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MrMachineTest 
{
    private MrNeighborhood neighborhood;
    private MrLocation location;
    private List<MrMachineCapacity> machineCapacityList;
    private Map<MrMachine, Integer> machineMoveCostMap; 
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrMachine mm = new MrMachine();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrMachine mm = new MrMachine();
		mm = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrMachine mm = new MrMachine();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrMachine mm = new MrMachine();
		mm = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetNeighborhood() 
	{
        System.out.println(neighborhood);
    }

	@Test
    public void testsetNeighborhood() 
	{
        this.neighborhood = neighborhood;
    }

	@Test
    public void testgetLocation() 
	{
    	System.out.println(location);
    }

	@Test
    public void testsetLocation() 
	{
        this.location = location;
    }

	@Test
    public void testgetMachineCapacityList() 
	{
    	System.out.println(machineCapacityList);
    }

	@Test
    public void testsetMachineCapacityList() 
	{
        this.machineCapacityList = machineCapacityList;
    }

	@Test
    public void testgetMachineCapacity() 
	{
    	System.out.println(0);
    }

	@Test
    public void testgetMachineMoveCostMap() 
	{
    	System.out.println(machineMoveCostMap);
    }

	@Test
    public void testsetMachineMoveCostMap() 
	{
        this.machineMoveCostMap = machineMoveCostMap;
    }

	@Test
    public void testgetLabel() 
	{
    	System.out.println("Machine ");
    }

	@Test
    public void testgetMoveCostTo() 
	{
    	System.out.println(0);
    }
}
