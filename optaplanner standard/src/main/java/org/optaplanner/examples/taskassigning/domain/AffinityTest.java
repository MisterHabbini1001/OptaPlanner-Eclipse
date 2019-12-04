package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;  

public class AffinityTest 
{	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Affinity af_1 = Affinity.NONE;
		Affinity af_2 = Affinity.LOW;
		Affinity af_3 = Affinity.MEDIUM;
		Affinity af_4 = Affinity.HIGH;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Affinity af_1 = Affinity.NONE;
		Affinity af_2 = Affinity.LOW;
		Affinity af_3 = Affinity.MEDIUM;
		Affinity af_4 = Affinity.HIGH;
		af_1 = null;
		af_2 = null;
		af_3 = null;
		af_4 = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Affinity af_1 = Affinity.NONE;
		Affinity af_2 = Affinity.LOW;
		Affinity af_3 = Affinity.MEDIUM;
		Affinity af_4 = Affinity.HIGH;
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Affinity af_1 = Affinity.NONE;
		Affinity af_2 = Affinity.LOW;
		Affinity af_3 = Affinity.MEDIUM;
		Affinity af_4 = Affinity.HIGH;
		af_1 = null;
		af_2 = null;
		af_3 = null;
		af_4 = null;
	}
	
	@Test
	public int testgetDurationMultiplier() 
	{
		//assertEquals(2, 2); // For now. Remove later
		return 2;
	}
	
	@Test
	public String testgetLabel() 
	{
		//assertEquals(2, 2); // For now. Remove later
        switch (this) {
        case Affinity.NONE:
            return "No affinity";
        case Affinity.LOW:
            return "Low affinity";
        case Affinity.MEDIUM:
            return "Medium affinity";
        case Affinity.HIGH:
            return "High affinity";
        default:
            throw new IllegalStateException("The affinity (" + this + ") is not implemented.");
        }
	}
}
