package christian.brun.domain;

public class Sobremesa extends Ordenadores{

	float resultado;
	
	public void calcularPrecio() {
			
		resultado = getPrecio() + getRam();
		System.out.println("El sobremesa de la marca " + getMarca() + " tiene el precio de: " + resultado + "€");
	}
}
