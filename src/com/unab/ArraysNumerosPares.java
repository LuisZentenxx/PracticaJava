/**
 * 
 */
package com.unab;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Este programa permite ingresar una lista de números y realiza las siguientes operaciones:
 * 1. Mostrar la lista de números ingresados.
 * 2. Mostrar la suma y el promedio de los números ingresados.
 * 3. Mostrar el valor mínimo y máximo de los números ingresados.
 * 4. Eliminar de la lista los números pares y volver a realizar las operaciones 1, 2 y 3.
 *
 * @author Luis Zenteno
 */


/**
 * Clase principal donde se encuentra el método main y donde se realizan todas las operaciones descritas anteriormente.
 */
public class ArraysNumerosPares {

	static Scanner sc = new Scanner(System.in);

	static ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

	
	static String numero;
	static int suma, minimo,maximo,par;
	static double promedio;
	
	
	/**
	 * El método "detectarNum" verifica si el valor ingresado es un número o no. 
	 * Si es un número se devuelve el valor como una cadena de caracteres, de lo contrario se muestra un mensaje de error y se vuelve a pedir un valor válido.
	 * 
	 * @param mensaje Es un string que representa un mensaje que se muestra al usuario para ingresar un número.
	 * @param sc Es un objeto Scanner que permite la entrada de datos.
	 * @return Devuelve una entrada de tipo string que representa un número.
	 */

	public static String detectarNum(String mensaje, Scanner sc) {

		boolean condicionNum = true;
		String entrada = "";

		while (condicionNum) {

			System.out.print(mensaje);
			entrada = sc.nextLine();
			
			// Se pueden ingresar números enteros positivos como negativos de 1 digito o más.
			if (entrada.matches("-\\d+") || entrada.matches("[0-9]{1,}")) {

				condicionNum = false;

			} else {
				System.out.println("\nHas ingresado un dato no númerico, intentelo nuevamente");
			}
		}
		return entrada;
	}

	static void ingresoNumeros() {
		boolean condicion = true;
		
		// contador de números ingresados
		int contador = 0;

		// bucle que se repetirá hasta que se cumpla la condición de salida
		while (condicion) {
			
			// llamada a la función detectarNum para obtener un número ingresado por el usuario
			numero = detectarNum("Ingrese un número para ingresar a la lista --> ", sc);
			
			if (!numero.equals("0")) {
				
				// convertir el número a tipo entero y agregarlo a la lista e incrementar el contador de números.
				int numeroEntero = Integer.parseInt(numero);
				listaNumeros.add(numeroEntero);
				contador+=1;
				
				
			// si el número ingresado es cero pero no se han ingresado al menos tres números.
			}else if (numero.equals("0") && contador >=3){
				
				mostrarLista();
				promedioNumeros();
				valorMinimoMaximo();
				condicion = false;
				
			}else {
				// no se realiza ninguna acción
				
			}
			
		}
	}

	static void mostrarLista() {
		
		System.out.println("\n//////////////////////////////////////");
		System.out.println("\n* Lista de numeros --> " + listaNumeros);
	}
	
	
	// Método que calcula el promedio de los números ingresados en la lista
	static void promedioNumeros() {
		
		// Inicialización de la variable "total" para almacenar la suma de los números
		int total = 0;
		for (int x = 0; x < listaNumeros.size(); x++) {
			
			// Se suma el número actual a la variable "total"
			suma =  listaNumeros.get(x);
			total = total + suma;
		}
		
		// Cálculo del promedio de los números (total dividido por la cantidad de números)
		System.out.println("\n* La suma de los números es --> " + total);
		promedio = (total / listaNumeros.size());
		System.out.println("\n* El promedio de los números es --> " + promedio);
		
	}
	
	static void valorMinimoMaximo() {
		
			minimo = Collections.min(listaNumeros);
			maximo = Collections.max(listaNumeros);
			System.out.println("\n"
					+ "* El número minimo es --> " + minimo);
			System.out.println("\n* El número máximo es --> " + maximo);
			
	}
	
	// Método para eliminar los números pares de la lista
	static void eliminarPares() {
		
		// Iteramos por la lista de números
		for (int v = 0; v < listaNumeros.size(); v++) {
			
			// Si el número seleccionado de la lista es par
			if (listaNumeros.get(v)%2 == 0) {
				
				// Lo eliminamos de la lista
				listaNumeros.remove(v);
				
				// Decrementamos el índice v para no perder ningún elemento
				v--;
			}
		}
		mostrarLista();
		promedioNumeros();
		valorMinimoMaximo();
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ingresoNumeros();
		System.out.println("");
		System.out.println("\nEliminar números");
		eliminarPares();
	}

}
