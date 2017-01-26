package com.project.brainteaser.entities;

import java.util.Date;

public class Quiz {

	private int quizId;
	private User user;
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
