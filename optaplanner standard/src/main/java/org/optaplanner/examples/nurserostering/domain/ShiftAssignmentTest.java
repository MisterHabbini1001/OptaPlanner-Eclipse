package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import java.time.DayOfWeek;
import java.util.Comparator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.examples.nurserostering.domain.contract.Contract;
import org.optaplanner.examples.nurserostering.domain.solver.EmployeeStrengthComparator;

public class ShiftAssignmentTest 
{
    private static final Comparator<Shift> COMPARATOR = Comparator.comparing(Shift::getShiftDate)
            .thenComparing(a -> a.getShiftType().getStartTimeString())
            .thenComparing(a -> a.getShiftType().getEndTimeString());

    private Shift shift;
    private int indexInShift;

    // Planning variables: changes during planning, between score calculations.
    @PlanningVariable(valueRangeProviderRefs = {"employeeRange"},
            strengthComparatorClass = EmployeeStrengthComparator.class)
    private Employee employee;
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ShiftAssignment sa = new ShiftAssignment();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ShiftAssignment sa = new ShiftAssignment();
		sa = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ShiftAssignment sa = new ShiftAssignment();
	}

	@After
	public void tearDown() throws Exception 
	{
		ShiftAssignment sa = new ShiftAssignment();
		sa = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
	public void testgetShift() 
	{
        System.out.println(shift);
    }

	@Test
    public void testsetShift() 
    {
        this.shift = shift;
    }

	@Test
    public void testgetIndexInShift() 
    {
		System.out.println(indexInShift);
    }

	@Test
    public void testsetIndexInShift() 
    {
        this.indexInShift = indexInShift;
    }

	@Test
    public void testgetEmployee() 
    {
		System.out.println(employee);
    }

	@Test
    public void testsetEmployee() 
    {
        this.employee = employee;
    }

	@Test
    public void testgetShiftDate() 
    {
		System.out.println(shift.getShiftDate());
    }

	@Test
    public void testgetShiftType() 
    {
		System.out.println(shift.getShiftType());
    }

	@Test
    public void testgetShiftDateDayIndex() 
    {
		System.out.println(shift.getShiftDate().getDayIndex());
    }

	@Test
    public void testgetShiftDateDayOfWeek() 
    {
		System.out.println(shift.getShiftDate().getDayOfWeek());
    }

	@Test
    public void testgetContract() 
    {
        if (employee == null) 
        {
        	System.out.println();
        }
        
        System.out.println(0);
    }

	@Test
    public void testisWeekend() 
    {
        if (employee == null) 
        {
        	System.out.println(false);
        }
        
        WeekendDefinition weekendDefinition = employee.getContract().getWeekendDefinition();
        DayOfWeek dayOfWeek = shift.getShiftDate().getDayOfWeek();
        System.out.println(weekendDefinition.isWeekend(dayOfWeek));
    }

	@Test
    public void testgetWeekendSundayIndex() 
    {
		System.out.println(shift.getShiftDate().getWeekendSundayIndex());
    }

	@Test
    public void testtoString() 
    {
		System.out.println(shift.toString());
    }

	@Test
    public void testcompareTo() 
	{
        System.out.println(0);
    }
}
