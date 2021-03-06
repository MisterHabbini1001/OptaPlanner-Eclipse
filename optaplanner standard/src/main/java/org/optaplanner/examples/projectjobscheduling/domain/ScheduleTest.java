package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.examples.projectjobscheduling.domain.resource.Resource;
import org.optaplanner.persistence.xstream.api.score.buildin.bendable.BendableScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class ScheduleTest 
{
    private List<Project> projectList;
    private List<Job> jobList;
    private List<ExecutionMode> executionModeList;
    private List<Resource> resourceList;
    private List<ResourceRequirement> resourceRequirementList;

    private List<Allocation> allocationList;

    @XStreamConverter(BendableScoreXStreamConverter.class)
    private BendableScore score;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    @ProblemFactCollectionProperty
    public void getProjectList() 
	{
        //return projectList;
		System.out.println(projectList);
    }

	@Test
    public void setProjectList() 
	{
        this.projectList = projectList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void getJobList() 
	{
        //return jobList;
		System.out.println(jobList);
    }

	@Test
    public void setJobList() 
	{
        this.jobList = jobList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void getExecutionModeList() 
	{
        //return executionModeList;
		System.out.println(executionModeList);
    }

	@Test
    public void setExecutionModeList() 
	{
        this.executionModeList = executionModeList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void getResourceList() 
	{
        //return resourceList;
		System.out.println(resourceList);
    }

	@Test
    public void setResourceList() 
	{
        this.resourceList = resourceList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void getResourceRequirementList() 
	{
        //return resourceRequirementList;
		System.out.println(resourceRequirementList);
    }

	@Test
    public void setResourceRequirementList() 
	{
        this.resourceRequirementList = resourceRequirementList;
    }

	@Test
    @PlanningEntityCollectionProperty
    public void getAllocationList() 
	{
        //return allocationList;
		System.out.println(allocationList);
    }

	@Test
    public void setAllocationList() 
	{
        this.allocationList = allocationList;
    }

	@Test
    @PlanningScore(bendableHardLevelsSize = 1, bendableSoftLevelsSize = 2)
    public void getScore() 
	{
        //return score;
		System.out.println(score);
    }

	@Test
    public void setScore() 
	{
        this.score = score;
    }
}
