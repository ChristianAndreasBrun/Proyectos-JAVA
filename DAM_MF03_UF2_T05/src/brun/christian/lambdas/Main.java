package brun.christian.lambdas;

public class Main {

	public static void main(String[] args) {
		
		IOperacionesMatematicasBasicas opera;
		double resultado;
		
		
		// Operacion de suma
		opera = (v1, v2) -> v1 + v2;
		resultado = opera.operacion(15.1, 3);
		System.out.println("Sumar: " + resultado);
		System.out.println("---------------------------------------------------------------------------------");

		// Operacion de resta
		opera = (v1, v2) -> v1 - v2;
		resultado = opera.operacion(15.1, 3);
		System.out.println("Restar: " + resultado);
		System.out.println("---------------------------------------------------------------------------------");
		
		// Operacion de multiplicar
		opera = (v1, v2) -> v1 * v2;
		resultado = opera.operacion(15.1, 3);
		System.out.println("Multiplicar: " + resultado);
		System.out.println("---------------------------------------------------------------------------------");
		
		// Operacion de dividir
		opera = (v1, v2) -> v1 / v2;
		resultado = opera.operacion(15.1, 3);
		System.out.println("Dividir: " + resultado);
		System.out.println("---------------------------------------------------------------------------------");
		
		// Operacion de potencia
		opera = (v1, v2) -> Math.pow(v1, v2);
		resultado = opera.operacion(15.1, 3);
		System.out.println("Elevar: " + resultado);
		System.out.println("---------------------------------------------------------------------------------");
	}

}
