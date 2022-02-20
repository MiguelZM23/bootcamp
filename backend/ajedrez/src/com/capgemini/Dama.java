package com.capgemini;

public class Dama extends Pieza{
	Dama dama;
	Color color;
	
	public Dama(Color color) {
		this.color = color;
		
	}
	/**
	 * Comprueba si el movimiento es válido.
	 * @throws JuegoException 
	 */
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
		Color colorPiezaEscaque = Color.NEGRO;
		Pieza pieza = tablero.findEscaque(mov.getPosFin()).getPieza();
		dama = new Dama(this.color);

		if (pieza != null)
			colorPiezaEscaque = pieza.getColor();

		if (tablero.findEscaque(mov.getPosIni()).getPieza().getClass() == Dama.class) {
			
			if (dama.getColor() == colorPiezaEscaque) {
				System.out.println("No te puedes comer una pieza de tu color");
				return false;
			}
						
			if (mov.saltoVertical() >= 1 && mov.saltoHorizontal() ==0|| 
					mov.saltoHorizontal() >= 1 && mov.saltoVertical() == 0
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

