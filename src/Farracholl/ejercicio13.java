package Farracholl;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		
		int horaIngresada , minutoIngresado, segundoIngresado;
		
		System.out.println("Ingrese una hora: ");
		horaIngresada = ingreso.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		minutoIngresado = ingreso.nextInt();
		
		System.out.println("Ingrese los segundos: ");
		segundoIngresado = ingreso.nextInt();
		
		
	

		if (horaIngresada > 24 || horaIngresada <0) {
			System.out.println("\tValor de HORARIOS incorrectos");
		} 
		
		else if (minutoIngresado > 60) {
			System.out.println("Valor de MINUTOS incorrecto");
		} else if (segundoIngresado > 60) {
			System.out.println("Valor de SEGUNDOS incorrecto");
		} 		
		else {
			
			System.out.println(
					"Hora: " + horaIngresada + "\nMinutos: " + minutoIngresado + "\nSegundos: " + segundoIngresado);
			System.out.println("Valor de HORARIOS correctos");
			
		}

		
	}

}
