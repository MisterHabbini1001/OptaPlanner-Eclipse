package org.optaplanner.examples.conferencescheduling.domain;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.optaplanner.core.api.domain.constraintweight.ConstraintWeight;
import org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScore;

public class ConferenceConstraintConfigurationTest 
{
    public static final String ROOM_UNAVAILABLE_TIMESLOT = "Room unavailable timeslot";
    public static final String ROOM_CONFLICT = "Room conflict";
    public static final String SPEAKER_UNAVAILABLE_TIMESLOT = "Speaker unavailable timeslot";
    public static final String SPEAKER_CONFLICT = "Speaker conflict";
    public static final String TALK_PREREQUISITE_TALKS = "Talk prerequisite talks";
    public static final String TALK_MUTUALLY_EXCLUSIVE_TALKS_TAGS = "Talk mutually-exclusive-talks tags";
    public static final String CONSECUTIVE_TALKS_PAUSE = "Consecutive talks pause";
    public static final String CROWD_CONTROL = "Crowd control";

    public static final String SPEAKER_REQUIRED_TIMESLOT_TAGS = "Speaker required timeslot tags";
    public static final String SPEAKER_PROHIBITED_TIMESLOT_TAGS = "Speaker prohibited timeslot tags";
    public static final String TALK_REQUIRED_TIMESLOT_TAGS = "Talk required timeslot tags";
    public static final String TALK_PROHIBITED_TIMESLOT_TAGS = "Talk prohibited timeslot tags";
    public static final String SPEAKER_REQUIRED_ROOM_TAGS = "Speaker required room tags";
    public static final String SPEAKER_PROHIBITED_ROOM_TAGS = "Speaker prohibited room tags";
    public static final String TALK_REQUIRED_ROOM_TAGS = "Talk required room tags";
    public static final String TALK_PROHIBITED_ROOM_TAGS = "Talk prohibited room tags";

    public static final String PUBLISHED_TIMESLOT = "Published timeslot";

    public static final String PUBLISHED_ROOM = "Published room";
    public static final String THEME_TRACK_CONFLICT = "Theme track conflict";
    public static final String THEME_TRACK_ROOM_STABILITY = "Theme track room stability";
    public static final String SECTOR_CONFLICT = "Sector conflict";
    public static final String AUDIENCE_TYPE_DIVERSITY = "Audience type diversity";
    public static final String AUDIENCE_TYPE_THEME_TRACK_CONFLICT = "Audience type theme track conflict";
    public static final String AUDIENCE_LEVEL_DIVERSITY = "Audience level diversity";
    public static final String CONTENT_AUDIENCE_LEVEL_FLOW_VIOLATION = "Content audience level flow violation";
    public static final String CONTENT_CONFLICT = "Content conflict";
    public static final String LANGUAGE_DIVERSITY = "Language diversity";
    public static final String SAME_DAY_TALKS = "Same day talks";
    public static final String POPULAR_TALKS = "Popular talks";

    public static final String SPEAKER_PREFERRED_TIMESLOT_TAGS = "Speaker preferred timeslot tags";
    public static final String SPEAKER_UNDESIRED_TIMESLOT_TAGS = "Speaker undesired timeslot tags";
    public static final String TALK_PREFERRED_TIMESLOT_TAGS = "Talk preferred timeslot tags";
    public static final String TALK_UNDESIRED_TIMESLOT_TAGS = "Talk undesired timeslot tags";
    public static final String SPEAKER_PREFERRED_ROOM_TAGS = "Speaker preferred room tags";
    public static final String SPEAKER_UNDESIRED_ROOM_TAGS = "Speaker undesired room tags";
    public static final String TALK_PREFERRED_ROOM_TAGS = "Talk preferred room tags";
    public static final String TALK_UNDESIRED_ROOM_TAGS = "Talk undesired room tags";

    private int minimumConsecutiveTalksPauseInMinutes = 30;

