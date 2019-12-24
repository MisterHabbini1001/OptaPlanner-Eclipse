package org.optaplanner.examples.meetingscheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RequiredAttendanceTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		RequiredAttendance ra = new RequiredAttendance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		RequiredAttendance ra = new RequiredAttendance();
		ra = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		RequiredAttendance ra = new RequiredAttendance();
	}

	@After
	public void tearDown() throws Exception 
	{
		RequiredAttendance ra = new RequiredAttendance();
		ra = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
}
