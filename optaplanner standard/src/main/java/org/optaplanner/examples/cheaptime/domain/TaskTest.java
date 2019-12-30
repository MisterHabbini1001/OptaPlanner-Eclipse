package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskTest 
{
    private long powerConsumptionMicros;
    private int duration;
    private int startPeriodRangeFrom; 
    private int startPeriodRangeTo; 
    private List<TaskRequirement> taskRequirementList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Task t = new Task();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Task t = new Task();
		t = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Task t = new Task();
	}

	@After
	public void tearDown() throws Exception 
	{
		Task t = new Task();
		t = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

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
    public void testgetDuration() 
    {
    	System.out.println(duration);
    }

	@Test
    public void testsetDuration() 
    {
        this.duration = duration;
    }

	@Test
    public void testgetStartPeriodRangeFrom() 
    {
    	System.out.println(startPeriodRangeFrom);
    }

	@Test
    public void testsetStartPeriodRangeFrom() 
    {
        this.startPeriodRangeFrom = startPeriodRangeFrom;
    }

	@Test
    public void testgetStartPeriodRangeTo() 
    {
    	System.out.println(startPeriodRangeTo);
    }

	@Test
    public void testsetStartPeriodRangeTo() 
    {
        this.startPeriodRangeTo = startPeriodRangeTo;
    }

	@Test
    public void testgetTaskRequirementList() 
    {
    	System.out.println(taskRequirementList);
    }

	@Test
    public void testsetTaskRequirementList() 
    {
        this.taskRequirementList = taskRequirementList;
    }

	@Test
    public void testgetUsage() 
    {
    	System.out.println(0);
    }

	@Test
    public void testgetResourceUsageMultiplicand() 
    {
        int multiplicand = 1;
        
        for (TaskRequirement taskRequirement : taskRequirementList) 
        {
            multiplicand *= taskRequirement.getResourceUsage();
        }
        
        System.out.println(multiplicand);
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println("Task");
    }
}
