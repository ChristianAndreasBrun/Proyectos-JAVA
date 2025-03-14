package brun.christian.view;

import java.util.Scanner;

import brun.christian.model.domain.Cubo;
import brun.christian.model.domain.Esfera;

public class FiguraView {

	public Cubo getCubo() 
	{
		float arista = getDatoFloat("Introduce las aristas del Cubo: ");
		Cubo cubo = new Cubo(arista);
		cubo.setArtista(arista);
		return cubo;
	}
	
	public Esfera getEsfera() 
	{
		float radio = getDatoFloat("Introduce el radio de la Esfera: ");
		Esfera esfera = new Esfera(radio);
		esfera.setRadio(radio);
		return esfera;
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
