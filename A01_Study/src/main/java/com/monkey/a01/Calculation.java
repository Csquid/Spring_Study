package com.monkey.a01;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public Calculation() {}
	public Calculation(int nNum01, int nNum02) {
		this.firstNum = nNum01;
		this.secondNum = nNum02;
	}
	
	public void setFirstNum(int nNum01) {
		this.firstNum = nNum01;
	}
	
	public void setSecondNum(int nNum02) {
		this.secondNum = nNum02;
	}
	
	public void add() {
		System.out.println("add()");
		System.out.println(this.firstNum + " + " + this.secondNum + ": " + (this.firstNum + this.secondNum));
	}
	
	public void sub() {
		System.out.println("sub()");
		System.out.println(this.firstNum + " - " + this.secondNum + ": " + (this.firstNum - this.secondNum));
	}
	
	public void mul() {
		System.out.println("mul()");
		System.out.println(this.firstNum + " * " + this.secondNum + ": " + (this.firstNum * this.secondNum));
	}
	
	public void div() {
		System.out.println("div()");
		System.out.println(this.firstNum + " / " + this.secondNum + ": " + (this.firstNum / this.secondNum));
	}
}
