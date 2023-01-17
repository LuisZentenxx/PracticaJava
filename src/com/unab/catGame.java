package com.unab;
import java.util.Scanner;
public class catGame {
	
	// Declaración de variables
	public static Scanner sr = new Scanner(System.in);
	public static String a1 = " ", a2 = " ", a3 = " ", b1 = " ", b2 = " ", b3 = " ", c1 = " ", c2 = " ", c3 = " ";
	
	// Funcion tablero
	public static void tablero() {
		
		System.out.println(" 1 2 3 ");
		System.out.println(" ");
		System.out.println("a " + a1 + "|" + a2  + "|"+ a3);
		System.out.println("  _|_|_");
		System.out.println("b " + b1 + "|" + b2 + "|" + b3);
		System.out.println("  _|_|_");
		System.out.println("c " + c1 + "|" + c2 + "|" + c3);
		
	}
	
	public static void jugadas() {
		
		String player = "O";
		int verificador = 0;
		// Bucle que parte de la 1era jugada hasta la 9na.
		
		for(int i=1;i<=9;i++) {
			
			if(player=="O") {
				player ="X";
			}
			else {
				player="O";
			}
			
			if(verificador==0) {
				verificador=1;
			}else {
				verificador=0;
			}
			
			
			
			System.out.println("\nJugador " + player + " Elige tu posición (ej: a1): ");
			String opc = sr.nextLine();
			
			switch(opc) {
			case "a1":
				a1 = player;
				break;
				
			case "a2":
				a2 = player;
				break;
				
			case "a3":
				a3 = player;
				break;
				
			case "b1":
				b1 = player;
				break;
				
			case "b2":
				b2 = player;
				break;
				
			case "b3":
				b3 = player;
				break;
				
			case "c1":
				c1 = player;
				break;
				
			case "c2":
				c2 = player;
				break;
				
			case "c3":
				c3 = player;
				break;
				
			default:
				System.out.println("Opcion invalida");
				
			switch(opc) {
			case "a1":
				System.out.println("error");		
				}
			}
				
				
		}
			
			tablero();
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Llamar a la funcion tablero y jugadores
		
		tablero();
		
		jugadas();
		

}
}