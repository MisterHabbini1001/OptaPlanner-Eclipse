package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SkillTest 
{
	private String code;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Skill s = new Skill();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Skill s = new Skill();
		s = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Skill s = new Skill();
	}

	@After
	public void tearDown() throws Exception 
	{
		Skill s = new Skill();
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
    public void testgetCode() 
    {
        System.out.println(code);
    }

	@Test
    public void testsetCode() 
    {
        this.code = code;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(code);
    }
}