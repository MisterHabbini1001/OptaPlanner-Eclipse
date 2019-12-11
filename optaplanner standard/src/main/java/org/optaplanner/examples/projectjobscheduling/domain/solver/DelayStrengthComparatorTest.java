package org.optaplanner.examples.projectjobscheduling.domain.solver;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DelayStrengthComparatorTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		DelayStrengthComparator dsc = new DelayStrengthComparator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		DelayStrengthComparator dsc = new DelayStrengthComparator();
		dsc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		DelayStrengthComparator dsc = new DelayStrengthComparator();
	}

	@After
	public void tearDown() throws Exception 
	{
		DelayStrengthComparator dsc = new DelayStrengthComparator();
		dsc = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void compare() 
	{
        //return a.compareTo(b);
		System.out.println();
    }
}
