package org.optaplanner.examples.tsp.domain;
import static org.junit.Assert.*;

import java.text.NumberFormat;
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
import org.optaplanner.core.api.score.buildin.simplelong.SimpleLongScore;
import org.optaplanner.examples.tsp.domain.location.DistanceType;
import org.optaplanner.examples.tsp.domain.location.Location;
import org.optaplanner.persistence.xstream.api.score.buildin.simplelong.SimpleLongScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class TspSolutionTest 
{
    private String name;
    protected DistanceType distanceType;
    protected String distanceUnitOfMeasurement;
    private List<Location> locationList;
    private Domicile domicile;
    private List<Visit> visitList;

    @XStreamConverter(SimpleLongScoreXStreamConverter.class)
    private SimpleLongScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		TspSolution ts = new TspSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		TspSolution ts = new TspSolution();
		ts = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		TspSolution ts = new TspSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		TspSolution ts = new TspSolution();
		ts = null;
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
    public void testgetDistanceType() 
    {
    	System.out.println(distanceType);
    }

	@Test
    public void testsetDistanceType() 
    {
        this.distanceType = distanceType;
    }

	@Test
    public void testgetDistanceUnitOfMeasurement() 
    {
    	System.out.println(distanceUnitOfMeasurement);
    }

	@Test
    public void testsetDistanceUnitOfMeasurement() 
    {
        this.distanceUnitOfMeasurement = distanceUnitOfMeasurement;
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
    @ProblemFactProperty
    public void testgetDomicile() 
    {
    	System.out.println(domicile);
    }

	@Test
    public void testsetDomicile() 
    {
        this.domicile = domicile;
    }

	@Test
    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "visitRange")
    public void testgetVisitList() 
    {
    	System.out.println(visitList);
    }

	@Test
    public void testsetVisitList() 
    {
        this.visitList = visitList;
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
    @ValueRangeProvider(id = "domicileRange")
    public void testgetDomicileRange() 
    {
    	System.out.println(Collections.singletonList(domicile));
    }

	@Test
    public void testgetDistanceString() 
    {
        if (score == null) 
        {
        	System.out.println();
        }
        
        long distance = - score.getScore();
        if (distanceUnitOfMeasurement == null) 
        {
        	System.out.println(((double) distance) / 1000.0);
        }
        
        switch (distanceUnitOfMeasurement) 
        {
            case "sec":  
                long hours = distance / 3600000;
                long minutes = distance % 3600000 / 60000;
                long seconds = distance % 60000 / 1000;
                long milliseconds = distance % 1000;
                System.out.println(hours + "h " + minutes + "m " + seconds + "s " + milliseconds + "ms");
            case "km": 
            { 
                long km = distance / 1000;
                long meter = distance % 1000;
                System.out.println(km + "km " + meter + "m");
            }
            case "meter": 
            {
                long km = distance / 1000;
                long meter = distance % 1000;
                System.out.println(km + "km " + meter + "m");
            }
            default:
            	double d = (double) distance / 1000.0;
            	System.out.println(d + " " + distanceUnitOfMeasurement);
        }
    }
}
