package org.optaplanner.examples.nurserostering.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SkillProficiencyTest 
{
    private Employee employee;
    private Skill skill;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		SkillProficiency sp = new SkillProficiency();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		SkillProficiency sp = new SkillProficiency();
		sp = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		SkillProficiency sp = new SkillProficiency();
	}

	@After
	public void tearDown() throws Exception 
	{
		SkillProficiency sp = new SkillProficiency();
		sp = null;
	}

	/*
	@Test
	public void test() 
	{
		fail("Not yet implemented");
	}
	*/

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
    public void testgetSkill() 
    {
		System.out.println(skill);
    }

	@Test
    public void testsetSkill() 
    {
        this.skill = skill;
    }

	@Test
    public void testtoString() 
    {
		System.out.println(employee + "-" + skill);
    }
}
