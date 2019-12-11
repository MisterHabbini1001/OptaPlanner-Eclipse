package org.optaplanner.examples.projectjobscheduling.domain.solver;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionModeStrengthWeightFactoryTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ExecutionModeStrengthWeightFactory emswf = new ExecutionModeStrengthWeightFactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ExecutionModeStrengthWeightFactory emswf = new ExecutionModeStrengthWeightFactory();
		emswf = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ExecutionModeStrengthWeightFactory emswf = new ExecutionModeStrengthWeightFactory();
	}

	@After
	public void tearDown() throws Exception 
	{
		ExecutionModeStrengthWeightFactory emswf = new ExecutionModeStrengthWeightFactory();
		emswf = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
}
