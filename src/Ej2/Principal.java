package Ej2;

public class Principal {

	public static void main(String[] args) {
		
		Libro Lib1 = new Libro();
		
		Lib1.setTitulo("Mi vida");
		Lib1.setAutor("Anónimo");
		Lib1.setEjemplares(5);
		Lib1.setEjemPrestados(0);
		
		Lib1.prestamo();
		System.out.println(Lib1.getEjemPrestados());
		
		Lib1.devolucion();
		System.out.println(Lib1.getEjemPrestados());
		
		

	}

}
