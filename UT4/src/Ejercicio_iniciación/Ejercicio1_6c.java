package Ejercicio_iniciaci�n;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio1_6c {
	/*
	 * Haciendo uso de un m�todo que pida un n�mero entero, hacer un programa
	 * que pida n�meros enteros y visualice el resultado de sumar dichos n�mero.
	 * Se pedir�s n�meros hasta que se inserte una letra o se inserten seis
	 * n�meros.
	 */

	static Scanner teclado;

	public static int pideNumero() throws InputMismatchException {

		int resultado;

		resultado= teclado.nextInt();

		return resultado;
	}

	public static void main(String[] args) {
		int n2;
		int acumulador;

		teclado = new Scanner(System.in);

		System.out.println("Introduzca un n�mero entero para sumarlo: ");
		acumulador = 0;

		boolean continuarCiclo = true;
		int intentos = 0;
		do {

			try {
				System.out.println("Introduzca otro n�mero entero: (n�meros a introducir restantes = " + (6-intentos) + ")" );
				n2 = pideNumero();
				acumulador+=n2;
				intentos++;
				continuarCiclo=true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Se ha insertado una letra en lugar de un n�mero entero.");
				continuarCiclo=false;
			}

		} while (continuarCiclo == true && intentos != 6);

		System.out.printf("Se han introducido %d numeros que suman: %d\n",intentos,acumulador);
		System.out.println("--FIN DEL PROGRAMA--");

		teclado.close();
	}
}
