/**
 * 
 */
package com.unab;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LuisZenteno
 *
 */
public class ReadChar {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		/* Listas donde se almacenarán vocales y consonantes por seaparado */
		List<Character> vocales = new ArrayList();
		List<Character> consonantes = new ArrayList();

		/* Contador de vocales y consonantes */
		int contVocal = 0, contCons = 0;

		while (true) {

			System.out.print("\nIngresa una cadena de caracteres: ");
			String cadena = sr.nextLine();

			/*
			 * Si la cadena ingresada cumple con contener solo letras y espacios, se
			 * ejecutará el siguiente bloque.
			 */

			if (cadena.matches("[a-zA-Z\\s]+$")) {

				/* El ciclo for recorre la cadena tantas veces como su propio largo */

				for (int i = 0; i < cadena.length(); i++) {
					char letra = cadena.toLowerCase().charAt(i);

					/*
					 * Si la variable letra es igual a alguna de esos caracteres, se agregará a la
					 * lista vocales y el contador irá sumando por cada letra
					 */
					if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
						vocales.add(letra);
						contVocal += 1;

						/*
						 * En caso contrario, si la variable esta dentro del rango de la letra A a la Z,
						 * se agregará a la lista de consonantes
						 */
					} else if (letra >= 'a' && letra <= 'z') {
						consonantes.add(letra);
						contCons += 1;
					}
					
					else if (letra == ' ') {
						System.out.println("Has ingresado un espacio");
					}
				}

				/*
				 * Fuera del ciclo, se imprimen por pantalla la cantidad de de vocales y
				 * consonantes y sus respectivas listas
				 */
				System.out.println("\nCantidad de vocales: " + contVocal + "\nVocales " + vocales);
				System.out.println("\nCantidad de consonantes: " + contCons + "\nConsonantes " + consonantes);
				break;

			} else {
				System.out.println("Ingreso no valido, intentalo de nuevo");
			}
		}

	}
}