package com.fatec.localizacaoDeFalha;

public class Principal {
	public static void main (String args[]) {
		Mediana m = new Mediana();
		System.out.println(m.determinaMediana(2, 1, 3));
		System.out.println(m.determinaMediana(3, 2, 1));
	}

}
