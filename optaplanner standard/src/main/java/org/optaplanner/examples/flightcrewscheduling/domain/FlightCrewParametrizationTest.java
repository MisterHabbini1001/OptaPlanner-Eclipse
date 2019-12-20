package org.optaplanner.examples.flightcrewscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FlightCrewParametrizationTest 
{
    public static final String REQUIRED_SKILL = "Required skill";
    public static final String FLIGHT_CONFLICT = "Flight conflict";
    public static final String TRANSFER_BETWEEN_TWO_FLIGHTS = "Transfer between two flights";
    public static final String EMPLOYEE_UNAVAILABILITY = "Employee unavailability";
    public static final String LOAD_BALANCE_FLIGHT_DURATION_TOTAL_PER_EMPLOYEE = "Load balance flight duration total per employee";
    private long loadBalanceFlightDurationTotalPerEmployee = 1;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		FlightCrewParametrization fcp = new FlightCrewParametrization();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		FlightCrewParametrization fcp = new FlightCrewParametrization();
		fcp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		FlightCrewParametrization fcp = new FlightCrewParametrization();
	}

	@After
	public void tearDown() throws Exception 
	{
		FlightCrewParametrization fcp = new FlightCrewParametrization();
		fcp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetLoadBalanceFlightDurationTotalPerEmployee() 
    {
        System.out.println(loadBalanceFlightDurationTotalPerEmployee);
    }

	@Test
    public void testsetLoadBalanceFlightDurationTotalPerEmployee() 
    {
        this.loadBalanceFlightDurationTotalPerEmployee = loadBalanceFlightDurationTotalPerEmployee;
    }
}
