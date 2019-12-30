package org.optaplanner.examples.investment.domain;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.investment.domain.util.InvestmentNumericUtil;

public class AssetClassTest 
{
    private String name;
    private Region region;
    private Sector sector;
    private long expectedReturnMillis; 
    private long standardDeviationRiskMillis; 
    private Map<AssetClass, Long> correlationMillisMap;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		AssetClass ac = new AssetClass();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		AssetClass ac = new AssetClass();
		ac = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		AssetClass ac = new AssetClass();
	}

	@After
	public void tearDown() throws Exception 
	{
		AssetClass ac = new AssetClass();
		ac = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
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
    public void testgetRegion() 
    {
    	System.out.println(region);
    }

	@Test
    public void testsetRegion() 
    {
        this.region = region;
    }

	@Test
    public void testgetSector() 
    {
    	System.out.println(sector);
    }

	@Test
    public void testsetSector() 
    {
        this.sector = sector;
    }

	@Test
    public void testgetExpectedReturnMillis() 
    {
    	System.out.println(expectedReturnMillis);
    }

	@Test
    public void testsetExpectedReturnMillis() 
    {
        this.expectedReturnMillis = expectedReturnMillis;
    }

	@Test
    public void testgetStandardDeviationRiskMillis() 
    {
    	System.out.println(standardDeviationRiskMillis);
    }

	@Test
    public void testsetStandardDeviationRiskMillis() 
    {
        this.standardDeviationRiskMillis = standardDeviationRiskMillis;
    }

	@Test
    public void testgetCorrelationMillisMap() 
    {
    	System.out.println(correlationMillisMap);
    }

	@Test
    public void testsetCorrelationMillisMap() 
    {
        this.correlationMillisMap = correlationMillisMap;
    }

	@Test
    public void testgetExpectedReturnLabel() 
    {
    	System.out.println(InvestmentNumericUtil.formatMillisAsPercentage(expectedReturnMillis));
    }

	@Test
    public void testgetStandardDeviationRiskLabel() 
    {
    	System.out.println(InvestmentNumericUtil.formatMillisAsPercentage(standardDeviationRiskMillis));
    }

	@Test
    public String testgetCorrelationLabel(AssetClass other) 
    {
        long correlationMillis = correlationMillisMap.get(other);
        return InvestmentNumericUtil.formatMillisAsNumber(correlationMillis);
    }

	@Test
    public String testtoString() 
    {
        return "-" + name;
    }
}
