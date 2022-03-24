package logico;

import java.util.ArrayList;

public class CentroEstudios {
	
	protected ArrayList<Profesor> misProfesores;
	protected ArrayList <Estudiantes> misEstudiantes;
	protected ArrayList<Grupo> misGrupos;
	protected ArrayList<Prisma> misPrisma;
	
	
	public CentroEstudios(ArrayList<Profesor> misProfesores, ArrayList<Estudiantes> misEstudiantes,
			ArrayList<Grupo> misGrupos, ArrayList<Prisma> misPrisma) {
		super();
		this.misProfesores = new ArrayList<>();
		this.misEstudiantes = new ArrayList<>();
		this.misGrupos = new ArrayList<>();
		this.misPrisma = new ArrayList<>();
	}


	public ArrayList<Profesor> getMisProfesores() {
		return misProfesores;
	}

	public void setMisProfesores(ArrayList<Profesor> misProfesores) {
		this.misProfesores = misProfesores;
	}

	public ArrayList<Estudiantes> getMisEstudiantes() {
		return misEstudiantes;
	}

	public void setMisEstudiantes(ArrayList<Estudiantes> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}

	public ArrayList<Grupo> getMisGrupos() {
		return misGrupos;
	}

	public void setMisGrupos(ArrayList<Grupo> misGrupos) {
		this.misGrupos = misGrupos;
	}


	public ArrayList<Prisma> getMisPrisma() {
		return misPrisma;
	}


	public void setMisPrisma(ArrayList<Prisma> misPrisma) {
		this.misPrisma = misPrisma;
	}
	
	
	
	
	
	
	

}
