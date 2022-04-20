package logico;

public class Triangulo extends Prisma {
	
	private float verticeBX;
	
	

	public Triangulo(float altura, float verticeBX) {
		super(altura);
		this.verticeBX = verticeBX;
		
		
	}
	

	
	public float getVerticeBX() {
		return verticeBX;
	}

	public void setVerticeBX(float verticeBX) {
		this.verticeBX = verticeBX;
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




	
/**
	@Override
	public float Volumen() {
		float areaBase = (verticeBX * verticeBY ) / 2;
		float volumen = areaBase * Altura;
		return volumen;
	}

	@Override
	//public float areaLaterales() {
		//float areaLateral = verticeBY * verticeBX * Altura;
		
		//return areaLateral;
	//}

	@Override
	//public float areaTotales() {
		float areaBase = (verticeBX * verticeBY ) / 2;
		float areaTotal =  areaLaterales() + (2*areaBase);
		return areaTotal;
		
**/
	private static final long serialVersionUID = 5325596378792549454L;

}
