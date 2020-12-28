package com.calcBackend.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServices {
	
	
	public String calcEquation(String first,String op,String second) {
		double num1 =Double.parseDouble(first);
		double num2 =Double.parseDouble(second);
		switch (op){
		case "add":
			return add(num1,num2);
		case "subtract":
			return subtract(num1,num2);
		case "multiply":
			return multiply(num1,num2);
		case "divide":
			return division(num1,num2);
		case "sqrt":
			return sqrt(num1);
		default:
			return null;	
		}
	}
	private String add(double first,double second) {
		return (first+second)+"";
		//return String.format("%.4f", (first+second));
	}
	private String subtract(double first,double second) {
		return (first-second)+"";
		//return String.format("%.4f", (first-second));
	}
	private String multiply(double first,double second) {
		return (first*second)+"";
		//return String.format("%.4f", (first*second));
	}
	private String division(double first,double second) {
		return second==0?"E":(first/second)+"";
	}
	private String sqrt(double number) {
		return Math.sqrt(number)+"";
		//return String.format("%.4f", Math.sqrt(number));
	}

}
