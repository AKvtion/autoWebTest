package org.liangfacan353.selenium_test;

public class Calculate {
	
	public double add(double a,double b) {
		return a + b;
	}
	
	public double sub(double a ,double b) {
		return a - b;
	}
	
	public double mcl(double a ,double b) {
		return a * b;
	}
	
	public double div(double a ,double b) {
		if(b==0) {
			System.out.println("分母不能为0");
			return 0;
		}
		return a / b;
	}
	
 }

