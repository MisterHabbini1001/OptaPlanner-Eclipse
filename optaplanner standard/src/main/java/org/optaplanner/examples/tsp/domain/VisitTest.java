package org.optaplanner.examples.tsp.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableGraphType;
import org.optaplanner.examples.tsp.domain.location.Location;
import org.optaplanner.examples.tsp.domain.solver.DomicileDistanceStandstillStrengthWeightFactory;

public class VisitTest 
{
    private Location location;
    private Standstill previousStandstill;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Visit vi = new Visit();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Visit vi = new Visit();
		vi = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Visit vi = new Visit();
	}

	@After
	public void tearDown() throws Exception 
	{
		Visit vi = new Visit();
		vi = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetLocation() 
    {
        System.out.println(location);
    }

	@Test
    public void testsetLocation() 
    {
        this.location = location;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"domicileRange", "visitRange"},
            graphType = PlanningVariableGraphType.CHAINED,
            strengthWeightFactoryClass = DomicileDistanceStandstillStrengthWeightFactory.class)
    public void testgetPreviousStandstill() 
    {
    	System.out.println(previousStandstill);
    }

	@Test
    public void testsetPreviousStandstill() 
    {
        this.previousStandstill = previousStandstill;
    }

	@Test
    public void testgetDistanceFromPreviousStandstill() 
    {
        if (previousStandstill == null) 
        {
        	System.out.println(0L);
        }
        
        System.out.println(0L);
    }

	@Test
    public void testgetDistanceFrom() 
    {
    	System.out.println(0L);
    }

	@Test
    public void testgetDistanceTo() 
    {
    	System.out.println(0L);
    }

	@Test
    public void testtoString() 
    {
        if (location.getName() == null) 
        {
        	System.out.println(super.toString());
        }
        
        System.out.println(location.getName());
    }
}
