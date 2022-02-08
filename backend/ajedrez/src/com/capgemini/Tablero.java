package com.capgemini;

import java.util.List;

public class Tablero implements Cloneable {
	
	private List<Pieza> piezas;
	private Pieza escaque;
	
	private boolean esValido(int i) {
		return true;
	}
	public boolean hayPieza(Posicion pos) {
		return true;
	}
	
	public boolean hayPieza(int col, int fila) {
		return true;
	}
	public void quitaPieza(int col, int fila) {
		
	}
	public void quitaPieza(Posicion pos) {
		
	}
	public void mover(Movimiento mov) {
		
	}
	
	public Object clone() {
		Object object = "";
		return object;
	}
	
	public Color colorEscaque(int col, int fila) {
		Color color = Color.BLANCO;
		return color;
	}
	
	public boolean hayPiezasEntre(Movimiento mov) {
		return true;
	}
	public Pieza getEscaque() {
		return escaque;
	}
	public void setEscaque(Pieza escaque) {
		this.escaque = escaque;
	}
	
}
