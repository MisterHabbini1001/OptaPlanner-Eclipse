package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RoomTest 
{
    private String name;
    private Department department;
    private int capacity;
    private GenderLimitation genderLimitation;
    private List<RoomSpecialism> roomSpecialismList;
    private List<RoomEquipment> roomEquipmentList;
    private List<Bed> bedList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Room r = new Room();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Room r = new Room();
		r = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Room r = new Room();
	}

	@After
	public void tearDown() throws Exception 
	{
		Room r = new Room();
		r = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetName() 
	{
        System.out.println(name);
    }

	@Test
    public void testsetName() 
	{
        this.name = name;
    }

	@Test
    public void testgetDepartment() 
	{
    	System.out.println(department);
    }

	@Test
    public void testsetDepartment() 
	{
        this.department = department;
    }

	@Test
    public void testgetCapacity() 
	{
    	System.out.println(capacity);
    }

	@Test
    public void testsetCapacity() 
	{
        this.capacity = capacity;
    }

	@Test
    public void testgetGenderLimitation() 
	{
    	System.out.println(genderLimitation);
    }

	@Test
    public void testsetGenderLimitation() 
	{
        this.genderLimitation = genderLimitation;
    }

	@Test
    public void testgetRoomSpecialismList() 
	{
    	System.out.println(roomSpecialismList);
    }

	@Test
    public void testsetRoomSpecialismList() 
	{
        this.roomSpecialismList = roomSpecialismList;
    }

	@Test
    public void testgetRoomEquipmentList() 
	{
    	System.out.println(roomEquipmentList);
    }

	@Test
    public void testsetRoomEquipmentList() 
	{
        this.roomEquipmentList = roomEquipmentList;
    }

	@Test
    public void testgetBedList() 
	{
    	System.out.println(bedList);
    }

	@Test
    public void testsetBedList() 
	{
        this.bedList = bedList;
    }

	@Test
    public void testcountHardDisallowedAdmissionPart() 
	{
    	System.out.println(0);
    }

	@Test
    public void testcountMissingRequiredRoomProperties()
	{
    	System.out.println(0);
    }

	@Test
    public void testcountDisallowedPatientGender() 
	{
        switch (genderLimitation) 
        {
            case ANY_GENDER:
            	System.out.println(0);
            case MALE_ONLY:
            	System.out.println(0);
            case FEMALE_ONLY:
            	System.out.println(0);
            case SAME_GENDER:
                // scoreRules check this
            	System.out.println(1);
            default:
                throw new IllegalStateException("The genderLimitation (" + genderLimitation + ") is not implemented.");
        }
    }

	@Test
    public void testcountSoftDisallowedAdmissionPart() 
	{
    	System.out.println(0);
    }

	@Test
    public void testcountMissingPreferredRoomProperties() 
	{
    	System.out.println(0);
    }

	@Test
    public void testgetLabel() 
	{
    	System.out.println(name);
    }

	@Test
    public void testtoString() 
	{
    	System.out.println(name);
    }
}