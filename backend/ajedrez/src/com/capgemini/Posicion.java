package com.capgemini;

public class Posicion {
	private int fila;
	private int columna;
	
	public Posicion(int col, int fila) {
		
	}
	public Posicion(char col, char fila) {
		
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
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
}
