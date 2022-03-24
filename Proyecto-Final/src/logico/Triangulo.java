package logico;

public class Triangulo extends Prisma {
	
	private float verticeBX;
	private float verticeBY;
	private float verticeAltura;

	public Triangulo(float altura, float verticeBX, float verticeBY, float verticeAltura) {
		super(altura);
		this.verticeBX = verticeBX;
		this.verticeBY = verticeBY;
		this.verticeAltura = verticeAltura;
	}
	

	public float getVerticeBX() {
		return verticeBX;
	}

	public void setVerticeBX(float verticeBX) {
		this.verticeBX = verticeBX;
	}

	public float getVerticeBY() {
		return verticeBY;
	}

	public void setVerticeBY(float verticeBY) {
		this.verticeBY = verticeBY;
	}

	public float getVerticeAltura() {
		return verticeAltura;
	}

	public void setVerticeAltura(float verticeAltura) {
		this.verticeAltura = verticeAltura;
	}

	

	@Override
	public float Volumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float areaLaterales() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void areaTotales() {
		// TODO Auto-generated method stub

	}

}
