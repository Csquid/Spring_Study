package com.monkey.a0;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		
		nScoreClass.setScore();
	}

	private void showScore() {
		nScoreClass.showScore();
	}
	
	public void showStudentInfo() {
		if(this.name != null) {
			System.out.println("\nName: " + this.name);
		} else {
			System.out.println("Private Name");
		}
		if(this.age > 0) {
			System.out.println("Age:  " + this.age);
		}
		else {
			System.out.println("Private Age");
		}
		if(this.height > 0) {
			System.out.println("Height: " + this.height);
		} else {
			System.out.println("Private Height");
		}
		
		this.showScore();
	}
}
