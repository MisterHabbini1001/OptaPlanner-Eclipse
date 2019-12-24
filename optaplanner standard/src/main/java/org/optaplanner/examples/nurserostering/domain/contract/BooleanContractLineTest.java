package org.optaplanner.examples.nurserostering.domain.contract;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BooleanContractLineTest 
{
    private boolean enabled;
    private int weight;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		BooleanContractLine bcl = new BooleanContractLine();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		BooleanContractLine bcl = new BooleanContractLine();
		bcl = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		BooleanContractLine bcl = new BooleanContractLine();
	}

	@After
	public void tearDown() throws Exception 
	{
		BooleanContractLine bcl = new BooleanContractLine();
		bcl = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
    @Test
    public void testisEnabled() 
    {
        System.out.println(enabled);
    }

    @Test
    public void testsetEnabled() 
    {
        this.enabled = enabled;
    }

    @Test
    public void testgetWeight() 
    {
    	System.out.println(weight);
    }

    @Test
    public void testsetWeight() 
    {
        this.weight = weight;
    }
}
