package org.optaplanner.examples.projectjobscheduling.domain.resource;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.projectjobscheduling.domain.Project;

public class LocalResourceTest 
{
    private Project project;
    private boolean renewable;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		LocalResource lr = new LocalResource();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		LocalResource lr = new LocalResource();
		lr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		LocalResource lr = new LocalResource();
	}

	@After
	public void tearDown() throws Exception 
	{
		LocalResource lr = new LocalResource();
		lr = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void getProject() 
	{
        //return project;
		System.out.println(project);
    }

	@Test
    public void setProject() 
	{
        this.project = project;
    }

	@Test  
    public void isRenewable() 
	{
        //return renewable;
		System.out.println(renewable);
    }

	@Test
    public void setRenewable() 
	{
        this.renewable = renewable;
    }
}
