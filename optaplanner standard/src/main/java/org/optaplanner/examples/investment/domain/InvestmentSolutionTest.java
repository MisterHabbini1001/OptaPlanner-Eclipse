package org.optaplanner.examples.investment.domain;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactProperty;
import org.optaplanner.core.api.domain.valuerange.CountableValueRange;
import org.optaplanner.core.api.domain.valuerange.ValueRangeFactory;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScore;
import org.optaplanner.examples.investment.domain.util.InvestmentNumericUtil;
import org.optaplanner.persistence.xstream.api.score.buildin.hardsoftlong.HardSoftLongScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class InvestmentSolutionTest 
{
    private InvestmentParametrization parametrization;
    private List<Region> regionList;
    private List<Sector> sectorList;
    private List<AssetClass> assetClassList;
    private List<AssetClassAllocation> assetClassAllocationList;

    @XStreamConverter(HardSoftLongScoreXStreamConverter.class)
    private HardSoftLongScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		InvestmentSolution is = new InvestmentSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		InvestmentSolution is = new InvestmentSolution();
		is = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		InvestmentSolution is = new InvestmentSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		InvestmentSolution is = new InvestmentSolution();
		is = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	@ProblemFactProperty
    public void testgetParametrization() 
	{
        System.out.println(parametrization);
    }

	@Test
    public void testsetParametrization() 
    {
        this.parametrization = parametrization;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetRegionList() 
    {
    	System.out.println(regionList);
    }

	@Test
    public void testsetRegionList() 
    {
        this.regionList = regionList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetSectorList() 
    {
    	System.out.println(sectorList);
    }

	@Test
    public void testsetSectorList() 
    {
        this.sectorList = sectorList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetAssetClassList() 
    {
    	System.out.println(assetClassList);
    }

	@Test
    public void testsetAssetClassList() 
    {
        this.assetClassList = assetClassList;
    }

	@Test
    @PlanningEntityCollectionProperty
    public void testgetAssetClassAllocationList() 
    {
    	System.out.println(assetClassAllocationList);
    }

	@Test
    public void testsetAssetClassAllocationList() 
    {
        this.assetClassAllocationList = assetClassAllocationList;
    }

	@Test
    @PlanningScore
    public void testgetScore() 
    {
    	System.out.println(score);
    }

	@Test
    public void testsetScore() 
    {
        this.score = score;
    }

	@Test
    @ValueRangeProvider(id = "quantityMillisRange")
    public void testgetQuantityMillisRange() 
    {
    	System.out.println(ValueRangeFactory.createLongValueRange(0L, InvestmentNumericUtil.MAXIMUM_QUANTITY_MILLIS + 1L));
    }

	@Test
    public void testcalculateExpectedReturnMicros() 
    {
        long expectedReturnMicros = 0L;
        
        for (AssetClassAllocation allocation : assetClassAllocationList) 
        {
            expectedReturnMicros += allocation.getQuantifiedExpectedReturnMicros();
        }
        
        System.out.println(expectedReturnMicros);
    }

	@Test
    public void testcalculateStandardDeviationMicros() 
    {
    	System.out.println(0);
    }

	@Test
    public void testcalculateStandardDeviationSquaredFemtos() 
    {
        long totalFemtos = 0L;
        for (AssetClassAllocation a : assetClassAllocationList) 
        {
            for (AssetClassAllocation b : assetClassAllocationList) 
            {
                if (a == b) 
                {
                    totalFemtos += a.getQuantifiedStandardDeviationRiskMicros() * b.getQuantifiedStandardDeviationRiskMicros()
                            * 1000L;
                } 
                
                else 
                {
                    // Matches twice: once for (A, B) and once for (B, A)
                    long correlationMillis = a.getAssetClass().getCorrelationMillisMap().get(b.getAssetClass());
                    totalFemtos += a.getQuantifiedStandardDeviationRiskMicros() * b.getQuantifiedStandardDeviationRiskMicros()
                            * correlationMillis;
                }
            }
        }
        
        System.out.println(totalFemtos);
    }

	@Test
    public void testcalculateRegionQuantityMillisTotalMap() 
    {
        Map<Region, Long> totalMap = new HashMap<>(regionList.size());
        for (Region region : regionList) 
        {
            totalMap.put(region, 0L);
        }
        
        for (AssetClassAllocation allocation : assetClassAllocationList) 
        {
            Long quantityMillis = allocation.getQuantityMillis();
            
            if (quantityMillis != null) 
            {
                totalMap.put(allocation.getRegion(),
                        totalMap.get(allocation.getRegion()) + quantityMillis);
            }
        }
        
        System.out.println(totalMap);
    }

	@Test
    public void testcalculateSectorQuantityMillisTotalMap() 
    {
        Map<Sector, Long> totalMap = new HashMap<>(regionList.size());
        for (Sector sector : sectorList) 
        {
            totalMap.put(sector, 0L);
        }
        
        for (AssetClassAllocation allocation : assetClassAllocationList) 
        {
            Long quantityMillis = allocation.getQuantityMillis();
            
            if (quantityMillis != null) 
            {
                totalMap.put(allocation.getSector(),
                        totalMap.get(allocation.getSector()) + quantityMillis);
            }
            
        }
        
        System.out.println(totalMap);
    }
}
