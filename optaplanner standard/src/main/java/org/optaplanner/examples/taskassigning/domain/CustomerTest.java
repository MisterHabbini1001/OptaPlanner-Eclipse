package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;  

public class CustomerTest 
{
    protected Location location;//habbo+-
    private String name;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
		c = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
		c = null;
	}
	
	@Test
	public String testgetName()
	{
		//assertEquals(2, 2); // For now. Remove later
		return name;
	}
	
	@Test
	public void testsetName(String name)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.name = name;
	}
	
	@Test
	public void testgetLocation()
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
	public String testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
		return name;
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		return name;
	}
}
