package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.core.api.domain.entity.PlanningPin;
import org.optaplanner.core.api.domain.variable.AnchorShadowVariable;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableGraphType;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.taskassigning.domain.solver.StartTimeUpdatingVariableListener;  

public class TaskTest 
{
    private TaskType taskType;
    private int indexInTaskType;
    private String code;
    private String title;
    private int duration; //in minutes
    private int responsTime; //in minutes
    private double latitude;
    private double longitude;
    private Customer customer;
    private int readyTime;
    private Priority priority;
    @PlanningPin
    private boolean pinned;

    // Planning variables: changes during planning, between score calculations.
    @PlanningVariable(valueRangeProviderRefs = {"employeeRange", "taskRange"},
            graphType = PlanningVariableGraphType.CHAINED)
    private TaskOrEmployee previousTaskOrEmployee;

    // Shadow variables
    // Task nextTask inherited from superclass
    @AnchorShadowVariable(sourceVariableName = "previousTaskOrEmployee")
    private Employee employee;
    @CustomShadowVariable(variableListenerClass = StartTimeUpdatingVariableListener.class,
            // Arguable, to adhere to API specs (although this works), nextTask and employee should also be a source,
            // because this shadow must be triggered after nextTask and employee (but there is no need to be triggered by those)
            sources = {@PlanningVariableReference(variableName = "previousTaskOrEmployee")})
    private Integer startTime; // In minutes
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Task ta = new Task();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Task ta = new Task();
		ta = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		Task ta = new Task();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		Task ta = new Task();
		ta = null;
	}
	
	@Test
	public TaskType testgetTaskType()
	{
		//assertEquals(2, 2); // For now. Remove later
		return taskType;
	}
	
	@Test
	public void testsetTaskType(TaskType taskType) 
	{
		//assertEquals(2, 2); // For now. Remove later
		this.taskType = taskType;
	}
	
	@Test
	public String testgetCode()
	{
		//assertEquals(2, 2); // For now. Remove later
		return code;
	}
	
	@Test
	public void testsetCode(String code)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.code = code;
	}
	
	@Test
	public String testgetTitle()
	{
		//assertEquals(2, 2); // For now. Remove later
		return title;
	}
	
	@Test
	public void testsetTitle(String title)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.title = title;
	}
	
	@Test
	public void testsetDuration(int duration)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.duration = duration;
	}
	
	@Test
	public int testgetResponsTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return responsTime;
	}
	
	@Test
	public void testsetResponsTime(int responsTime)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.responsTime = responsTime;
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
	public int testgetIndexInTaskType()
	{
		//assertEquals(2, 2); // For now. Remove later
		return indexInTaskType;
	}
	
	@Test
	public void testsetIndexInTaskType(int indexInTaskType)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.indexInTaskType = indexInTaskType;
	}
	
	@Test
	public Customer testgetCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		return customer;
	}
	
	@Test
	public void testsetCustomer(Customer customer)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.customer = customer;
	}
	
	@Test
	public int testgetReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return readyTime;
	}
	
	@Test
	public void testsetReadyTime(int readyTime)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.readyTime = readyTime;
	}
	
	@Test
	public Priority testgetPriority()
	{
		//assertEquals(2, 2); // For now. Remove later
		return priority;
	}
	
	@Test
	public void testsetPriority(Priority priority)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.priority = priority;
	}
	
	@Test
	public boolean testisPinned()
	{
		//assertEquals(2, 2); // For now. Remove later
		return pinned;
	}
	
	@Test
	public void testsetPinned(boolean pinned)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.pinned = pinned;
	}
	
	@Test
	public TaskOrEmployee testgetPreviousTaskOrEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		return previousTaskOrEmployee;
	}
	
	@Test
	public void testsetPreviousTaskOrEmployee(TaskOrEmployee previousTaskOrEmployee)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.previousTaskOrEmployee = previousTaskOrEmployee;
	}
	
	@Test
	public Employee testgetEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		return employee;
	}
	
	@Test
	public void testsetEmployee(Employee employee)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.employee = employee;
	}
	
	@Test
	public Integer testgetStartTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		return startTime;
	}
	
	@Test
	public void testsetStartTime(Integer startTime)
	{
		//assertEquals(2, 2); // For now. Remove later
		this.startTime = startTime;
	}
	
	@Test
	public int testgetMissingSkillCount()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (employee == null) 
        {
            return 0;
        }
        int count = 0;
        for (Skill skill : taskType.getRequiredSkillList()) 
        {
            if (!employee.getSkillSet().contains(skill)) 
            {
                count++;
            }
        }
        return count;
	}
	
	@Test
	public void testgetDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
    	if (duration == 0) 
    	{
    		Affinity affinity = testgetAffinity();
    		return taskType.getBaseDuration() * affinity.getDurationMultiplier() + testgetTravelDuration();
    	}
    	return duration + testgetTravelDuration();
	}
	
	@Test
	public Affinity testgetAffinity()
	{
		//assertEquals(2, 2); // For now. Remove later
		return (employee == null) ? Affinity.NONE : employee.getAffinity(customer);
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
		 if (startTime == null) 
	        {
	            return null;
	        }
	        return startTime + testgetDuration();
	}
	
	@Test
	public String testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
		return testgetCode() + ": " + testgetTitle();
	}
	
	@Test
	public String testgetToolText()
	{
		//assertEquals(2, 2); // For now. Remove later
        StringBuilder toolText = new StringBuilder();
        toolText.append("<html><center><b>").append(testgetLabel()).append("</b><br/><br/>");
                //.append(priority.getLabel()).append("<br/><br/>");
        int hours = getResponsTime() / 60;
        int minutes = getResponsTime() - hours * 60;
        if(minutes == 0)
        {
          toolText.append("Response Time: " + hours + ":" + minutes + "0" + "<br/>");
        }
        
        else
        {
          toolText.append("Response Time: " + hours + ":" + minutes + "<br/>");
        }
        //toolText.append("Response Time: " + getResponsTime() + "<br/>");
        toolText.append("Travel Duration: " + testgetTravelDuration() + "<br/>");
        toolText.append("Required skills:<br/>");
        for (Skill skill : taskType.getRequiredSkillList()) {
            toolText.append(skill.getLabel()).append("<br/>");
        }
        toolText.append("<br/>Customer:<br/>").append(customer.getName()).append("<br/>(")
                .append(testgetAffinity().getLabel()).append(")<br/>");
        toolText.append("</center></html>");
        return toolText.toString();
	}
	
	@Test
	public String testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		return testgetCode();
	}
	
	@Test
	public Integer testgetTravelHomeDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
    	if (latitude == 0 && longitude == 0) 
    	{
    		return 0;
    	}
    	
    	Employee employee = testgetEmployee();
    	if (employee == null) 
    	{
    		return 0;
    	}
    	
    	int timeToTravelHome = testgetAirTimeTo(latitude, longitude, employee.getLatitude(), employee.getLongitude());
    	return Math.min(timeToTravelHome, 90);
	}
	
	@Test
	public Integer testgetTravelDuration()
	{
    	//skip when no value for current position
    	if (latitude == 0 && longitude == 0) 
    	{
    		return 0;
    	}
    	//get previous position
        TaskOrEmployee previous = this.testgetPreviousTaskOrEmployee();
        if (previous == null) 
        {
        	return 0;
        }
        
        double latitudeFrom = previous.getLatitude();
        double longitudeFrom = previous.getLongitude();
        int previousEndTime = previous.getEndTime();
        //if this start is more than 6 hours from previous end, then employee leaves from home
        if (startTime != null && previousEndTime != 0) 
        {
	        if ((startTime - previousEndTime > 360))  
	        {
	        	Employee employee = testgetEmployee();
	        	latitudeFrom = employee.getLatitude();
	        	longitudeFrom = employee.getLongitude();
	        }
        }
        //skip when no previous position
        if (latitudeFrom == 0 && longitudeFrom == 0) 
        {
        	return 0;
        }
        int travelDuration = testgetAirTimeTo(latitudeFrom, longitudeFrom, latitude, longitude);
        return Math.min(travelDuration, 120);
	}
	
	@Test
	public int testgetAirTimeTo(double latitudeFrom, double longitudeFrom, double latitudeTo, double longitudeTo)
	{
		//assertEquals(2, 2); // For now. Remove later
        // Calculation are based upon Haversine formula
    	// The math module contains a function named toRadians which converts from degrees to radians
        
        double lon1 = Math.toRadians(longitudeFrom); 
        double lon2 = Math.toRadians(longitudeTo); 
        double lat1 = Math.toRadians(latitudeFrom); 
        double lat2 = Math.toRadians(latitudeTo); 
        
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
        return((int)Math.round(c * r * 60 / speed));
	}
}