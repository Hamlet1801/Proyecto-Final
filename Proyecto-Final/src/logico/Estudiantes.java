package logico;

import java.util.ArrayList;

public class Estudiantes extends Usuarios {
	
	protected ArrayList<Profesor> misProfesores;
	protected ArrayList<Prisma> misPrisma;
	

	public Estudiantes(String matricula, String nombre, int fechaNacimiento, ArrayList<Profesor> misProfesores, ArrayList<Prisma> misPrisma) {
		super(matricula, nombre, fechaNacimiento);
		
		this.misProfesores = new ArrayList<>();
		this.misPrisma = new ArrayList<>();
		
	}


	public ArrayList<Profesor> getMisProfesores() {
		return misProfesores;
	}


	public void setMisProfesores(ArrayList<Profesor> misProfesores) {
		this.misProfesores = misProfesores;
	}


	public ArrayList<Prisma> getMisPrisma() {
		return misPrisma;
	}


	public void setMisPrisma(ArrayList<Prisma> misPrisma) {
		this.misPrisma = misPrisma;
	}
	
	
	
	
	

}
