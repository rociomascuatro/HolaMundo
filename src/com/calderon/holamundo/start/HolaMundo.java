/**
 Esto es una prueba de comentario de varias líneas 
 */
package com.calderon.holamundo.start;

/**
 
 */
public class HolaMundo {
	// TODO pendiente inicio de clase
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("STAR PROGRAM Hola Mundo.");
		System.out.println("Hoy estoy aprendiendo Java.");
		
		testIntegerNumbers();
		
		testRealNumbers();
		
		System.out.println("Hasta mañana Mundo cruel. END PROGRAM.");

		
	}

	public static void testIntegerNumbers() {
		System.out.println("START. Aquí comienzan los IntegerNumbers.");

		//Declaración de variables:tipo nombre;
		byte dias;
		short contador;

		//Declaración y asignación de valor
		//tipo nombre=valor inicial;
		short resultado = 42;

		//Declaración de varias variables del mismo tipo
		short codigo, edad, media;

		//Declaración y asignación a varias a la vez:
		int i, j, k;

		i = j = k = 0;

		//El tipo long
		long sueldoFutbolista = 23489343;
		long valorGoogle = 666000666;

		//Vamos a probar a mostrarlos por pantalla : concatenamos con +
		System.out.println("Para dar sentido a tu vida sólo tienes que hacer " + resultado+ " abdominales al día.");

		System.out.println("Más de " +resultado + valorGoogle + " cosas dan sentido a la vida.");

		System.out.println("El sentido de la vida radica en ganar " + sueldoFutbolista + " euros al mes.");

		System.out.println("El sueldo de un futbolista medio es de " + sueldoFutbolista);
		
		System.out.println("END. Aquí acaban los IntegerNumbers.");

	}

	public static void testRealNumbers() {
		
		System.out.println("START. Aquí comienzan los Real Numbers.");
		
		float temperatura;
		//Al asignar valor le ponemos la F para distinguir del tipo double
		float peso = 78.9F;

		double saldoCuentaCorriente = 3423343.43D;
		//Los valores altos se pueden abreviar;
		//esto sería 4.6 muliplicado por 10 elevado a 9.
		double masaJupiter = 4.6E+9D;

		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println(
				"Tu peso es de " + peso + " kilos, y tienes un saldo de " + saldoCuentaCorriente + " euros en tu CC.");
		System.out.println("La masa de Jupiter es de " + masaJupiter + ".");
		
		System.out.println("END. Aquí acaban los RealNumbers.");
		

	}

	
	
}
