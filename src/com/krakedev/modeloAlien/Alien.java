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

		mensaje = "Tamaño: " + tamanio + " ,Color:  " + color 
				+ " ,Numero de ojos: " + numeroOjos + " ,Numero de brazos: " 
				+ numeroBrazos + " ,Numero de pies" + numeroPies + " ,Precio de extremidades: " 
				+ precioExtremidad + ". Precio de ojos: " + precioOjo 
				+ " , Precio de curepo: " + precioCuerpo;
		System.out.println(mensaje);

	}
}
