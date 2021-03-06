package org.optaplanner.examples.vehiclerouting.domain.timewindowed.solver;
import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.*;
import org.optaplanner.core.impl.score.director.ScoreDirector;
import org.optaplanner.examples.vehiclerouting.domain.Customer;
import org.optaplanner.examples.vehiclerouting.domain.Standstill;
import org.optaplanner.examples.vehiclerouting.domain.Vehicle;
import org.optaplanner.examples.vehiclerouting.domain.timewindowed.TimeWindowedCustomer;
import org.optaplanner.examples.vehiclerouting.domain.timewindowed.TimeWindowedDepot; 

public class ArrivalTimeUpdatingVariableListenerTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		ArrivalTimeUpdatingVariableListener atuvl = new ArrivalTimeUpdatingVariableListener();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		ArrivalTimeUpdatingVariableListener atuvl = new ArrivalTimeUpdatingVariableListener();
		atuvl = null;
	}

	@Before
	public void setUp() throws Exception
	{
		//assertEquals(2, 2); // For now. Remove later
		ArrivalTimeUpdatingVariableListener atuvl = new ArrivalTimeUpdatingVariableListener();
	}

	@After
	public void tearDown() throws Exception 
	{
		//assertEquals(2, 2); // For now. Remove later
		ArrivalTimeUpdatingVariableListener atuvl = new ArrivalTimeUpdatingVariableListener();
		atuvl = null;
	}
	
	@Test
	public void testbeforeEntityAdded()
	{
		//assertEquals(2, 2);  // For now. Remove later
		// Do nothing
	}
	
	@Test
	public void testafterEntityAdded()
	{
		//assertEquals(2, 2);  // For now. Remove later
		/*
        if (customer instanceof TimeWindowedCustomer) 
        {
            testupdateArrivalTime(scoreDirector, (TimeWindowedCustomer) customer);
        }
        */
		
		System.out.println();
	}
	
	@Test
	public void testbeforeVariableChanged()
	{
		//assertEquals(2, 2); // For now. Remove later
		// Do nothing
	}
	
	@Test
	public void testafterVariableChanged()
	{
		//assertEquals(2, 2); // For now. Remove later
		/*
        if (customer instanceof TimeWindowedCustomer) 
        {
            updateArrivalTime(scoreDirector, (TimeWindowedCustomer) customer);
        }
        */
        
        System.out.println();
	}
	
	@Test
	public void testbeforeEntityRemoved()
	{
		//assertEquals(2, 2); // For now. Remove later
		// Do nothing
	}
	
	@Test
	public void testafterEntityRemoved()
	{
		//assertEquals(2, 2); // For now. Remove later
		// Do nothing
	}
	
	@Test
	public void testupdateArrivalTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		/*
        Standstill previousStandstill = sourceCustomer.getPreviousStandstill();
        Standstill previousStandstill = new Standstill();
        Long departureTime = previousStandstill == null ? null
                : (previousStandstill instanceof TimeWindowedCustomer)
                ? ((TimeWindowedCustomer) previousStandstill).getDepartureTime()
                : ((TimeWindowedDepot) ((Vehicle) previousStandstill).getDepot()).getReadyTime();
        TimeWindowedCustomer shadowCustomer = sourceCustomer;
        Long arrivalTime = testcalculateArrivalTime(shadowCustomer, departureTime);
        while (shadowCustomer != null && !Objects.equals(shadowCustomer.getArrivalTime(), arrivalTime)) 
        {
            //scoreDirector.beforeVariableChanged(shadowCustomer, "arrivalTime");
            shadowCustomer.setArrivalTime(arrivalTime);
            //scoreDirector.afterVariableChanged(shadowCustomer, "arrivalTime");
            departureTime = shadowCustomer.getDepartureTime();
            shadowCustomer = shadowCustomer.getNextCustomer();
            //arrivalTime = testcalculateArrivalTime(shadowCustomer, departureTime);
        }
        */
		System.out.println();
	}
	
	@Test
	public void testcalculateArrivalTime()
	{
		//assertEquals(2, 2); // For now. Remove later
		TimeWindowedCustomer customer = new TimeWindowedCustomer();
		Long previousDepartureTime = 1020L;
		
        if (customer == null || customer.getPreviousStandstill() == null) 
        {
            //return null;
            System.out.println();
        }
        
        if (customer.getPreviousStandstill() instanceof Vehicle) 
        {
            // PreviousStandstill is the Vehicle, so we leave from the Depot at the best suitable time
            //return Math.max(customer.getReadyTime(), previousDepartureTime + customer.getDistanceFromPreviousStandstill());
            System.out.println(Math.max(customer.getReadyTime(), previousDepartureTime + customer.getDistanceFromPreviousStandstill()));
        }
        
        //return previousDepartureTime + customer.getDistanceFromPreviousStandstill();
        System.out.println(previousDepartureTime + customer.getDistanceFromPreviousStandstill());
	}
}
