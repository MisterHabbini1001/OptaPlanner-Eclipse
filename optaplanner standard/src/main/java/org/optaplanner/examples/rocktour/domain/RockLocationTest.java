package org.optaplanner.examples.rocktour.domain;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RockLocationTest 
{
    protected String cityName;
    protected double latitude;
    protected double longitude;
    protected Map<RockLocation, Long> drivingSecondsMap;
    
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
	public void testgetDrivingTimeTo() 
	{
		System.out.println(0L);
    }

	@Test
    public void testgetAirDistanceTo() 
    {
    	System.out.println((long) (1000.0 + 0.5));
    }

	@Test
    public void testtoString() 
    {
    	System.out.println(cityName);
    }

	@Test
    public void testgetCityName() 
    {
    	System.out.println(cityName);
    }

	@Test
    public void testsetCityName() 
    {
        this.cityName = cityName;
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
    public void testgetDrivingSecondsMap() 
    {
    	System.out.println(drivingSecondsMap);
    }

	@Test
    public void testsetDrivingSecondsMap(Map<RockLocation, Long> drivingSecondsMap) 
    {
        this.drivingSecondsMap = drivingSecondsMap;
    }
}
