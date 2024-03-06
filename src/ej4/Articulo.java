package ej4;

/**
 * Clase que realiza diferentes funciones de los artículos.
 */
public class Articulo {
	/**
	 * Cadena que almacena el nombre del artículo.
	 */
	private String nombre = "";
	/**
	 * Atributo que almacena el precio del artículo.
	 */
	private double precio;
	/**
	 * Atributo constante que almacena el valor del IVA de los artículos.
	 */
	private static final double IVA = 21;
	/**
	 * Atributo que almacena existencias del artículo.
	 */
	private int cuantosQuedan;

	/**
	 * Constructor con parámetros para crear artículos.
	 * 
	 * @param nombre,        parámetro que almacena el nombre del artículo.
	 * @param precio,        parámetro que almacena el precio del artículo.
	 * @param cuantosQuedan, parámetro que almacena las existencias del artículo.
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (precio > 0) {
			this.precio = precio;
		}

		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public static double getIva() {
		return IVA;
	}

	public void infoArticulo() {
		System.out.println("Articulo");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Precio: " + this.precio);
		System.out.println("Existencias: " + this.cuantosQuedan);
	}

	public double getPVP() {

		double precioIva = this.precio + (this.precio * (this.IVA / 100));

		return precioIva;
	}

	public double getPVPDescuento(double descuento) {

		double precio = getPVP();
		double precioDescuento = precio - (precio * (descuento / 100));

		return precioDescuento;
	}

	public boolean vender(int unidVenta) {
		boolean existencias = false;
		if (this.cuantosQuedan > unidVenta) {
			this.cuantosQuedan -= unidVenta;
			existencias = true;
		}
		return existencias;
	}

	public void almacenar(int reposicion) {
		if (reposicion > 0) {
			this.cuantosQuedan += reposicion;
		}
	}

}
