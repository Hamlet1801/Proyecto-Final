package logico;

public class Rectangulo extends Prisma {
	
	private float verticeX;
	private float verticeY;


	public Rectangulo(float altura,float verticeX,float verticeY) {
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
		float areaBase = verticeX * verticeY;
		float vol = areaBase * Altura;
		return vol;
	}

	@Override
	public float areaLaterales() {
	  float perimetroBase = verticeX + verticeX +verticeY + verticeY;
	  float areaLateral = perimetroBase * Altura;
		return areaLateral;
	}

	@Override
	public float areaTotales() {
		float areaBase = verticeX * verticeY;
		float areaTotal = areaLaterales() + 2 * (areaBase);
		return areaTotal;
		

	}
	private static final long serialVersionUID = 2160964019487119569L;

}
