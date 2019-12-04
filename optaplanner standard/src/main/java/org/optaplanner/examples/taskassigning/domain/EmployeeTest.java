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
	public String testgetFullName()
	{
		//assertEquals(2, 2); // For now. Remove later
		return fullName;
	}
	
	@Test
	public void testsetFullName(String fullName)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.fullName = fullName;
	}
	
	@Test
	public void testsetLatitude(double latitude)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.latitude = latitude;
	}
	
	@Test
	public void testsetLongitude(double longitude)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.longitude = longitude;
	}
	
	@Test
	public Set<Skill> testgetSkillSet()
	{
		//assertEquals(2, 2); // For now. Remove later
		return skillSet;
	}
	
	@Test
	public void testsetSkillSet(Set<Skill> skillSet)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.skillSet = skillSet;
	}
	
	@Test
	public Set<Capacity> testgetCapacitySet()
	{
		//assertEquals(2, 2); // For now. Remove later
		return capacitySet;
	}
	
	@Test
	public void testsetCapacitySet(Set<Capacity> capacitySet)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.capacitySet = capacitySet;
	}
	
	@Test
	public Map<Customer, Affinity> testgetAffinityMap()
	{
		//assertEquals(2, 2); // For now. Remove later
		return affinityMap;
	}
	
	@Test
	public void testsetAffinityMap(Map<Customer, Affinity> affinityMap)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.affinityMap = affinityMap;
	}
	
	@Test
	public EmployeeTest testgetEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		return this;
	}
	
	@Test
	public double testgetLatitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		return latitude;
	}
	
	@Test
	public double testgetLongitude()
	{
		//assertEquals(2, 2); // For now. Remove later
		return longitude;
	}
	
	@Test
	public Integer testgetEndTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return 0;
	}
	
	@Test
	public Affinity testgetAffinity(Customer customer)
	{
		//assertEquals(2, 2); // For now. Remove later
        Affinity affinity = affinityMap.get(customer);
        if (affinity == null) {
            affinity = Affinity.NONE;
        }
        return affinity;
	}
	
	@Test
	public String testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
		return fullName;
	}
	
	@Test
	public String testgetToolText()
	{
		//assertEquals(2, 2); // For now. Remove later
        StringBuilder toolText = new StringBuilder();
        toolText.append("<html><center><b>").append(fullName).append("</b><br/><br/>");
        toolText.append("Skills:<br/>");
        for (Skill skill : skillSet) {
            toolText.append(skill.getLabel()).append("<br/>");
        }
        toolText.append("</center></html>");
        return toolText.toString();
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		return fullName;
	}
	
	private int capacityEndTime;
	
	@Test
	public int testgetCapacityEndTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return capacityEndTime;
	}
	
	@Test
	public Integer testgetWorkStart(int startTime)
	{
		//assertEquals(2, 2); // For now. Remove later
    	if (capacitySet == null || capacitySet.isEmpty()) {
    		return getStandardStart(startTime);
    	}
    	//find the first capacity which ends after the start 
    	for (Capacity capacity : capacitySet) {
			capacityEndTime = capacity.getEndTime();    		
    		if (capacity.getEndTime() > startTime) {
    			return capacity.getStartTime();
    		}
    	}
    	//Set the startTime to the beginning of next day (1440) when the employee specific capacities are exceeded
    	//Only do this when the start is less than 8 hours (480)from the last found end time.
    	if (startTime - capacityEndTime < 480 ) {
    		int startOfDay = startTime - (startTime % 1440);
    		startTime = startOfDay + 1440;
    	}
    	return testgetStandardStart(startTime);
	}
	
	@Test
	public Integer testgetStandardStart(int startTime)
	{
		//assertEquals(2, 2); // For now. Remove later
    	//If start is after 16:00 add one day = 1440 minutes
    	if (startTime % 1440 > 960) {
    		startTime += 1440;
    	}
    	int startOfDay = startTime - (startTime % 1440);
    	//we need a standard variable to indicate the day of week;
    	//standard day starts at 08:00 = 480 minutes and ends at 16:00 = 960 minutes
    	capacityEndTime = startOfDay + 960;
    	return startOfDay + 480;
	}
}
