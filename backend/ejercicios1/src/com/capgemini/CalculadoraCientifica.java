package com.capgemini;

public class CalculadoraCientifica {

	
	public double dividir(double a, double b) throws Exception {
		if (b==0) throw new ArithmeticException("/ by zero");
		return a/b; 
	}
	
	
	
}
