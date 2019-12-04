package org.optaplanner.examples.vehiclerouting.domain.location;
import static org.junit.Assert.*;
import org.junit.*;

public class LocationTest 
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
	public String testgetName()
	{
		//assertEquals(2, 2);  // For now. Remove later
		return name;
	}
	
	@Test
	public void testsetName(String name)
	{
		//assertEquals(2, 2);  // For now. Remove later
		this.name = name;
	}
	
	@Test
	public double testgetLatitude()
	{
		//assertEquals(2, 2);  // For now. Remove later
		return latitude;
	}
	
	@Test
	public void testsetLatitude(double latitude)
	{
		//assertEquals(2, 2);  // For now. Remove later
		this.latitude = latitude;
	}
	
	@Test
	public double testgetLongitude()
	{
		//assertEquals(2, 2);  // For now. Remove later
		return longitude;
	}
	
	@Test
	public void testsetLongitude(double longitude)
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
	public double testgetAirDistanceDoubleTo(Location location)
	{
		//assertEquals(2, 2); // For now. Remove later
        double latitudeDifference = location.latitude - latitude;
        double longitudeDifference = location.longitude - longitude;
        return Math.sqrt(
                (latitudeDifference * latitudeDifference) + (longitudeDifference * longitudeDifference));
	}
	
	@Test
	public double testgetAngle(Location location)
	{
		//assertEquals(2, 2); // For now. Remove later
        // Euclidean distance (Pythagorean theorem) - not correct when the surface is a sphere
        double latitudeDifference = location.latitude - latitude;
        double longitudeDifference = location.longitude - longitude;
        return Math.atan2(latitudeDifference, longitudeDifference);
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (name == null) 
        {
            return super.toString();
        }
        
        return name;
	}
}
