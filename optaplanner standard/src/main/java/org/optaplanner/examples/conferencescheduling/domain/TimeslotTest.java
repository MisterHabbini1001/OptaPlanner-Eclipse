package org.optaplanner.examples.conferencescheduling.domain;
import static org.junit.Assert.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimeslotTest 
{
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Set<TalkType> talkTypeSet;
    private Set<String> tagSet;

    // Cached
    private Integer durationInMinutes;
	
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
    public void testgetDate() 
	{
        System.out.println(startDateTime.toLocalDate());
    }

	@Test
    public void testgetDurationInMinutes() 
    {
		System.out.println(durationInMinutes);
    }

	@Test
    public void testoverlapsTime() 
    {
		System.out.println(true);
    }

	@Test
    public void testgetOverlapInMinutes() 
    {
		System.out.println(durationInMinutes);
    }

	@Test
    public void teststartsAfter() 
    {
		System.out.println(0);
    }

	@Test
    public void testendsBefore() 
    {
		System.out.println(0);
    }

	@Test
    public void testhasTag() 
    {
		System.out.println(0);
    }

	@Test
    public void testisOnSameDayAs() 
    {
		System.out.println(0);
    }

	@Test
    public void testpauseExists() 
    {
		System.out.println(false);
    }

    @Test
    public void testtoString() 
    {
    	System.out.println(startDateTime + "-" + endDateTime.toLocalTime());
    }

    @Test
    public void testgetStartDateTime() 
    {
    	System.out.println(startDateTime);
    }

    @Test
    public void testsetStartDateTime() 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetEndDateTime() 
    {
    	System.out.println(endDateTime);
    }

    @Test
    public void testsetEndDateTime(LocalDateTime endDateTime) 
    {
    	System.out.println(0);
    }

    @Test
    public void testgetTalkTypeSet() 
    {
    	System.out.println(talkTypeSet);
    }

    @Test
    public void testsetTalkTypeSet() 
    {
        this.talkTypeSet = talkTypeSet;
    }

    @Test
    public void testgetTagSet() 
    {
    	System.out.println(tagSet);
    }

    @Test
    public void testsetTagSet() 
    {
        this.tagSet = tagSet;
    }

    @Test
    public void testwithTalkTypeSet() 
    {
        this.talkTypeSet = talkTypeSet;
    }

    @Test
    public void testwithStartDateTime() 
    {
    	System.out.println(0);
    }

    @Test
    public void testwithEndDateTime() 
    {
    	System.out.println(0);
    }
}