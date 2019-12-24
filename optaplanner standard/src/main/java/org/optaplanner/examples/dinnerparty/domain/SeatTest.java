package org.optaplanner.examples.dinnerparty.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SeatTest 
{
    private Table table;
    private int seatIndexInTable;
    private Seat leftSeat;
    private Seat rightSeat;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Seat s = new Seat();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Seat s = new Seat();
		s = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Seat s = new Seat();
	}

	@After
	public void tearDown() throws Exception 
	{
		Seat s = new Seat();
		s = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetTable() 
    {
        System.out.println(table);
    }

	@Test
    public void testsetTable() 
    {
        this.table = table;
    }

	@Test
    public void testgetSeatIndexInTable() 
    {
		System.out.println(seatIndexInTable);
    }

	@Test
    public void testsetSeatIndexInTable() 
    {
        this.seatIndexInTable = seatIndexInTable;
    }

	@Test
    public void testgetLeftSeat() 
    {
		System.out.println(leftSeat);
    }

	@Test
    public void testsetLeftSeat() 
    {
        this.leftSeat = leftSeat;
    }

	@Test
    public void testgetRightSeat() 
    {
		System.out.println(rightSeat);
    }

	@Test
    public void testsetRightSeat() 
    {
        this.rightSeat = rightSeat;
    }

	@Test
    public void testgetRequiredGender() 
    {
		System.out.println((seatIndexInTable % 2 == 0) ? Gender.MALE : Gender.FEMALE);
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println("Table " + table.getTableIndex() + " seat " + seatIndexInTable);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(table + "." + seatIndexInTable);
    }
}
