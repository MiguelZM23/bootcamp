package com.bootcamp;


public enum Color {
		BLANCO(1), NEGRO(2);
	
	public int value;
	Color(int value){this.value = value;}
	//Añadir un método
    public static Color getEnum(int value) {
		switch (value) {
		case 0: return Color.BLANCO;
		case 1: return Color.NEGRO;
		default:
			throw new IllegalArgumentException("Unexpected value: " + value);
		}
	}
		}
