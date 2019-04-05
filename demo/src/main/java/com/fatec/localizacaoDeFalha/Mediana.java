package com.fatec.localizacaoDeFalha;

public class Mediana {
	public int determinaMediana(int a, int b, int c) {
		int x = a;
		int y = b;
		int z = c;
		int m = z;// meio
		if (y < z) {
			if (x < y) {
				m = y;
			} else {
				if (x < z) {
					m = y; 
				}
			}
		} else {
			if (x > y) {
				m = y;
			} else {
				if (x > z) {
					m = x;
				}
			}
		}
		return m;
	}
}
