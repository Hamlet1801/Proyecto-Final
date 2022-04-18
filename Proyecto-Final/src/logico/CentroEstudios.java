package logico;

import java.util.ArrayList;

public class CentroEstudios {
	
	private ArrayList<Prisma> misPrismas;
	private ArrayList<Usuarios> misUsuarios;
	private ArrayList<Grupo> misGrupos;
	public static CentroEstudios centroestudios= null;
	private float tamCubo;
	
	public CentroEstudios() {
		super();
		this.misPrismas = new ArrayList<Prisma>();
		this.misUsuarios = new ArrayList<Usuarios>();
		this.misGrupos = new ArrayList<Grupo>();
		this.tamCubo = tamCubo;
	}
	
	public static CentroEstudios getInstance() {
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

	public ArrayList<Grupo> getMisGrupos() {
		return misGrupos;
	}

	public void setMisGrupos(ArrayList<Grupo> misGrupos) {
		this.misGrupos = misGrupos;
	}
	
	public void insertarUser(Usuarios usuario) {
		misUsuarios.add(usuario);
	}
	
	public void insertarPrisma(Prisma prisma) {
		misPrismas.add(prisma);
	}
	
	public Usuarios buscarUserByMat(String matricula) {
		Usuarios aux= null;
		boolean encontrado = false;
		int i =0;
		
		while(!encontrado && i<misUsuarios.size()) {
			if(misUsuarios.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				aux= misUsuarios.get(i);
				encontrado= true;
			}
			i++;
		}
		return aux;
	}
	
	public void insertarPrismaUsuario(String matricula, Prisma prisma) {
		
		Usuarios usuario= buscarUserByMat(matricula);
		if(usuario instanceof Estudiantes) {
			((Estudiantes) usuario).getPrismasEstudiante().add(prisma);
		}
		
		if(usuario instanceof Profesor) {
			((Profesor) usuario).getPrismasProfesor().add(prisma);
			((Profesor) usuario).setCantFigurasCreadas(+1);
		}
	}

	public float getTamCubo() {
		return tamCubo;
	}

	public void setTamCubo(float tamCubo) {
		this.tamCubo = tamCubo;
	}

}
