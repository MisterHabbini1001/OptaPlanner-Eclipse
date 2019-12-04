package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;  

public enum PriorityTest 
{
	MINOR,
    MAJOR,
    CRITICAL;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Priority pr_1 = Priority.CRITICAL;
		Priority pr_2 = Priority.MAJOR;
		Priority pr_3 = Priority.MINOR;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Priority pr_1 = Priority.CRITICAL;
		Priority pr_2 = Priority.MAJOR;
		Priority pr_3 = Priority.MINOR;
		pr_1 = null;
		pr_2 = null;
		pr_3 = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Priority pr_1 = Priority.CRITICAL;
		Priority pr_2 = Priority.MAJOR;
		Priority pr_3 = Priority.MINOR;
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Priority pr_1 = Priority.CRITICAL;
		Priority pr_2 = Priority.MAJOR;
		Priority pr_3 = Priority.MINOR;
		pr_1 = null;
		pr_2 = null;
		pr_3 = null;
	}
	
	@Test
	public String testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
        switch (this) 
        {
            case MINOR:
                return "Minor priority";
            case MAJOR:
                return "Major priority";
            case CRITICAL:
                return "Critical priority";
            default:
                throw new IllegalStateException("The priority (" + this + ") is not implemented.");
        }
	}
}
