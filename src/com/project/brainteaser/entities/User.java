package com.project.brainteaser.entities;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int id;
	private String firstname;
	private String lastname;
	private double experience;
	private String level;
	
	public User(){}
	
	public User(String firstname, String lastname, double experience){
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.experience = experience;
		
		if(this.experience > 0 && this.experience < 3)
			this.setLevel("Fresher");
		else if(this.experience >= 3 && this.experience < 8)
			this.setLevel("Moderate");
		else if(this.experience >= 8)
			this.setLevel("Experienced");
		
	}
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
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
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
