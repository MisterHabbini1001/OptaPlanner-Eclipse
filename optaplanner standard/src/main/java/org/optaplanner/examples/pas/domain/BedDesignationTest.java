package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.examples.pas.domain.solver.BedStrengthComparator;

public class BedDesignationTest 
{
    private AdmissionPart admissionPart;
    private Bed bed;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		BedDesignation bd = new BedDesignation();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		BedDesignation bd = new BedDesignation();
		bd = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		BedDesignation bd = new BedDesignation();
	}

	@After
	public void tearDown() throws Exception 
	{
		BedDesignation bd = new BedDesignation();
		bd = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetAdmissionPart() 
	{
        System.out.println(admissionPart);
    }

	@Test
    public void testsetAdmissionPart() 
	{
        this.admissionPart = admissionPart;
    }

	@Test
    @PlanningVariable(nullable = true, valueRangeProviderRefs = {"bedRange"},
            strengthComparatorClass = BedStrengthComparator.class)
    public void testgetBed() 
	{
    	System.out.println(bed);
    }

	@Test
    public void testsetBed() 
	{
        this.bed = bed;
    }

	@Test
    public void testgetPatient() 
	{
    	System.out.println(admissionPart.getPatient());
    }

	@Test
    public void testgetPatientGender() 
	{
    	System.out.println(admissionPart.getPatient().getGender());
    }

	@Test
    public void testgetPatientAge() 
	{
    	System.out.println(admissionPart.getPatient().getAge());
    }

	@Test
    public void testgetPatientPreferredMaximumRoomCapacity() 
	{
    	System.out.println(admissionPart.getPatient().getPreferredMaximumRoomCapacity());
    }

	@Test
    public void testgetAdmissionPartSpecialism() 
	{
    	System.out.println(admissionPart.getSpecialism());
    }

	@Test
    public void testgetFirstNightIndex() 
	{
    	System.out.println(admissionPart.getFirstNight().getIndex());
    }

	@Test
    public void testgetLastNightIndex() 
	{
    	System.out.println(admissionPart.getLastNight().getIndex());
    }

	@Test
    public void testgetAdmissionPartNightCount() 
	{
    	System.out.println(admissionPart.getNightCount());
    }

	@Test
    public void testgetRoom() 
	{
        if (bed == null) 
        {
        	System.out.println(0);
        }
        
        System.out.println(bed.getRoom());
    }

	@Test
    public void testgetRoomCapacity() 
	{
        if (bed == null) 
        {
        	System.out.println(Integer.MIN_VALUE);
        }
        
        System.out.println(bed.getRoom().getCapacity());
    }

	@Test
    public void testgetDepartment() 
	{
        if (bed == null) 
        {
        	System.out.println();
        }
        
        System.out.println(bed.getRoom().getDepartment());
    }

	@Test
    public void testgetRoomGenderLimitation() 
	{
        if (bed == null) 
        {
        	System.out.println();
        }
        
        System.out.println(bed.getRoom().getGenderLimitation());
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(admissionPart.toString());
    }
}
