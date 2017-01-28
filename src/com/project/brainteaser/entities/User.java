package com.project.brainteaser.entities;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int userId;
	private String firstname;
	private String lastname;
	private double experience;
	private String level;
	private String username;


//--------------------------------------------------------------------------------------------------------
		
	public User(){}	

//--------------------------------------------------------------------------------------------------------
		
	public User(String firstname, String lastname, double experience, String username){
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.experience = experience;
		this.username = username;
		this.calculateLevel();
		
	}
	
//--------------------------------------------------------------------------------------------------------
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void calculateLevel(){
	
		if(this.experience > 0 && this.experience < 3)
			this.setLevel("Fresher");
		else if(this.experience >= 3 && this.experience < 8)
			this.setLevel("Moderate");
		else if(this.experience >= 8)
			this.setLevel("Experienced");
	}
	
//--------------------------------------------------------------------------------------------------------
		
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}
	private Set<Language> languages = new HashSet<Language>();
		
	public String getFirstname() {
		return firstname;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public Set getLanguages() {
		return languages;
	}
	
}