    @ConstraintWeight(ROOM_UNAVAILABLE_TIMESLOT)
    private HardMediumSoftScore roomUnavailableTimeslot = HardMediumSoftScore.ofHard(100_000);
    @ConstraintWeight(ROOM_CONFLICT)
    private HardMediumSoftScore roomConflict = HardMediumSoftScore.ofHard(1_000);
    @ConstraintWeight(SPEAKER_UNAVAILABLE_TIMESLOT)
    private HardMediumSoftScore speakerUnavailableTimeslot = HardMediumSoftScore.ofHard(100);
    @ConstraintWeight(SPEAKER_CONFLICT)
    private HardMediumSoftScore speakerConflict = HardMediumSoftScore.ofHard(10);
    @ConstraintWeight(TALK_PREREQUISITE_TALKS)
    private HardMediumSoftScore talkPrerequisiteTalks = HardMediumSoftScore.ofHard(10);
    @ConstraintWeight(TALK_MUTUALLY_EXCLUSIVE_TALKS_TAGS)
    private HardMediumSoftScore talkMutuallyExclusiveTalksTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(CONSECUTIVE_TALKS_PAUSE)
    private HardMediumSoftScore consecutiveTalksPause = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(CROWD_CONTROL)
    private HardMediumSoftScore crowdControl = HardMediumSoftScore.ofHard(1);

    @ConstraintWeight(SPEAKER_REQUIRED_TIMESLOT_TAGS)
    private HardMediumSoftScore speakerRequiredTimeslotTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(SPEAKER_PROHIBITED_TIMESLOT_TAGS)
    private HardMediumSoftScore speakerProhibitedTimeslotTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(TALK_REQUIRED_TIMESLOT_TAGS)
    private HardMediumSoftScore talkRequiredTimeslotTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(TALK_PROHIBITED_TIMESLOT_TAGS)
    private HardMediumSoftScore talkProhibitedTimeslotTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(SPEAKER_REQUIRED_ROOM_TAGS)
    private HardMediumSoftScore speakerRequiredRoomTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(SPEAKER_PROHIBITED_ROOM_TAGS)
    private HardMediumSoftScore speakerProhibitedRoomTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(TALK_REQUIRED_ROOM_TAGS)
    private HardMediumSoftScore talkRequiredRoomTags = HardMediumSoftScore.ofHard(1);
    @ConstraintWeight(TALK_PROHIBITED_ROOM_TAGS)
    private HardMediumSoftScore talkProhibitedRoomTags = HardMediumSoftScore.ofHard(1);

    @ConstraintWeight(PUBLISHED_TIMESLOT)
    private HardMediumSoftScore publishedTimeslot = HardMediumSoftScore.ofMedium(1);

    @ConstraintWeight(PUBLISHED_ROOM)
    private HardMediumSoftScore publishedRoom = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(THEME_TRACK_CONFLICT)
    private HardMediumSoftScore themeTrackConflict = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(THEME_TRACK_ROOM_STABILITY)
    private HardMediumSoftScore themeTrackRoomStability = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(SECTOR_CONFLICT)
    private HardMediumSoftScore sectorConflict = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(AUDIENCE_TYPE_DIVERSITY)
    private HardMediumSoftScore audienceTypeDiversity = HardMediumSoftScore.ofSoft(1);
    @ConstraintWeight(AUDIENCE_TYPE_THEME_TRACK_CONFLICT)
    private HardMediumSoftScore audienceTypeThemeTrackConflict = HardMediumSoftScore.ofSoft(1);
    @ConstraintWeight(AUDIENCE_LEVEL_DIVERSITY)
    private HardMediumSoftScore audienceLevelDiversity = HardMediumSoftScore.ofSoft(1);
    @ConstraintWeight(CONTENT_AUDIENCE_LEVEL_FLOW_VIOLATION)
    private HardMediumSoftScore contentAudienceLevelFlowViolation = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(CONTENT_CONFLICT)
    private HardMediumSoftScore contentConflict = HardMediumSoftScore.ofSoft(100);
    @ConstraintWeight(LANGUAGE_DIVERSITY)
    private HardMediumSoftScore languageDiversity = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(SAME_DAY_TALKS)
    private HardMediumSoftScore sameDayTalks = HardMediumSoftScore.ofSoft(10);
    @ConstraintWeight(POPULAR_TALKS)
    private HardMediumSoftScore popularTalks = HardMediumSoftScore.ofSoft(10);

