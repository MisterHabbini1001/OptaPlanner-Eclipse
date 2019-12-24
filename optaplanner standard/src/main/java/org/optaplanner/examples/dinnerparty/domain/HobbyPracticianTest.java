package org.optaplanner.examples.dinnerparty.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HobbyPracticianTest 
{
    private Guest guest;
    private Hobby hobby;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		HobbyPractician hp = new HobbyPractician();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		HobbyPractician hp = new HobbyPractician();
		hp = null;
	}

	@Before
	public void setUp() throws Exception 
	{		
		HobbyPractician hp = new HobbyPractician();
	}

	@After
	public void tearDown() throws Exception 
	{
		HobbyPractician hp = new HobbyPractician();
		hp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetGuest() 
    {
        System.out.println(guest);
    }

	@Test
    public void testsetGuest() 
    {
        this.guest = guest;
    }

	@Test
    public void testgetHobby() 
    {
		System.out.println(hobby);
    }

	@Test
    public void testsetHobby() 
    {
        this.hobby = hobby;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(guest + "-" + hobby);
    }
}
