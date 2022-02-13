package com.capgemini;

public class Caballo extends Pieza{
	Color color;
	public Caballo(Color color) {
		this.color = color;
	}
	boolean esValido(Movimiento mov, Tablero tablero) {
		return false;
	}
}
