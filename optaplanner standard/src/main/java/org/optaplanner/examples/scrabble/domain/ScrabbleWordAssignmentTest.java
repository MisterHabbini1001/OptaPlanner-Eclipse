package org.optaplanner.examples.scrabble.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

public class ScrabbleWordAssignmentTest {
    private ScrabbleSolution solution;
    private String word;

    @PlanningVariable(valueRangeProviderRefs = {"startCellRange"})
    private ScrabbleCell startCell;
    @PlanningVariable(valueRangeProviderRefs = {"directionRange"})
    private ScrabbleWordDirection direction;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ScrabbleWordAssignment swa = new ScrabbleWordAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ScrabbleWordAssignment swa = new ScrabbleWordAssignment();
		swa = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ScrabbleWordAssignment swa = new ScrabbleWordAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		ScrabbleWordAssignment swa = new ScrabbleWordAssignment();
		swa = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetSolution() 
	{
        System.out.println(solution);
    }

	@Test
    public void testsetSolution() 
	{
        this.solution = solution;
    }

	@Test
    public void testgetWord() 
	{
    	System.out.println(word);
    }

	@Test
    public void testsetWord() 
	{
        this.word = word;
    }

	@Test
    public void testgetStartCell() 
	{
    	System.out.println(startCell);
    }

	@Test
    public void testsetStartCell() 
	{
        this.startCell = startCell;
    }

	@Test
    public void testgetDirection() 
	{
    	System.out.println(direction);
    }

	@Test
    public void testsetDirection() 
	{
        this.direction = direction;
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println(word);
    }

	@Test
    public void testisOutOfGrid() 
	{
        if (direction == null || startCell == null) 
        {
        	System.out.println(false);
        }
        
        switch (direction) 
        {
            case HORIZONTAL:
            	System.out.println(startCell.getX() + word.length() > solution.getGridWidth());
            case VERTICAL:
            	System.out.println(startCell.getY() + word.length() > solution.getGridHeight());
            default:
                throw new IllegalStateException("The direction (" + direction + ") is not implemented.");
        }
    }

	@Test
    public void testgetDistanceToCenter() 
	{
        if (direction == null || startCell == null) 
        {
        	System.out.println(0);
        }
        
        int centerX = solution.getGridWidth() / 2;
        int centerY = solution.getGridHeight() / 2;
        int x;
        int y;
        
        switch (direction) 
        {
            case HORIZONTAL:
                x = startCell.getX() + word.length() / 2;
                y = startCell.getY();
                break;
            case VERTICAL:
                x = startCell.getX();
                y = startCell.getY() + word.length() / 2;
                break;
            default:
                throw new IllegalStateException("The direction (" + direction + ") is not implemented.");
        }
        
        System.out.println(Math.abs(centerX - x) + Math.abs(centerY - y));
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(word);
    }
}
