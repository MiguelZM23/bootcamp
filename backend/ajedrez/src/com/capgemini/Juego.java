package com.capgemini;

public class Juego {

	Tablero tablero;
	Color turno;
	boolean partidaActiva = false;

	public void inicializar() {
		
		Tablero tablero = new Tablero();
		tablero.rellenarTablero();		
	}

	public void jugada(String jugada) {
		
		

	}

	public void mover(Movimiento mov) throws JuegoException {
		
		Pieza pieza;
		pieza = tablero.findEscaque(mov.getPosIni()).getPieza();
		tablero.findEscaque(mov.getPosFin()).quitaPieza();
		tablero.findEscaque(mov.getPosFin()).setPieza(pieza);

	}

	public void cambiaTurno() {
		
		if (turno == Color.BLANCO) turno = Color.NEGRO;
		else turno = Color.BLANCO;

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
