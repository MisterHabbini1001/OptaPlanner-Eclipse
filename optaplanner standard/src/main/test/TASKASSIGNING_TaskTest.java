//package org.optaplanner.examples.taskassigning.domain;
import static org.junit.Assert.*;
import org.junit.*;
import org.optaplanner.core.api.domain.entity.PlanningPin;
import org.optaplanner.core.api.domain.variable.AnchorShadowVariable;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableGraphType;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.taskassigning.domain.solver.StartTimeUpdatingVariableListener;  

public class TASKASSIGNING_TaskTest 
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
	public void testgetTaskType()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return taskType;
		System.out.println(taskType);
	}
	
	@Test
	public void testsetTaskType() 
	{
		//assertEquals(2, 2); // For now. Remove later
		this.taskType = taskType;
	}
	
	@Test
	public void testgetCode()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return code;
		System.out.println(code);
	}
	
	@Test
	public void testsetCode()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.code = code;
	}
	
	@Test
	public void testgetTitle()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return title;
		System.out.println(title);
	}
	
	@Test
	public void testsetTitle()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.title = title;
	}
	
	@Test
	public void testsetDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.duration = duration;
	}
	
	@Test
	public void testgetResponsTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return responsTime;
		System.out.println(responsTime);
	}
	
	@Test
	public void testsetResponsTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.responsTime = responsTime;
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
	public void testgetIndexInTaskType()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return indexInTaskType;
		System.out.println(indexInTaskType);
	}
	
	@Test
	public void testsetIndexInTaskType()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.indexInTaskType = indexInTaskType;
	}
	
	@Test
	public void testgetCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return customer;
		System.out.println(customer);
	}
	
	@Test
	public void testsetCustomer()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.customer = customer;
	}
	
	@Test
	public void testgetReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return readyTime;
		System.out.println(readyTime);
	}
	
	@Test
	public void testsetReadyTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.readyTime = readyTime;
	}
	
	@Test
	public void testgetPriority()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return priority;
		System.out.println(priority);
	}
	
	@Test
	public void testsetPriority()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.priority = priority;
	}
	
	@Test
	public void testisPinned()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return pinned;
		System.out.println(pinned);
	}
	
	@Test
	public void testsetPinned()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.pinned = pinned;
	}
	
	@Test
	public void testgetPreviousTaskOrEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return previousTaskOrEmployee;
		System.out.println(previousTaskOrEmployee);
	}
	
	@Test
	public void testsetPreviousTaskOrEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.previousTaskOrEmployee = previousTaskOrEmployee;
	}
	
	@Test
	public void testgetEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return employee;
		System.out.println(employee);
	}
	
	@Test
	public void testsetEmployee()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.employee = employee;
	}
	
	@Test
	public void testgetStartTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return startTime;
		System.out.println(startTime);
	}
	
	@Test
	public void testsetStartTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.startTime = startTime;
	}
	
	@Test
	public void testgetMissingSkillCount()
	{
		//assertEquals(2, 2); // For now. Remove later
		Employee employee = new Employee();
		
        if (employee == null) 
        {
            //return 0;
            System.out.println(0);
        }
        
        int count = 0;
        /*
        for (Skill skill : taskType.getRequiredSkillList()) 
        {
            if (!employee.getSkillSet().contains(skill)) 
            {
                count++;
            }
        }
        */
        
        //return count;
        System.out.println(count);
	}
	
	@Test
	public void testgetDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
		int duration = 120;
		
    	if (duration == 0) 
    	{
    		//Affinity affinity = testgetAffinity();
    		//return taskType.getBaseDuration() * affinity.getDurationMultiplier() + testgetTravelDuration();
    		System.out.println(taskType.getBaseDuration());
    	}
    	
    	//return duration + testgetTravelDuration();
    	System.out.println(duration);
	}
	
	@Test
	public void testgetAffinity()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return (employee == null) ? Affinity.NONE : employee.getAffinity(customer);
		System.out.println((employee == null) ? Affinity.NONE : employee.getAffinity(customer));
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
		 if (startTime == null) 
         {
            //return null;
            System.out.println();
         }
		 
	     //return startTime + testgetDuration();
	     System.out.println(startTime);
	}
	
	@Test
	public void testgetLabel()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return testgetCode() + ": " + testgetTitle();
		System.out.println();
	}
	
	@Test
	public void testgetToolText()
	{
		//assertEquals(2, 2); // For now. Remove later
        StringBuilder toolText = new StringBuilder();
        //toolText.append("<html><center><b>").append(testgetLabel()).append("</b><br/><br/>");
                //.append(priority.getLabel()).append("<br/><br/>");
        int responsTime = 1247;
        int hours = responsTime / 60;
        int minutes = responsTime - hours * 60;
        
        if(minutes == 0)
        {
          toolText.append("Response Time: " + hours + ":" + minutes + "0" + "<br/>");
        }
        
        else
        {
          toolText.append("Response Time: " + hours + ":" + minutes + "<br/>");
        }
        
        //toolText.append("Response Time: " + getResponsTime() + "<br/>");
        //toolText.append("Travel Duration: " + testgetTravelDuration() + "<br/>");
        toolText.append("Required skills:<br/>");
        /*
        for (Skill skill : taskType.getRequiredSkillList()) 
        {
            toolText.append(skill.getLabel()).append("<br/>");
        }
        */
        
        //toolText.append("<br/>Customer:<br/>").append(customer.getName()).append("<br/>(")
        //        .append(testgetAffinity().getLabel()).append(")<br/>");
        toolText.append("</center></html>");
        //return toolText.toString();
        System.out.println(toolText.toString());
	}
	
	@Test
	public void testtoString()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return testgetCode();
		System.out.println();
	}
	
	@Test
	public void testgetTravelHomeDuration()
	{
		//assertEquals(2, 2); // For now. Remove later
    	if (latitude == 0 && longitude == 0) 
    	{
    		//return 0;
    		System.out.println(0);
    	}
    	
    	//Employee employee = testgetEmployee();
    	Employee employee = new Employee();
    	if (employee == null) 
    	{
    		//return 0;
    		System.out.println(0);
    	}
    	
    	//int timeToTravelHome = testgetAirTimeTo(latitude, longitude, employee.getLatitude(), employee.getLongitude());
    	//return Math.min(timeToTravelHome, 90);
    	System.out.println(Math.min(50, 90));
	}
	
	@Test
	public void testgetTravelDuration()
	{
    	//skip when no value for current position
    	if (latitude == 0 && longitude == 0) 
    	{
    		//return 0;
    		System.out.println(0);
    	}
    	//get previous position
        //TaskOrEmployee previous = this.testgetPreviousTaskOrEmployee();
    	/*
        if (previous == null) 
        {
        	return 0;
        }
        */
        
        //double latitudeFrom = previous.getLatitude();
        //double longitudeFrom = previous.getLongitude();
        //int previousEndTime = previous.getEndTime();
    	double latitudeFrom = 5.239021;
    	double longitudeFrom = 53.093891;
    	int previousEndTime = 960;
        //if this start is more than 6 hours from previous end, then employee leaves from home
        if (startTime != null && previousEndTime != 0) 
        {
	        if ((startTime - previousEndTime > 360))  
	        {
	        	//Employee employee = testgetEmployee();
	        	Employee employee = new Employee();
	        	latitudeFrom = employee.getLatitude();
	        	longitudeFrom = employee.getLongitude();
	        }
        }
        
        //skip when no previous position
        if (latitudeFrom == 0 && longitudeFrom == 0) 
        {
        	//return 0;
        	System.out.println(0);
        }
        
        //int travelDuration = testgetAirTimeTo(latitudeFrom, longitudeFrom, latitude, longitude);
        int travelDuration = 90;
        //return Math.min(travelDuration, 120);
        System.out.println(Math.min(travelDuration, 120));
	}
	
	@Test
	public void testgetAirTimeTo()
	{
		//assertEquals(2, 2); // For now. Remove later
        // Calculation are based upon Haversine formula
    	// The math module contains a function named toRadians which converts from degrees to radians
        
        //double lon1 = Math.toRadians(longitudeFrom); 
        //double lon2 = Math.toRadians(longitudeTo); 
        //double lat1 = Math.toRadians(latitudeFrom); 
        //double lat2 = Math.toRadians(latitudeTo); 
        
        double lon1 = Math.toRadians(53.201910); 
        double lon2 = Math.toRadians(51.923092); 
        double lat1 = Math.toRadians(5.239202); 
        double lat2 = Math.toRadians(4.628202);
        
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
        //return((int)Math.round(c * r * 60 / speed));
        System.out.println(((int)Math.round(c * r * 60 / speed)));
	}
}
