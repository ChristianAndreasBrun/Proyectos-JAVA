package m03uf2.c10.p1.ejemplo3;

public class TestMain {

	public static void main(String[] args) {
//		double getUnValorDouble();
		
		IEjemplo03 prueba1 = () -> 15.1;	// se detecta "return" de forma automatica
		double v1 = prueba1.getUnValorDouble();
		System.out.println(v1);
		
//		===================================================================================
		
		IEjemplo03 preuba2 = () -> 15.1 + 10;
		double v2 = preuba2.getUnValorDouble();
		System.out.println(v2);
		
//		===================================================================================
		
		// Al poner "return" obliga que la sintaxis sea metodo
		IEjemplo03 preuba3 = () -> {
			return 15.1 + 10;
		};
		double v3 = preuba3.getUnValorDouble();
		System.out.println(v3);
		
//		===================================================================================
		
		IEjemplo03 preuba4 = () -> {
			double sumando1 = 15.1;
			double sumando2 = 10;
			double reslutado = sumando1 + sumando2;
			return 15.1 + 10;
		};
		double v4 = preuba4.getUnValorDouble();
		System.out.println(v4);
	}

}
