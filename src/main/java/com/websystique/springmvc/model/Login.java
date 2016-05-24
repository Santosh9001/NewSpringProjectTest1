package com.websystique.springmvc.model;

public class Login {

	private String username;
	private String countries;
	private String genders;
	public String getGenders() {
		return genders;
	}
	public void setGenders(String genders) {
		this.genders = genders;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private String password;
	private String sections;
	
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
}
