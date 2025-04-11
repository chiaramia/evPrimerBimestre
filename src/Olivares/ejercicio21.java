package Olivares;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);

		int bateria = 100;

		while (bateria <= 100 && bateria > 0) {

			bateria--;

			Thread.sleep(20);

			System.out.println("tenes este porcentaje de bateria: "+bateria+"%");

			 if(bateria == 20){

				 Thread.sleep(1000);

				 System.out.println("Baja Batería");
	
			}
			 if(bateria == 0){

				 Thread.sleep(1000);

				 System.out.println("Batería Agotada");
}
}
}

}
