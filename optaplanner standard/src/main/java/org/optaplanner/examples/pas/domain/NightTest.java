package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NightTest 
{
	private int index;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Night n = new Night();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Night n = new Night();
		n = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Night n = new Night();
	}

	@After
	public void tearDown() throws Exception 
	{
		Night n = new Night();
		n = null;
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
    	System.out.println((index + 1) + "-JAN");
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(Integer.toString(index));
    }
}
