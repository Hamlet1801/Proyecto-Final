package logico;

import java.io.Serializable;

public abstract class Prisma implements Serializable  {

	protected float Altura;
	private static final long serialVersionUID = 1093142714433252182L;

	
	
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
