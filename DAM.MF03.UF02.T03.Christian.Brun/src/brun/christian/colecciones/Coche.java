package brun.christian.colecciones;

public class Coche {

	private int num;
	private String marca;
	private String modelo;

	public Coche() {
    }

	public Coche(int num, String marca, String modelo) {
        this.num = num;
        this.marca = marca;
        this.modelo = modelo;
    }

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
