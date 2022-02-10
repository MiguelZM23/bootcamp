package com.capgemini;

public class Juego {
	
	Tablero tablero;
	Color turno;
	boolean partidaActiva = false;
	
	public void inicializar() {
		Tablero tablero = new Tablero();
		
	
		
	}
	
	public void jugada(String jugada) {
		
	}
	
	public void mover(Movimiento movimiento) {
		
	}
	
	public void cambiaTurno() {
		
	}
	
	public void promocionaPeon(Object o, PromocionEventArgs e) {
		
	}

	public Tablero getTablero() {
		return tablero;
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Color getTurno() {
		return turno;
	}

	public void setTurno(Color turno) {
		this.turno = turno;
	}
	

}
