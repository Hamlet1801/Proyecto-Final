package logico;


import java.io.Serializable;
import java.util.ArrayList;



public class CentroEstudios implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Prisma> misPrismas;
	private ArrayList<Usuarios> misUsuarios;
	private ArrayList<Grupo> misGrupos;
	private  static CentroEstudios centroestudios;
	private static Usuarios loginUsuarios;
	
	public CentroEstudios() {
		super();
		misPrismas = new ArrayList<Prisma>();
		misUsuarios = new ArrayList<Usuarios>();
		misGrupos = new ArrayList<Grupo>();
	}
	
	
	public static CentroEstudios getInstance1() {
		if(centroestudios== null) {
			centroestudios= new CentroEstudios();
		}
		return centroestudios;
	}

	public ArrayList<Prisma> getMisPrismas() {
		return misPrismas;
	}

	public void setMisPrismas(ArrayList<Prisma> misPrismas) {
		this.misPrismas = misPrismas;
	}

	public ArrayList<Usuarios> getMisUsuarios() {
		return misUsuarios;
	}

	public void setMisUsuarios(ArrayList<Usuarios> misUsuarios) {
		this.misUsuarios = misUsuarios;
	}

	public ArrayList<Grupo> getMisGrupos1() {
		return misGrupos;
	}

	public void setMisGrupos1(ArrayList<Grupo> misGrupos) {
		this.misGrupos = misGrupos;
	}
	
	public void insertarUser(Usuarios usuario) {
		misUsuarios.add(usuario);
	}
	
	public void insertarPrisma(Prisma prisma) {
		misPrismas.add(prisma);
	}



	public ArrayList<Grupo> getMisGrupos() {
		return misGrupos;
	}

	public void setMisGrupos(ArrayList<Grupo> misGrupos) {
		this.misGrupos = misGrupos;
	}


	public ArrayList<Prisma> getMisPrisma() {
		return misPrismas;
	}


	public void setMisPrisma(ArrayList<Prisma> misPrisma) {
		this.misPrismas = misPrisma;
	}


	public static CentroEstudios getCentroestudios() {
		return centroestudios;
	}


	public static void setCentroestudios(CentroEstudios centroestudios) {
		CentroEstudios.centroestudios = centroestudios;
	}


	public static Usuarios getLoginUsuarios() {
		return loginUsuarios;
	}


	public static void setLoginUsuarios(Usuarios loginUsuarios) {
		CentroEstudios.loginUsuarios = loginUsuarios;
	}
	
	public void RegUsuario(Usuarios usuarios) {
		misUsuarios.add(usuarios);
		
	}
	
	
	public boolean confirmLoging(String text, String text2) {
		boolean Login = false;
		for(Usuarios user : misUsuarios) {
			if(user.getNombre().equals(text) && user.getContraseña().equals(text2) ) {
				loginUsuarios = user;
				Login = true;
			}
		}
		
		
		return Login;
	}


	
	}






	
	
	
	
	
	
	
	


