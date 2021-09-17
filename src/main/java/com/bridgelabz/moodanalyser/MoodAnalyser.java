package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	static MoodAnalyser moodAnalyser = new MoodAnalyser();

	public static void main(String[] args) {

		String message = "I am in Sad Mood";
		String messages = "I am in Any Mood";

		String sadmood = null;
		String happayMood = null;
		try {

			sadmood = moodAnalyser.analyseMood(message);
			happayMood = moodAnalyser.analyseMood(messages);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(sadmood);
		System.out.println(happayMood);

	}

	public String analyseMood(String message) throws MoodAnalysisException {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "Sad";
			} else {
				return "Happy";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("No Mood");
		}

	}
}
