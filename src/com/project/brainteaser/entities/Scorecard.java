package com.project.brainteaser.entities;

public class Scorecard {

	private int scorecardId;
	private Quiz quiz;
	private User user;
	private double percentage;
	private String remarks;
	
	public Scorecard(){}

	public Scorecard(Quiz quiz, User user, double percentage, String remarks){
		this.quiz = quiz;
		this.user = user;
		this.percentage = percentage;
		this.remarks = remarks;
	}
	
	public int getScorecardId() {
		return scorecardId;
	}

	public void setScorecardId(int scorecardId) {
		this.scorecardId = scorecardId;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
