package org.optaplanner.examples.meetingscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest 
{
	private String fullName;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Person p = new Person();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Person p = new Person();
		p = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Person p = new Person();
	}

	@After
	public void tearDown() throws Exception 
	{
		Person p = new Person();
		p = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetFullName() 
    {
        System.out.println(fullName);
    }

	@Test
    public void testsetFullName() 
    {
        this.fullName = fullName;
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println(fullName);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(fullName);
    }
}
