package m03uf02.c03.p1.model.domain;

public class Cuadrado extends FiguraGeometrica2D {

	@Override
	public float calculaArea() {

//		return (float)Math.pow(getBase(), 2);
//		return (float)Math.pow(getAltura(), 2);
		return getBase() * getAltura();

	}
}
