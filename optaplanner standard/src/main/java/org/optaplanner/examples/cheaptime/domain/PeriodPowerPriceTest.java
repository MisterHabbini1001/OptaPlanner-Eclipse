package org.optaplanner.examples.cheaptime.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PeriodPowerPriceTest 
{
    private int period;
    private long powerPriceMicros;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		PeriodPowerPrice ppp = new PeriodPowerPrice();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		PeriodPowerPrice ppp = new PeriodPowerPrice();
		ppp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		PeriodPowerPrice ppp = new PeriodPowerPrice();
	}

	@After
	public void tearDown() throws Exception 
	{
		PeriodPowerPrice ppp = new PeriodPowerPrice();
		ppp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetPeriod() 
	{
        System.out.println(period);
    }

	@Test
    public void testsetPeriod() 
	{
        this.period = period;
    }

	@Test
    public void testgetPowerPriceMicros() 
	{
		System.out.println(powerPriceMicros);
    }

	@Test
    public void testsetPowerPriceMicros() 
	{
        this.powerPriceMicros = powerPriceMicros;
    }
}
