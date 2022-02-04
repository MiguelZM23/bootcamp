package com.capgemini;

public class DecodificarCadenas {
	// Ejercicio 2- Decodificar cadenas

	public void inicializar(){
		System.out.println("Decodificar la siguiente cadena:");
		String cadena = "3+4+3,4-7*1=";
		int[] numeros = new int[12];
		float decimal = 0;System.out.println(cadena);
		char operandos[] = new char[7];
		char operadores[] = new char[5];
		float operandosFloat[] = new float[7];
		int j = 0;
		int h = 0;
		int guardar;
	

		for(int i = 0;i<cadena.length();i++){
			if (Character.isDigit(cadena.charAt(i)) || cadena.charAt(i)==',') {	
				operandos[j] = cadena.charAt(i);
				j=j+1;
			}else {
				operadores[h] = cadena.charAt(i);
				h=h+1;
			}
				
		}
		
		//Cambio las , por .
		for(int i = 0; i<operandos.length; i++) {
			if(operandos[i] == ',') operandos[i]='.';
		}
		
		//Transformo a float
		for(int i = 0; i<operandos.length; i++) {
			if(operandos[i] == '.') {
				operandosFloat[i-1] = Float.valueOf(String.valueOf(operandos[i-1]+operandos[i]+operandos[i+1]));
				i=i+1;
			}else operandosFloat[i] = (float)operandos[i]-'0';	
		}
		
		
		
		for (int i=0; i<operandos.length; i++) {
			System.out.println(operandosFloat[i]);
		}
		
		Calculadora calculadora = new Calculadora();		
		/*
		float resultado = calculadora.calcula(operandosFloat[0], operadores[0]);
		float resultado2 = calculadora.calcula(operandosFloat[1], operadores[1]);
		float resultado3 = calculadora.calcula(operandosFloat[2], operadores[2]);
		
		
		System.out.println(resultado);
		System.out.println(resultado2);
		System.out.println(resultado3);
		*/
		//Calculadora()
		
		//Creo un bucle que va a pasar los datos a la clase calculadora
		
		
		
		/*
		
		System.out.println(caracteres[0]+" "+caracteres[1]);System.out.println(caracteres[2]+" "+caracteres[3]); 
		// Para evitar que
		// se sumen convierto uno de los char en string para mostrarlo por pantalla
		System.out.println(caracteres[4]+Character.toString(caracteres[5]).substring(0)+caracteres[6]+" "+caracteres[7]);System.out.println(caracteres[8]+" "+caracteres[9]);System.out.println(caracteres[10]+" "+caracteres[11]);

		for(int j = 0;j<caracteres.length;j+=2){
			if (j == 4) { // Transformo 3,4 a String
				String numero = String.valueOf(caracteres[4]) + String.valueOf(caracteres[5])
					+ String.valueOf(caracteres[6]);
				System.out.println(numero);
			// Cambio la coma por un punto y convierto a float 
			decimal = Float.valueOf(numero.replace(",", "."));
			j += 2;
		} // Asigno valor de chars a un array de ints y pongo el '0' para que me coja el
			// valor y no el código numérico de referencia.
		numeros[j] = caracteres[j] - '0';
	}
*/
		
	//float resultado = (numeros[0] + numeros[2] + decimal) - (numeros[8]) * numeros[10];

	// Mostramos el resultado redondeando a dos decimales.
	//System.out.println("El resultado es... "+Math.ceil(resultado*100)/100);
	}
}
