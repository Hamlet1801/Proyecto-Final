package logico;

import java.util.ArrayList;



public class Estudiantes extends Usuarios {
	
	private ArrayList<Profesor> misPorfesores;
	private ArrayList<Prisma> prismasEstudiante;
	
	public Estudiantes(String matricula, String nombre, String contrase�a, int diaNacimiento, int mesNacimiento,
			int a�oNacimiento, ArrayList<Profesor> misPorfesores, ArrayList<Prisma> prismasEstudiante) {
		super(matricula, nombre, contrase�a, diaNacimiento, mesNacimiento, a�oNacimiento);
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
