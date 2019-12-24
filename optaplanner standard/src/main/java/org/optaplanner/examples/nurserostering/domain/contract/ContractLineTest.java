package org.optaplanner.examples.nurserostering.domain.contract;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ContractLineTest 
{
    private Contract contract;
    private ContractLineType contractLineType;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetContract() 
	{
        System.out.println(contract);
    }

	@Test
    public void testsetContract() 
	{
        this.contract = contract;
    }

	@Test
    public void testgetContractLineType() 
	{
		System.out.println(contractLineType);
    }

	@Test
    public void testsetContractLineType() 
	{
        this.contractLineType = contractLineType;
    }

	@Test
    public void testisEnabled()
    {
		System.out.println(0);
    }

	@Test
    public void testtoString() 
	{
		System.out.println(contract + "-" + contractLineType);
    }
}
