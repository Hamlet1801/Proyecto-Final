package logico;


import java.util.ArrayList;

public class CentroEstudios {

	private ArrayList<Prisma> misPrismas;
	private ArrayList<Usuarios> misUsuarios;
	private ArrayList<Grupo> misGrupos;
	public static CentroEstudios centroestudios= null;
	
	public CentroEstudios() {
		super();
		this.misPrismas = new ArrayList<Prisma>();
		this.misUsuarios = new ArrayList<Usuarios>();
		this.misGrupos = new ArrayList<Grupo>();
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



	
	
	
	
	
	
	
	

}
