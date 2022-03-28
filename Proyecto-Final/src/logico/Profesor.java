package logico;

import java.util.ArrayList;

public class Profesor extends Usuarios {
	
	protected int cantFigurasCreadas;
	protected ArrayList<Prisma> misPrisma;

	public Profesor(String matricula, String nombre, int fechaNacimiento, int cantFigurascreadas,ArrayList<Prisma> misPrisma) {
		super(matricula, nombre, fechaNacimiento);
	
		this.cantFigurasCreadas = cantFigurasCreadas;
		this.misPrisma = new ArrayList<>();
	}

	public int getCantFigurasCreadas() {
		return cantFigurasCreadas;
	}
	

	public void setCantFigurasCreadas(int cantFigurasCreadas) {
		this.cantFigurasCreadas = cantFigurasCreadas;
	}

	public ArrayList<Prisma> getMisPrisma() {
		return misPrisma;
	}

	public void setMisPrisma(ArrayList<Prisma> misPrisma) {
		this.misPrisma = misPrisma;
	}
	
	
	
	
	

}
