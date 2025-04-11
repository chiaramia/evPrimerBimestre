package Olivares;

import java.util.Scanner;

public class ejercicio15 {
public static void main(String[] args) {
	Scanner ingreso = new Scanner(System.in);
	System.out.println("Elegir entre las siguentes opciones :");
	System.out.println("S");
	System.out.println("M");
	System.out.println("L");
	
	char opciones = ingreso.next().charAt(0);
	
	switch(opciones) {
	case 's': 
	case 'S': System.out.println("Solo quedan 5 remeras.");
	break;
	
	case 'm': 
	case 'M': System.out.println("Solo quedan 2 remeras.");
	break;
	
	case 'l': 
	case 'L': System.out.println("Ya no quedan remeras.");
	break;
	
	default: System.err.println("Elegiste cualquier cosa");
	break;
	}

	System.out.println("Hasta la proxima.");
}

}
	

