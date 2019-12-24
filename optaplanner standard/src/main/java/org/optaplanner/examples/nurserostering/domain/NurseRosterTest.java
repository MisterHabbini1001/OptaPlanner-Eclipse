package org.optaplanner.examples.nurserostering.domain;
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
import org.optaplanner.core.api.domain.solution.drools.ProblemFactProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.examples.nurserostering.domain.contract.Contract;
import org.optaplanner.examples.nurserostering.domain.contract.ContractLine;
import org.optaplanner.examples.nurserostering.domain.contract.PatternContractLine;
import org.optaplanner.examples.nurserostering.domain.pattern.Pattern;
import org.optaplanner.examples.nurserostering.domain.request.DayOffRequest;
import org.optaplanner.examples.nurserostering.domain.request.DayOnRequest;
import org.optaplanner.examples.nurserostering.domain.request.ShiftOffRequest;
import org.optaplanner.examples.nurserostering.domain.request.ShiftOnRequest;
import org.optaplanner.persistence.xstream.api.score.buildin.hardsoft.HardSoftScoreXStreamConverter;

import com.thoughtworks.xstream.annotations.XStreamConverter;

public class NurseRosterTest 
{
    private String code;

    @ProblemFactProperty
    private NurseRosterParametrization nurseRosterParametrization;
    @ProblemFactCollectionProperty
    private List<Skill> skillList;
    @ProblemFactCollectionProperty
    private List<ShiftType> shiftTypeList;
    @ProblemFactCollectionProperty
    private List<ShiftTypeSkillRequirement> shiftTypeSkillRequirementList;
    @ProblemFactCollectionProperty
    private List<Pattern> patternList;
    @ProblemFactCollectionProperty
    private List<Contract> contractList;
    @ProblemFactCollectionProperty
    private List<ContractLine> contractLineList;
    @ProblemFactCollectionProperty
    private List<PatternContractLine> patternContractLineList;
    @ValueRangeProvider(id = "employeeRange")
    @ProblemFactCollectionProperty
    private List<Employee> employeeList;
    @ProblemFactCollectionProperty
    private List<SkillProficiency> skillProficiencyList;
    @ProblemFactCollectionProperty
    private List<ShiftDate> shiftDateList;
    @ProblemFactCollectionProperty
    private List<Shift> shiftList;
    @ProblemFactCollectionProperty
    private List<DayOffRequest> dayOffRequestList;
    @ProblemFactCollectionProperty
    private List<DayOnRequest> dayOnRequestList;
    @ProblemFactCollectionProperty
    private List<ShiftOffRequest> shiftOffRequestList;
    @ProblemFactCollectionProperty
    private List<ShiftOnRequest> shiftOnRequestList;

    @PlanningEntityCollectionProperty
    private List<ShiftAssignment> shiftAssignmentList;

    @PlanningScore
    @XStreamConverter(HardSoftScoreXStreamConverter.class)
    private HardSoftScore score;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		NurseRoster nr = new NurseRoster();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		NurseRoster nr = new NurseRoster();
		nr = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		NurseRoster nr = new NurseRoster();
	}

	@After
	public void tearDown() throws Exception 
	{
		NurseRoster nr = new NurseRoster();
		nr = null;
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
    public void testgetNurseRosterParametrization() 
    {
		System.out.println(nurseRosterParametrization);
    }

	@Test
    public void testsetNurseRosterParametrization() 
    {
        this.nurseRosterParametrization = nurseRosterParametrization;
    }

	@Test
    public void testgetSkillList() 
    {
		System.out.println(skillList);
    }

	@Test
    public void testsetSkillList() 
    {
        this.skillList = skillList;
    }

	@Test
    public void testgetShiftTypeList() 
    {
		System.out.println(shiftTypeList);
    }

	@Test
    public void testsetShiftTypeList() 
    {
        this.shiftTypeList = shiftTypeList;
    }

	@Test
    public void testgetShiftTypeSkillRequirementList() 
    {
		System.out.println(shiftTypeSkillRequirementList);
    }

	@Test
    public void testsetShiftTypeSkillRequirementList() 
    {
        this.shiftTypeSkillRequirementList = shiftTypeSkillRequirementList;
    }

	@Test
    public void testgetPatternList() 
    {
		System.out.println(patternList);
    }

	@Test
    public void testsetPatternList() 
    {
        this.patternList = patternList;
    }

	@Test
    public void testgetContractList() 
    {
		System.out.println(contractList);
    }

	@Test
    public void testsetContractList() 
    {
        this.contractList = contractList;
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
    public void testgetPatternContractLineList() 
    {
		System.out.println(patternContractLineList);
    }

	@Test
    public void testsetPatternContractLineList() 
    {
        this.patternContractLineList = patternContractLineList;
    }

	@Test
    public void testgetEmployeeList() 
    {
		System.out.println(employeeList);
    }

	@Test
    public void testsetEmployeeList() 
    {
        this.employeeList = employeeList;
    }

	@Test
    public void testgetSkillProficiencyList() 
    {
		System.out.println(skillProficiencyList);
    }

	@Test
    public void testsetSkillProficiencyList() 
    {
        this.skillProficiencyList = skillProficiencyList;
    }

	@Test
    public void testgetShiftDateList() 
    {
		System.out.println(shiftDateList);
    }

	@Test
    public void testsetShiftDateList() 
    {
        this.shiftDateList = shiftDateList;
    }

	@Test
    public void testgetShiftList() 
    {
		System.out.println(shiftList);
    }

	@Test
    public void testsetShiftList() 
    {
        this.shiftList = shiftList;
    }

	@Test
    public void testgetDayOffRequestList() 
    {
		System.out.println(dayOffRequestList);
    }

	@Test
    public void testsetDayOffRequestList() 
    {
        this.dayOffRequestList = dayOffRequestList;
    }

	@Test
    public void testgetDayOnRequestList() 
    {
		System.out.println(dayOnRequestList);
    }

	@Test
    public void testsetDayOnRequestList() 
    {
        this.dayOnRequestList = dayOnRequestList;
    }

	@Test
    public void testgetShiftOffRequestList() 
    {
		System.out.println(shiftOffRequestList);
    }

	@Test
    public void testsetShiftOffRequestList() 
    {
        this.shiftOffRequestList = shiftOffRequestList;
    }

	@Test
    public void testgetShiftOnRequestList() 
    {
		System.out.println(shiftOnRequestList);
    }

	@Test
    public void testsetShiftOnRequestList() 
    {
        this.shiftOnRequestList = shiftOnRequestList;
    }

	@Test
    public void testgetShiftAssignmentList() 
    {
		System.out.println(shiftAssignmentList);
    }

	@Test
    public void testsetShiftAssignmentList() 
    {
        this.shiftAssignmentList = shiftAssignmentList;
    }

	@Test
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
