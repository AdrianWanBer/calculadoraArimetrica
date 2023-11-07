package edu.servicios;

import java.util.Scanner;

public class menuImplementaicon implements menuInterfaz {
	
	 public int menuSeleccion(Scanner sc){
	
	System.out.println("###############################");
	System.out.println("1.Cerrar la aplicacion");
	System.out.println("2.Suma");
	System.out.println("3.Resta");
	System.out.println("4.Multiplicacion");
	System.out.println("5.Division");
	System.out.println("###############################");
	System.out.println("Seleccione una opcion: ");
	
	int opcionSeleccionada = sc.nextInt();
	return opcionSeleccionada;
	
	 }
	 public int pedirNumeros(Scanner sc) {
		 System.out.println("Escribe un numero");
		 int numero = sc.nextInt();
		 return numero;
		 
	 }
}
