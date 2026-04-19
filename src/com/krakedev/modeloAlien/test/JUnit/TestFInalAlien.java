package com.krakedev.modeloAlien.test.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.modeloAlien.Alien;

public class TestFInalAlien {
	
	@Test
	public void CalcuLoPrecioTotalCorrecto () {
		Alien alien = new Alien(10, "Verde");

	    alien.agregarBrazos(2);
	    alien.agregarOjos(2);

	    // cuerpo = 2.0
	    // brazos = 2 * 1.0 = 2
	    // ojos = 2 * 0.5 = 1
	    // total = 5
	    assertEquals(5.0, alien.getPrecioTotal(), 0.001);
	}
	
	@Test
	public void testAgregarElementos() {
	    Alien alien = new Alien(10, "Rojo");

	    // agregar todo
	    assertTrue(alien.agregarBrazos(2));
	    assertTrue(alien.agregarPiernas(2));
	    assertTrue(alien.agregarOjos(2));

	    // validar que se agregaron
	    assertEquals(2, alien.getNumeroBrazos());
	    assertEquals(2, alien.getNumeroPies());
	    assertEquals(2, alien.getNumeroOjos());

	    // validar que el precio cambió
	    assertTrue(alien.getPrecioTotal() > 0);
	}
	

	
	@Test
	public void testLimiteExtremidades() {
	    Alien alien = new Alien(10, "Azul");

	    alien.agregarBrazos(8);

	    boolean resultado = alien.agregarBrazos(5);

	    assertEquals(false, resultado); // 👈 reemplazo
	    assertEquals(8, alien.getNumeroBrazos());
	}
	
	@Test
	public void testLimiteOjos() {
	    Alien alien = new Alien(10, "Negro"); // max 3

	    boolean resultado = alien.agregarOjos(4);

	    assertEquals(false, resultado); // 👈 aquí también
	    assertEquals(0, alien.getNumeroOjos());
	}
	
	@Test
	public void testTamanioNormalExacto() {
	    Alien a = new Alien(10, "Verde");
	    assertEquals(10, a.getTamanio());
	}
	
	@Test
	public void testAgregarPiernasValidoDirecto() {
	    Alien a = new Alien(10, "Verde");

	    boolean resultado = a.agregarPiernas(3);

	    assertTrue(resultado);
	    assertEquals(3, a.getNumeroPies());
	}
	
	@Test
	public void testRestriccionPiernas() {
	    Alien a = new Alien(10, "Verde");

	    a.agregarBrazos(8);

	    boolean resultado = a.agregarPiernas(5);

	    assertFalse(resultado);
	    assertEquals(8, a.getNumeroBrazos());
	    assertEquals(0, a.getNumeroPies());
	}
}
