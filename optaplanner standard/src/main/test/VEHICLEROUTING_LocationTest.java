//package org.optaplanner.examples.vehiclerouting.domain.location;
import static org.junit.Assert.*;
import org.junit.*;

public class VEHICLEROUTING_LocationTest 
{
    protected String name = null;
    protected double latitude;
    protected double longitude;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetName()
	{
		//assertEquals(2, 2);  // For now. Remove later
		//return name;
        System.out.println(name);
	}
	
	@Test
	public void testsetName()
	{
		//assertEquals(2, 2);  // For now. Remove later
		this.name = name;
	}
	
	@Test
	public void testgetLatitude()
	{
		//assertEquals(2, 2);  // For now. Remove later
		//return latitude;
        System.out.println(latitude);
	}
	
	@Test
	public void testsetLatitude()
	{
		//assertEquals(2, 2);  // For now. Remove later
		this.latitude = latitude;
	}
	
	@Test
	public void testgetLongitude()
	{
		//assertEquals(2, 2);  // For now. Remove later
		//return longitude;
		System.out.println(longitude);
	}
	
	@Test
	public void testsetLongitude()
	{
		//assertEquals(2, 2);  // For now. Remove later
		this.longitude = longitude;
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2);  // For now. Remove later
	}
	
	@Test
	public void testgetAirDistanceDoubleTo()
	{
		//assertEquals(2, 2); // For now. Remove later
        //double latitudeDifference = location.latitude - latitude;
        //double longitudeDifference = location.longitude - longitude;
		double latitudeDifference = 1.293822;
		double longitudeDifference = 2.039339;
        //return Math.sqrt((latitudeDifference * latitudeDifference) + (longitudeDifference * longitudeDifference));
        System.out.println(Math.sqrt((latitudeDifference * latitudeDifference) + (longitudeDifference * longitudeDifference)));
	}
	
	@Test
	public void testgetAngle()
	{
		//assertEquals(2, 2); // For now. Remove later
        // Euclidean distance (Pythagorean theorem) - not correct when the surface is a sphere
        //double latitudeDifference = location.latitude - latitude;
        //double longitudeDifference = location.longitude - longitude;
		double latitudeDifference = 0.793822;
		double longitudeDifference = 1.039339;
        //return Math.atan2(latitudeDifference, longitudeDifference);
		System.out.println(Math.atan2(latitudeDifference, longitudeDifference));
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		/*
        if (name == null) 
        {
            return super.toString();
        }
        
        return name;
        */
        System.out.println();
	}
}
