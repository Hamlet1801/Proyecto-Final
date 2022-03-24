package logico;

public class Rectangulo extends Prisma {
	
	private float verticeX;
	private float verticeY;
	private float verticeZ;

	public Rectangulo(float altura,float verticeX,float verticeY,float verticeZ) {
		super(altura);
		this.verticeX = verticeX;
		this.verticeY = verticeY;
		this.verticeZ = verticeZ;
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

	public float getVerticeZ() {
		return verticeZ;
	}

	public void setVerticeZ(float verticeZ) {
		this.verticeZ = verticeZ;
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
