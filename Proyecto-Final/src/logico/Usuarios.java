package logico;

public class Usuarios {
	
	protected String matricula;
	protected String nombre;
	protected int fechaNacimiento;
	
	
	
	public Usuarios(String matricula, String nombre, int fechaNacimiento) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getMatricula() {
		return matricula;
	}

	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	

}
