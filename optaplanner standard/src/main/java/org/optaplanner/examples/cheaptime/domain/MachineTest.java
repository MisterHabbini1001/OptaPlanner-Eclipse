package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MachineTest 
{
    private int index;
    private long powerConsumptionMicros; 
    private long spinUpDownCostMicros; 
    private List<MachineCapacity> machineCapacityList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Machine m = new Machine();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Machine m = new Machine();
		m = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Machine m = new Machine();
	}

	@After
	public void tearDown() throws Exception 
	{
		Machine m = new Machine();
		m = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetIndex() 
	{
        System.out.println(index);
    }

	@Test
    public void testsetIndex() 
	{
        this.index = index;
    }

	@Test
    public void testgetPowerConsumptionMicros() 
	{
    	System.out.println(powerConsumptionMicros);
    }

	@Test
    public void testsetPowerConsumptionMicros() 
	{
        this.powerConsumptionMicros = powerConsumptionMicros;
    }

	@Test
    public void testgetSpinUpDownCostMicros() 
	{
    	System.out.println(spinUpDownCostMicros);
    }

	@Test
    public void testsetSpinUpDownCostMicros() 
	{
        this.spinUpDownCostMicros = spinUpDownCostMicros;
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
    public void testgetLabel() 
	{
    	System.out.println("Machine");
    }
}
