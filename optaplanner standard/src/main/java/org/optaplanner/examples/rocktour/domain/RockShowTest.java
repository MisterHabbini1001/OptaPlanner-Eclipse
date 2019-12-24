package org.optaplanner.examples.rocktour.domain;
import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.NavigableSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.AnchorShadowVariable;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableGraphType;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.rocktour.domain.solver.RockShowVariableListener;

public class RockShowTest {
    private String venueName;
    private RockLocation location;
    private int durationInHalfDay;
    private int revenueOpportunity;
    private boolean required;
    private NavigableSet<LocalDate> availableDateSet;

    @PlanningVariable(valueRangeProviderRefs = {"busRange", "showRange"}, graphType = PlanningVariableGraphType.CHAINED)
    private RockStandstill previousStandstill;
    private RockShow nextShow;

    @AnchorShadowVariable(sourceVariableName = "previousStandstill")
    private RockBus bus;

    @CustomShadowVariable(variableListenerClass = RockShowVariableListener.class,
            sources = {@PlanningVariableReference(variableName = "previousStandstill"),
            @PlanningVariableReference(variableName = "bus")})
    private LocalDate date;

    @CustomShadowVariable(variableListenerRef = @PlanningVariableReference(variableName = "date"))
    private RockTimeOfDay timeOfDay; 

    @CustomShadowVariable(variableListenerRef = @PlanningVariableReference(variableName = "date"))
    private RockStandstill hosWeekStart; 

    @CustomShadowVariable(variableListenerRef = @PlanningVariableReference(variableName = "date"))
    private Long hosWeekDrivingSecondsTotal; 
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		RockShow rs = new RockShow();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		RockShow rs = new RockShow();
		rs = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		RockShow rs = new RockShow();
	}

	@After
	public void tearDown() throws Exception 
	{
		RockShow rs = new RockShow();
		rs = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetDepartureLocation() 
    {
        System.out.println(location);
    }

	@Test
    public void testgetDepartureDate() 
    {
        if (date == null) 
        {
        	System.out.println();
        }
        
        System.out.println(date.plusDays((durationInHalfDay - 1) / 2));
    }

	@Test
    public void testgetDepartureTimeOfDay() 
    {
    	System.out.println(durationInHalfDay % 2 == 0 ? RockTimeOfDay.LATE : timeOfDay);
    }

	@Test
    public void testgetArrivalLocation() 
    {
    	System.out.println(location);
    }

	@Test
    public void testgetDrivingTimeFromPreviousStandstill() 
    {
    	System.out.println(previousStandstill.getDepartureLocation().getDrivingTimeTo(location));
    }

	@Test
    public void testgetDrivingTimeToBusArrivalLocation() 
    {
    	System.out.println(location.getDrivingTimeTo(bus.getArrivalLocation()));
    }

	@Test
    public void testgetDaysAfterBusDeparture() 
    {
    	System.out.println(DAYS.between(bus.getDepartureDate(), date));
    }

	@Test
    public void testtoString() 
    {
    	System.out.println(venueName);
    }

	@Test
    public void testgetVenueName() 
    {
    	System.out.println(venueName);
    }

	@Test
    public void testsetVenueName() 
    {
        this.venueName = venueName;
    }

	@Test
    public void testgetLocation() 
    {
    	System.out.println(location);
    }

	@Test
    public void testsetLocation() 
    {
        this.location = location;
    }

	@Test
    public void testgetDurationInHalfDay() 
    {
    	System.out.println(durationInHalfDay);
    }

	@Test
    public void testsetDurationInHalfDay() 
    {
        this.durationInHalfDay = durationInHalfDay;
    }

	@Test
    public void testgetRevenueOpportunity() 
    {
    	System.out.println(revenueOpportunity);
    }

	@Test
    public void testsetRevenueOpportunity() 
    {
        this.revenueOpportunity = revenueOpportunity;
    }

	@Test
    public void testisRequired() 
    {
    	System.out.println(required);
    }

	@Test
    public void testsetRequired() 
    {
        this.required = required;
    }

	@Test
    public void testgetAvailableDateSet() 
    {
    	System.out.println(availableDateSet);
    }

	@Test
    public void testsetAvailableDateSet() 
    {
        this.availableDateSet = availableDateSet;
    }

	@Test
    public void testgetPreviousStandstill() 
    {
    	System.out.println(previousStandstill);
    }

	@Test
    public void testsetPreviousStandstill() 
    {
        this.previousStandstill = previousStandstill;
    }

	@Test
    public void testgetNextShow() 
    {
    	System.out.println(nextShow);
    }

	@Test
    public void testsetNextShow() 
    {
        this.nextShow = nextShow;
    }

	@Test
    public void testgetBus() 
    {
    	System.out.println(bus);
    }

	@Test
    public void testsetBus() 
    {
        this.bus = bus;
    }

	@Test
    public void testgetDate() 
    {
    	System.out.println(date);
    }

	@Test
    public void testsetDate() 
    {
        this.date = date;
    }

	@Test
    public void testgetTimeOfDay() 
    {
    	System.out.println(timeOfDay);
    }

	@Test
    public void testsetTimeOfDay() 
    {
        this.timeOfDay = timeOfDay;
    }

	@Test
    public void testgetHosWeekStart() 
    {
    	System.out.println(hosWeekStart);
    }

	@Test
    public void testsetHosWeekStart() 
    {
        this.hosWeekStart = hosWeekStart;
    }

	@Test
    public void testgetHosWeekDrivingSecondsTotal() 
    {
    	System.out.println(hosWeekDrivingSecondsTotal);
    }

	@Test
    public void testsetHosWeekDrivingSecondsTotal() 
    {
        this.hosWeekDrivingSecondsTotal = hosWeekDrivingSecondsTotal;
    }
}
