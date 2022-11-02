package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sol; // Esta es la variable que pediremos al usuario para validar si el número es mayor, menor o igual al que está pensando.
		int num; // Este es el número aleatorio que mostraremos al usuario.
		int max=100; // Esta variable es el máximo del número aleatorio.
		int min=1; // Esta variable es el mínimo del número aleatorio.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Asignamos a num un valor aleatorio entre 1 y 100.
		num=(int) (Math.random()*100+1);
		/*
		 * Recorremos el bucle mientras que la solución sea distinta a igual.
		 */
		do {
			// Pregunatamos al usuario si el número que está pensando es num.
			System.out.println("¿El número es " + num + "?");
			// Asignamos a sol el mensaje escrito por el usuario.
			sol=sc.nextLine();
			// Si el mensaje es mayor asignamos a max el valor de num menos 1.
			if(sol.toLowerCase().equals("mayor")) max = num-1;
			// Sino asignamos a min el valor de num más 1.
			else if(sol.toLowerCase().equals("menor")) min=num+1;
			// Asignamos a num un nuevo valor aleatorio entre min y max.
			num=(int) (Math.random()*(max-min+1)+min);
		}while(!sol.toLowerCase().equals("igual"));
		// Mostramos un mensaje por pantalla diciendo que hemos acertado el número que pensaba el usuario.
		System.out.println("El número es igual al que usted pensaba");
		// Cerramos el escaner.
		sc.close();
	}
}