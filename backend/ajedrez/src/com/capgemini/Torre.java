package com.capgemini;

public class Torre extends Pieza{
	
	public Torre(Color color) {
		this.color = color;
	}
	boolean esValido(Movimiento mov, Tablero tablero) {
		return false;
	}
}
