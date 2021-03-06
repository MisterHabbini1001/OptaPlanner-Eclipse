package org.optaplanner.examples.nurserostering.domain.contract;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.nurserostering.domain.WeekendDefinition;

public class ContractTest 
{
    private String code;
    private String description;
    private WeekendDefinition weekendDefinition;
    private List<ContractLine> contractLineList;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Contract c = new Contract();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Contract c = new Contract();
		c = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Contract c = new Contract();
	}

	@After
	public void tearDown() throws Exception 
	{
		Contract c = new Contract();
		c = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetCode() 
    {
        System.out.println(code);
    }

	@Test
    public void testsetCode() 
    {
        this.code = code;
    }

	@Test
    public void testgetDescription() 
    {
		System.out.println(description);
    }

	@Test
    public void testsetDescription() 
    {
        this.description = description;
    }

	@Test
    public void testgetWeekendDefinition() 
    {
		System.out.println(weekendDefinition);
    }

	@Test
    public void testsetWeekendDefinition() 
    {
        this.weekendDefinition = weekendDefinition;
    }

	@Test
    public void testgetContractLineList() 
    {
		System.out.println(contractLineList);
    }

	@Test
    public void testsetContractLineList() 
    {
        this.contractLineList = contractLineList;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(code);
    }

	@Test
    public void testgetWeekendLength() 
    {
		System.out.println(weekendDefinition.getWeekendLength());
    }
}
