package org.optaplanner.examples.meetingscheduling.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreferredAttendanceTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		PreferredAttendance pa = new PreferredAttendance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		PreferredAttendance pa = new PreferredAttendance();
		pa = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		PreferredAttendance pa = new PreferredAttendance();
	}

	@After
	public void tearDown() throws Exception 
	{
		PreferredAttendance pa = new PreferredAttendance();
		pa = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
}
