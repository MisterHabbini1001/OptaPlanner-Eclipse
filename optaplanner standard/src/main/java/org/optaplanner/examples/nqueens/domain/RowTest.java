package org.optaplanner.examples.nqueens.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RowTest 
{
	private int index;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Row r = new Row();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Row r = new Row();
		r = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Row r = new Row();
	}

	@After
	public void tearDown() throws Exception 
	{
		Row r = new Row();
		r = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetIndex() 
    {
        System.out.println(index);
    }

	@Test
    public void testsetIndex() 
    {
        this.index = index;
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println("Row " + index);
    }

	@Test
    public void testtoString() 
    {
    	System.out.println("Row-" + index);
    }
}
