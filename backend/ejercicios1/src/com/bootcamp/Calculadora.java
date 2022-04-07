package com.capgemini;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

package com.bootcamp;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

/**
 * Clase simple para realizar c�lculos acumulados.
 *
 * @author Javier
 */
public class Calculadora {
    /**
     * Lista de las operaciones soportadas
     */
    public static final String OPERACIONES_SOPORTADAS = "+-*/=%";
    
    private BigDecimal acumulado;
    private char operadorPendiente;

    /**
     * Constructor por defecto
     */
    public Calculadora() {
        inicializa();
    }

    /**
     * Restaura el valor inicial para calcular la siguiente secuencia
     */
    public void inicializa() {
        acumulado = new BigDecimal(0);
        operadorPendiente = '+';
    }

    /**
     * Obtiene el total acumulado hasta el momento.
     * @return Valor acumulado
     */
    public double getAcumulado() {
        return acumulado.setScale(16, RoundingMode.HALF_EVEN).doubleValue();
    }

    /**
     * Comprueba que sea una de las operaciones soportadas por la calculadora.
     * @param operacion S�mbolo de la operaci�n
     * @return true si la soporta, false en el resto de los casos.
     */
    public boolean isOperacion(char operacion) {
        return OPERACIONES_SOPORTADAS.indexOf(operacion) != -1;
    }
    /**
     * Realiza la operaci�n pendiente una vez obtenido el segundo operador y 
     * guarda la nueva operaci�n pendiente
     * @param operando2 segundo operador
     * @param nuevoOperador la nueva operaci�n pendiente
     * @return el total acumulado hasta el momento
     * @throws Exception Cuando el s�mbolo de operaci�n no esta soportado
     */
    public double calcula(double operando2, char nuevoOperador) throws CalculadoraException{
        if (!isOperacion(nuevoOperador)) {
            throw new CalculadoraException("Operaci�n no soportada.");
        }
        var operando = new BigDecimal(operando2);
        switch (operadorPendiente) {
            case '+':
            	acumulado = acumulado.add(new BigDecimal(operando2));
                break;
            case '-':
            	acumulado = acumulado.subtract(new BigDecimal(operando2));
                break;
            case '*':
            	acumulado = acumulado.multiply(new BigDecimal(operando2));
                break;
            case '/':
            	acumulado = acumulado.divide(new BigDecimal(operando2), MathContext.DECIMAL64);
                break;
            case '%':
            	acumulado = acumulado.remainder(new BigDecimal(operando2));
                break;
            case '=':
                break;
            default:
                throw new CalculadoraException("Operaci�n no soportada.");
        }
        this.operadorPendiente = nuevoOperador;
        return getAcumulado();
    }

    /**
     * Sobrecarga
     * @see Calculadora#calcula(double, char) 
     * @param operando2 segundo operador
     * @param nuevaOperacion la nueva operaci�n pendiente
     * @return el total acumulado hasta el momento
     * @throws Exception Cuando el s�mbolo de operaci�n no esta soportado
     */
    public double calcula(String operando2, char nuevoOperador) throws CalculadoraException {
        if (operando2.endsWith(",") || operando2.endsWith(".")) {
            operando2 += "0";
        }
        try {
            return calcula(
                    Double.parseDouble(operando2.replace(',', '.')),
                    nuevoOperador);
        } catch (NumberFormatException ex) {
            throw new CalculadoraException(
                    "El operando no tienen un formato númerico valido.", 
                    ex);
        }
    }
    
    public static double calcula(String expresion) throws CalculadoraException, Exception {
		if (expresion == null || "".equals(expresion) || !Character.isDigit(expresion.charAt(0)))
			throw new java.lang.IllegalArgumentException("No es una expresión valida");
		String operando = "";
		Calculadora calculadora = new Calculadora();
		for (int i = 0; i < expresion.length(); i++) {
			char ch = expresion.charAt(i);
			if (Character.isDigit(ch)) {
				operando += ch;
			} else if (ch == ',') {
				if (operando.indexOf(ch) == -1) {
					operando += ch;
				} else {
					// throw new Exception("Ya existe separador decimal.");
				}
			} else if ("+-*/%=".indexOf(ch) >= 0) {
				if (operando.endsWith(",")) {
					operando += "0";
				}
				calculadora.calcula(operando, ch);
				System.out.println(operando + "\t" + ch + "\t" + calculadora.getAcumulado());
				if (ch == '=') {
					break;
				}
				operando = "";
			} else if (ch != ' ') {
//				throw new Exception("Carácter no valido.");
			}
		}
		System.out.println(calculadora.getAcumulado());
		return calculadora.getAcumulado();
	}
	public static class Operacion {
		private double operando;
		private char operador;
		
		public Operacion(double operando, char operador) {
			super();
			this.operando = operando;
			this.operador = operador;
		}
		public Operacion(String operando, char operador) {
			this(Double.parseDouble(operando.replace(',', '.')), operador);
		}
		public double getOperando() {
			return operando;
		}
		public char getOperador() {
			return operador;
		}
	}
	
	public double calcula(List<Operacion> operaciones) throws CalculadoraException {
		inicializa();
		for (Operacion operacion : operaciones) {
			calcula(operacion.getOperando(), operacion.getOperador());			
		}
		return getAcumulado();
	}
	

    
    public void leerFichero() throws IOException {
    	
    	File datosLeidos = new File ("C:\\Entrada.txt");
    	FileReader fr = new FileReader (datosLeidos);
    	
    	BufferedReader br = new BufferedReader(fr);
    	
    	String linea = br.readLine();
    	
    	System.out.println(linea);
    	
    	calcula(linea);
    	
    	
    	
    }
    
public void escribirFichero() throws IOException {
    	
	FileWriter fichero = null;
    PrintWriter pw = null;
    try
    {
        fichero = new FileWriter("c:/Entrada.txt");
        pw = new PrintWriter(fichero);

        pw.println("Linea " + "3.5");

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
       try {
       // Nuevamente aprovechamos el finally para 
       // asegurarnos que se cierra el fichero.
       if (null != fichero)
          fichero.close();
       } catch (Exception e2) {
          e2.printStackTrace();
       }
    }
    }

}
