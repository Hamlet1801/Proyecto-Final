package logico;

public class Rombo extends Prisma {
	
	private float verticeX;
	private float verticeY;
	private float verticeZ;
	private float verticeR;
	
	
	public Rombo(float altura,float verticeX,float verticeY,float verticeZ,float verticeR) {
		super(altura);
		this.verticeX = verticeX;
		this.verticeY = verticeY;
		this.verticeZ = verticeZ;
		this.verticeR =verticeR;
		
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

	public float getVerticeR() {
		return verticeR;
	}

	public void setVerticeR(float verticeR) {
		this.verticeR = verticeR;
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
