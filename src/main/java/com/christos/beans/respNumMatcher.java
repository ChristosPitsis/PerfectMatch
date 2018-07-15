package com.christos.beans;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement(name="respNumMatcher")
public class respNumMatcher {
	
	private String male;
	private int number;
	private String female;
	
	public respNumMatcher() {
		super();
	}
	
	public respNumMatcher(String male, int number, String female) {
		super();
		this.male = male;
		this.number = number;
		this.female = female;
	}
	
	@XmlElement(name="male")
	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	@XmlElement(name="number")
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@XmlElement(name="female")
	public String getFemale() {
		return female;
	}

	public void setFemale(String female) {
		this.female = female;
	}

	@Override
	public String toString() {
		return "respNumMatcher [male=" + male + ", number=" + number + ", female=" + female + "]";
	}
}