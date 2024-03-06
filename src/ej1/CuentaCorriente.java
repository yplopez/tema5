package ej1;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private double saldo;

	public CuentaCorriente(String dni, int saldo) {
		if (nombre != null && !nombre.equals(""))
		{
			this.dni = dni;
		}
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public CuentaCorriente(String dni, String nombre, int saldo){
		this (dni, saldo);		
		if (nombre != null && !nombre.equals("")) {			
		this.nombre = nombre;
		}		
	}
	

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
		this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean sacarDinero(double dinero) {
		boolean opRealizada = false;

		if (this.saldo >= dinero) {
			this.saldo -= dinero;
			opRealizada = true;		
		}
		return opRealizada;
	}

	public void ingresarDinero(double dinero) {
		
		if (dinero > 0) {
			this.saldo += dinero;
		}
	}
	
	public void mostrarInformacion () {
		System.out.println("***********************\n");
		System.out.println("Titular: " + this.nombre + "\n");
		System.out.println("DNI: " + this.dni + "\n");
		System.out.println("Saldo: " + this.saldo + "\n");
		System.out.println("***********************");
	}

}
