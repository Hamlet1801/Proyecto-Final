package logico;

public class Cilindro extends Prisma {

	private float Base;

	public Cilindro(float altura, float base) {
		super(altura);
		Base = base;
	}

	public float getBase() {
		return Base;
	}

	public void setBase(float base) {
		Base = base;
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
	public float areaTotales() {
		// TODO Auto-generated method stub
		return 0;
	}
}
