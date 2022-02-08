package com.capgemini;

public class Movimiento {
	private Posicion posIni;
	private Posicion posFin;

	public Movimiento(String string) {
		this.posIni = new Posicion(string.charAt(0), string.charAt(1));
		this.posFin = new Posicion(string.charAt(2), string.charAt(3));
	}

	public boolean esVertical() {
		boolean movimientoVertical;
		if (posIni.getCol() != posFin.getCol() && posIni.getFila() == posFin.getFila()) {
			movimientoVertical = true;
		} else
			movimientoVertical = false;

		return movimientoVertical;
	}

	public boolean esHorizontal() {
		boolean movimientoHorizontal;
		if (posIni.getCol() == posFin.getCol() && posIni.getFila() != posFin.getFila()) {
			movimientoHorizontal = true;
		} else
			movimientoHorizontal = false;

		return movimientoHorizontal;
	}

	public boolean esDiagonal() {
		boolean movimientoDiagonal;
		if((posIni.getCol() == posFin.getCol()+1 || posIni.getCol() == posFin.getCol()-1) 
			&& (posIni.getFila()== posFin.getFila()+1 || posIni.getFila()== posFin.getFila()-1)) {
			movimientoDiagonal = true;
		}else movimientoDiagonal = false;
		
		return movimientoDiagonal;
		
	}

	public int saltoVertical() {
		return 0;
	}

	public int saltoHorizontal() {
		return 0;
	}

	// Delta indica el número que tengo que moverme para llegar a la
	// posición final
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
