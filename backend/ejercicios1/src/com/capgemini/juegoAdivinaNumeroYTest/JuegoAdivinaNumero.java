package com.bootcamp.juegoAdivinaNumeroYTest;

import java.util.Random;

/**
 * Juego de adivinar numeros
 * @author Javier
 * @version 1.0
 */
public class JuegoAdivinaNumero implements Juego<String> {
	int numeroBuscado;
    private int intentos;
    private boolean encontrado;
    private String resultado;

    public JuegoAdivinaNumero() {
		inicializar();
	}
    
    /**
     * Inicializa el juego
     */
	@Override
	public void inicializar() {
     numeroBuscado = (new Random()).nextInt(100) + 1;
     intentos = 0;
     encontrado = false;
     resultado = "Pendiente de empezar";
	}
	
	@Override
	public void jugada(String numeroIntroducidoString) throws JuegoException {
		
		try {
			jugada(Integer.parseInt(numeroIntroducidoString));
		} catch (NumberFormatException e) {
			throw new JuegoException("No es un número.", e);
		}
	}

	public void jugada(int numeroIntroducidoInt) throws JuegoException {
		if(getFinalizado()) {
			throw new JuegoException("El juego ha finalizado");
		}
        intentos += 1;
        if (numeroBuscado == numeroIntroducidoInt) {
            encontrado = true;
            resultado = "Bieeen!!! Acertaste.";
        } else if (intentos >= 10) {
        	resultado = "Upsss! Se acabaron los intentos, el número era el " + numeroBuscado;
        } else if (numeroBuscado > numeroIntroducidoInt) {
        	resultado = "Mi número es mayor.";
        } else {
        	resultado = "Mi número es menor.";
        }
	}

	/**
	 * Cadena con el mensaje de la ultima jugada
	 */
	@Override
	public String getResultado() {
		return resultado;
	}
	

	@Override
	public boolean getFinalizado() {
		return intentos >= 10 || encontrado;
	}

	@Override
	public int getJugada() {
		return intentos;
	}

}