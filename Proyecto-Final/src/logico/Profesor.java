package logico;


import java.util.ArrayList;



public class Profesor extends Usuarios {

	private ArrayList<Prisma> prismasProfesor;
	private int cantFigurasCreadas;
	
	
	
	public Profesor(String matricula, String nombre, String contraseña, int diaNacimiento, int mesNacimiento,
			int añoNacimiento, String tipo, int i) {
		super(matricula, nombre, contraseña, diaNacimiento, mesNacimiento, añoNacimiento);
		
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
