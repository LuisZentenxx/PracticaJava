/**
 * 
 */
package com.unab;
import java.util.Scanner;
/**
 * @author LuisZenteno
 *
 */
public class Password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sr = new Scanner(System.in);
		
		String passWord = "luis123";
		
		//Validación de la contraseña
		
		for(int i = 2; i>=0; i--) {
			
			System.out.print("\nIngresa tu contraseña: ");
			String passWord1 = sr.nextLine();
			
			if(passWord1.equals(passWord)){
				System.out.println("\nContraeña ingresada correctamente");
				break;
				
				}else {
					
					System.out.println("Contraseña invalida, te quedan " + i  + " intentos");
					
					if(i==0) {
						System.out.println("\nLo siento, te has quedado sin intentos");
					}
				}
		}

	}

}
