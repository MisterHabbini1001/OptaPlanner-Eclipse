package org.optaplanner.examples.dinnerparty.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class SeatDesignationTest 
{
    private Guest guest;
    private Seat seat;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		SeatDesignation sd = new SeatDesignation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		SeatDesignation sd = new SeatDesignation();
		sd = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		SeatDesignation sd = new SeatDesignation();
	}

	@After
	public void tearDown() throws Exception 
	{
		SeatDesignation sd = new SeatDesignation();
		sd = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetGuest() 
    {
        System.out.println(guest);
    }

	@Test
    public void testsetGuest(Guest guest) 
    {
        this.guest = guest;
    }

    @PlanningVariable(valueRangeProviderRefs = {"seatRange"})
    @Test
    public void testgetSeat() 
    {
    	System.out.println(seat);
    }

    @Test
    public void testsetSeat() 
    {
        this.seat = seat;
    }

    @Test
    public void testgetGuestName() 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetGuestGender() 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetGuestJob() 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetGuestJobType() 
    {
    	System.out.println(0);
    }

    @Test
    public void testdifferentKindIfNeeded() 
    {
        JobType jobType = guest.getJob().getJobType();
        System.out.println(jobType == JobType.SOCIALITE || jobType == JobType.TEACHER);
    }

    public void testgetSeatTable() 
    {
        if (seat == null) 
        {
        	System.out.println();
        }
        
        System.out.println(seat.getTable());
    }

    public void testisRightOf() 
    {
        if (seat == null) 
        {
        	System.out.println(false);
        }
        
        System.out.println(seat.getRightSeat()); 
    }

    public void testisNeighborOf(SeatDesignation otherSeatDesignation) 
    {
        if (seat == null) 
        {
        	System.out.println(false);
        }
        
        System.out.println(seat.getLeftSeat()); 
    }

    public void testgetLabel() 
    {
    	System.out.println(guest.getLabel());
    }

    public void testtoString() 
    {
    	System.out.println(guest.toString());
    }
}