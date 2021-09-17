package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser moodanalyser = new MoodAnalyser();
		String mood = "I am in Sad Mood";
		try {
			String actualResult = moodanalyser.analyseMood(mood);
			Assert.assertEquals("Sad", actualResult);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser moodanalyser = new MoodAnalyser();
		String mood = "I am in Any Mood";
		try {
			String actualResult = moodanalyser.analyseMood(mood);
			Assert.assertEquals("Happy", actualResult);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}
}
