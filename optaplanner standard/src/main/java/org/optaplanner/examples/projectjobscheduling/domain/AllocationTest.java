package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.valuerange.CountableValueRange;
import org.optaplanner.core.api.domain.valuerange.ValueRangeFactory;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.projectjobscheduling.domain.solver.DelayStrengthComparator;
import org.optaplanner.examples.projectjobscheduling.domain.solver.ExecutionModeStrengthWeightFactory;
import org.optaplanner.examples.projectjobscheduling.domain.solver.PredecessorsDoneDateUpdatingVariableListener;

public class AllocationTest 
{
    private Job job;
    private Allocation sourceAllocation;
    private Allocation sinkAllocation;
    private List<Allocation> predecessorAllocationList;
    private List<Allocation> successorAllocationList;
    private ExecutionMode executionMode;
    private Integer delay; // In days
    private Integer predecessorsDoneDate;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Allocation al = new Allocation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Allocation al = new Allocation();
		al = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Allocation al = new Allocation();
	}

	@After
	public void tearDown() throws Exception 
	{
		Allocation al = new Allocation();
		al = null;
	}

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
    */
	
	@Test
    public void testgetJob() 
    {
        //return job;
		System.out.println(job);
    }

	@Test
    public void testsetJob() 
    {
        this.job = job;
    }

	@Test
    public void testgetSourceAllocation() 
    {
        //return sourceAllocation;
		System.out.println(sourceAllocation);
    }

	@Test
    public void testsetSourceAllocation() 
    {
        this.sourceAllocation = sourceAllocation;
    }

	@Test
    public void testgetSinkAllocation() 
    {
        //return sinkAllocation;
		System.out.println(sinkAllocation);
    }

	@Test
    public void testsetSinkAllocation() 
    {
        this.sinkAllocation = sinkAllocation;
    }

	@Test
    public void testgetPredecessorAllocationList() 
    {
        //return predecessorAllocationList;
        System.out.println(predecessorAllocationList);
    }

	@Test
    public void testsetPredecessorAllocationList() 
    {
        this.predecessorAllocationList = predecessorAllocationList;
    }

	@Test
    public void testgetSuccessorAllocationList() 
    {
        //return successorAllocationList;
        System.out.println(successorAllocationList);
    }

	@Test
    public void testsetSuccessorAllocationList() 
    {
        this.successorAllocationList = successorAllocationList;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"executionModeRange"},
            strengthWeightFactoryClass = ExecutionModeStrengthWeightFactory.class)
    public void testgetExecutionMode() 
    {
        //return executionMode;
        System.out.println(executionMode);
    }

	@Test
    public void testsetExecutionMode() 
    {
        this.executionMode = executionMode;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"delayRange"},
            strengthComparatorClass = DelayStrengthComparator.class)
    public void testgetDelay() 
    {
        //return delay;
        System.out.println(delay);
    }

	@Test
    public void testsetDelay() 
    {
        this.delay = delay;
    }

	@Test
    @CustomShadowVariable(variableListenerClass = PredecessorsDoneDateUpdatingVariableListener.class,
            sources = {@PlanningVariableReference(variableName = "executionMode"),
                    @PlanningVariableReference(variableName = "delay")})
    public void testgetPredecessorsDoneDate() 
    {
        //return predecessorsDoneDate;
		System.out.println(predecessorsDoneDate);
    }

	@Test
    public void testsetPredecessorsDoneDate() 
    {
        this.predecessorsDoneDate = predecessorsDoneDate;
    }

	@Test
    public void testgetStartDate() 
    {
        if (predecessorsDoneDate == null) 
        {
            //return null;
            System.out.println();
        }
        
        //return predecessorsDoneDate + (delay == null ? 0 : delay);
        System.out.println(predecessorsDoneDate + (delay == null ? 0 : delay));
    }

	@Test
    public void testgetEndDate() 
    {
        if (predecessorsDoneDate == null) 
        {
            //return null;
            System.out.println();
        }
        
        //return predecessorsDoneDate + (delay == null ? 0 : delay)
        //        + (executionMode == null ? 0 : executionMode.getDuration());
        System.out.println(predecessorsDoneDate + (delay == null ? 0 : delay)
                + (executionMode == null ? 0 : executionMode.getDuration()));
    }

	@Test
    public void testgetProject() 
    {
        //return job.getProject();
        System.out.println(job.getProject());
    }

	@Test
    public void testgetProjectCriticalPathEndDate() 
    {
        //return job.getProject().getCriticalPathEndDate();
		System.out.println(job.getProject().getCriticalPathEndDate());
    }

	@Test
    public void testgetJobType() 
    {
        //return job.getJobType();
		System.out.println(job.getJobType());
    }

	@Test
    public void testgetLabel() 
    {
        //return "Job " + job.getId();
		System.out.println("Job " + job.getId());
    }

	@Test
    @ValueRangeProvider(id = "executionModeRange")
    public void testgetExecutionModeRange() 
    {
        //return job.getExecutionModeList();
		System.out.println(job.getExecutionModeList());
    }

	@Test
    @ValueRangeProvider(id = "delayRange")
    public void testgetDelayRange() 
    {
        //return ValueRangeFactory.createIntValueRange(0, 500);
        System.out.println(ValueRangeFactory.createIntValueRange(0, 500));
    }
}
