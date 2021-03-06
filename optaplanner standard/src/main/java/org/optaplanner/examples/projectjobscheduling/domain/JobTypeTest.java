package org.optaplanner.examples.projectjobscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JobTypeTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		JobType jt_1 = JobType.SINK;
		JobType jt_2 = JobType.SOURCE;
		JobType jt_3 = JobType.STANDARD;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		JobType jt_1 = JobType.SINK;
		JobType jt_2 = JobType.SOURCE;
		JobType jt_3 = JobType.STANDARD;
		jt_1 = null;
		jt_2 = null;
		jt_3 = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		JobType jt_1 = JobType.SINK;
		JobType jt_2 = JobType.SOURCE;
		JobType jt_3 = JobType.STANDARD;
	}

	@After
	public void tearDown() throws Exception 
	{
		JobType jt_1 = JobType.SINK;
		JobType jt_2 = JobType.SOURCE;
		JobType jt_3 = JobType.STANDARD;
		jt_1 = null;
		jt_2 = null;
		jt_3 = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
}
