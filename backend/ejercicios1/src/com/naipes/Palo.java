package com.naipes;

public enum Palo{
	COPAS(0), BASTOS(1), ESPADAS(2), OROS(3), PICAS(4), DIAMANTES(5), TREBOLES(6), CORAZONES(7);
	private int value;
	Palo(int value){this.value = value;}
	//Añadir un método
    public int getPalo(){return value;}
    public static Palo getEnum(int value) {
		switch (value) {
		case 0: return Palo.COPAS;
		case 1: return Palo.BASTOS;
		case 2: return Palo.ESPADAS;
		case 3: return Palo.OROS;
		case 4: return Palo.PICAS;
		case 5: return Palo.DIAMANTES;
		case 6: return Palo.TREBOLES;
		case 7: return Palo.CORAZONES;
		default:
			throw new IllegalArgumentException("Unexpected value: " + value);
		}
	}
}
