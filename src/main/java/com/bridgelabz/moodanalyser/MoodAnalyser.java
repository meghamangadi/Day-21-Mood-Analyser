package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	static MoodAnalyser moodAnalyser = new MoodAnalyser();

	public static void main(String[] args) {

		String message = "I am in Sad Mood";
		String mood = null;
		try {

			mood = moodAnalyser.analyseMood(message);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(mood);

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
