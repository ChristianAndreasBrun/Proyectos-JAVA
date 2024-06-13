package brun.christian.app;

import brun.christian.controller.Figura3DController;

public class App {

	public static void main(String[] args) {

		Figura3DController figura3DController = new Figura3DController();
		figura3DController.Cubo();
		System.out.println("------------------------------------------------------------");
		figura3DController.Esfera();
	}

}
