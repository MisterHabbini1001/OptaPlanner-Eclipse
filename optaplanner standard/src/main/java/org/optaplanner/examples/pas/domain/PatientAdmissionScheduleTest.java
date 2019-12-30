package org.optaplanner.examples.pas.domain;
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
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;
import org.optaplanner.persistence.xstream.api.score.buildin.hardmediumsoft.HardMediumSoftScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class PatientAdmissionScheduleTest 
{
    private List<Specialism> specialismList;
    private List<Equipment> equipmentList;
    private List<Department> departmentList;
    private List<DepartmentSpecialism> departmentSpecialismList;
    private List<Room> roomList;
    private List<RoomSpecialism> roomSpecialismList;
    private List<RoomEquipment> roomEquipmentList;
    private List<Bed> bedList;
    private List<Night> nightList;
    private List<Patient> patientList;
    private List<AdmissionPart> admissionPartList;
    private List<RequiredPatientEquipment> requiredPatientEquipmentList;
    private List<PreferredPatientEquipment> preferredPatientEquipmentList;
    private List<BedDesignation> bedDesignationList;

    @XStreamConverter(HardMediumSoftScoreXStreamConverter.class)
    private HardMediumSoftScore score;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		PatientAdmissionSchedule pas = new PatientAdmissionSchedule();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		PatientAdmissionSchedule pas = new PatientAdmissionSchedule();
		pas = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		PatientAdmissionSchedule pas = new PatientAdmissionSchedule();
	}

	@After
	public void tearDown() throws Exception 
	{
		PatientAdmissionSchedule pas = new PatientAdmissionSchedule();
		pas = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
	@ProblemFactCollectionProperty
    public void testgetSpecialismList() 
	{
        System.out.println(specialismList);
    }

	@Test
    public void testsetSpecialismList() 
	{
        this.specialismList = specialismList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetEquipmentList() 
	{
    	System.out.println(equipmentList);
    }

	@Test
    public void testsetEquipmentList() 
	{
        this.equipmentList = equipmentList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetDepartmentList() 
	{
    	System.out.println(departmentList);
    }

	@Test
    public void testsetDepartmentList() 
	{
        this.departmentList = departmentList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetDepartmentSpecialismList() 
	{
    	System.out.println(departmentSpecialismList);
    }

	@Test
    public void testsetDepartmentSpecialismList() 
	{
        this.departmentSpecialismList = departmentSpecialismList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetRoomList() 
	{
    	System.out.println(roomList);
    }

	@Test
    public void testsetRoomList() 
	{
        this.roomList = roomList;
    }

	@Test
    @ProblemFactCollectionProperty
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
    @ProblemFactCollectionProperty
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
    @ValueRangeProvider(id = "bedRange")
    @ProblemFactCollectionProperty
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
    @ProblemFactCollectionProperty
    public void testgetNightList() 
	{
    	System.out.println(nightList);
    }

	@Test
    public void testsetNightList() 
	{
        this.nightList = nightList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetPatientList() 
	{
    	System.out.println(patientList);
    }

	@Test
    public void testsetPatientList() 
	{
        this.patientList = patientList;
    }

	@Test
    @ProblemFactCollectionProperty
    public void testgetAdmissionPartList() 
	{
    	System.out.println(admissionPartList);
    }

	@Test
    public void testsetAdmissionPartList() 
	{
        this.admissionPartList = admissionPartList;
    }

	@Test
    @ProblemFactCollectionProperty
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
    @ProblemFactCollectionProperty
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
    @PlanningEntityCollectionProperty
    public void testgetBedDesignationList() 
	{
    	System.out.println(bedDesignationList);
    }

	@Test
    public void testsetBedDesignationList() 
	{
        this.bedDesignationList = bedDesignationList;
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
