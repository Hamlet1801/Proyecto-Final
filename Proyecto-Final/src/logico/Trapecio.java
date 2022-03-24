package logico;

public class Trapecio extends Prisma {
	
	private float verticeTX;
	private float verticeTY;
	private float verticeTZ;
	private float verticeT;
	private float AlturaT;

	public Trapecio(float altura,float verticeTX,float verticeTY,float verticeTZ,float verticeT,float AlturaT) {
		super(altura);
		this.verticeTX = verticeTX;
		this.verticeTY = verticeTY;
		this.verticeTZ = verticeTZ;
		this.verticeT = verticeT;
		this.AlturaT = AlturaT;
	}

	public float getVerticeTX() {
		return verticeTX;
	}

	public void setVerticeTX(float verticeTX) {
		this.verticeTX = verticeTX;
	}

	public float getVerticeTY() {
		return verticeTY;
	}

	public void setVerticeTY(float verticeTY) {
		this.verticeTY = verticeTY;
	}

	public float getVerticeTZ() {
		return verticeTZ;
	}

	public void setVerticeTZ(float verticeTZ) {
		this.verticeTZ = verticeTZ;
	}

	public float getVerticeT() {
		return verticeT;
	}

	public void setVerticeT(float verticeT) {
		this.verticeT = verticeT;
	}

	public float getAlturaT() {
		return AlturaT;
	}

	public void setAlturaT(float alturaT) {
		AlturaT = alturaT;
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
