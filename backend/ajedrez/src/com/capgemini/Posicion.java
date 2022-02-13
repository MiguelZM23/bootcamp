package com.capgemini;

public class Posicion {
	private int fila;
	private int col;
	
	public Posicion(int col, int fila) throws JuegoException {
		
		this.fila = fila;
		this.col = col;
		if (this.col>8 || this.col<1 || this.fila>8 || this.fila<1) 
			throw new JuegoException("Valor fuera del rango permitido utilizar valores entre 1 y 8");
	}
	public Posicion(char col, char fila) throws JuegoException {
		
		this.col = (col-'A')+1;
		this.fila = Integer.parseInt(String.valueOf(fila));
		if (this.col>8 || this.col<1 || this.fila>8 || this.fila<1) 
			throw new JuegoException("Valor fuera del rango permitido utilizar valores entre 1 y 8");
		
	}
	/**
	 * Indica si dos posiciones son iguales
	 * @param pos
	 * @return
	 * @throws JuegoException
	 */
	public boolean equals(Posicion pos) throws JuegoException {
		if (pos == null) 
			throw new JuegoException("La posición no puede ser nula");
		boolean equals;
		if(this.fila == pos.fila && this.col == pos.col) equals = true;
		else equals = false;
		
		return equals;
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
