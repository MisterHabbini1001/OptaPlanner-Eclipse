package org.optaplanner.examples.curriculumcourse.domain;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CourseTest 
{
    private String code;
    private Teacher teacher;
    private int lectureSize;
    private int minWorkingDaySize;
    private List<Curriculum> curriculumList;
    private int studentSize;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Course co = new Course();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Course co = new Course();
		co = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Course co = new Course();
	}

	@After
	public void tearDown() throws Exception 
	{
		Course co = new Course();
		co = null;
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
    public void testgetTeacher() 
	{
		System.out.println(teacher);
    }

	@Test
    public void testsetTeacher() 
	{
        this.teacher = teacher;
    }

	@Test
    public void testgetLectureSize() 
	{
		System.out.println(lectureSize);
    }

	@Test
    public void testsetLectureSize() 
	{
        this.lectureSize = lectureSize;
    }

	@Test
    public void testgetMinWorkingDaySize() 
	{
		System.out.println(minWorkingDaySize);
    }

	@Test
    public void testsetMinWorkingDaySize() 
	{
        this.minWorkingDaySize = minWorkingDaySize;
    }

	@Test
    public void testgetCurriculumList() 
	{
		System.out.println(curriculumList);
    }

	@Test
    public void testsetCurriculumList() 
	{
        this.curriculumList = curriculumList;
    }

	@Test
    public void testgetStudentSize() 
	{
		System.out.println(studentSize);
    }

	@Test
    public void testsetStudentSize() 
	{
        this.studentSize = studentSize;
    }

	@Test
    public void testtoString() 
	{
		System.out.println(code);
    }
}