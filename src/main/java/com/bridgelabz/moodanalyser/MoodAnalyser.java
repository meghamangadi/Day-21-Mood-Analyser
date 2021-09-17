package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser() {
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public static void main(String[] args) {

		String message = "I am in Sad Mood";
		String sadmood = null;
		MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		try {

			sadmood = moodAnalyser.analyseMood();

		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(sadmood);

	}

	public String analyseMood() throws MoodAnalysisException {
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
