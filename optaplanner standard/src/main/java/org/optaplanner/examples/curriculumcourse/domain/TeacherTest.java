package org.optaplanner.examples.curriculumcourse.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeacherTest 
{
	private String code;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Teacher te = new Teacher();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Teacher te = new Teacher();
		te = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Teacher te = new Teacher();
	}

	@After
	public void tearDown() throws Exception 
	{
		Teacher te = new Teacher();
		te = null;
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
    public void testsetCode(String code) 
	{
        this.code = code;
    }

	@Test
    public void testgetLabel() 
	{
		System.out.println(code);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(code);
    }
}
