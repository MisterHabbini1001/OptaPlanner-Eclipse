package org.optaplanner.examples.curriculumcourse.domain.solver;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.examples.curriculumcourse.domain.Course;

public class CourseConflictTest 
{
    private static final Comparator<Course> COURSE_COMPARATOR = Comparator.comparingLong(Course::getId);
    private static final Comparator<CourseConflict> COMPARATOR =
            Comparator.comparing(CourseConflict::getLeftCourse, COURSE_COMPARATOR)
                    .thenComparing(CourseConflict::getRightCourse, COURSE_COMPARATOR);

    private Course leftCourse;
    private Course rightCourse;
    private int conflictCount;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/
	
	@Test
    public void testgetLeftCourse() 
    {
        System.out.println(leftCourse);
    }

	@Test
    public void testgetRightCourse() 
    {
		System.out.println(rightCourse);
    }

	@Test
    public void testgetConflictCount() 
    {
		System.out.println(conflictCount);
    }

    @Test
    public void testequals() 
    {
    	System.out.println(false);
    }

    @Test
    public void testhashCode() 
    {
    	System.out.println(0);
    }

    @Test
    public void testcompareTo() 
    {
        System.out.println(0);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(leftCourse + " & " + rightCourse);
    }
}
