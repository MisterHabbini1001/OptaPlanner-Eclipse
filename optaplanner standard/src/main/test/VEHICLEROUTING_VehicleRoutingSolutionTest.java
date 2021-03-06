//package org.optaplanner.examples.vehiclerouting.domain;
import static org.junit.Assert.*;

import java.text.NumberFormat;
import java.util.List;

import org.junit.*;
import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import org.optaplanner.examples.vehiclerouting.domain.VehicleRoutingSolutionTest;
import org.optaplanner.examples.vehiclerouting.domain.location.DistanceType;
import org.optaplanner.examples.vehiclerouting.domain.location.Location;
import org.optaplanner.persistence.xstream.api.score.buildin.hardsoftlong.HardSoftLongScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class VEHICLEROUTING_VehicleRoutingSolutionTest 
{
    protected String name;
    protected DistanceType distanceType;
    protected String distanceUnitOfMeasurement;
    protected List<Location> locationList;
    protected List<Depot> depotList;
    protected List<Vehicle> vehicleList;
    protected List<Customer> customerList;

    @XStreamConverter(HardSoftLongScoreXStreamConverter.class)
    protected HardSoftLongScore score;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		VehicleRoutingSolutionTest vrst = new VehicleRoutingSolutionTest();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		VehicleRoutingSolutionTest vrst = new VehicleRoutingSolutionTest();
		vrst = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		VehicleRoutingSolutionTest vrst = new VehicleRoutingSolutionTest();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		VehicleRoutingSolutionTest vrst = new VehicleRoutingSolutionTest();
		vrst = null;
	}
	
	@Test
	public void testgetName()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return name;
		System.out.println(name);
	}
	
	@Test
	public void testsetName()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.name = name;
	}
	
	@Test
	public void testgetDistanceType()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return distanceType;
		System.out.println(distanceType);
	}
	
	@Test
	public void testsetDistanceType()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.distanceType = distanceType;
	}
	
	@Test
	public void testgetDistanceUnitOfMeasurement()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return distanceUnitOfMeasurement;
		System.out.println(distanceUnitOfMeasurement);
	}
	
	@Test
	public void testsetDistanceUnitOfMeasurement()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.distanceUnitOfMeasurement = distanceUnitOfMeasurement;
	}
	
	@Test
	public void testgetLocationList()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return locationList;
		System.out.println(locationList);
	}
	
	@Test
	public void testsetLocationList()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.locationList = locationList;
	}
	
	@Test
	public void testgetDepotList()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return depotList;
		System.out.println(depotList);
	}
	
	@Test
	public void testsetDepotList()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.depotList = depotList;
	}
	
	@Test
	public void testgetVehicleList()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return vehicleList;
		System.out.println(vehicleList);
	}
	
	@Test
	public void testsetVehicleList()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.vehicleList = vehicleList;
	}
	
	@Test
	public void testgetCustomerList()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return customerList;
		System.out.println(customerList);
	}
	
	@Test
	public void testsetCustomerList()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.customerList = customerList;
	}
	
	@Test
	public void testgetScore()
	{
		//assertEquals(2, 2); // For now. Remove later
		//return score;
		System.out.println(score);
	}
	
	@Test
	public void testsetScore()
	{
		//assertEquals(2, 2); // For now. Remove later
		this.score = score;
	}
	
	@Test
	public void testgetDistanceString()
	{
		//assertEquals(2, 2); // For now. Remove later
        if (score == null) 
        {
            //return null;
            System.out.println();
        }
        
        //long distance = - score.getSoftScore();
        long distance = 123;
        if (distanceUnitOfMeasurement == null) 
        {
            //return numberFormat.format(((double) distance) / 1000.0);
            System.out.println((double) distance / 1000.0);
        }
        
        /*
        switch (distanceUnitOfMeasurement) 
        {
            case "sec":  // TODO why are the values 1000 larger?
                long hours = distance / 3600000L;
                long minutes = distance % 3600000L / 60000L;
                long seconds = distance % 60000L / 1000L;
                long milliseconds = distance % 1000L;
                //return hours + "h " + minutes + "m " + seconds + "s " + milliseconds + "ms";
                System.out.println(hours + "h " + minutes + "m " + seconds + "s " + milliseconds + "ms");
            case "km": { // TODO why are the values 1000 larger?
                long km = distance / 1000L;
                long meter = distance % 1000L;
                //return km + "km " + meter + "m";
                System.out.println(km + "km " + meter + "m");
            }
            case "meter": 
            {
                long km = distance / 1000L;
                long meter = distance % 1000L;
                //return km + "km " + meter + "m";
                System.out.println(km + "km " + meter + "m");
            }
            default:
                //return numberFormat.format(((double) distance) / 1000.0) + " " + distanceUnitOfMeasurement;
                System.out.println((double) distance / 1000.0 + " " + distanceUnitOfMeasurement);
        }
        */
	}
}
