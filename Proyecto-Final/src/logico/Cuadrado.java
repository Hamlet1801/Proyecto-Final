package logico;

public class Cuadrado extends Prisma {
	
	private float verticeX;
	private float verticeY;

	public Cuadrado(float altura,float verticeX,float verticeY) {
		super(altura);
		this.verticeX = verticeX;
		this.verticeY = verticeY;
	}

	public float getVerticeX() {
		return verticeX;
	}

	public void setVerticeX(float verticeX) {
		this.verticeX = verticeX;
	}

	public float getVerticeY() {
		return verticeY;
	}

	public void setVerticeY(float verticeY) {
		this.verticeY = verticeY;
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
