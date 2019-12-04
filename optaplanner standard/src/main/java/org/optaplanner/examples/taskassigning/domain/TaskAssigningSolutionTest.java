package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.List;

import org.junit.*;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.persistence.xstream.api.score.buildin.bendable.BendableScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;  

public class TaskAssigningSolutionTest 
{
    @ProblemFactCollectionProperty
    private List<Skill> skillList;
    @ProblemFactCollectionProperty
    private List<TaskType> taskTypeList;
    @ProblemFactCollectionProperty
    private List<Customer> customerList;
    //habbo+
    //@ProblemFactCollectionProperty
    private List<Capacity> capacityList;
    //habbo-
    @ValueRangeProvider(id = "employeeRange")
    @ProblemFactCollectionProperty
    private List<Employee> employeeList;

    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "taskRange")
    private List<Task> taskList;

    @XStreamConverter(BendableScoreXStreamConverter.class)
    @PlanningScore(bendableHardLevelsSize = 1, bendableSoftLevelsSize = 2)
    private BendableScore score;

    /** Relates to {@link Task#getStartTime()}. */
    private int frozenCutoff; // In minutes
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		TaskAssigningSolution tas = new TaskAssigningSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		TaskAssigningSolution tas = new TaskAssigningSolution();
		tas = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		TaskAssigningSolution tas = new TaskAssigningSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		TaskAssigningSolution tas = new TaskAssigningSolution();
		tas = null;
	}
	
	@Test
	public void testgetSkillList()
	{
		//assertEquals(2, 2);	 // For now. Remove later
	}
	
	@Test
	public void testsetSkillList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetTaskTypeList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetTaskTypeList()
	{
		//assertEquals(2, 2);	// For now. Remove later
	}
	
	@Test
	public void testgetCustomerList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetCustomerList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetEmployeeList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetEmployeeList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetTaskList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetTaskList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetCapacityList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetCapacityList()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetScore()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetScore()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetFrozenCutoff()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testsetFrozenCutoff()
	{
		assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetTravelDurationString()
	{
		assertEquals(2, 2); // For now. Remove later
	}
}
