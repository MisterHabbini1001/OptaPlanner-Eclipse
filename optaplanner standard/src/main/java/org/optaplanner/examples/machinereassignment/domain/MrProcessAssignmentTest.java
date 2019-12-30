package org.optaplanner.examples.machinereassignment.domain;
import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class MrProcessAssignmentTest 
{
    private MrProcess process;
    private MrMachine originalMachine;
    private MrMachine machine;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MrProcessAssignment mpa = new MrProcessAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MrProcessAssignment mpa = new MrProcessAssignment();
		mpa = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MrProcessAssignment mpa = new MrProcessAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		MrProcessAssignment mpa = new MrProcessAssignment();
		mpa = null;
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
    public void testgetOriginalMachine() 
	{
    	System.out.println(originalMachine);
    }

	@Test
    public void testsetOriginalMachine() 
	{
        this.originalMachine = originalMachine;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"machineRange"})
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
    public void testgetService() 
	{
    	System.out.println(process.getService());
    }

	@Test
    public void testisMoved() 
	{
    	System.out.println(!Objects.equals(originalMachine, machine));
    }

	@Test
    public void testgetProcessMoveCost() 
	{
    	System.out.println(process.getMoveCost());
    }

	@Test
    public void testgetMachineMoveCost() 
	{
    	System.out.println((machine == null || originalMachine == null) ? 0 : originalMachine.getMoveCostTo(machine));
    }

	@Test
    public void testgetNeighborhood() 
	{
    	System.out.println(machine == null ? null : machine.getNeighborhood());
    }

	@Test
    public void testgetLocation() 
	{
    	System.out.println(machine == null ? null : machine.getLocation());
    }

	@Test
    public void testgetUsage() 
	{
    	System.out.println(0);
    }

	@Test
    public void testgetLabel() 
	{
    	System.out.println("Process ");
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(process.toString());
    }
}
