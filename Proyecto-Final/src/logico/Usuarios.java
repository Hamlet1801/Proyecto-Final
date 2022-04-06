package logico;

public abstract class Usuarios {
	
	protected String matricula;
	protected String nombre;
	protected String contrase�a;
	protected int diaNacimiento;
	protected int mesNacimiento;
	protected int a�oNacimiento;
	
	public Usuarios(String matricula, String nombre, String contrase�a, int diaNacimiento, int mesNacimiento,
			int a�oNacimiento) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.a�oNacimiento = a�oNacimiento;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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

	public int getA�oNacimiento() {
		return a�oNacimiento;
	}

	public void setA�oNacimiento(int a�oNacimiento) {
		this.a�oNacimiento = a�oNacimiento;
	}
	

}
	
	


