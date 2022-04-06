package logico;

public abstract class Usuarios {
	
	protected String matricula;
	protected String nombre;
	protected String contraseña;
	protected int diaNacimiento;
	protected int mesNacimiento;
	protected int añoNacimiento;
	
	public Usuarios(String matricula, String nombre, String contraseña, int diaNacimiento, int mesNacimiento,
			int añoNacimiento) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.añoNacimiento = añoNacimiento;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public int getMesNacimiento() {
		return mesNacimiento;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public int getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	

}
	
	


