package com.capgemini;

public class Dama extends Pieza{
	Dama dama;
	Color color;
	
	public Dama(Color color) {
		this.color = color;
		
	}
	/**
	 * Comprueba si el movimiento es válido.
	 */
	boolean esValido(Movimiento mov, Tablero tablero) {
		dama = new Dama(color);

		if (tablero.escaque.getPieza().equals(dama)) {

			if (mov.saltoVertical() >= 1 || mov.saltoHorizontal() >= 1 
					|| (mov.saltoVertical() ==  mov.saltoHorizontal() 
					&& mov.saltoVertical() != 0 
					&& mov.saltoHorizontal() !=0)) {
				return true;
			} else
				System.out.println("La pieza no se mueve o movimiento incorrecto");

		}

		return false;
	}
}

