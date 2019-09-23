package com.monkey.a02;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public void setFirstNum(int nNum01) {
		firstNum = nNum01;
	}
	
	public void setSecondNum(int nNum02) {
		secondNum = nNum02;
	}
	
	public MyCalculator() { }
	
	public void add() {
		calculator.add(firstNum, secondNum);
	}
	public void sub() {
		calculator.sub(firstNum, secondNum);
	}
	public void mul() {
		calculator.mul(firstNum, secondNum);
	}
	public void div() {
		calculator.div(firstNum, secondNum);
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
}
