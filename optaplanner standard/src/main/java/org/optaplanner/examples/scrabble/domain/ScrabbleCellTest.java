package org.optaplanner.examples.scrabble.domain;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.solution.cloner.DeepPlanningClone;
import org.optaplanner.core.api.domain.variable.CustomShadowVariable;
import org.optaplanner.core.api.domain.variable.PlanningVariableReference;
import org.optaplanner.examples.scrabble.domain.solver.CellUpdatingVariableListener;

public class ScrabbleCellTest 
{
    private int x;
    private int y;

    @CustomShadowVariable(variableListenerClass = CellUpdatingVariableListener.class,
            sources = {@PlanningVariableReference(entityClass = ScrabbleWordAssignment.class, variableName = "startCell"),
                    @PlanningVariableReference(entityClass = ScrabbleWordAssignment.class, variableName = "direction")})
    @DeepPlanningClone 
    private Set<ScrabbleWordAssignment> wordSet;

    @CustomShadowVariable(variableListenerRef = @PlanningVariableReference(variableName = "wordSet"))
    @DeepPlanningClone 
    private Map<Character, Integer> characterCountMap;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ScrabbleCell sc = new ScrabbleCell();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ScrabbleCell sc = new ScrabbleCell();
		sc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ScrabbleCell sc = new ScrabbleCell();
	}

	@After
	public void tearDown() throws Exception 
	{
		ScrabbleCell sc = new ScrabbleCell();
		sc = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetX() 
	{
        System.out.println(x);
    }

	@Test
    public void testsetX() 
    {
        this.x = x;
    }

	@Test
    public void testgetY() 
    {
    	System.out.println(y);
    }

	@Test
    public void testsetY() 
    {
        this.y = y;
    }

	@Test
    public void testgetWordSet() 
    {
    	System.out.println(wordSet);
    }

	@Test
    public void testsetWordSet() 
    {
        this.wordSet = wordSet;
    }

	@Test
    public void testgetCharacterCountMap() 
    {
    	System.out.println(characterCountMap);
    }

	@Test
    public void testsetCharacterCountMap() 
    {
        this.characterCountMap = characterCountMap;
    }

	@Test
    public void testgetLabel() 
    {
    	System.out.println("(" + x + "," + y + ")");
    }

	@Test
    public void testinsertWordAssignment() 
    {
    	System.out.println(0);
    }

	@Test
    public void testretractWordAssignment() 
    {
    	System.out.println(0);
    }

	@Test
    public void testgetCharacterSet() 
    {
    	System.out.println(characterCountMap.keySet());
    }

	@Test
    public void testhasMerge() 
    {
        if (characterCountMap.containsKey(' ')) 
        {
        	System.out.println(false);
        }
        
        System.out.println(wordSet.size() > 1);
    }

	@Test
    public void testhasWordSet() 
    {        
        System.out.println(false);
    }

	@Test
    public void testtoString() 
    {
    	System.out.println("(" + x + "," + y + ")");
    }
}
