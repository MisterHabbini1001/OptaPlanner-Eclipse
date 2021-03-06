//package org.optaplanner.examples.taskassigning.domain.location;
import static org.junit.Assert.*;
import org.junit.*;

public class TASKASSIGNING_LocationTest 
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
		//assertEquals(2, 2); // For now. Remove later
		//return name;
		System.out.println(name);
	}
	
	@Test
	public void testsetName()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.name = name;
	}
	
	@Test
	public void testgetLatitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return latitude;
		System.out.println(latitude);
	}
	
	@Test
	public void testsetLatitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.latitude = latitude;
	}
	
	@Test
	public void testgetLongitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return longitude;
		System.out.println(longitude);
	}
	
	@Test
	public void testsetLongitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.longitude = longitude;
	}
	
	@Test
	public void testgetDistanceTo()
	{
		//assertEquals(2, 2); // For now. Remove later
	}
	
	@Test
	public void testgetAirDistanceDoubleTo()
	{
		//assertEquals(2, 2); // For now. Remove later
        // Calculation are based upon Haversine formula
    	// The math module contains a function named toRadians which converts from degrees to radians
        
        double lon1 = Math.toRadians(longitude); 
        //double lon2 = Math.toRadians(location.longitude);
        double lon2 = Math.toRadians(53.230920);
        double lat1 = Math.toRadians(latitude); 
        //double lat2 = Math.toRadians(location.latitude);
        double lat2 = Math.toRadians(4.892020);
        
        // Haversine formula  
        double dlon = lon2 - lon1;  
        double dlat = lat2 - lat1; 
        double a = Math.pow(Math.sin(dlat / 2), 2) 
                 + Math.cos(lat1) * Math.cos(lat2) 
                 * Math.pow(Math.sin(dlon / 2),2); 
              
        double c = 2 * Math.asin(Math.sqrt(a)); 
  
        // Radius of earth in kilometers. Use 3956  
        // for miles 
        double r = 6371; 
  
        // calculate the result
        
        //average speed over air is 68 kilometer per hour
        //return the time in minutes
        double speed = 68;
        //return(c * r * 60 / speed);
        System.out.println(c * r * 60 / speed);
	}
	
	@Test
	public void testgetAngle()
	{
		//assertEquals(2, 2); // For now. Remove later
        //double latitudeDifference = location.latitude - latitude;
        //double longitudeDifference = location.longitude - longitude;
		double latitudeDifference = 0.389202;
		double longitudeDifference = 0.403932;
        //return Math.atan2(latitudeDifference, longitudeDifference);
		System.out.println(Math.atan2(latitudeDifference, longitudeDifference));
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (name == null) 
        {
          //return super.toString();
          System.out.println(super.toString());
        }
        
        //return name;
        System.out.println(name);
	}
}
