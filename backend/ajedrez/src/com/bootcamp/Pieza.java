package com.bootcamp;

public abstract class Pieza {
	
	Color color;
	
	
	public Pieza(Color color) {
		this.color = color;
	}
	public Pieza() {
		
	}
	
	
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
		return false;
	}
	
	public void mover(Movimiento mov, Tablero tablero) {
		
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
