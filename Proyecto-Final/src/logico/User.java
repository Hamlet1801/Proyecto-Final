package logico;

import java.io.Serializable;

public class User extends Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String tipo;
	

	public User(String matricula, String nombre, String contraseña, int diaNacimiento, int mesNacimiento,
			int añoNacimiento, String tipo) {
		super(matricula, nombre, contraseña, diaNacimiento, mesNacimiento, añoNacimiento);
		// TODO Auto-generated constructor stub
		
		
		this.tipo = tipo;
	}

	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
