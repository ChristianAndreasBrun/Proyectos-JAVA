package m03uf2.c10.p1.ejemplo6;

public class TestMain {

	public static void main(String[] args) {
		// String opera(String valor1, String valor2);
		
		IEjemplo06 e06;
		String resultado;
		
		
		e06 = (s1, s2) -> s1 + s2;
		resultado = e06.opera("Hola", " mundo!");
		System.out.println(resultado);
		
		//metodo usado un StringBuilder
		e06 = (s1, s2) -> {
			StringBuilder sb = new StringBuilder();
			sb.append(s1);
			sb.append(s2);
			return sb.toString();
		};
		resultado = e06.opera("Hola", " mundo 2!");
		System.out.println(resultado);
		
		//metodo usado un StringBuilder haciendo print de texto al reves
		e06 = (s1, s2) -> {
			StringBuilder sb = new StringBuilder();
			sb.append(s1);
			sb.append(s2);
			return sb.reverse().toString();
		};
		resultado = e06.opera("Hola", " mundo 3!");
		System.out.println(resultado);

	}

}
