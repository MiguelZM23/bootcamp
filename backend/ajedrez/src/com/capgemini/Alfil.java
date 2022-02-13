package com.capgemini;

public class Alfil extends Pieza{
	Color color;
	public Alfil(Color color) {
		this.color = color;
	}
	boolean esValido(Movimiento mov, Tablero tablero) {
		return false;
	}
}
