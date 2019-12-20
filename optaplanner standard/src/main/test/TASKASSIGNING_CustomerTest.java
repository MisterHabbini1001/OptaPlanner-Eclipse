//package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;  

public class TASKASSIGNING_CustomerTest 
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
	public void testgetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return location;
		System.out.println(location);
	}
	
	@Test
	public void testsetLocation()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.location = location;
	}
	
	@Test
	public void testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return name;
		System.out.println(name);
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return name;
		System.out.println(name);
	}
}
