package com.project.brainteaser.entities;

public class Answer {
	
	private int answerId;
	private Question question;
	
	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String solution;
	
	
	public Answer(){}
	
	public Answer(Question question, String optionA, String optionB, String optionC, String optionD, String solution ){
		
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.solution = solution;
		
	}
	
	public int getId() {
		return answerId;
	}
	public void setId(int id) {
		this.answerId = id;
	}
	
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	
	

}
