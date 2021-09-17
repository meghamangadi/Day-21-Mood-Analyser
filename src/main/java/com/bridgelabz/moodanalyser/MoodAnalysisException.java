package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception {

	private static final long serialVersionUID = 1L;
	public String message;

	public MoodAnalysisException(String message) {
		super(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}