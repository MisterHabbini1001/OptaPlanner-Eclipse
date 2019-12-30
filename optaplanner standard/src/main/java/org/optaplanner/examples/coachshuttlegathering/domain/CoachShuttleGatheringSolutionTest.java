package org.optaplanner.examples.coachshuttlegathering.domain;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import org.optaplanner.examples.coachshuttlegathering.domain.location.RoadLocation;
import org.optaplanner.persistence.xstream.api.score.buildin.hardsoftlong.HardSoftLongScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class CoachShuttleGatheringSolutionTest 
{
    protected String name;
    protected List<RoadLocation> locationList;
    protected List<Coach> coachList;
    protected List<Shuttle> shuttleList;
    protected List<BusStop> stopList;
    protected BusHub hub;

    @XStreamConverter(HardSoftLongScoreXStreamConverter.class)
    protected HardSoftLongScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		CoachShuttleGatheringSolution csgs = new CoachShuttleGatheringSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		CoachShuttleGatheringSolution csgs = new CoachShuttleGatheringSolution();
		csgs = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		CoachShuttleGatheringSolution csgs = new CoachShuttleGatheringSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		CoachShuttleGatheringSolution csgs = new CoachShuttleGatheringSolution();
		csgs = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetName() 
	{
        System.out.println(name);
    }

	@Test
    public void testsetName() 
    {
        this.name = name;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetLocationList() 
    {
    	System.out.println(locationList);
    }

	@Test
    public void testsetLocationList() 
    {
        this.locationList = locationList;
    }

	@Test
    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "coachRange")
    public void testgetCoachList() 
    {
    	System.out.println(coachList);
    }

	@Test
    public void testsetCoachList() 
    {
        this.coachList = coachList;
    }

	@Test
    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "shuttleRange")
    public void testgetShuttleList() 
    {
    	System.out.println(shuttleList);
    }

	@Test
    public void testsetShuttleList() 
    {
        this.shuttleList = shuttleList;
    }

	@Test
    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "stopRange")
    public void testgetStopList() 
    {
    	System.out.println(stopList);
    }

	@Test
    public void testsetStopList() 
    {
        this.stopList = stopList;
    }

	@Test
    @ProblemFactProperty
    public void testgetHub() 
    {
    	System.out.println(hub);
    }

	@Test
    public void testsetHub() 
    {
        this.hub = hub;
    }

	@Test
    @PlanningScore
    public void testgetScore() 
    {
    	System.out.println(score);
    }

	@Test
    public void testsetScore() 
    {
        this.score = score;
    }

	@Test
    @ValueRangeProvider(id = "hubRange")
    public void testgetHubRange() 
    {
    	System.out.println(Collections.singletonList(hub));
    }

	@Test
    public void testgetBusList() 
    {
        List<Bus> busList = new ArrayList<>(coachList.size() + shuttleList.size());
        busList.addAll(coachList);
        busList.addAll(shuttleList);
        System.out.println(busList);
    }
}
