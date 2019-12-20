package org.optaplanner.examples.flightcrewscheduling.domain;
import static org.junit.Assert.*;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AirportTest 
{
    private String code; // IATA 3-letter code
    private String name;
    private double latitude;
    private double longitude;
    private Map<Airport, Long> taxiTimeInMinutesMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
	public void testgetHaversineDistanceInKmTo() 
	{
        System.out.println(0);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(name);
    }

	@Test
    public void testgetCode() 
    {
		System.out.println(code);
    }

	@Test
    public void testsetCode() 
    {
        this.code = code;
    }

	@Test
    public void testgetName() 
    {
		System.out.println(name);
    }

	@Test
    public void testsetName() 
    {
        this.name = name;
    }

	@Test
    public void testgetLatitude() 
    {
		System.out.println(latitude);
    }

	@Test
    public void testsetLatitude() 
    {
        this.latitude = latitude;
    }

	@Test
    public void testgetLongitude() 
    {
		System.out.println(longitude);
    }

	@Test
    public void testsetLongitude() 
    {
        this.longitude = longitude;
    }

	@Test
    public void testgetTaxiTimeInMinutesMap() 
    {
		System.out.println(taxiTimeInMinutesMap);
    }

	@Test
    public void testsetTaxiTimeInMinutesMap() 
    {
        this.taxiTimeInMinutesMap = taxiTimeInMinutesMap;
    }

    @Test
    public void testcompareTo() 
    {
    	System.out.println(0);
    }
}
