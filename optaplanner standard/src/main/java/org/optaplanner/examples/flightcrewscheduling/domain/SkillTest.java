package org.optaplanner.examples.flightcrewscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SkillTest 
{
	private String name;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Skill sk = new Skill();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Skill sk = new Skill();
		sk = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Skill sk = new Skill();
	}

	@After
	public void tearDown() throws Exception 
	{
		Skill sk = new Skill();
		sk = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testtoString() 
	{
        System.out.println(name);
    }

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
}
