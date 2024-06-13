package m03uf02.c03.p1.view;

import java.util.Scanner;

import m03uf02.c03.p1.model.domain.Cuadrado;
import m03uf02.c03.p1.model.domain.Rectangulo;
import m03uf02.c03.p1.model.domain.Triangulo;

public class FiguraView {

	public Triangulo getTriangulo()
	{
		float base = getDatoFloat("Introduce la base: ");
		float altura = getDatoFloat("Introduce la altura: ");
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(base);
		triangulo.setAltura(altura);
		return triangulo;
	}
	
	public Rectangulo getRectangulo()
	{
		float base = getDatoFloat("Introduce la base: ");
		float altura = getDatoFloat("Introduce la altura: ");
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setBase(base);
		rectangulo.setAltura(altura);
		return rectangulo;
	}
	
	public Cuadrado getCuadrado()
	{
		float base = getDatoFloat("Introduce la base: ");
		float altura = getDatoFloat("Introduce la altura: ");
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setBase(base);
		cuadrado.setAltura(altura);
		return cuadrado;
	}
	
	
	
	public void mostrarInformacion(String mensaje)
	{
		System.out.println(mensaje);
	}
	
	private float getDatoFloat(String mensaje)
	{
		System.out.println(mensaje);
		Scanner scanner = new Scanner(System.in);
		float valor = scanner.nextFloat();
		return valor;
		
	}
}
