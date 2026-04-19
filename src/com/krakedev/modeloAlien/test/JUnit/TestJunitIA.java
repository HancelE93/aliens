package com.krakedev.modeloAlien.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.modeloAlien.Alien;

public class TestJunitIA {

	 // 🔹 Tamaño normal
    @Test
    public void testTamanioNormal() {
        Alien alien = new Alien(15, "Verde");

        assertEquals(15, alien.getTamanio());
    }

    // 🔹 Tamaño menor al mínimo
    @Test
    public void testTamanioMenor() {
        Alien alien = new Alien(1, "Rojo");

        assertEquals(5, alien.getTamanio());
    }

    // 🔹 Tamaño mayor al máximo
    @Test
    public void testTamanioMayor() {
        Alien alien = new Alien(100, "Azul");

        assertEquals(30, alien.getTamanio());
    }

    // 🔹 Precios con tamaño mínimo
    @Test
    public void testPreciosMinimos() {
        Alien alien = new Alien(5, "Negro");

        assertEquals(1.0, alien.getPrecioCuerpo(), 0.001);
        assertEquals(0.5, alien.getPrecioExtremidad(), 0.001);
        assertEquals(0.25, alien.getPrecioOjo(), 0.001);
    }

    // 🔹 Precios con tamaño máximo
    @Test
    public void testPreciosMaximos() {
        Alien alien = new Alien(30, "Blanco");

        assertEquals(6.0, alien.getPrecioCuerpo(), 0.001);
        assertEquals(3.0, alien.getPrecioExtremidad(), 0.001);
        assertEquals(1.5, alien.getPrecioOjo(), 0.001);
    }

    // 🔹 Valores por defecto
    @Test
    public void testValoresIniciales() {
        Alien alien = new Alien(10, "Verde");

        assertEquals(0, alien.getNumeroOjos());
        assertEquals(0, alien.getNumeroBrazos());
        assertEquals(0, alien.getNumeroPies());
    }
}

