package edu.servicios;

public class operacionesImplementacion implements operacionesInterfaz{

	public void suma(int num1, int num2) {
		int resultado = num1 + num2;
		System.out.println("El resultado es. " + resultado);
	}
	public void resta(int num1, int num2) {
		int resultado = num1 - num2;
		System.out.println("El resultado es. " + resultado);
	}
	public void multiplicacion(int num1, int num2) {
		int resultado = num1 * num2;
		System.out.println("El resultado es. " + resultado);
	}
	public void division(int num1, int num2) {
		int resultado = num1 / num2;
		System.out.println("El resultado es. " + resultado);
	}
}
