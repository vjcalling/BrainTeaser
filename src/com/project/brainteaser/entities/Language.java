package com.project.brainteaser.entities;

public class Language {

	private int langId;
	private String name;
	
	public Language(){}
	
	public Language(String name){
		this.name = name;
	}

	public int getLangId() {
		return langId;
	}

	public void setLangId(int langId) {
		this.langId = langId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

	
}
