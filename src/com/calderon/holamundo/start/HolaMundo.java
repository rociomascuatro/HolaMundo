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
		System.out.println();

		
//		testIntegerNumbers();
		
//		testRealNumbers();
		
//		testChars();
		
//		testBoolean();
		
//		testWrappers();

		testStrings();

		
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

	public static void testChars() {
		
		System.out.println("START. Aquí comienza el TestChars.");
		//Los caracteres no son más que una letra
		char caracter= 'A';
		char ultima='z';
		
		//Los especiales comienzan por \
		char nuevaLinea= '\n';
		char tabulacion= '\t';
		char retornoCarro= '\r';
		char comillasSimple= '\'';
		char contrabarra= '\\';
		char dobleComillas= '\"';
		char formFeed= '\f';
		
		// Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("Primera letra "+caracter+" y última: "+ultima+".");
		System.out.println();
		System.out.print("Con la \\ usamos caracteres especiales.");
		System.out.println(" Que parezca un \"accidente\". ");
		System.out.println();
		System.out.println("Vamos a saltar creando el salto de línea \ny ahora otra: "+nuevaLinea+".");
		System.out.println(tabulacion +"Vamos a ver cómo nos afecta la tabulación: "+nuevaLinea+"y ahora \run retorno de carro.");
		System.out.println();
		System.out.println("El formFeed \f no tiene sentido en la consola ni es visible, sólo es útil a la hora de imprimir varias páginas.");
		System.out.println("Aquí termina el TestChars.END");
	
		}


	public static void testBoolean() {
		System.out.println();

		System.out.println("START. Aquí comienza el TestBoolean.");
		//Solo pueden ser true o false
		boolean terminado= false;
		boolean aprobar= true;
		boolean resultado= aprobar;
		
		
		//Vamos a probar a mostrarlos por pantalla: concatenamos con +
		System.out.println("¿Este programa ha terminado con tu paciencia? "+terminado+".");
		
		System.out.println("¿Ha terminado el curso y lo aprobaré? "+(terminado && aprobar));

		System.out.println("¿Ha terminado el curso o lo aprobaré? "+(terminado || aprobar));
		
		System.out.println("Terminado vale: "+terminado+ ", pero si lo niego vale: "+!terminado+".");
		System.out.println("¿Ha terminado el curso y lo aprobaré? "+(terminado && aprobar));
		System.out.println();

		System.out.println("Y si niego?(¿Ha terminado el curso o lo aprobaré?) "+ !(terminado || aprobar));




		System.out.println("¿Conseguirás aprender Java? "+aprobar+".");
		
		System.out.println();

		System.out.println("¿El examen para bombero ha terminado? "+terminado+".");
		
		System.out.println("Miguel ha obtenido plaza? "+aprobar+".");
		
		System.out.println("Aquí acaba el TestBoolean.END");
		System.out.println();
		
		
	

	}
	
	
	public static void testWrappers() {
		System.out.println();

		System.out.println("START. Aquí comienza el TestWrappers.");
		
		
		
		Integer entero=new Integer(8);
		int integer= 9;
		
		Long largo = 1000000L;
		Long longint=new Long (1000000);
		long longinte = 2000000L;
		
		double doble= 123.45;
		Double doblefloat=new Double(123.45);
		Double doblefloate = 223.45;
		
		char caracter = 'A';
		Character character= new Character ('A');
		
		boolean booleano = true;
		Boolean booleanos= new Boolean (true);
		boolean booleanoso=false;
		
		
		System.out.println(">>>"+integer+ ">"+longinte+">"+doblefloate+">"+booleanoso);
		
		System.out.println("Aquí acaba el TestWrappers.END");
		System.out.println();
		
	

	}

	public static void testStrings() {
		System.out.println();

		System.out.println("START. Aquí comienza el TestStrings.");
		String nombre;
		String frase="A quién madruga, Dios le ayuda";
		String presidente;
		
		// Podemos iniciarla con una cadena vacía
		String otraFrase = "Sólo quiero que seamos \"amigos\".";
		
		int edad = 666;
		 
		presidente= "Bittelchus";
		nombre = "Optimus Prime";
		
		//Los especiales comienzan por \
		char nuevaLinea = '\n';
		char tabulacion = '\t';
		
		//Podemos unir una cadena y un carácter con el operador de concatenación.
		frase = frase + nuevaLinea;
		
		//Vamos a probar a mostrarlos en pantalla:
		System.out.println(frase);
		
		//Al concatenar número se convierten en cadenas
		frase = presidente + " tiene: " +edad+ " años.";
		
		System.out.println("La frase queda así: \n"+frase);
		
		System.out.println("Y la otra frase queda así: \n"+otraFrase);

		

		
		

		
		
		
		
		System.out.println("Aquí acaba el TestStrings.END");
		System.out.println();
		
		
	

	}

}
