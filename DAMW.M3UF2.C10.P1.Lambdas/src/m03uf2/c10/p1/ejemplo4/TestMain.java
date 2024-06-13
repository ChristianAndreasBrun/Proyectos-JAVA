package m03uf2.c10.p1.ejemplo4;

public class TestMain {

	public static void main(String[] args) {
//		double getUnValorDouble(double valor1);
		
		IEjemplo04 ejemplo04;
		double resultado;
		
		// esperara que el valor sea un tipo double 
		ejemplo04 = (valor1) -> valor1;
		resultado = ejemplo04.getUnValorDouble(15.1);
		System.out.println(resultado);
		
		
		ejemplo04 = valor1 -> valor1;	// Se puede ahorar los parantesis del parametero, solo cuando hay un parametro
		resultado = ejemplo04.getUnValorDouble(15.1);
		System.out.println(resultado);
		
		
		
		
		ejemplo04 = valor1 -> valor1 *2;
		resultado = ejemplo04.getUnValorDouble(15.1);
		System.out.println(resultado);
		
		ejemplo04 = valor1 -> valor1 /2;
		resultado = ejemplo04.getUnValorDouble(15.1);
		System.out.println(resultado);
	}

}
