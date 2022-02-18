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
		
		if(tablero.escaque.getPieza().equals(rey)) {
			
			if(mov.saltoVertical() == 1 || mov.saltoHorizontal() == 1) return true; 
			else System.out.println("La pieza no se mueve o movimiento incorrecto");
		
			
			if(rey.getColor() == tablero.findEscaque(mov.getPosFin()).getPieza().getColor())
				{System.out.println("No te puedes comer una pieza de tu color");
					return false;
				}
		}
		
		return false;
	}
}
