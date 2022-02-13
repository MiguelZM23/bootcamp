package com.capgemini;

public class Rey extends Pieza {
	Color color;
	Rey rey;
	
	public Rey(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 */
	boolean esValido(Movimiento mov, Tablero tablero) {
		
		rey = new Rey(color);
		
		if(tablero.escaque.getPieza().equals(rey)) {
			
			if(mov.saltoVertical() == 1 || mov.saltoHorizontal() == 1) return true; 
			else System.out.println("La pieza no se mueve o movimiento incorrecto");
		
		}
		
		return false;
	}
}
