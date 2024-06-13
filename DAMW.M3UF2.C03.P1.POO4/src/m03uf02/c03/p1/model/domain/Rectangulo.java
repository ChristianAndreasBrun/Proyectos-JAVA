package m03uf02.c03.p1.model.domain;

public class Rectangulo extends FiguraGeometrica2D {

	@Override
	public float calculaArea() {

		return getBase() * getAltura();
	}
}
