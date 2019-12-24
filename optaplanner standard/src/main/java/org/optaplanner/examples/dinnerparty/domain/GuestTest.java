package org.optaplanner.examples.dinnerparty.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GuestTest 
{
    private String code;
    private String name;
    private Job job;
    private Gender gender;
    private List<HobbyPractician> hobbyPracticianList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Guest g = new Guest();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Guest g = new Guest();
		g = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Guest g = new Guest();
	}

	@After
	public void tearDown() throws Exception 
	{
		Guest g = new Guest();
		g = null;
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
    public void testgetJob() 
    {
		System.out.println(job);
    }

	@Test
    public void testsetJob() 
    {
        this.job = job;
    }

	@Test
    public void testgetGender() 
    {
		System.out.println(gender);
    }

	@Test
    public void testsetGender() 
    {
        this.gender = gender;
    }

	@Test
    public void testgetHobbyPracticianList() 
    {
		System.out.println(hobbyPracticianList);
    }

	@Test
    public void testsetHobbyPracticianList() 
    {
        this.hobbyPracticianList = hobbyPracticianList;
    }

	@Test
    public void testgetLabel() 
    {
		System.out.println(name);
    }

	@Test
    public void testtoString() 
    {
		System.out.println(name);
    }
}
