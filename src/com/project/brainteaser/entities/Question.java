package com.project.brainteaser.entities;

import java.util.HashSet;
import java.util.Set;

public class Question {

	private int quesId;
	private Language language;
	private String level;
	private String questionDescription;
	private Set<Question> quizzes = new HashSet<Question>();

	public Set<Question> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(Set<Question> quizzes) {
		this.quizzes = quizzes;
	}

	public String getQuestionDescription() {
		return questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}


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
