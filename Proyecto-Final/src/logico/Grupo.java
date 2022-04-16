package logico;


import java.util.ArrayList;

public class Grupo {
	
	private ArrayList<Estudiantes> grupoEstudiantes;
	private Profesor profesor;
	private ArrayList<Prisma> prismasGrupo;
	private String nombre;

	
	public Grupo(ArrayList<Estudiantes> grupoEstudiantes, Profesor profesor, ArrayList<Prisma> prismasGrupo, String nombre) {
		super();
		this.grupoEstudiantes = grupoEstudiantes;
		this.profesor = profesor;
		this.prismasGrupo = prismasGrupo;
		this.nombre = nombre;
	}
	
	


	
	public ArrayList<Estudiantes> getGrupoEstudiantes() {
		return grupoEstudiantes;
	}

	public void setGrupoEstudiantes(ArrayList<Estudiantes> grupoEstudiantes) {
		this.grupoEstudiantes = grupoEstudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Prisma> getPrismasGrupo() {
		return prismasGrupo;
	}

	public void setPrismasGrupo(ArrayList<Prisma> prismasGrupo) {
		this.prismasGrupo = prismasGrupo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
