package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EquipmentTest 
{
	private String name;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Equipment e = new Equipment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Equipment e = new Equipment();
		e = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Equipment e = new Equipment();
	}

	@After
	public void tearDown() throws Exception 
	{
		Equipment e = new Equipment();
		e = null;
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
