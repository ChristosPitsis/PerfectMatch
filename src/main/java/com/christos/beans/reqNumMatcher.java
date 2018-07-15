package com.christos.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="reqNumMatcher")
public class reqNumMatcher {

	private String name;
	private int num;
	
	public reqNumMatcher() {
		super();
	}
	
	public reqNumMatcher(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	@XmlElement(name="name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="num")
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "reqNumMatcher [name=" + name + ", num=" + num + "]";
	}
}
