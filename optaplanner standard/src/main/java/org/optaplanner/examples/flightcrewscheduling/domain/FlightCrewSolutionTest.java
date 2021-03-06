package org.optaplanner.examples.flightcrewscheduling.domain;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;

public class FlightCrewSolutionTest 
{
    private LocalDate scheduleFirstUTCDate;
    private LocalDate scheduleLastUTCDate;

    @ProblemFactProperty
    private FlightCrewParametrization parametrization;

    @ProblemFactCollectionProperty
    private List<Skill> skillList;

    @ProblemFactCollectionProperty
    private List<Airport> airportList;

    @ProblemFactCollectionProperty
    @ValueRangeProvider(id = "employeeRange")
    private List<Employee> employeeList;

    @ProblemFactCollectionProperty
    private List<Flight> flightList;

    @PlanningEntityCollectionProperty
    private List<FlightAssignment> flightAssignmentList;

    @PlanningScore
    private HardSoftLongScore score = null;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		FlightCrewSolution fcs = new FlightCrewSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		FlightCrewSolution fcs = new FlightCrewSolution();
		fcs = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		FlightCrewSolution fcs = new FlightCrewSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		FlightCrewSolution fcs = new FlightCrewSolution();
		fcs = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testgetScheduleFirstUTCDate() 
	{
        System.out.println(scheduleFirstUTCDate);
    }

	@Test
    public void testsetScheduleFirstUTCDate() 
    {
        this.scheduleFirstUTCDate = scheduleFirstUTCDate;
    }

	@Test
    public void testgetScheduleLastUTCDate() 
    {
		System.out.println(scheduleLastUTCDate);
    }

	@Test
    public void testsetScheduleLastUTCDate() 
    {
        this.scheduleLastUTCDate = scheduleLastUTCDate;
    }

	@Test
    public void testgetParametrization() 
    {
		System.out.println(parametrization);
    }

	@Test
    public void testsetParametrization() 
    {
        this.parametrization = parametrization;
    }

	@Test
    public void testgetSkillList() 
    {
		System.out.println(skillList);
    }

	@Test
    public void testsetSkillList() 
    {
        this.skillList = skillList;
    }

	@Test
    public void testgetAirportList() 
    {
		System.out.println(airportList);
    }

	@Test
    public void testsetAirportList() 
    {
        this.airportList = airportList;
    }

	@Test
    public void testgetEmployeeList() 
    {
		System.out.println(employeeList);
    }

	@Test
    public void testsetEmployeeList() 
    {
        this.employeeList = employeeList;
    }

	@Test
    public void testgetFlightList() 
    {
		System.out.println(flightList);
    }

	@Test
    public void testsetFlightList() 
    {
        this.flightList = flightList;
    }

	@Test
    public void testgetFlightAssignmentList() 
    {
		System.out.println(flightAssignmentList);
    }

	@Test
    public void testsetFlightAssignmentList() 
    {
        this.flightAssignmentList = flightAssignmentList;
    }

	@Test
    public void testgetScore() 
    {
		System.out.println(score);
    }

	@Test
    public void testsetScore() 
    {
        this.score = score;
    }
}