    @ConstraintWeight(SPEAKER_PREFERRED_TIMESLOT_TAGS)
    private HardMediumSoftScore speakerPreferredTimeslotTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(SPEAKER_UNDESIRED_TIMESLOT_TAGS)
    private HardMediumSoftScore speakerUndesiredTimeslotTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(TALK_PREFERRED_TIMESLOT_TAGS)
    private HardMediumSoftScore talkPreferredTimeslotTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(TALK_UNDESIRED_TIMESLOT_TAGS)
    private HardMediumSoftScore talkUndesiredTimeslotTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(SPEAKER_PREFERRED_ROOM_TAGS)
    private HardMediumSoftScore speakerPreferredRoomTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(SPEAKER_UNDESIRED_ROOM_TAGS)
    private HardMediumSoftScore speakerUndesiredRoomTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(TALK_PREFERRED_ROOM_TAGS)
    private HardMediumSoftScore talkPreferredRoomTags = HardMediumSoftScore.ofSoft(20);
    @ConstraintWeight(TALK_UNDESIRED_ROOM_TAGS)
    private HardMediumSoftScore talkUndesiredRoomTags = HardMediumSoftScore.ofSoft(20);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		ConferenceConstraintConfiguration ccc = new ConferenceConstraintConfiguration();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		ConferenceConstraintConfiguration ccc = new ConferenceConstraintConfiguration();
		ccc = null;
	}

	@Before
	public void setUp() throws Exception 
	{
		ConferenceConstraintConfiguration ccc = new ConferenceConstraintConfiguration();
	}

	@After
	public void tearDown() throws Exception 
	{
		ConferenceConstraintConfiguration ccc = new ConferenceConstraintConfiguration();
		ccc = null;
	}

	/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	*/

    public ConferenceConstraintConfigurationTest() 
    {
    	
    }

    // ************************************************************************
    // Simple getters and setters
    // ************************************************************************

    @Test
    public void testgetMinimumConsecutiveTalksPauseInMinutes() 
    {
        System.out.println(minimumConsecutiveTalksPauseInMinutes);
    }

    @Test
    public void testsetMinimumConsecutiveTalksPauseInMinutes() 
    {
        this.minimumConsecutiveTalksPauseInMinutes = minimumConsecutiveTalksPauseInMinutes;
    }

    @Test
    public void testgetRoomUnavailableTimeslot() 
    {
        System.out.println(roomUnavailableTimeslot);
    }

    @Test
    public void testsetRoomUnavailableTimeslot() 
    {
        this.roomUnavailableTimeslot = roomUnavailableTimeslot;
    }

    @Test
    public void testgetRoomConflict() 
    {
        System.out.println(roomConflict);
    }

    @Test
    public void testsetRoomConflict() 
    {
        this.roomConflict = roomConflict;
    }

    @Test
    public void testgetSpeakerUnavailableTimeslot() 
    {
        System.out.println(speakerUnavailableTimeslot);
    }

    @Test
    public void testsetSpeakerUnavailableTimeslot() 
    {
        this.speakerUnavailableTimeslot = speakerUnavailableTimeslot;
    }

    @Test
    public void testgetSpeakerConflict() 
    {
        System.out.println(speakerConflict);
    }

    @Test
    public void testsetSpeakerConflict() 
    {
        this.speakerConflict = speakerConflict;
    }

    @Test
    public void testgetTalkPrerequisiteTalks() 
    {
        System.out.println(talkPrerequisiteTalks);
    }

    @Test
    public void testsetTalkPrerequisiteTalks() 
    {
        this.talkPrerequisiteTalks = talkPrerequisiteTalks;
    }

    @Test
    public void testgetTalkMutuallyExclusiveTalksTags() 
    {
        System.out.println(talkMutuallyExclusiveTalksTags);
    }

    @Test
    public void testsetTalkMutuallyExclusiveTalksTags() 
    {
        this.talkMutuallyExclusiveTalksTags = talkMutuallyExclusiveTalksTags;
    }

    @Test
    public void testgetConsecutiveTalksPause() 
    {
        System.out.println(consecutiveTalksPause);
    }

    @Test
    public void testsetConsecutiveTalksPause() 
    {
        this.consecutiveTalksPause = consecutiveTalksPause;
    }

    @Test
    public void testgetCrowdControl() 
    {
        System.out.println(crowdControl);
    }

    @Test
    public void testsetCrowdControl() 
    {
        this.crowdControl = crowdControl;
    }

    @Test
    public void testgetSpeakerRequiredTimeslotTags() 
    {
        System.out.println(speakerRequiredTimeslotTags);
    }

    @Test
    public void testsetSpeakerRequiredTimeslotTags() 
    {
        this.speakerRequiredTimeslotTags = speakerRequiredTimeslotTags;
    }

    @Test
    public void testgetSpeakerProhibitedTimeslotTags() 
    {
        System.out.println(speakerProhibitedTimeslotTags);
    }

    @Test
    public void testsetSpeakerProhibitedTimeslotTags() 
    {
        this.speakerProhibitedTimeslotTags = speakerProhibitedTimeslotTags;
    }

    @Test
    public void testgetTalkRequiredTimeslotTags() 
    {
        System.out.println(talkRequiredTimeslotTags);
    }

    @Test
    public void testsetTalkRequiredTimeslotTags() 
    {
        this.talkRequiredTimeslotTags = talkRequiredTimeslotTags;
    }

    @Test
    public void testgetTalkProhibitedTimeslotTags() 
    {
    	System.out.println(talkProhibitedTimeslotTags);
    }

    @Test
    public void testsetTalkProhibitedTimeslotTags() 
    {
        this.talkProhibitedTimeslotTags = talkProhibitedTimeslotTags;
    }

    @Test
    public void testgetSpeakerRequiredRoomTags() 
    {
    	System.out.println(speakerRequiredRoomTags);
    }

    @Test
    public void testsetSpeakerRequiredRoomTags() 
    {
        this.speakerRequiredRoomTags = speakerRequiredRoomTags;
    }

    @Test
    public void testgetSpeakerProhibitedRoomTags() 
    {
        System.out.println(speakerProhibitedRoomTags);
    }

    @Test
    public void testsetSpeakerProhibitedRoomTags() 
    {
        this.speakerProhibitedRoomTags = speakerProhibitedRoomTags;
    }

    @Test
    public void testgetTalkRequiredRoomTags() 
    {
    	System.out.println(talkRequiredRoomTags);
    }

    @Test
    public void testsetTalkRequiredRoomTags() 
    {
        this.talkRequiredRoomTags = talkRequiredRoomTags;
    }

    @Test
    public void testgetTalkProhibitedRoomTags() 
    {
    	System.out.println(talkProhibitedRoomTags);
    }

    @Test
    public void testsetTalkProhibitedRoomTags() 
    {
        this.talkProhibitedRoomTags = talkProhibitedRoomTags;
    }

    @Test
    public void testgetPublishedTimeslot() 
    {
        System.out.println(publishedTimeslot);
    }

    @Test
    public void testsetPublishedTimeslot() 
    {
        this.publishedTimeslot = publishedTimeslot;
    }

    @Test
    public void testgetPublishedRoom() 
    {
    	System.out.println(publishedRoom);
    }

    @Test
    public void testsetPublishedRoom() 
    {
        this.publishedRoom = publishedRoom;
    }

    @Test
    public void testgetThemeTrackConflict() 
    {
    	System.out.println(themeTrackConflict);
    }

    @Test
    public void testsetThemeTrackConflict() 
    {
        this.themeTrackConflict = themeTrackConflict;
    }

    @Test
    public void testgetThemeTrackRoomStability() 
    {
    	System.out.println(themeTrackRoomStability);
    }

    @Test
    public void testsetThemeTrackRoomStability() 
    {
        this.themeTrackRoomStability = themeTrackRoomStability;
    }

    @Test
    public void testgetSectorConflict() 
    {
    	System.out.println(sectorConflict);
    }

    @Test
    public void testsetSectorConflict() 
    {
        this.sectorConflict = sectorConflict;
    }

    @Test
    public void testgetAudienceTypeDiversity() 
    {
        System.out.println(audienceTypeDiversity);
    }

    @Test
    public void testsetAudienceTypeDiversity() 
    {
        this.audienceTypeDiversity = audienceTypeDiversity;
    }

    @Test
    public void testgetAudienceTypeThemeTrackConflict() 
    {
        System.out.println(audienceTypeThemeTrackConflict);
    }

    @Test
    public void testsetAudienceTypeThemeTrackConflict() 
    {
        this.audienceTypeThemeTrackConflict = audienceTypeThemeTrackConflict;
    }

    @Test
    public void testgetAudienceLevelDiversity() 
    {
        System.out.println(audienceLevelDiversity);
    }

    @Test
    public void testsetAudienceLevelDiversity() 
    {
        this.audienceLevelDiversity = audienceLevelDiversity;
    }

    @Test
    public void testgetContentAudienceLevelFlowViolation() 
    {
        System.out.println(contentAudienceLevelFlowViolation);
    }

    @Test
    public void testsetContentAudienceLevelFlowViolation() 
    {
        this.contentAudienceLevelFlowViolation = contentAudienceLevelFlowViolation;
    }

    @Test
    public void testgetContentConflict() 
    {
        System.out.println(contentConflict);
    }

    @Test
    public void testsetContentConflict() 
    {
        this.contentConflict = contentConflict;
    }

    @Test
    public void testgetLanguageDiversity() 
    {
        System.out.println(languageDiversity);
    }

    @Test
    public void testsetLanguageDiversity() 
    {
        this.languageDiversity = languageDiversity;
    }

    @Test
    public void testgetSameDayTalks() 
    {
        System.out.println(sameDayTalks);
    }

    @Test
    public void testsetSameDayTalks() 
    {
        this.sameDayTalks = sameDayTalks;
    }

    @Test
    public void testgetPopularTalks() 
    {
        System.out.println(popularTalks);
    }

    @Test
    public void testsetPopularTalks() 
    {
        this.popularTalks = popularTalks;
    }

    @Test
    public void testgetSpeakerPreferredTimeslotTags() 
    {
        System.out.println(speakerPreferredTimeslotTags);
    }

    @Test
    public void testsetSpeakerPreferredTimeslotTags() 
    {
        this.speakerPreferredTimeslotTags = speakerPreferredTimeslotTags;
    }

    @Test
    public void testgetSpeakerUndesiredTimeslotTags() 
    {
        System.out.println(speakerUndesiredTimeslotTags);
    }

    @Test
    public void testsetSpeakerUndesiredTimeslotTags() 
    {
        this.speakerUndesiredTimeslotTags = speakerUndesiredTimeslotTags;
    }

    @Test
    public void testgetTalkPreferredTimeslotTags() 
    {
        System.out.println(talkPreferredTimeslotTags);
    }

    @Test
    public void testsetTalkPreferredTimeslotTags() 
    {
        this.talkPreferredTimeslotTags = talkPreferredTimeslotTags;
    }

    @Test
    public void testgetTalkUndesiredTimeslotTags() 
    {
        System.out.println(talkUndesiredTimeslotTags);
    }

    @Test
    public void testsetTalkUndesiredTimeslotTags() 
    {
        this.talkUndesiredTimeslotTags = talkUndesiredTimeslotTags;
    }

    @Test
    public void testgetSpeakerPreferredRoomTags() 
    {
        System.out.println(speakerPreferredRoomTags);
    }

    @Test
    public void testsetSpeakerPreferredRoomTags() 
    {
        this.speakerPreferredRoomTags = speakerPreferredRoomTags;
    }

    @Test
    public void testgetSpeakerUndesiredRoomTags() 
    {
        System.out.println(speakerUndesiredRoomTags);
    }

    @Test
    public void testsetSpeakerUndesiredRoomTags() 
    {
        this.speakerUndesiredRoomTags = speakerUndesiredRoomTags;
    }

    @Test
    public void testgetTalkPreferredRoomTags() 
    {
        System.out.println(talkPreferredRoomTags);
    }

    @Test
    public void testsetTalkPreferredRoomTags() 
    {
        this.talkPreferredRoomTags = talkPreferredRoomTags;
    }

    @Test
    public void testgetTalkUndesiredRoomTags() 
    {
        System.out.println(talkUndesiredRoomTags);
    }

    @Test
    public void testsetTalkUndesiredRoomTags() 
    {
        this.talkUndesiredRoomTags = talkUndesiredRoomTags;
    }
}
