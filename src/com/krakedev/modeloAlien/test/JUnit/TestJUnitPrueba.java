package com.krakedev.modeloAlien.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.modeloAlien.Alien;

public class TestJUnitPrueba {
	 @Test
	    public void testAgregarBrazosValido() {
	        Alien alien = new Alien(10, "Verde");

	        boolean resultado = alien.agregarBrazos(4);

	        assertTrue(resultado);
	        assertEquals(4, alien.getNumeroBrazos());
	    }

	    // 🔹 CASO LÍMITE (exactamente 10)
	    @Test
	    public void testAgregarBrazosLimite() {
	        Alien alien = new Alien(10, "Rojo");

	        boolean resultado = alien.agregarBrazos(10);

	        assertTrue(resultado);
	        assertEquals(10, alien.getNumeroBrazos());
	    }

	    // 🔹 CASO FALLIDO (excede el límite)
	    @Test
	    public void testAgregarBrazosExcede() {
	        Alien alien = new Alien(10, "Azul");

	        alien.agregarBrazos(8);

	        boolean resultado = alien.agregarBrazos(5);

	        assertFalse(resultado);
	        assertEquals(8, alien.getNumeroBrazos()); // no cambia
	    }

	    // 🔹 CASO COMBINADO (brazos + pies)
	    @Test
	    public void testAgregarBrazosYPies() {
	        Alien alien = new Alien(10, "Negro");

	        boolean r1 = alien.agregarBrazos(5);
	        boolean r2 = alien.agregarPiernas (5);

	        assertTrue(r1);
	        assertTrue(r2);

	        assertEquals(5, alien.getNumeroBrazos());
	        assertEquals(5, alien.getNumeroPies());
	    }

	    // 🔹 CASO COMBINADO FALLIDO
	    @Test
	    public void testAgregarBrazosYPiesExcede() {
	        Alien alien = new Alien(10, "Blanco");

	        alien.agregarBrazos(7);

	        boolean resultado = alien.agregarPiernas (5);

	        assertFalse(resultado);

	        assertEquals(7, alien.getNumeroBrazos());
	        assertEquals(0, alien.getNumeroPies()); // no cambia
	    }
	}
	
