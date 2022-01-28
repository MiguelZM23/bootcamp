package com.example;

import com.example.exceptions.DemoException;

public class Principal {

	public static void main(String[] args) throws DemoException {
		Object o = null;
		
		Factura f = new Factura(1);
		f.addLinea("Comida", 1, 9.0);
		
		if(f.getEstado() == Factura.Estado.PENDIENTE) {
			f.cancelar();
		}
	
	
	Grafico grafico = f;
	
	grafico.pintate();
	if(f instanceof Factura)
		((Factura)grafico).addLinea("Comida", 1, 9.0);
	
	
	
	if(o instanceof Grafico)
		((Grafico)o).pintate();
	}
	
	public static void ejemplos2(String[] args) {
		Dias dia = Dias.DOMINGO;
		String s = "Hola";
		s += " Mundo";
		System.out.println(dia);
		
		//Calculadora c = new Calculadora();
//		System.out.println(c.avg());
//		System.out.println(c.avg(5));
//		System.out.println(c.avg(1,2,3,4,5));
//		int i = c.suma(0, 0);
		CalculadoraCientifica cc = new CalculadoraCientifica();
		System.out.println(cc.suma(2,2));
	}

}
