package com.example;

public class Calculadora {
	
	public Calculadora(int i) {
		
	};
	
	public int suma(int a, int b) {
		return a+b;
	}
	//Con static el método estará disponible sin instanciar
	//la clase.
	public static double suma(double a, double b) {
		return a+b;
	}
	

//	public double avg(double... resto) {
//		if(resto.length == 0) return primero;
//		double acumula = 0.0;
//		for(int i=0; i < resto.length; acumula += resto[i++]);
//		//for(double valor: resto) acumula += valor;
//		return acumula / resto.length;
//	}
	
	public double avg(double primero, double... resto) {
		if(resto.length == 0) return primero;
		double acumula = 0.0;
		for(int i=0; i < resto.length; acumula += resto[i++]);
		//for(double valor: resto) acumula += valor;
		return acumula / resto.length;
	}
}
