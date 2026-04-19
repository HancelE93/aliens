package com.krakedev.modeloAlien.test;

import com.krakedev.modeloAlien.Alien;

public class TestConstrucores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien aliens = new Alien (4,"Verde");
		aliens.imprimir();

		System.out.println("--------------------");
		
		Alien aliens2 = new Alien (30,"Rojo");
		aliens2.imprimir();
	}

}
