package m03uf2.c10.p1.ejemplo2;


import m03uf2.c10.p1.ejemplo1.InterfazFuncionalSaludo;

public class Main {

	public static void main(String[] args) {

//		InterfazFuncionalSaludo gato2 = new Gato();
//		InterfazFuncionalSaludo gato2 = new InterfazFuncionalSaludo(); < No se puede hacer
		
//		void saluda();
		InterfazFuncionalSaludo gato2 = () -> System.out.println("Miau");	// "->" significa que es una Lambda
		gato2.saluda();
		
		InterfazFuncionalSaludo gato3cantante = () -> System.out.println("Miau, Miauuu");	// "->" significa que es una Lambda
		gato3cantante.saluda();
		
//		=======================================================================================================================================
		
		InterfazFuncionalSaludo perro2 = () -> System.out.println("Guau");	// "->" significa que es una Lambda
		perro2.saluda();
		
		// forma visual como metodo
		InterfazFuncionalSaludo perro3 = () -> {
			System.out.println("Guau");}
		;	
		perro3.saluda();
	}

}
