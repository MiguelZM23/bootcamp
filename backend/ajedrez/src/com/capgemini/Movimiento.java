package com.capgemini;

public class Movimiento {
	private Posicion posIni;
	private Posicion posFin;
	
	public Movimiento(String string) {
		
	}
	
	public boolean esVertical() {
		return true;
	}
	public boolean esHorizontal() {
		return true;
	}
	public boolean esDiagonal() {
		return true;
	}
	public int saltoVertical() {
		return 0;
	}
	public int saltoHorizontal() {
		return 0;
	}
	//Delta indica el número que tengo que moverme para llegar a la 
	//posición final
	public int deltaFila() {
		return 0;
	}
	public int deltaColumna() {
		return 0;
	}

	public Posicion getPosIni() {
		return posIni;
	}

	public void setPosIni(Posicion posIni) {
		this.posIni = posIni;
	}

	public Posicion getPosFin() {
		return posFin;
	}

	public void setPosFin(Posicion posFin) {
		this.posFin = posFin;
	}
	
}
