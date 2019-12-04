package org.optaplanner.examples.vehiclerouting.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;

public class DepotTest 
{	
	protected Location location;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Depot de = new Depot();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Depot de = new Depot();
		de = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Depot de = new Depot();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Depot de = new Depot();
		de = null;
	}
	
	@Test
	public Location testgetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		return location;
	}
	
	@Test
	public void testsetLocation(Location location)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.location = location;
	}
	
	@Test
	public long testgetDistanceTo(Standstill standstill)
	{
		//assertEquals(2, 2); // For now. Remove later
		return location.getDistanceTo(standstill.getLocation());
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (location.getName() == null) 
        {
            return super.toString();
        }
        
        return location.getName();
	}
}
