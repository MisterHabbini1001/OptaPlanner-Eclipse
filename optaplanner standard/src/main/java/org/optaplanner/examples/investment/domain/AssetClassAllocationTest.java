package org.optaplanner.examples.investment.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.examples.investment.domain.util.InvestmentNumericUtil;

public class AssetClassAllocationTest 
{
    private AssetClass assetClass;
    private Long quantityMillis; 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		AssetClassAllocation aca = new AssetClassAllocation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		AssetClassAllocation aca = new AssetClassAllocation();
		aca = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		AssetClassAllocation aca = new AssetClassAllocation();
	}

	@After
	public void tearDown() throws Exception 
	{
		AssetClassAllocation aca = new AssetClassAllocation();
		aca = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public static void testcalculateSquaredStandardDeviationFemtosFromTo() 
    {
    	System.out.println(0);
    }
    
	@Test
    public void testgetAssetClass() 
    {
    	System.out.println(assetClass);
    }

	@Test
    public void testsetAssetClass() 
    {
        this.assetClass = assetClass;
    }

	@Test
    @PlanningVariable(valueRangeProviderRefs = {"quantityMillisRange"})
    public void testgetQuantityMillis() 
    {
    	System.out.println(quantityMillis);
    }

	@Test
    public void testsetQuantityMillis() 
    {
        this.quantityMillis = quantityMillis;
    }

	@Test
    public void testgetRegion() 
    {
    	System.out.println(assetClass.getRegion());
    }

	@Test
    public void testgetSector() 
    {
    	System.out.println(assetClass.getSector());
    }

	@Test
    public void testgetQuantifiedExpectedReturnMicros() 
    {
        if (quantityMillis == null) 
        {
        	System.out.println(0L);
        }
        
        System.out.println(quantityMillis * assetClass.getExpectedReturnMillis());
    }

	@Test
    public void testgetQuantifiedStandardDeviationRiskMicros() 
    {
        if (quantityMillis == null) 
        {
        	System.out.println(0L);
        }
        
        System.out.println(quantityMillis * assetClass.getStandardDeviationRiskMillis());
    }

	@Test
    public void testgetQuantityLabel() 
    {
        if (quantityMillis == null) 
        {
        	System.out.println("");
        }
        
        System.out.println(InvestmentNumericUtil.formatMillisAsPercentage(quantityMillis));
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println(assetClass.getName());
    }

	@Test
    public void testtoString() 
    {
    	System.out.println(assetClass.toString());
    }
}
