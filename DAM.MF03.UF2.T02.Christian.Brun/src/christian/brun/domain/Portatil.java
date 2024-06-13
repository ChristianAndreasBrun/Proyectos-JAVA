package christian.brun.domain;

public class Portatil extends Ordenadores {

	float resultado;
	
	public void calcularPrecio() {
		
		resultado = getPrecio() + getRam() * getCapacidad();
		System.out.println("El portatil de la marca " + getMarca() + " tiene el precio de: " + resultado + "€");
	}
}
