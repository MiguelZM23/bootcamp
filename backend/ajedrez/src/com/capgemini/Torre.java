package com.capgemini;

public class Torre extends Pieza {
	Torre torre;

	public Torre(Color color) {
		this.color = color;
	}

	/**
	 * Comprueba si el movimiento es válido.
	 * 
	 * @throws JuegoException
	 */
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
		Color colorPiezaEscaque = Color.NEGRO;
		Pieza pieza = tablero.findEscaque(mov.getPosFin()).getPieza();
		torre = new Torre(this.color);

		if (pieza != null)
			colorPiezaEscaque = pieza.getColor();

		if (tablero.findEscaque(mov.getPosIni()).getPieza().getClass() == Torre.class) {

			if (torre.getColor() == colorPiezaEscaque) {
				System.out.println("No te puedes comer una pieza de tu color");
				return false;
			}

			if (mov.saltoVertical() >= 1 && mov.saltoHorizontal() == 0
					|| mov.saltoHorizontal() >= 1 && mov.saltoVertical() == 0) {
				return true;
			} else
				System.out.println("La pieza no se mueve o movimiento incorrecto");

		}

		return false;
	}
}
