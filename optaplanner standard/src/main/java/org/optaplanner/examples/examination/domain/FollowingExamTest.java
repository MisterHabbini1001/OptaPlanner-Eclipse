package org.optaplanner.examples.examination.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.examination.domain.solver.PeriodUpdatingVariableListener;

public class FollowingExamTest 
{
    protected LeadingExam leadingExam;
	protected Period period;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		FollowingExam fe = new FollowingExam();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		FollowingExam fe = new FollowingExam();
		fe = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		FollowingExam fe = new FollowingExam();
	}

	@After
	public void tearDown() throws Exception 
	{
		FollowingExam fe = new FollowingExam();
		fe = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetLeadingExam() 
    {
        System.out.println(leadingExam);
    }

	@Test
    public void testsetLeadingExam() 
    {
        this.leadingExam = leadingExam;
    }

    @CustomShadowVariable(variableListenerClass = PeriodUpdatingVariableListener.class,
            sources = {@PlanningVariableReference(entityClass = LeadingExam.class, variableName = "period")})
    @Test
    public void testgetPeriod() 
    {
    	System.out.println(period);
    }

    @Test
    public void testsetPeriod() 
    {
        this.period = period;
    }
}
