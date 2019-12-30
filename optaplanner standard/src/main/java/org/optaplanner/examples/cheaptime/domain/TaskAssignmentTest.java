package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.valuerange.CountableValueRange;
import org.optaplanner.core.api.domain.valuerange.ValueRangeFactory;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class TaskAssignmentTest 
{
    private Task task;
    private Machine machine;
    private Integer startPeriod;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TaskAssignment ta = new TaskAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TaskAssignment ta = new TaskAssignment();
		ta = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TaskAssignment ta = new TaskAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		TaskAssignment ta = new TaskAssignment();
		ta = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetTask() 
    {
        System.out.println(task);
    }

	@Test
    public void testsetTask() 
    {
        this.task = task;
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
    @PlanningVariable(valueRangeProviderRefs = {"startPeriodRange"})
    public void testgetStartPeriod() 
    {
    	System.out.println(startPeriod);
    }

	@Test
    public void testsetStartPeriod() 
    {
        this.startPeriod = startPeriod;
    }

	@Test
    public void testgetEndPeriod() 
    {
        if (startPeriod == null) 
        {
        	System.out.println();
        }
        
        System.out.println(startPeriod + task.getDuration());
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println(task.getLabel());
    }

	@Test
    @ValueRangeProvider(id = "startPeriodRange")
    public void testgetStartPeriodRange() 
    {
    	System.out.println(ValueRangeFactory.createIntValueRange(task.getStartPeriodRangeFrom(), task.getStartPeriodRangeTo()));
    }
}