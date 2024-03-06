package ej4;

import java.util.Scanner;

public class PrincipalEj4 {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		String nombre;
		double precio;
		int cuantosQuedan;
		
		System.out.println("Escriba el nombre del artículo: ");
		nombre=sc.nextLine();
		
		System.out.println("Ingrese el precio del producto: ");
		precio = sc.nextDouble();
		
		System.out.println("Ingrese la cantidad en existencias: ");
		cuantosQuedan = sc.nextInt();
		
		Articulo article = new Articulo (nombre, precio, cuantosQuedan);
		
		
		

	}

}
