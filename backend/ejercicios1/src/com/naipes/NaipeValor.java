package com.naipes;

public enum NaipeValor {
	AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8),NUEVE(9), DIEZ(10), SOTA(11), CABALLO(12), REY(13);

	private int value;
	private NaipeValor(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static NaipeValor getEnum(int value) {
		switch (value) {
		case 1: return NaipeValor.AS;
		case 2: return NaipeValor.DOS;
		case 3: return NaipeValor.TRES;
		case 4: return NaipeValor.CUATRO;
		case 5: return NaipeValor.CINCO;
		case 6: return NaipeValor.SEIS;
		case 7: return NaipeValor.SIETE;
		case 8: return NaipeValor.OCHO;
		case 9: return NaipeValor.NUEVE;
		case 10: return NaipeValor.DIEZ;
		case 11: return NaipeValor.SOTA;
		case 12: return NaipeValor.CABALLO;
		case 13: return NaipeValor.REY;
		default:
			throw new IllegalArgumentException("Unexpected value: " + value);
		}
	}
	
}
