package m03uf2.c10.p1.ejemplo1;

public class Main {

	public static void main(String[] args) {
		
		Gato gato1 = new Gato();
		gato1.saluda();
		
		Perro perro1 = new Perro();
		perro1.saluda();
		
//		=====================================================
		
		InterfazFuncionalSaludo gato2 = new Gato();
		gato2.saluda();
		
		InterfazFuncionalSaludo perro2 = new Perro();
		perro2.saluda();
		
//		=====================================================

	}

}
