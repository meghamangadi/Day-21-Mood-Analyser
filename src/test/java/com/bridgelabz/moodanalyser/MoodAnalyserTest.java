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
}
