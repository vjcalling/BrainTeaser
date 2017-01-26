package com.project.brainteaser.entities;

public class Question {

	private int quesId;
	private Language language;
	private String level;
	
	public Question(){}
	

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	
	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
}
