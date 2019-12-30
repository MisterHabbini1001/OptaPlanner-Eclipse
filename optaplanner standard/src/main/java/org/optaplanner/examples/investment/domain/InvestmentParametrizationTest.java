package org.optaplanner.examples.investment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvestmentParametrizationTest 
{
	private long standardDeviationMillisMaximum;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		InvestmentParametrization ip = new InvestmentParametrization();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		InvestmentParametrization ip = new InvestmentParametrization();
		ip = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		InvestmentParametrization ip = new InvestmentParametrization();
	}

	@After
	public void tearDown() throws Exception 
	{
		InvestmentParametrization ip = new InvestmentParametrization();
		ip = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetStandardDeviationMillisMaximum() 
    {
        System.out.println(standardDeviationMillisMaximum);
    }

	@Test
    public void testsetStandardDeviationMillisMaximum() 
    {
        this.standardDeviationMillisMaximum = standardDeviationMillisMaximum;
    }

	@Test
    public void testcalculateSquaredStandardDeviationFemtosMaximum() 
    {
    	System.out.println(standardDeviationMillisMaximum * standardDeviationMillisMaximum
                * 1000L * 1000L * 1000L);
    }
}