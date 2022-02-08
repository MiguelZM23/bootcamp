package com.capgemini;

public class Posicion {
	private int fila;
	private int col;
	
	public Posicion(int col, int fila) {
		this.fila = fila;
		this.col = col;
	}
	public Posicion(char col, char fila) {
		this.col = (col-'A')+1;
		this.fila = Integer.parseInt(String.valueOf(fila));
		
	}
	
	public boolean equals(Posicion pos) {
		return true;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getCol() {
		return col;
			
	}
	public void setCol(int columna) {
		this.col = columna;
	}
	
}
