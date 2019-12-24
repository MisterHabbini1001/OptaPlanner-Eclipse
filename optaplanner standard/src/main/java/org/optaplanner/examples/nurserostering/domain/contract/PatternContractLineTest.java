package org.optaplanner.examples.nurserostering.domain.contract;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.nurserostering.domain.pattern.Pattern;

public class PatternContractLineTest 
{
    private Contract contract;
    private Pattern pattern;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		PatternContractLine pcl = new PatternContractLine();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		PatternContractLine pcl = new PatternContractLine();
		pcl = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		PatternContractLine pcl = new PatternContractLine();
	}

	@After
	public void tearDown() throws Exception 
	{
		PatternContractLine pcl = new PatternContractLine();
		pcl = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetContract() 
	{
        System.out.println(contract);
    }

	@Test
    public void testsetContract() 
	{
        this.contract = contract;
    }

	@Test
    public void testgetPattern() 
	{
		System.out.println(pattern);
    }

	@Test
    public void testsetPattern() 
	{
        this.pattern = pattern;
    }

	@Test
    public void testtoString() 
	{
		System.out.println(contract + "-" + pattern);
    }
}
