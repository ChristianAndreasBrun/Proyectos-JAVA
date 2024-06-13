package brun.christian.model.domain;

public class Cubo extends FiguraGeometrica3D {

	private float arista;
	
	
	public Cubo(float arista)
	{
		this.arista = arista;
	}
	
	public float getArista() 
	{
		return arista;
	}
	
	public float setArtista(float arista)
	{
		return this.arista = arista;
	}
	
	
	@Override
	public float calcularAreaFigura() {
		
		return 6 * arista * arista;
	}

}
