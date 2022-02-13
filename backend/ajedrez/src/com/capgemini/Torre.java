package com.capgemini;

public class Torre extends Pieza {
	Torre torre;

	public Torre(Color color) {
		this.color = color;
	}

	boolean esValido(Movimiento mov, Tablero tablero) {
		torre = new Torre(color);

		if (tablero.escaque.getPieza().equals(torre)) {

			if (mov.saltoVertical() >= 1 || mov.saltoHorizontal() >= 1) {
				return true;
			} else
				System.out.println("La pieza no se mueve o movimiento incorrecto");

		}

		return false;
	}
}
