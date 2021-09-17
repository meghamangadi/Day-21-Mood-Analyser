package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	MoodAnalyser moodAnalyser = new MoodAnalyser();

	public static void main(String[] args) {

		String message = null;
		String mood = null;
		try {
			mood = MoodAnalyser.analyseMood(message);
		} catch (MoodAnalysisException e) {

			e.printStackTrace();
		}
		System.out.println(mood);

	}

	public static String analyseMood(String message) throws MoodAnalysisException {
		try {
			if (message.toLowerCase().contains("sad")) {
				return "Sad";
			} else {
				return "Happy";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalysisException("No mood");
		}

	}
}
