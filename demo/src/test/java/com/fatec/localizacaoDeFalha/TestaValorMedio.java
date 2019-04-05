package com.fatec.localizacaoDeFalha;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestaValorMedio {
    @Ignore
	@Test
	public void ct01() {
		Mediana vm = new Mediana();
		assertEquals (3, vm.determinaMediana(3, 3, 5));
		
	}
    @Ignore
	@Test
	public void ct02() {
		Mediana vm = new Mediana();
		assertEquals (2, vm.determinaMediana(1, 2, 3));
	}
    @Ignore
	@Test
	public void ct03() {
		Mediana vm = new Mediana();
		assertEquals (2, vm.determinaMediana(3, 2, 1));
	}
    @Ignore
	@Test
	public void ct04() {
		Mediana vm = new Mediana();
		assertEquals (5, vm.determinaMediana(5, 5, 5));
	}
    @Ignore
	@Test
	public void ct05() {
		Mediana vm = new Mediana();
		assertEquals (4, vm.determinaMediana(5, 3, 4));
	}
	@Test
	public void ct06() {
		Mediana vm = new Mediana();
		assertEquals (2, vm.determinaMediana(2, 1, 3));
	}
}
