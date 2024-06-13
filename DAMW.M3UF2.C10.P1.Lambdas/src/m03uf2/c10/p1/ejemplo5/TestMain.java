package m03uf2.c10.p1.ejemplo5;

public class TestMain {

	public static void main(String[] args) {
		// boolean comprobar(int valor1, int valor2);
		
		IEjemplo05 e05;
		boolean resultado;
		
		e05 = (v1, v2) -> v1 > v2;	//al ser 2 valores, se tiene que colocar entre parantesis
		resultado = e05.comprobar(10, 3);
		System.out.println(resultado);
		resultado = e05.comprobar(10, 10);
		System.out.println(resultado);
		System.out.println("---------------------------------------------");
		
//		--------------------------------------------------------------------
		
		e05 = (v1, v2) -> v1 >= v2;	//al ser 2 valores, se tiene que colocar entre parantesis
		resultado = e05.comprobar(10, 3);
		System.out.println(resultado);
		resultado = e05.comprobar(10, 10);
		System.out.println(resultado);
		System.out.println("---------------------------------------------");
		
//		--------------------------------------------------------------------
		
		e05 = (v1, v2) -> v1 % v2 == 0;	//comprobar que sea divisible entre 0
		resultado = e05.comprobar(10, 3);
		System.out.println(resultado);
		resultado = e05.comprobar(10, 10);
		System.out.println(resultado);
		System.out.println("---------------------------------------------");
		
//		--------------------------------------------------------------------
		
		e05 = (v1, v2) -> v1 % v2 == 0 || v1 >= v2;	//comprobar que sea divisible entre 0
		resultado = e05.comprobar(10, 3);
		System.out.println(resultado);
		resultado = e05.comprobar(10, 10);
		System.out.println(resultado);
		
	}

}
