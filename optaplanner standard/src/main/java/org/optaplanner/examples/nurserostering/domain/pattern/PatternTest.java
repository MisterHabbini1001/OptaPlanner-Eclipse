package org.optaplanner.examples.nurserostering.domain.pattern;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PatternTest 
{
    protected String code;
    protected int weight;
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
    public void testgetWeight() 
	{
		System.out.println(weight);
    }

	@Test
    public void testsetWeight() 
	{
        this.weight = weight;
    }

	@Test
    public void testtoString() 
	{
		System.out.println(code);
    }
}
