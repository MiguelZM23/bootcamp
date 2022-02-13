package com.capgemini;

public class Movimiento {
	private Posicion posIni;
	private Posicion posFin;

	/**
	 * Constructor movimiento
	 * @param string
	 * @throws JuegoException
	 */
	public Movimiento(String string) throws JuegoException {
		if (string == null) throw new JuegoException("No puedes pasar un nulo");
		this.posIni = new Posicion(string.charAt(0), string.charAt(1));
		this.posFin = new Posicion(string.charAt(2), string.charAt(3));
		if(posIni.getFila() >8 || posIni.getCol()<1 || posFin.getFila()>8 || posFin.getCol()<1)
			throw new JuegoException("Valor fuera de rango permitido");
		
	}
	/**
	 * Comprueba si el movimiento es vertical
	 * @return
	 * @throws JuegoException
	 */
	public boolean esVertical() throws JuegoException {
		boolean movimientoVertical;
		if(posIni == posFin) throw new JuegoException("No hay movimiento");
		if (posIni.getCol() == posFin.getCol()) {
			movimientoVertical = true;
		} else
			movimientoVertical = false;

		return movimientoVertical;
	}
	/**
	 * Comprueba si el movimiento es Horizontal
	 * @return
	 * @throws JuegoException
	 */
	public boolean esHorizontal() throws JuegoException {
		boolean movimientoHorizontal;
		if(posIni == posFin) throw new JuegoException("No hay movimiento");
		if (posIni.getFila() == posFin.getFila()) {
			movimientoHorizontal = true;
		} else
			movimientoHorizontal = false;

		return movimientoHorizontal;
	}
	/**
	 * Comprueba si el movimiento es diagonal
	 * @return
	 * @throws JuegoException
	 */
	public boolean esDiagonal() throws JuegoException {
		boolean movimientoDiagonal;
		if(posIni == posFin) throw new JuegoException("No hay movimiento");
		if(saltoHorizontal() == saltoVertical() ) {
			movimientoDiagonal = true;
		}else movimientoDiagonal = false;
		
		return movimientoDiagonal;
		
	}
	/**
	 * Devuelve el numero de casillas del movimiento en vertical
	 * @return
	 */
	public int saltoVertical() {

		return Math.abs(posFin.getFila()-posIni.getFila());
		
	}

	/**
	 * Devuelve el numero de casillas del movimiento en horizontal
	 * @return
	 */
	public int saltoHorizontal() {
		
		return Math.abs(posFin.getCol()-posIni.getCol());
		
		 
	}
	/**
	 * Delta indica el sentido del movimiento positivo hacia arriba
	 * negativo hacia abajo.
	 * @return
	 */
	 
	public int deltaFila() {
		int orientacionFila = 0;
		if(posFin.getFila() > posIni.getFila()) orientacionFila = 1;
		else if (posFin.getFila() == posIni.getFila()) orientacionFila = 0;
		else if (posFin.getFila() < posIni.getFila()) orientacionFila = -1;
		
		
		return orientacionFila;
	}

	public int deltaColumna() {
		int orientacionColumna = 0;
		if(posFin.getCol() > posIni.getCol()) orientacionColumna = 1;
		else if (posFin.getCol() == posIni.getCol()) orientacionColumna = 0;
		else if (posFin.getCol() < posIni.getCol()) orientacionColumna = -1;
		
		
		return orientacionColumna;
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
