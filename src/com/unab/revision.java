package com.unab;

import java.util.Scanner;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Registro de usuarios
		Una empresa de asesorías en prevención de riesgos posee un sistema 
		de información en el que interactúan tres perfiles: cliente, 
		profesional y administrativo. Para cada usuario se necesita 
		saber el nombre, fecha de nacimiento y RUN. 
		Por cada perfil se necesita registrar distintos datos específicos:
		Cliente: dirección, teléfono, cantidad de empleados 
		Profesional:años de experiencia, departamento 
		Administrativo: función, nombre superior
		Se pide un algoritmo y pieza de código Java que solicite una 
		cantidad de usuarios a ingresar, y que pida por cada uno de 
		ellos los campos que son comunes y el tipo a registrar. 
		Dependiendo del tipo, debe pedir los campos se piden según perfil; 
		una vez ingresados los campos, se deben mostrar por pantalla.
		El algoritmo concluye una vez que se ha ingresado la cantidad 
		de usuarios indicada inicialmente.
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("¿Cuántos usuarios ingresará?: ");
		int cantidadAingresar = teclado.nextInt();
		
		for (int contador = 1; contador <= cantidadAingresar; contador++ ) {
			
			
			System.out.println("Ingresar el nombre: ");
			String nombre = teclado.nextLine();
			System.out.println("Ingresar la fecha de nacimiento: ");
			System.out.println("Ingresar el RUN: ");
			
			
			System.out.println("");
			System.out.println("MENU");
			System.out.println("Opción 1 = Cliente");
			System.out.println("Opción 2 = Profesional");
			System.out.println("Opción 3 = Administrativo");
			System.out.println("");
			int opcion = Integer.parseInt(teclado.nextLine());
			
			
			
			switch(opcion) {
				case 1: 
					System.out.println("Opción seleccionada: CLIENTE");
					/*System.out.println("Ingresar el nombre del cliente: ");
					System.out.println("Ingresar la fecha de nacimiento del cliente: ");
					System.out.println("Ingresar el RUN del cliente: "); */
					
					System.out.println("Ingresar la dirección del cliente "+nombre);
					System.out.println("Ingresar el telefono del cliente: ");
					System.out.println("Ingrese la cantidad de empleados del cliente: ");
				case 2:
					System.out.println("Opción seleccionada: PROFESIONAL");
					/*System.out.println("Ingresar el nombre del cliente: ");
					System.out.println("Ingresar la fecha de nacimiento del cliente: ");
					System.out.println("Ingresar el RUN del cliente: "); */
					
					System.out.println("Ingresar años de experiencia: ");
					System.out.println("Ingresar departamento: ");
				case 3:
					System.out.println("Opción seleccionada: ADMINISTRATIVO");
					/*System.out.println("Ingresar el nombre del cliente: ");
					System.out.println("Ingresar la fecha de nacimiento del cliente: ");
					System.out.println("Ingresar el RUN del cliente: ");*/
					
					System.out.println("Ingresar función: ");
					System.out.println("Ingresar nombre superior: ");
			
			}
		
		}

		
		
		
		
		
	}

}
