package org.optaplanner.examples.flightcrewscheduling.domain;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FlightTest 
{
    private static final Comparator<Flight> COMPARATOR = Comparator.comparing(Flight::getDepartureUTCDate)
            .thenComparing(Flight::getDepartureAirport)
            .thenComparing(Flight::getDepartureUTCDateTime)
            .thenComparing(Flight::getArrivalAirport)
            .thenComparing(Flight::getArrivalUTCDateTime);

    private String flightNumber;
    private Airport departureAirport;
    private LocalDateTime departureUTCDateTime;
    private Airport arrivalAirport;
    private LocalDateTime arrivalUTCDateTime;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Flight fl = new Flight();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Flight fl = new Flight();
		fl = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Flight fl = new Flight();
	}

	@After
	public void tearDown() throws Exception 
	{
		Flight fl = new Flight();
		fl = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetDurationInMinutes() 
	{
        System.out.println(ChronoUnit.MINUTES.between(departureUTCDateTime, arrivalUTCDateTime));
    }

	@Test
    public void testgetDepartureUTCDate() 
    {
		System.out.println(departureUTCDateTime.toLocalDate());
    }
	
	@Test
    public void testgetDepartureUTCTime() 
    {
		System.out.println(departureUTCDateTime.toLocalTime());
    }

	@Test
    public void testgetArrivalUTCDate() 
    {
		System.out.println(arrivalUTCDateTime.toLocalDate());
    }
    
	@Test
    public void testgetArrivalUTCTime() 
    {
		System.out.println(arrivalUTCDateTime.toLocalTime());
    }

	@Test
    public void testoverlaps() 
    {
		System.out.println(departureUTCDateTime.compareTo(arrivalUTCDateTime) < 0);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(flightNumber + "@" + departureUTCDateTime.toLocalDate());
    }

	@Test
    public void testgetFlightNumber() 
    {
		System.out.println(flightNumber);
    }

	@Test
    public void testsetFlightNumber() 
    {
        this.flightNumber = flightNumber;
    }

	@Test
    public void testgetDepartureAirport() 
    {
		System.out.println(departureAirport);
    }

	@Test
    public void testsetDepartureAirport() 
    {
        this.departureAirport = departureAirport;
    }

	@Test
    public void testgetDepartureUTCDateTime() 
    {
		System.out.println(departureUTCDateTime);
    }

	@Test
    public void testsetDepartureUTCDateTime() 
    {
        this.departureUTCDateTime = departureUTCDateTime;
    }

	@Test
    public void testgetArrivalAirport() 
    {
		System.out.println(arrivalAirport);
    }

	@Test
    public void testsetArrivalAirport() 
    {
        this.arrivalAirport = arrivalAirport;
    }

	@Test
    public void testgetArrivalUTCDateTime() 
    {
		System.out.println(arrivalUTCDateTime);
    }

	@Test
    public void testsetArrivalUTCDateTime() 
    {
        this.arrivalUTCDateTime = arrivalUTCDateTime;
    }

	@Test
    public void testcompareTo() 
    {
		System.out.println(0);
    }
}
