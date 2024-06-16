package git2;

import java.util.Scanner;

public class Git2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = scanner.nextLine();
		System.out.println("Tu nombre es " + nombre);
		

		//Modificaciones posteriores al primer commit
		System.out.println("Introduce tu edad: ");
		int edad = scanner.nextInt();
		System.out.println("Mi nombre es " + nombre + " y mi edad: " + edad);
		
		

		scanner.close();
	}

}
