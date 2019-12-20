package org.optaplanner.examples.meetingscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AttendanceTest 
{
	private Person person;
    private Meeting meeting;
    
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
    public void testgetPerson() 
    {
        System.out.println(person);
    }

	@Test
    public void testsetPerson() 
    {
        this.person = person;
    }

	@Test
    public void testgetMeeting() 
    {
		System.out.println(meeting);
    }

	@Test
    public void testsetMeeting() 
    {
        this.meeting = meeting;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(person + "-" + meeting);
    }
}
