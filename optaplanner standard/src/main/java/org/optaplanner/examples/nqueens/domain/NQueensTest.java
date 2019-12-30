package org.optaplanner.examples.nqueens.domain;
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
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;
import org.optaplanner.persistence.xstream.api.score.buildin.simple.SimpleScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class NQueensTest 
{
    private int n;
    private List<Column> columnList;
    private List<Row> rowList;
    private List<Queen> queenList;
    @XStreamConverter(SimpleScoreXStreamConverter.class)
    private SimpleScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		NQueens n = new NQueens();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		NQueens n = new NQueens();
		n = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		NQueens n = new NQueens();
	}

	@After
	
	public void tearDown() throws Exception 
	{
		NQueens n = new NQueens();
		n = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetN() 
	{
        System.out.println(n);
    }

	@Test
    public void testsetN() 
	{
        this.n = n;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetColumnList() 
	{
		System.out.println(columnList);
    }
	
	@Test
    public void testsetColumnList() 
	{
        this.columnList = columnList;
    }

	@Test
    @ValueRangeProvider(id = "rowRange")
    @ProblemFactCollectionProperty
    public void testgetRowList() 
	{
		System.out.println(rowList);
    }

	@Test
    public void testsetRowList() 
	{
        this.rowList = rowList;
    }

	@Test
    @PlanningEntityCollectionProperty
    public void testgetQueenList() 
	{
		System.out.println(queenList);
    }

	@Test
    public void testsetQueenList() 
	{
        this.queenList = queenList;
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
}