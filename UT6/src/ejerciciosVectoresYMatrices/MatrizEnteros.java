package ejerciciosVectoresYMatrices;

import java.util.Scanner;

public class MatrizEnteros {

	/*
	 * Ejercicio 7. Escribe un m�todo que reciba una matriz de enteros con la
	 * creaci�n ya hecha y que dicho m�todo se encargue,�nicamente, de cargar
	 * dicha matriz con datos que se van a insertar a traves del teclado y as�
	 * devolver dicha informaci�n al m�todo que le llam�.
	 */
	private static Scanner teclado;

	public static void rellenarMatriz(int[][] matriz) {
		teclado = new Scanner(System.in);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduzca un caracter para la [fila "
						+ (i + 1) + " - columna " + (j + 1) + "].");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		/*
		for(int[] fila:matriz) {
			for(int elemento:fila) {
				System.out.println(elemento);
			}
		}*/

		
	}


	public static void mostrarMatriz(int[][] enteros) {
		System.out.println("Los valores introducidos son:");
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[i].length; j++) {
				System.out.print(enteros[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int filas;
		int columnas;
		
		System.out.print("Introduzca el n�mero de filas: ");
		filas = teclado.nextInt();
		System.out.print("Introduzca el n�mero de columnas: ");
		columnas = teclado.nextInt();
		System.out.println("Ha creado una matriz " + filas + "x" + columnas
				+ ".\n");
		
		int[][] enteros = new int[filas][columnas];
				
		rellenarMatriz(enteros);

		mostrarMatriz(enteros);

	}

}
