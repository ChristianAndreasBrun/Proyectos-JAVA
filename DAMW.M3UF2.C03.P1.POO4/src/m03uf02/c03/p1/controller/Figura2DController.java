package m03uf02.c03.p1.controller;

import m03uf02.c03.p1.view.FiguraView;
import m03uf02.c03.p1.model.domain.Triangulo;
import m03uf02.c03.p1.model.domain.Rectangulo;
import m03uf02.c03.p1.model.domain.Cuadrado;

public class Figura2DController {

	//Default Constructor
	public void Triangulo()
	{
		FiguraView figuraView = new FiguraView();
		Triangulo triangulo = figuraView.getTriangulo();
		float area = triangulo.calculaArea();
		figuraView.mostrarInformacion("El area del trinagulo es: " + area);
	}
	
	public void Rectangulo()
	{
		FiguraView figuraView = new FiguraView();
		Rectangulo rectangulo = figuraView.getRectangulo();
		float area = rectangulo.calculaArea();
		figuraView.mostrarInformacion("El area del rectangulo es: " + area);
	}
	
	public void Cuadrado()
	{
		FiguraView figuraView = new FiguraView();
		Cuadrado cuadrado = figuraView.getCuadrado();
		float area = cuadrado.calculaArea();
		figuraView.mostrarInformacion("El area del cuadrado es: " + area);
	}
}
