package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*; 

public class SkillTest 
{
	private String name;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Skill sk = new Skill();
		Skill sk_2 = new Skill(293809, "Removing");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Skill sk = new Skill();
		Skill sk_2 = new Skill(293809, "Removing");
		sk = null;
		sk_2 = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Skill sk = new Skill();
		Skill sk_2 = new Skill(293809, "Removing");
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Skill sk = new Skill();
		Skill sk_2 = new Skill(293809, "Removing");
		sk = null;
		sk_2 = null;
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