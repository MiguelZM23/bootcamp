package com.bootcamp;

public class Alfil extends Pieza{
	Pieza alfil;
	Color color;

	public Alfil(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 * @throws JuegoException 
	 */
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
		Color colorPiezaEscaque = Color.NEGRO;
		Pieza pieza = tablero.findEscaque(mov.getPosFin()).getPieza();
		alfil = new Alfil(color);

		if (pieza != null)
			colorPiezaEscaque = pieza.getColor();

		if (tablero.findEscaque(mov.getPosIni()).getPieza().getClass() == Alfil.class) {
			if (alfil.getColor() == colorPiezaEscaque) {
				System.out.println("No te puedes comer una pieza de tu color");
				return false;
			}
			
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
