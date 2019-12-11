package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.projectjobscheduling.domain.resource.LocalResource;

public class ProjectTest 
{
    private int releaseDate;
    private int criticalPathDuration;
    private List<LocalResource> localResourceList;
    private List<Job> jobList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Project pr = new Project();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Project pr = new Project();
		pr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Project pr = new Project();
	}

	@After
	public void tearDown() throws Exception 
	{
		Project pr = new Project();
		pr = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetReleaseDate() 
	{
        //return releaseDate;
		System.out.println(releaseDate);
    }

	@Test
    public void testsetReleaseDate() 
    {
        this.releaseDate = releaseDate;
    }

	@Test
    public void testgetCriticalPathDuration() 
    {
        //return criticalPathDuration;
		System.out.println(criticalPathDuration);
    }

	@Test
    public void testsetCriticalPathDuration() 
    {
        this.criticalPathDuration = criticalPathDuration;
    }

	@Test
    public void testgetLocalResourceList() 
    {
        //return localResourceList;
		System.out.println(localResourceList);
    }

	@Test
    public void testsetLocalResourceList() 
    {
        this.localResourceList = localResourceList;
    }

	@Test
    public void testgetJobList() 
    {
        //return jobList;
		System.out.println(jobList);
    }

	@Test
    public void testsetJobList() 
    {
        this.jobList = jobList;
    }

	@Test
    public void testgetCriticalPathEndDate() 
    {
        //return releaseDate + criticalPathDuration;
        System.out.println(releaseDate + criticalPathDuration);
    }

	@Test
    public void testgetLabel() 
    {
        //return "Project " + id;
		System.out.println("Project ");
    }
}
