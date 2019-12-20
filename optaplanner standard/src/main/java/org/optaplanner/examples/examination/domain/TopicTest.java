package org.optaplanner.examples.examination.domain;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TopicTest 
{
    private int duration; 
    private List<Student> studentList;
    private boolean frontLoadLarge;
    private Set<Topic> coincidenceTopicSet = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Topic to = new Topic();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Topic to = new Topic();
		to = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		Topic to = new Topic();
	}

	@After
	public void tearDown() throws Exception 
	{
		Topic to = new Topic();
		to = null;
	}

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

	@Test
    public void testgetDuration() 
    {
        System.out.println(duration);
    }

	@Test
    public void testsetDuration() 
    {
        this.duration = duration;
    }

	@Test
    public void testgetStudentList() 
    {
		System.out.println(studentList);
    }

	@Test
    public void testsetStudentList() 
    {
        this.studentList = studentList;
    }

	@Test
    public void testgetStudentSize() 
    {
		System.out.println(studentList.size());
    }

	@Test
    public void testisFrontLoadLarge() 
    {
		System.out.println(frontLoadLarge);
    }

	@Test
    public void testsetFrontLoadLarge() 
    {
        this.frontLoadLarge = frontLoadLarge;
    }

	@Test
    public void testgetCoincidenceTopicSet() 
    {
		System.out.println(coincidenceTopicSet);
    }

	@Test
    public void testsetCoincidenceTopicSet() 
    {
        this.coincidenceTopicSet = coincidenceTopicSet;
    }

	@Test
    public void testhasCoincidenceTopic() 
    {
		System.out.println(coincidenceTopicSet != null);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(0);
    }
}
