package m03uf02.c03.p1.app;

import m03uf02.c03.p1.controller.Figura2DController;

public class App {
	
	public static void main(String[] args) {
		Figura2DController figura2DController = new Figura2DController();
		figura2DController.Triangulo();
		figura2DController.Rectangulo();
		figura2DController.Cuadrado();
	}

}
