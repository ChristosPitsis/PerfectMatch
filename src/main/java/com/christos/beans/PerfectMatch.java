package com.christos.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="respPerfectMatch")
@XmlType(propOrder = {"maleName", "score", "femaleName"})
public class PerfectMatch {
	
	private String maleName;
	private String femaleName;
	private int score;
	
	public PerfectMatch(String maleName, String femaleName, int score) {
		super();
		this.maleName = maleName;
		this.femaleName = femaleName;
		this.score = score;
	}
	
	public PerfectMatch() {
		super();
	}
	
	@XmlElement(name="MaleName")
	public String getMaleName() {
		return maleName;
	}
	
	public void setMaleName(String maleName) {
		this.maleName = maleName;
	}
	
	@XmlElement(name="FemaleName")
	public String getFemaleName() {
		return femaleName;
	}
	
	public void setFemaleName(String femaleName) {
		this.femaleName = femaleName;
	}
	
	@XmlElement(name="Score")
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "PerfectMatch [maleName=" + maleName + ", femaleName=" + femaleName + ", score=" + score + "]";
	}
}
