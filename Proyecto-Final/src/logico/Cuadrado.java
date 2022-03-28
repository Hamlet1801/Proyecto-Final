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
		
		return (verticeY * verticeX * Altura);
	}

	@Override
	public float areaLaterales() {
		float arista = (float) Math.pow(verticeX, 2);
		float areaLateral = (4 * arista);
		return areaLateral;
	}

	@Override
	public float areaTotales() {
		float arista = (float) Math.pow(verticeX, 2);
		float total= 6 * arista ;
		return total;

	}

}
