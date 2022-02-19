package com.capgemini;

public class Rey extends Pieza {
	Color color;
	Rey rey;
	
	public Rey(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 * @throws JuegoException 
	 */
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
	
		rey = new Rey(color);
		Color colorPiezaEscaque = tablero.findEscaque(mov.getPosFin()).getPieza().getColor();		
		if(tablero.findEscaque(mov.getPosIni()).getPieza().getClass() == Rey.class) {
			
			if(rey.getColor() == colorPiezaEscaque)
			{System.out.println("No te puedes comer una pieza de tu color");
				return false;
			}
			
			if(mov.saltoVertical() == 1 || mov.saltoHorizontal() == 1) return true; 
			else System.out.println("La pieza no se mueve o movimiento incorrecto");	
		}
		System.out.println(tablero.findEscaque(mov.getPosIni()).getPieza());
		return false;
	}
}
