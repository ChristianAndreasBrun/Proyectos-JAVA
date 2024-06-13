package christian.brun.domain;

public abstract class Ordenadores {

	private String marca;
	private float precio;
	private int ram;
	private int capacidad;
	
	
	// Getter y Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	// - METODOS -
	public void calcularPrecio() {
		System.out.println("no sale nunca");
	}
	
	
	
}
