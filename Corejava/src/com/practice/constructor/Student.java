package com.practice.constructor;

public class Student {
	String name;
	int rollno ;
	
	public Student(String name) {
		this.name =name;
	}
	public Student(String name ,int rollno) {
		//this.name =name;
		this(name);
		this.rollno =rollno ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed :" + this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return  this.name.equals( s1.getName());
	}

	}

