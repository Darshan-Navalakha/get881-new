package com.lti.model;

public class Calc {

	public void add(int num1, int num2) {
		System.out.println("sum:" +num1+num2);
	}
	public void product(int num1,int num2) {
		System.out.println("multiply:" +(num1*num2));
	}
	public void subs(int num1, int num2) {
		System.out.println("diff:" + (num1-num2));
	}
	public void div(int num1,int num2) {
		System.out.println("division:" +(num1/num2));
	}
}
