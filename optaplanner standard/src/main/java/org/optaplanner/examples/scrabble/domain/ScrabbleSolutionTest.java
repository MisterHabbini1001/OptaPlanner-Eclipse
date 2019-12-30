package org.optaplanner.examples.scrabble.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;
import org.optaplanner.persistence.xstream.api.score.buildin.hardmediumsoft.HardMediumSoftScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class ScrabbleSolutionTest {
    private int gridWidth;
    private int gridHeight;

    @ValueRangeProvider(id = "startCellRange")
    @ProblemFactCollectionProperty
    private List<ScrabbleCell> cellList;

    @PlanningEntityCollectionProperty
    private List<ScrabbleWordAssignment> wordList;

    @XStreamConverter(HardMediumSoftScoreXStreamConverter.class)
    private HardMediumSoftScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ScrabbleSolution ss = new ScrabbleSolution();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ScrabbleSolution ss = new ScrabbleSolution();
		ss = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ScrabbleSolution ss = new ScrabbleSolution();
	}

	@After
	public void tearDown() throws Exception 
	{
		ScrabbleSolution ss = new ScrabbleSolution();
		ss = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetGridWidth() 
	{
        System.out.println(gridWidth);
    }

	@Test
    public void testsetGridWidth() 
	{
        this.gridWidth = gridWidth;
    }

	@Test
    public void testgetGridHeight() 
	{
    	System.out.println(gridHeight);
    }

	@Test
    public void testsetGridHeight() 
	{
        this.gridHeight = gridHeight;
    }

	@Test
    public void testgetCellList() 
	{
    	System.out.println(cellList);
    }

	@Test
    public void testsetCellList() 
	{
        this.cellList = cellList;
    }

	@Test
    public void testgetWordList() 
	{
    	System.out.println(wordList);
    }

	@Test
    public void testsetWordList() 
	{
        this.wordList = wordList;
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
    @ValueRangeProvider(id = "directionRange")
    public void testgetDirectionRange() 
	{
    	System.out.println(ScrabbleWordDirection.values());
    }

	@Test
    public void testgetCell() 
	{
    	System.out.println(0);
    }
}
