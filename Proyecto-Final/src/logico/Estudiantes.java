package logico;

import java.util.ArrayList;



public class Estudiantes extends Usuarios {
	
	private ArrayList<Profesor> misPorfesores;
	private ArrayList<Prisma> prismasEstudiante;
	

	
	public Estudiantes(String matricula, String nombre, String contraseña, String edad , String tipo, Object object) {
		super(matricula, nombre, contraseña, edad);
		this.misPorfesores = misPorfesores;
		this.prismasEstudiante = prismasEstudiante;

		
	}
	

	public ArrayList<Profesor> getMisPorfesores() {
		return misPorfesores;
	}

	public void setMisPorfesores(ArrayList<Profesor> misPorfesores) {
		this.misPorfesores = misPorfesores;
	}

	public ArrayList<Prisma> getPrismasEstudiante() {
		return prismasEstudiante;
	}

	public void setPrismasEstudiante(ArrayList<Prisma> prismasEstudiante) {
		this.prismasEstudiante = prismasEstudiante;
	}

}
