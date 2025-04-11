package evPrimerBimestre;

import java.util.Scanner;

public class ejercicio19 {
	public static void main(String[] args) throws InterruptedException {
		Scanner ingreso = new Scanner (System.in);
		
		int contrasena;
		int intentos = 0;
		
		

		do {

			System.out.println("Ingresa tu contrasena: ");
			contrasena = ingreso.nextInt();

			if (contrasena != 2008) {
				Thread.sleep(100);

				intentos++; 

				if (intentos < 3) {
					System.out.println("Volve a intentarlo. ");
				}

			}

		} while (contrasena != 2008 && intentos < 3);

		if (contrasena == 2008) {
			System.out.println("Contrasena correcta.");
		}
		if (contrasena != 2008) {
			System.err.println("Bloqueaste el usuario, salame. ");
		}
	}

}