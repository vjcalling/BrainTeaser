package com.project.brainteaser.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Quiz {

	private int quizId;
	private User user;
	private Scorecard scorecard;
	
	public Scorecard getScorecard() {
		return scorecard;
	}

	public void setScorecard(Scorecard scorecard) {
		this.scorecard = scorecard;
	}
	private Set<Question> questions = new HashSet<Question>();
	
	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	private Date timestamp;
	
	public Quiz(){}
	
	public Quiz(User user, Date timestamp){
		this.user = user;
		this.timestamp = timestamp;
	}
	
	
	
	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
