package com.capgemini;

public class Caballo extends Pieza{
	Caballo caballo;
	Color color;
	public Caballo(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 */
	boolean esValido(Movimiento mov, Tablero tablero) {
		caballo = new Caballo(color);

		if (tablero.escaque.getPieza().equals(caballo)) {

			if (mov.saltoVertical() == 2 && mov.saltoHorizontal() == 1
					|| mov.saltoHorizontal() == 2 && mov.saltoVertical() == 1) {
				return true;
			} else
				System.out.println("La pieza no se mueve o movimiento incorrecto");

		}

		return false;
	
	}
}
