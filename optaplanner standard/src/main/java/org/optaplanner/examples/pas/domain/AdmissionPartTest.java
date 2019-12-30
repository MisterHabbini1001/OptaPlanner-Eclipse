package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdmissionPartTest 
{
    private Patient patient;
    private Night firstNight;
    private Night lastNight;
    private Specialism specialism;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		AdmissionPart ap = new AdmissionPart();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		AdmissionPart ap = new AdmissionPart();
		ap = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		AdmissionPart ap = new AdmissionPart();
	}

	@After
	public void tearDown() throws Exception 
	{
		AdmissionPart ap = new AdmissionPart();
		ap = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetPatient() 
	{
        System.out.println(patient);
    }

	@Test
    public void testsetPatient() 
	{
        this.patient = patient;
    }

	@Test
    public void testgetFirstNight() 
	{
        System.out.println(firstNight);
    }

	@Test
    public void testsetFirstNight() 
	{
        this.firstNight = firstNight;
    }

	@Test
    public void testgetLastNight() 
	{
    	System.out.println(lastNight);
    }

	@Test
    public void testsetLastNight() 
	{
        this.lastNight = lastNight;
    }

	@Test
    public void testgetSpecialism() 
	{
    	System.out.println(specialism);
    }

	@Test
    public void testsetSpecialism() 
	{
        this.specialism = specialism;
    }

	@Test
    public void testgetNightCount() 
	{
    	System.out.println(lastNight.getIndex() - firstNight.getIndex() + 1);
    }

	@Test
    public void testcalculateSameNightCount() 
	{
        int firstNightIndex = 1;
        int lastNightIndex = 2;
        System.out.println(Math.max(0, lastNightIndex - firstNightIndex + 1));
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(patient + "(" + firstNight + "-" + lastNight + ")");
    }
}
