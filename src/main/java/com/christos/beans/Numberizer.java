package com.christos.beans;

public class Numberizer {

	private String name;
	private int num;
	
	public Numberizer() {
		super();
	}
	
	public Numberizer(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Numberizer [name=" + name + ", num=" + num + "]";
	}
}
