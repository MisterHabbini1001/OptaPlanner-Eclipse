package org.optaplanner.examples.flightcrewscheduling.domain;
import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class FlightAssignmentTest 
{
    private static final Comparator<FlightAssignment> PILLAR_SEQUENCE_COMPARATOR =
            Comparator.comparing((FlightAssignment a) -> a.getFlight().getDepartureUTCDateTime())
                    .thenComparing(a -> a.getFlight().getArrivalUTCDateTime())
                    .thenComparing(FlightAssignment::getIndexInFlight);

    private Flight flight;
    private int indexInFlight;
    private Skill requiredSkill;

    @PlanningVariable(valueRangeProviderRefs = {"employeeRange"})
    private Employee employee;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		FlightAssignment fa = new FlightAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		FlightAssignment fa = new FlightAssignment();
		fa = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		FlightAssignment fa = new FlightAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		FlightAssignment fa = new FlightAssignment();
		fa = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetFlightDurationInMinutes() 
	{
        System.out.println(flight.getDurationInMinutes());
    }

	@Test
    public void testtoString() 
    {
		System.out.println(flight + "-" + indexInFlight);
    }

	@Test
    public void testgetFlight() 
    {
		System.out.println(flight);
    }

	@Test
    public void testsetFlight() 
    {
        this.flight = flight;
    }

	@Test
    public void testgetIndexInFlight() 
    {
		System.out.println(indexInFlight);
    }

	@Test
    public void testsetIndexInFlight() 
    {
        this.indexInFlight = indexInFlight;
    }

	@Test
    public void testgetRequiredSkill() 
    {
		System.out.println(requiredSkill);
    }

	@Test
    public void testsetRequiredSkill() 
    {
        this.requiredSkill = requiredSkill;
    }

	@Test
    public void testgetEmployee() 
    {
		System.out.println(employee);
    }

	@Test
    public void testsetEmployee() 
    {
        this.employee = employee;
    }

	@Test
    public void testcompareTo() 
    {
		System.out.println(0);
    }
}