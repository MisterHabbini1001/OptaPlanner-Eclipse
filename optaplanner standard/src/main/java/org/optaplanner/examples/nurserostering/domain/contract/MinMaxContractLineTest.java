package org.optaplanner.examples.nurserostering.domain.contract;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinMaxContractLineTest 
{
    private boolean minimumEnabled;
    private int minimumValue;
    private int minimumWeight;

    private boolean maximumEnabled;
    private int maximumValue;
    private int maximumWeight;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		MinMaxContractLine mmcl = new MinMaxContractLine();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		MinMaxContractLine mmcl = new MinMaxContractLine();
		mmcl = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		MinMaxContractLine mmcl = new MinMaxContractLine();
	}

	@After
	public void tearDown() throws Exception 
	{
		MinMaxContractLine mmcl = new MinMaxContractLine();
		mmcl = null;
	}

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testisMinimumEnabled() 
	{
        System.out.println(minimumEnabled);
    }

	@Test
    public void testsetMinimumEnabled() 
	{
        this.minimumEnabled = minimumEnabled;
    }

	@Test
    public void testgetMinimumValue() 
	{
		System.out.println(minimumValue);
    }

	@Test
    public void testsetMinimumValue() 
	{
        this.minimumValue = minimumValue;
    }

	@Test
    public void testgetMinimumWeight() 
	{
		System.out.println(minimumWeight);
    }

	@Test
    public void testsetMinimumWeight() 
	{
        this.minimumWeight = minimumWeight;
    }

	@Test
    public void testisMaximumEnabled() 
	{
		System.out.println(maximumEnabled);
    }

	@Test
    public void testsetMaximumEnabled() 
	{
        this.maximumEnabled = maximumEnabled;
    }

	@Test
    public void testgetMaximumValue() 
	{
		System.out.println(maximumValue);
    }

	@Test
    public void testsetMaximumValue() 
	{
        this.maximumValue = maximumValue;
    }

	@Test
    public void testgetMaximumWeight() 
	{
		System.out.println(maximumWeight);
    }

	@Test
    public void testsetMaximumWeight() 
	{
        this.maximumWeight = maximumWeight;
    }

	@Test
    public void testisEnabled() 
	{
		System.out.println(minimumEnabled || maximumEnabled);
    }
}