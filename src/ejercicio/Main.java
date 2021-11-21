package ejercicio;

import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		String nombre = scan.nextLine();
		System.out.println("Ingrese su apellido");
		String apellido = scan.nextLine();
		System.out.println("Ingrese su edad");
		int edad = scan.nextInt();
		scan.nextLine();
		System.out.println("Ingrese su hobbie");
		String hobbie = scan.nextLine();
		System.out.println("Ingrese su IDE preferido");
		String ide = scan.nextLine();
		System.out.println("Ingrese su sistema operativo");
		String so = scan.nextLine();
		System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad +
				"\nHobbie: " + hobbie + "\nIDE Preferido: " + ide + "\nSistema operativo: " + so);

	}

}
