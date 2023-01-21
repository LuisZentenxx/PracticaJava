/**
 * 
 */
package com.unab;
import java.util.Scanner;
/**
 * @author Luis Zenteno
 *
 */
public class CalculadoraBasica {
	
	static Scanner sr = new Scanner(System.in);
	static float n1, n2,suma,resta,mult,mod;
	static double div;
	static String operacion;

	
	static void numeros() {
		
		while(true) {
			
		try{
			
			System.out.print("\nIngrese el valor N° 1: ");
			n1 = Integer.parseInt(sr.nextLine());
			break;
		}
		
		catch (NumberFormatException e){
			System.out.println("Número no valido");
		}
	}
		while(true) {
			
			try{
				
				System.out.print("\nIngrese el valor N° 2: ");
				n2 = Integer.parseInt(sr.nextLine());
				break;
			}
			
			catch (NumberFormatException e){
				System.out.println("Número no valido");
			}
		}
		
		
}
	
	static void suma() {
		
		suma = n1 + n2;
		
		System.out.println("La suma es: " + suma);
	}
	
	static void resta() {
		
		resta = n1 - n2;
		
		System.out.println("La resta es: " + resta);
	}
	
	static void mult() {
		
		mult = n1 * n2;
		
		System.out.println("La multiplicación es: " + mult);
	}
	
	static void div() {
		
		div = n1/n2; 
		
		while(true) {
		
		if(n2 == 0) {
			System.out.println("No divisible por 0, vuelva a ingresar valores validos");
			numeros();
		}
		else {
			break;
		}
	}
		System.out.println("La división es: " + div);
	}
	
	static void mod() {
		
		mod = n1%n2;
		
		System.out.println("El modulo es: " + mod);
	}
	
	static void menu() {
		
		System.out.println("\nCALCULADORA BASICA");
		System.out.println("-----------------------------------------");
		System.out.println("1.- SUMA (+)\n2.- RESTA (-)\n3.- MULTIPLIACIÓN (*)\n4-. DIVISIÓN (/)\n5.- MÓDULO (%)");
	
	}
	
	static void operador() {
		
		while(true) {
		
		System.out.println("\nElige tu operacion: ");
		operacion = sr.nextLine();
		
			switch(operacion) {
			
				case "+":
					suma();
					break;
					
				case "-":
					resta();
					break;
					
				case "*":
					mult();
					break;
					
				case "/":
					div();
					break;
					
				case "%":
					mod();
					break;
					
				default:{
					System.out.println("Opcion incorrecta");
				}
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		
		numeros();
		menu();
		operador();
		
	}

}
