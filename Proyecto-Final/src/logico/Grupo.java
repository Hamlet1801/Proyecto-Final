package logico;

import java.util.ArrayList;

public class Grupo {
	
	
	protected ArrayList <Estudiantes> misEstudiantes;
	protected Profesor profesor;
	protected ArrayList<Prisma> misPrisma;
	
	
	
	public Grupo(ArrayList<Estudiantes> misEstudiantes, Profesor profesor, ArrayList<Prisma> misPrisma) {
		super();
		this.misEstudiantes = new ArrayList<>();
		this.profesor = profesor;
		this.misPrisma = new ArrayList<>();
	}


	public ArrayList<Estudiantes> getMisEstudiantes() {
		return misEstudiantes;
	}

	public void setMisEstudiantes(ArrayList<Estudiantes> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	
	

}
