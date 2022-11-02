package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; // Esta es la variable del número que incrementaremos.
		/*
		 * Recorremos el bucle mientras que el número sea menor a 201.
		 */
		do {
			// Si el número es par lo mostramos en un mensaje por pantalla.
			if(num%2==0) System.out.println(num);
			// Incrementamos el valor de num.
			num++;
		}while(num<201);
	}

}