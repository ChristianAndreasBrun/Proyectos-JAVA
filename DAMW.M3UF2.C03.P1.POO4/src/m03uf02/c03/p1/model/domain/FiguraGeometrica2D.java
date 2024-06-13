package m03uf02.c03.p1.model.domain;

public abstract class FiguraGeometrica2D {
	
	//Variables
	private float base;
	private float altura;
	
	//Getters & Setters
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
	//Functions
	public abstract float calculaArea();

}
