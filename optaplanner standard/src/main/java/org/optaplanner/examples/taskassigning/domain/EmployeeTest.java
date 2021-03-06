package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import org.junit.*;  

public class EmployeeTest 
{
    private String fullName;
    private double latitude;
    private double longitude;
    private Set<Skill> skillSet;
    private Set<Capacity> capacitySet;//habbo+-
    private Map<Customer, Affinity> affinityMap;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Employee em = new Employee();
		Employee em_1 = new Employee(23948023, "Habbo Gaastra", 52.823092, 7.203820);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Employee em = new Employee();
		Employee em_1 = new Employee(23948023, "Habbo Gaastra", 52.823092, 7.203820);
		em = null;
		em_1 = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Employee em = new Employee();
		Employee em_1 = new Employee(23948023, "Habbo Gaastra", 52.823092, 7.203820);
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Employee em = new Employee();
		Employee em_1 = new Employee(23948023, "Habbo Gaastra", 52.823092, 7.203820);
		em = null;
		em_1 = null;
	}
	
	@Test
	public void testgetFullName()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return fullName;
		System.out.println(fullName);
	}
	
	@Test
	public void testsetFullName()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.fullName = fullName;
	}
	
	@Test
	public void testsetLatitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.latitude = latitude;
	}
	
	@Test
	public void testsetLongitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.longitude = longitude;
	}
	
	@Test
	public void testgetSkillSet()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return skillSet;
		System.out.println(skillSet);
	}
	
	@Test
	public void testsetSkillSet()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.skillSet = skillSet;
	}
	
	@Test
	public void testgetCapacitySet()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return capacitySet;
		System.out.println(capacitySet);
	}
	
	@Test
	public void testsetCapacitySet()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.capacitySet = capacitySet;
	}
	
	@Test
	public void testgetAffinityMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return affinityMap;
		System.out.println(affinityMap);
	}
	
	@Test
	public void testsetAffinityMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.affinityMap = affinityMap;
	}
	
	@Test
	public void testgetEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return this;
		System.out.println(this);
	}
	
	@Test
	public void testgetLatitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return latitude;
		System.out.println(latitude);
	}
	
	@Test
	public void testgetLongitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return longitude;
		System.out.println(longitude);
	}
	
	@Test
	public void testgetEndTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return 0;
		System.out.println(0);
	}
	
	@Test
	public void testgetAffinity()
	{
		//assertEquals(2, 2); // For now. Remove later
		Customer c = new Customer();
		/*
        Affinity affinity = affinityMap.get(c);
        if (affinity == null) 
        {
            affinity = Affinity.NONE;
        }
        */
        
        //return affinity;
        //System.out.println(affinity);
		System.out.println(c);
	}
	
	@Test
	public void testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return fullName;
		System.out.println(fullName);
	}
	
	@Test
	public void testgetToolText()
	{
		//assertEquals(2, 2); // For now. Remove later
        StringBuilder toolText = new StringBuilder();
        toolText.append("<html><center><b>").append(fullName).append("</b><br/><br/>");
        toolText.append("Skills:<br/>");
        
        /*
        for (Skill skill : skillSet) 
        {
            toolText.append(skill.getLabel()).append("<br/>");
        }
        */
        
        toolText.append("</center></html>");
        //return toolText.toString();
        System.out.println(toolText.toString());
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return fullName;
		System.out.println(fullName);
	}
	
	private int capacityEndTime;
	
	@Test
	public void testgetCapacityEndTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return capacityEndTime;
		System.out.println(capacityEndTime);
	}
	
	@Test
	public void testgetWorkStart()
	{
		//assertEquals(2, 2); // For now. Remove later
		int startTime = 1200;
    	if (capacitySet == null || capacitySet.isEmpty()) 
    	{
    		//return testgetStandardStart(startTime);
    		System.out.println(startTime);
    	}
    	
    	//find the first capacity which ends after the start
    	/*
    	for (Capacity capacity : capacitySet) 
    	{
			capacityEndTime = capacity.getEndTime();    		
    		if (capacity.getEndTime() > startTime) 
    		{
    			//return capacity.getStartTime();
    			System.out.println(startTime);
    		}
    	}
    	*/
    	
    	//Set the startTime to the beginning of next day (1440) when the employee specific capacities are exceeded
    	//Only do this when the start is less than 8 hours (480)from the last found end time.
    	if (startTime - capacityEndTime < 480 ) 
    	{
    		int startOfDay = startTime - (startTime % 1440);
    		startTime = startOfDay + 1440;
    	}
    	
    	//return testgetStandardStart(startTime);
    	System.out.println(startTime);
	}
	
	@Test
	public void testgetStandardStart()
	{
		//assertEquals(2, 2); // For now. Remove later
    	//If start is after 16:00 add one day = 1440 minutes
		int startTime = 1200;
		
    	if (startTime % 1440 > 960) 
    	{
    		startTime += 1440;
    	}
    	
    	int startOfDay = startTime - (startTime % 1440);
    	//we need a standard variable to indicate the day of week;
    	//standard day starts at 08:00 = 480 minutes and ends at 16:00 = 960 minutes
    	capacityEndTime = startOfDay + 960;
    	//return startOfDay + 480;
    	System.out.println(startOfDay + 480);
	}
}
