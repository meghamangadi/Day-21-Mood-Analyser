package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {

		String mood = "I am in Sad Mood";
		MoodAnalyser moodanalyser = new MoodAnalyser(mood);
		try {
			String actualResult = moodanalyser.analyseMood();
			Assert.assertEquals("Sad", actualResult);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {

		String mood = "I am in Happy Mood";
		MoodAnalyser moodanalyser = new MoodAnalyser(mood);
		try {
			String actualResult = moodanalyser.analyseMood();
			Assert.assertEquals("Happy", actualResult);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_Null_ShouldReturnExceptionHandled()  {
		String mood = null;
		String actualResult = null;
		MoodAnalyser moodanalyser = new MoodAnalyser(mood);
		try {
			actualResult = moodanalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e.toString());
		}
		Assert.assertEquals(null, actualResult);
	}
}
