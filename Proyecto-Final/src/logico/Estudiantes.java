package logico;

import java.util.ArrayList;

public class Estudiantes extends Usuarios {
	
	protected ArrayList<Profesor> misProfesores;
	protected ArrayList<Prisma> misPrismas;
	

	public Estudiantes(String matricula, String nombre, int fechaNacimiento, ArrayList<Profesor> misProfesores, ArrayList<Prisma> misPrisma) {
		super(matricula, nombre, fechaNacimiento);
		
		this.misProfesores = new ArrayList<>();
		this.misPrismas = new ArrayList<>();
		
	}


	
	public ArrayList<Profesor> getMisProfesores() {
		return misProfesores;
	}


	public void setMisProfesores(ArrayList<Profesor> misProfesores) {
		this.misProfesores = misProfesores;
	}


	public ArrayList<Prisma> getMisPrismas() {
		return misPrismas;
	}


	public void setMisPrisma(ArrayList<Prisma> misPrismas) {
		this.misPrismas = misPrismas;
	}
	
	
	
	
	

}
