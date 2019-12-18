package org.optaplanner.examples.curriculumcourse.domain;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.entity.PlanningPin;
import org.optaplanner.core.api.domain.variable.PlanningVariable;
import org.optaplanner.examples.curriculumcourse.domain.solver.PeriodStrengthWeightFactory;
import org.optaplanner.examples.curriculumcourse.domain.solver.RoomStrengthWeightFactory;

public class LectureTest 
{
    private Course course;
    private int lectureIndexInCourse;
    private boolean pinned;

    // Planning variables: changes during planning, between score calculations.
    private Period period;
    private Room room;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Lecture le = new Lecture();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Lecture le = new Lecture();
		le = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Lecture le = new Lecture();
		le = null;
	}

	@After
	public void tearDown() throws Exception 
	{
		Lecture le = new Lecture();
		le = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetCourse() 
	{
        System.out.println(course);
    }

	@Test
    public void testsetCourse() 
	{
        this.course = course;
    }

	@Test
    public void testgetLectureIndexInCourse() 
	{
		System.out.println(lectureIndexInCourse);
    }

	@Test
    public void testsetLectureIndexInCourse() 
	{
        this.lectureIndexInCourse = lectureIndexInCourse;
    }

    @PlanningPin
    @Test
    public void testisPinned() 
    {
    	System.out.println(pinned);
    }

    @Test
    public void testsetPinned() 
    {
        this.pinned = pinned;
    }

    @PlanningVariable(valueRangeProviderRefs = {"periodRange"},
            strengthWeightFactoryClass = PeriodStrengthWeightFactory.class)
    @Test
    public void testgetPeriod() 
    {
    	System.out.println(period);
    }

    @Test
    public void testsetPeriod() 
    {
        this.period = period;
    }

    @PlanningVariable(valueRangeProviderRefs = {"roomRange"},
            strengthWeightFactoryClass = RoomStrengthWeightFactory.class)
    @Test
    public void testgetRoom() 
    {
    	System.out.println(room);
    }

    @Test
    public void testsetRoom() 
    {
        this.room = room;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

    @Test
    public void testgetTeacher() 
    {
    	System.out.println(course.getTeacher());
    }

    @Test
    public void testgetStudentSize() 
    {
    	System.out.println(course.getStudentSize());
    }

    @Test
    public void testgetCurriculumList() 
    {
    	System.out.println(course.getCurriculumList());
    }

    @Test
    public void testgetDay() 
    {
    	/*
        if (period == null) 
        {
        	System.out.println(null);
        }
        */
        
    	System.out.println(period.getDay());
    }

    @Test
    public void testgetTimeslotIndex() 
    {
    	/*
        if (period == null) 
        {
            return Integer.MIN_VALUE;
        }
        */
        
    	System.out.println(period.getTimeslot().getTimeslotIndex());
    }

    @Test
    public void testgetLabel() 
    {
    	System.out.println(course.getCode() + "-" + lectureIndexInCourse);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(course + "-" + lectureIndexInCourse);
    }
}
