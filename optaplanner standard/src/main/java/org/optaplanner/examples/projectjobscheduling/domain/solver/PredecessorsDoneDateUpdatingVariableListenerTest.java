package org.optaplanner.examples.projectjobscheduling.domain.solver;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PredecessorsDoneDateUpdatingVariableListenerTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		PredecessorsDoneDateUpdatingVariableListener pdduvl = new PredecessorsDoneDateUpdatingVariableListener();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		PredecessorsDoneDateUpdatingVariableListener pdduvl = new PredecessorsDoneDateUpdatingVariableListener();
		pdduvl = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		PredecessorsDoneDateUpdatingVariableListener pdduvl = new PredecessorsDoneDateUpdatingVariableListener();
	}

	@After
	public void tearDown() throws Exception 
	{
		PredecessorsDoneDateUpdatingVariableListener pdduvl = new PredecessorsDoneDateUpdatingVariableListener();
		pdduvl = null;
	}

	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
}