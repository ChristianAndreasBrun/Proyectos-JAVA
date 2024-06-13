package christian.brun.domain;

public class Movil extends Ordenadores {

	float resultado;
	
	public void calcularPrecio() {
		
		resultado = getPrecio() * getRam() / getCapacidad();
		System.out.println("El movil de la marca " + getMarca() + " tiene el precio de: " + resultado + "€");
	}
}
