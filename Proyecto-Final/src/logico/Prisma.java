package logico;

public abstract class Prisma {

	protected float Altura;

	
	
	public Prisma(float altura) {
		super();
		this.Altura = altura;
	}

	public float getAltura() {
		return Altura;
	}

	public void setAltura(float altura) {
		Altura = altura;
	}
	
	public abstract float Volumen();
	public abstract float areaLaterales();
	public abstract float areaTotales();
}
