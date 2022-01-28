package com.example;

public class CalculadoraCientifica extends Calculadora implements Grafico {
	public CalculadoraCientifica() {
		this(0);
	}
	public CalculadoraCientifica(int i) {
		super(i);
	}
	
	public double divide(double a, double b) {
		return a/b;
	}
	
	@Override
	public int suma(int a, int b) {
		return a+b;
	}
	
	//atributo miembro de instancia
	private int contador =0;

	@Override
	public void pintate() {
		System.out.println("Soy una calculadora");
		
	}
	
	//si queremos acceder a este atributo contador desde
	//un método tenemos que utilizar el this:
	//this es un resolutor de instancia
//	public void contar (int contador) {
//		this.contador == contador;
//	}
//	//super es un resolutor de referencia podemos acceder al
//	//padre pero no al abuelo.
	
}
