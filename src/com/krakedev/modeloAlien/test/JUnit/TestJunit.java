package com.krakedev.modeloAlien.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.modeloAlien.Alien;

public class TestJunit {

	 @Test
	    public void testAsignacion() {
	        Alien alien = new Alien(10, "Verde");

	        assertEquals(10, alien.getTamanio());
	        assertEquals("Verde", alien.getColor());
	    }

	   
	    @Test
	    public void testTamanioMinimo() {
	        Alien alien = new Alien(2, "Rojo");

	        assertEquals(5, alien.getTamanio());
	    }

	  
	    @Test
	    public void testCalculoPrecios() {
	        Alien alien = new Alien(10, "Azul");

	        assertEquals(2.0, alien.getPrecioCuerpo(), 0.001);
	        assertEquals(1.0, alien.getPrecioExtremidad(), 0.001);
	        assertEquals(0.5, alien.getPrecioOjo(), 0.001);
	    }
	    @Test
	    public void testTamanioMaximo() {
	        Alien alien = new Alien(50, "Amarillo");

	        assertEquals(30, alien.getTamanio());
	    }
}
