package ej1;

public class Principal {

	public static void main(String[] args) {
		CuentaCorriente c1 = new CuentaCorriente ("12345678A", "Nomb Apell", 100);
		
		c1.ingresarDinero(200);
		c1.mostrarInformacion();
		
		c1.sacarDinero(50);
		c1.mostrarInformacion();

	}

}
