package com.bootcamp;

public class Caballo extends Pieza{
	Caballo caballo;
	Color color;
	public Caballo(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 * @throws JuegoException 
	 */
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
		Color colorPiezaEscaque = Color.NEGRO;
		Pieza pieza = tablero.findEscaque(mov.getPosFin()).getPieza();
		caballo = new Caballo(this.color);

		
		if (pieza != null)
			colorPiezaEscaque = pieza.getColor();

		if (tablero.findEscaque(mov.getPosIni()).getPieza().getClass() == Caballo.class) {

			if (caballo.getColor() == colorPiezaEscaque) {
				System.out.println("No te puedes comer una pieza de tu color");
				return false;
			}
			
			if (mov.saltoVertical() == 2 && mov.saltoHorizontal() == 1
					|| mov.saltoHorizontal() == 2 && mov.saltoVertical() == 1) {
				return true;
			} else
				System.out.println("La pieza no se mueve o movimiento incorrecto");

		}

		return false;
	
	}
}
