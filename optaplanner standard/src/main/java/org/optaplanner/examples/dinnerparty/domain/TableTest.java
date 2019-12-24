package org.optaplanner.examples.dinnerparty.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TableTest 
{
    private int tableIndex;
    private List<Seat> seatList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Table t = new Table();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Table t = new Table();
		t = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Table t = new Table();
	}

	@After
	public void tearDown() throws Exception 
	{
		Table t = new Table();
		t = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

    public void getTableIndex() 
    {
        System.out.println(tableIndex);
    }

    public void setTableIndex() 
    {
        this.tableIndex = tableIndex;
    }

    public void getSeatList() 
    {
    	System.out.println(seatList);
    }

    public void setSeatList() 
    {
        this.seatList = seatList;
    }

    public void toString() 
    {
    	System.out.println(0);
    }
}
