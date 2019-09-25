package com.monkey.a0;

public class Student {
	private Score nScoreClass; 
	private String name;
	private int age;
	private int height;
	
	public Student() {
		this.init();
	}
	
	public Student(String nName, int nAge) {
		this.init();
		
		this.name = nName;
		this.age = nAge;
	}
	
	public void init() {
		nScoreClass = new Score();
	}
	
	public void setScore() {
		nScoreClass.setScore();
	}
	
	
	public void showStudentInfo() {
		String areaLocation = "Student";
		
		StaticMethod.showArea(areaLocation, StaticMethod.start);
		
		if(this.name != null) {
			System.out.println("\nName: " + this.name);
		} else {
			System.out.println("ERROR Name Property");
		}
		if(this.age > 0) {
			System.out.println("Age:  " + this.age);
		} else {
			System.out.println("ERROR Age Property");
		}
		if(this.height > 0) {
			System.out.println("Height: " + this.height);
		} else {
			System.out.println("ERROR Height Property");
		}
		
		StaticMethod.showArea(areaLocation, StaticMethod.end);
		
		this.showScore();
	}
	
	private void showScore() {
		nScoreClass.showScore();
	}
	
}
