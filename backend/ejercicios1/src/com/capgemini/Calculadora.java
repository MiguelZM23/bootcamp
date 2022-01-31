package com.capgemini;

public class Calculadora {
	int operando = 0;
	char operador;
	float resultado = 0;
	float operando1 = -1;
	float operando2 =-1;
	float acumulado = 0;
	
	public float calcula(float operando, char operador) {
		
		char operadorGuardado = operador;

		if(operando1<0){
			operando1 = operando;
		}else if (operando2<0) {
			operando2 = operando;
			if(operador == '+')
			resultado = acumulado + operando1 + operando2; 
		}
		
		acumulado += resultado;
		return resultado;
		
	}
	
	
	
	
	
	
	
}
