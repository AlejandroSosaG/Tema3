package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; // Esta es la variable del número que incrementaremos.
		int numMax; // Esta es la variable del número tope hasta el que llegaremos.
		int suma=0; // Esta variable es la suma de los números que calcularemos.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que diga cúal es el tope.
		System.out.println("Diga el número máximo");
		// Asignamos a numMax el valor escrito por el usuario.
		numMax=sc.nextInt();
		/*
		 * Recorremos el bucle mientras que el número sea menor o igual al número tope.
		 */
		do {
			// Sumamos a suma el valor que tenía más el de num.
			suma+=num;
			// Incrementamos el valor de num.
			num++;
		}while(num<=numMax);
		// Mostramos por pantalla un mensaje con la suma de los números.
		System.out.println("La suma de todos los números es " + suma);
		// Cerramos el escaner.
		sc.close();
	}

}