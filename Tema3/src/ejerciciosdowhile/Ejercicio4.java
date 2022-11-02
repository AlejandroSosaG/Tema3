package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // Esta es la variable de la tabla que pediremos al usuario.
		int mult=1; // Esta variable es el número de la tabla por la que multiplicaremos el número.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que diga la tabla que desea mostrar.
		System.out.println("Diga el número de la tabla de multiplicar");
		// Asignamos a num el valor escrito por el usuario.
		num=sc.nextInt();
		/*
		 * Recorremos el bucle mientras que mult sea menor a 11.
		 */
		do {
			// Mostramos por pantalla la multiplicación de num y mult.
			System.out.println(num + " x " + mult + " = " + num*mult);
			// Incrementamos el valor de mult.
			mult++;
		}while(mult<11);
		// Cerramos el escaner.
		sc.close();
	}

}