package org.optaplanner.examples.pas.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PatientTest {
    private String name;
    private Gender gender;
    private int age;
    private Integer preferredMaximumRoomCapacity;
    private List<RequiredPatientEquipment> requiredPatientEquipmentList;
    private List<PreferredPatientEquipment> preferredPatientEquipmentList;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Patient pa = new Patient();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Patient pa = new Patient();
		pa = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Patient pa = new Patient();
	}

	@After
	public void tearDown() throws Exception 
	{
		Patient pa = new Patient();
		pa = null;
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
    public void testgetGender() 
    {
    	System.out.println(gender);
    }

    @Test
    public void testsetGender() 
    {
        this.gender = gender;
    }

    @Test
    public void testgetAge() 
    {
    	System.out.println(age);
    }

    @Test
    public void testsetAge() 
    {
        this.age = age;
    }

    @Test
    public void testgetPreferredMaximumRoomCapacity() 
    {
    	System.out.println(preferredMaximumRoomCapacity);
    }

    @Test
    public void testsetPreferredMaximumRoomCapacity() 
    {
        this.preferredMaximumRoomCapacity = preferredMaximumRoomCapacity;
    }

    @Test
    public void testgetRequiredPatientEquipmentList() 
    {
    	System.out.println(requiredPatientEquipmentList);
    }

    @Test
    public void testsetRequiredPatientEquipmentList() 
    {
        this.requiredPatientEquipmentList = requiredPatientEquipmentList;
    }

    @Test
    public void testgetPreferredPatientEquipmentList() 
    {
    	System.out.println(preferredPatientEquipmentList);
    }

    @Test
    public void testsetPreferredPatientEquipmentList() 
    {
        this.preferredPatientEquipmentList = preferredPatientEquipmentList;
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(name);
    }
}
