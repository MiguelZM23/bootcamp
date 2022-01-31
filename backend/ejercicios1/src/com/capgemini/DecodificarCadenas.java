package com.capgemini;

public class DecodificarCadenas {
	// Ejercicio 2- Decodificar cadenas

	public void inicializar(){
		System.out.println("Decodificar la siguiente cadena:");
		String cadena = "3+4+3,4-7*1=";
		int[] numeros = new int[12];
		float decimal = 0;System.out.println(cadena);
		char caracteres[] = new char[cadena.length()];
		
	

		for(int i = 0;i<cadena.length();i++){
			caracteres[i] = cadena.charAt(i);	
		}
		
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


	//float resultado = (numeros[0] + numeros[2] + decimal) - (numeros[8]) * numeros[10];

	// Mostramos el resultado redondeando a dos decimales.
	//System.out.println("El resultado es... "+Math.ceil(resultado*100)/100);
	}
}
