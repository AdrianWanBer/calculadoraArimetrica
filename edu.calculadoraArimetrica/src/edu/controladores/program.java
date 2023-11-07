package edu.controladores;

import java.util.Scanner;

import edu.servicios.menuImplementaicon;
import edu.servicios.menuInterfaz;
import edu.servicios.operacionesImplementacion;
import edu.servicios.operacionesInterfaz;

public class program {
	public static void main (String[] args) {
		
	Scanner sc = new Scanner(System.in);
	boolean cerrarMenu = false;
	menuInterfaz mi = new menuImplementaicon();
	operacionesInterfaz oi = new operacionesImplementacion();
	
	while(!cerrarMenu) {
		int opcionSeleccionada = mi.menuSeleccion(sc);
		switch(opcionSeleccionada) {
		case 1:
			cerrarMenu = true;
			break;
		case 2:
			int num1s = mi.pedirNumeros(sc);
			int num2s = mi.pedirNumeros(sc);
			oi.suma(num1s, num2s);
			break;
		case 3:
			int num1r = mi.pedirNumeros(sc);
			int num2r = mi.pedirNumeros(sc);
			oi.resta(num1r, num2r);
			break;
		case 4:
			int num1m = mi.pedirNumeros(sc);
			int num2m = mi.pedirNumeros(sc);
			oi.multiplicacion(num1m, num2m);
			break;
		case 5:
			int num1d = mi.pedirNumeros(sc);
			int num2d = mi.pedirNumeros(sc);
			oi.division(num1d, num2d);
			break;
		}
	}
	}
}
