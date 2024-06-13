package brun.christian.model.domain;

public abstract class FiguraGeometrica3D {

	//Variables
	private String nombreFigura;
	private String materialConstruccion;
	
	//Getters & Setters
	public String getNombreFigura() {
		return nombreFigura;
	}
	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	public String getMaterialConstruccion() {
		return materialConstruccion;
	}
	public void setMaterialConstruccion(String materialConstruccion) {
		this.materialConstruccion = materialConstruccion;
	}
	
	
	//Functions
	public abstract float calcularAreaFigura();
	
}
