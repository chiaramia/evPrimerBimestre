package evPrimerBimestre;

import java.util.Scanner;

public class ejercicio16 {
public static void main(String[] args) {
	Scanner ingreso = new Scanner(System.in);
	
	int opciones;
	
	System.out.println("Elegir entre las siguentes opciones :");
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	
	opciones = ingreso.nextInt();
	
	switch(opciones) {
	 
	case 1: System.out.println("Cafe Cortado");
	break;
	
	 
	case 2: System.out.println("Cafe Latte");
	break;
	
	
	case 3: System.out.println("Cafe Solo");
	break;
	
	
	case 4: System.out.println("Cafe Lagrima");
	break;
	

	case 5: System.out.println("Saliste del programa");
	break;
	
	default: System.err.println("Elegiste cualquier cosa");
	break;
	}
}


}

