package org.optaplanner.examples.curriculumcourse.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CurriculumTest 
{
	private String code;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
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
