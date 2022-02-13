package com.capgemini;

public class Alfil extends Pieza{
	Pieza alfil;
	Color color;
	public Alfil(Color color) {
		this.color = color;
	}
	boolean esValido(Movimiento mov, Tablero tablero) {
		alfil = new Alfil(color);

		if (tablero.escaque.getPieza().equals(alfil)) {

			
			if (mov.saltoVertical() ==  mov.saltoHorizontal() 
					&& mov.saltoVertical() != 0 
					&& mov.saltoHorizontal() !=0) {
				return true;
			} else
				System.out.println("La pieza no se mueve o movimiento incorrecto");
		}

		return false;
	
		
	}
}
