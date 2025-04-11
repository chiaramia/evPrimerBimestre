package Olivares;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);

		boolean pagoEntrada = true;
		int edad;

		System.out.println("Ingresa tu edad: ");
		edad = ingreso.nextInt();

		if (pagoEntrada == true && edad >= 18) {
			System.out.println("ENTRADA VALIDA");
		}
		if (pagoEntrada == true && edad < 18) {
			System.out.println("ENTRADA NO VALIDA");

		}

	}
}
