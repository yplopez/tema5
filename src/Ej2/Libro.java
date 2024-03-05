package Ej2;

public class Libro {

	private String titulo="";
	private String autor="";
	private int ejemplares;
	private int ejemPrestados;
	
	
	public Libro() {
		}


	public Libro(String titulo, String autor, int ejemplares, int ejemPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemPrestados = ejemPrestados;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public float getEjemplares() {
		return ejemplares;
	}


	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}


	public float getEjemPrestados() {
		return ejemPrestados;
	}


	public void setEjemPrestados(int ejemPrestados) {
		this.ejemPrestados = ejemPrestados;
	}
	
	
	public boolean prestamo () {
		boolean disponible = false;
		
		if(this.ejemplares > 1) {
			this.ejemPrestados++;
			disponible = true;
		}
		
		return disponible;
	}
	
	public boolean devolucion() {
		boolean devuelve = false;
		
		if (this.ejemPrestados > 0) {
			this.ejemPrestados--;
			devuelve = true;
		}
		
		return devuelve;
	}
	
	
	
	
	
}
