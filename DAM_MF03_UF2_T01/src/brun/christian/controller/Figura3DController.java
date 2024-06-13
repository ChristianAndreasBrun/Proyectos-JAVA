package brun.christian.controller;

import brun.christian.model.domain.Cubo;
import brun.christian.model.domain.Esfera;
import brun.christian.view.FiguraView;

public class Figura3DController {

	public void Cubo() 
	{
		FiguraView figuraView = new FiguraView();
		Cubo cubo = figuraView.getCubo();
		float area = cubo.calcularAreaFigura();
		figuraView.mostrarInformacion("El area del cubo es: " + area);
	}
	
	public void Esfera() 
	{
		FiguraView figuraView = new FiguraView();
		Esfera esfera = figuraView.getEsfera();
		float area = esfera.calcularAreaFigura();
		figuraView.mostrarInformacion("El area de la esfera es: " + area);
	}
}
