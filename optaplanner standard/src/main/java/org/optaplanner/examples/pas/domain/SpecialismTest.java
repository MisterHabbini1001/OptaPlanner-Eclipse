package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpecialismTest 
{
	private String name;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Specialism sp = new Specialism();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Specialism sp = new Specialism();
		sp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Specialism sp = new Specialism();
	}

	@After
	public void tearDown() throws Exception 
	{
		Specialism sp = new Specialism();
		sp = null;
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
    public void testtoString() 
	{
    	System.out.println(name);
    }
}
