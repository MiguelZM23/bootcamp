package com.capgemini;

public class Dama extends Pieza{
	Color color;
	
	public Dama(Color color) {
		this.color = color;
		
	}
	boolean esValido(Movimiento mov, Tablero tablero) {
		return false;
	}
}
