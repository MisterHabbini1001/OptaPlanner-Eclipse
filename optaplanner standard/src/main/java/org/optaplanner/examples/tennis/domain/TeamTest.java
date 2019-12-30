package org.optaplanner.examples.tennis.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeamTest 
{
	private String name;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Team t = new Team();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Team t = new Team();
		t = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Team t = new Team();
	}

	@After
	public void tearDown() throws Exception 
	{
		Team t = new Team();
		t = null;
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
    public void testgetLabel() 
	{
		System.out.println(name);
    }

	@Test
    public void testtoString() 
	{
		System.out.println(name == null ? super.toString() : name);
    }
}
