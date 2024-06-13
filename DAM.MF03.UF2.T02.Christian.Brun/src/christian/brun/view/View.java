package christian.brun.view;

import christian.brun.domain.*;

public class View {

	public static void main(String[] args) {
		
		Ordenadores sobremesa = new Sobremesa();
		sobremesa.setMarca("Asus");
		sobremesa.setPrecio((float)400.99);
		sobremesa.setRam(16);
		sobremesa.setCapacidad(500);
	
		Ordenadores portatil = new Portatil();
		portatil.setMarca("MSI");
		portatil.setPrecio((float)400.99);
		portatil.setRam(16);
		portatil.setCapacidad(500);
		
		Ordenadores movil = new Movil();
		movil.setMarca("Nothing");
		movil.setPrecio((float)400.99);
		movil.setRam(16);
		movil.setCapacidad(500);
	
		

		sobremesa.calcularPrecio();
		portatil.calcularPrecio();
		movil.calcularPrecio();
		
	}

}
