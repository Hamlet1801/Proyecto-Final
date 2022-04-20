package logico;

public class Cono extends Prisma {
	
	private float Base;

	public Cono(float altura, float base) {
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

	public void setModal(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
