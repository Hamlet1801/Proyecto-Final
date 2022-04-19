package logico;

import java.io.Serializable;

public abstract class Usuarios  implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	protected String matricula;
	protected String nombre;
	protected String contrase�a;
	protected String edad;
	
	public Usuarios(String matricula, String nombre, String contrase�a, String edad) {
		super();
		
		this.matricula = matricula;
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.edad= edad;
	
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

	public String getEdad() {
		return edad;
	}

	public void setEdad( String edad) {
		this.edad = edad;
	}

	
	
	


}
	
	


