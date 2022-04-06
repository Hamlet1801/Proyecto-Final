package logico;


import java.util.ArrayList;



public class Profesor extends Usuarios {

	private ArrayList<Prisma> prismasProfesor;
	private int cantFigurasCreadas;
	
	public Profesor(String matricula, String nombre, String contraseņa, int diaNacimiento, int mesNacimiento,
			int aņoNacimiento, ArrayList<Prisma> prismasProfesor, int cantFigurasCreadas) {
		super(matricula, nombre, contraseņa, diaNacimiento, mesNacimiento, aņoNacimiento);
		this.prismasProfesor = prismasProfesor;
		this.cantFigurasCreadas = cantFigurasCreadas;
	}
	
	
	public ArrayList<Prisma> getPrismasProfesor() {
		return prismasProfesor;
	}

	public void setPrismasProfesor(ArrayList<Prisma> prismasProfesor) {
		this.prismasProfesor = prismasProfesor;
	}

	public int getCantFigurasCreadas() {
		return cantFigurasCreadas;
	}

	public void setCantFigurasCreadas(int cantFigurasCreadas) {
		this.cantFigurasCreadas = cantFigurasCreadas;
	}	

}
