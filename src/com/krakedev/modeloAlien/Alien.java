package com.krakedev.modeloAlien;

public class Alien {

	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;
	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private double precioTotal;

	public Alien(int tamanio, String color) {
		// 🔹 Validación de tamaño
		if (tamanio < 5) {
			this.tamanio = 5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}

		this.color = color;

		// 🔹 Cálculo de precios basado en el tamaño final
		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;
		this.precioTotal = 0;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public void imprimir() {
		String mensaje;

		mensaje = "Tamaño: " + tamanio + " ,Color:  " + color + " ,Numero de ojos: " + numeroOjos
				+ " ,Numero de brazos: " + numeroBrazos + " ,Numero de pies: " + numeroPies
				+ " ,Precio de extremidades: " + precioExtremidad + ". Precio de ojos: " + precioOjo
				+ " , Precio de curepo: " + precioCuerpo;
		System.out.println(mensaje);

	}

	public boolean agregarBrazos(double cantidad) {

		int totalExtremidades = numeroBrazos + numeroPies;

		if (totalExtremidades + cantidad <= 10) {
			numeroBrazos += cantidad;
			calcularPrecioTotal();
			return true;
		} else {
			return false;
		}
	}

	public boolean agregarPiernas(double cantidad) {

		int totalExtremidades = numeroBrazos + numeroPies;

		if (totalExtremidades + cantidad <= 10) {
			numeroPies += cantidad;
			calcularPrecioTotal();
			return true;
		} else {
			return false;
		}
	}

	public boolean agregarOjos(double cantidad) {

		int maxOjos;

		if (tamanio >= 5 && tamanio <= 10) {
			maxOjos = 3;
		} else if (tamanio > 10 && tamanio <= 20) {
			maxOjos = 5;
		} else {
			maxOjos = 7;
		}

		if (numeroOjos + cantidad <= maxOjos) {
			numeroOjos += cantidad;
			calcularPrecioTotal();
			return true;
		} else {
			return false;
		}
	}

	public void calcularPrecioTotal() {
		int extremidades = numeroBrazos + numeroPies;
		precioTotal = precioCuerpo + (extremidades * precioExtremidad) + (numeroOjos * precioOjo) ;
		
	}

}
