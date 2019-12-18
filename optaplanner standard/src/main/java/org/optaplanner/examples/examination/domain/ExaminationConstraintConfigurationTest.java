package org.optaplanner.examples.examination.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.constraintweight.ConstraintWeight;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

public class ExaminationConstraintConfigurationTest 
{
    private int twoInARowPenalty;
    private int twoInADayPenalty;
    private int periodSpreadLength;
    private int periodSpreadPenalty;
    private int mixedDurationPenalty;
    private int frontLoadLargeTopicSize;
    private int frontLoadLastPeriodSize;
    private int frontLoadPenalty;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ExaminationConstraintConfiguration ecc = new ExaminationConstraintConfiguration();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ExaminationConstraintConfiguration ecc = new ExaminationConstraintConfiguration();
		ecc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ExaminationConstraintConfiguration ecc = new ExaminationConstraintConfiguration();
	}

	@After
	public void tearDown() throws Exception 
	{
		ExaminationConstraintConfiguration ecc = new ExaminationConstraintConfiguration();
		ecc = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

    @ConstraintWeight("twoExamsInARow")
    @Test
    public void testgetTwoInARowPenaltyAsScore() 
    {
    	System.out.println(0);
    }

    @ConstraintWeight("twoExamsInADay")
    @Test
    public void testgetTwoInADayPenaltyAsScore() 
    {
    	System.out.println(0);
    }

    @ConstraintWeight("periodSpread")
    @Test
    public void testgetPeriodSpreadPenaltyAsScore() 
    {
    	System.out.println(0);
    }

    @ConstraintWeight("mixedDurations")
    @Test
    public void testgetMixedDurationPenaltyAsScore() 
    {
    	System.out.println(0);
    }

    @ConstraintWeight("frontLoad")
    @Test
    public void testgetFrontLoadPenaltyAsScore() 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetTwoInARowPenalty() 
    {
    	System.out.println(twoInARowPenalty);
    }

    @Test
    public void testsetTwoInARowPenalty() 
    {
        this.twoInARowPenalty = twoInARowPenalty;
    }

    @Test
    public void testgetTwoInADayPenalty() 
    {
    	System.out.println(twoInADayPenalty);
    }

    @Test
    public void testsetTwoInADayPenalty() 
    {
        this.twoInADayPenalty = twoInADayPenalty;
    }

    @Test
    public void testgetPeriodSpreadLength() 
    {
    	System.out.println(periodSpreadLength);
    }

    @Test
    public void testsetPeriodSpreadLength() 
    {
        this.periodSpreadLength = periodSpreadLength;
    }

    @Test
    public void testgetPeriodSpreadPenalty() 
    {
    	System.out.println(periodSpreadPenalty);
    }

    @Test
    public void testsetPeriodSpreadPenalty() 
    {
        this.periodSpreadPenalty = periodSpreadPenalty;
    }

    @Test
    public void testgetMixedDurationPenalty() 
    {
    	System.out.println(mixedDurationPenalty);
    }

    @Test
    public void testsetMixedDurationPenalty() 
    {
        this.mixedDurationPenalty = mixedDurationPenalty;
    }

    @Test
    public void testgetFrontLoadLargeTopicSize() 
    {
    	System.out.println(frontLoadLargeTopicSize);
    }

    @Test
    public void testsetFrontLoadLargeTopicSize() 
    {
        this.frontLoadLargeTopicSize = frontLoadLargeTopicSize;
    }

    @Test
    public void testgetFrontLoadLastPeriodSize() 
    {
    	System.out.println(frontLoadLastPeriodSize);
    }

    @Test
    public void testsetFrontLoadLastPeriodSize() 
    {
        this.frontLoadLastPeriodSize = frontLoadLastPeriodSize;
    }

    @Test
    public void testgetFrontLoadPenalty() 
    {
    	System.out.println(frontLoadPenalty);
    }

    @Test
    public void testsetFrontLoadPenalty() 
    {
        this.frontLoadPenalty = frontLoadPenalty;
    }
}