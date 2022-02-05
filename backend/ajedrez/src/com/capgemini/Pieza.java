package com.capgemini;

public abstract class Pieza {
	
	Color color;
	
	boolean esValido(Movimiento movimiento, Tablero tablero) {
		return false;
	}
	
	public void mover(Movimiento movimiento, Tablero tablero) {
		
	}
}
