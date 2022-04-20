package logico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class CentroEstudios implements Serializable {
	
	private static final long serialVersionUID = 4175295123552801657L;
	private ArrayList<Prisma> misPrismas;
	private ArrayList<Usuarios> misUsuarios;
	private ArrayList<Grupo> misGrupos;
	public static CentroEstudios centroestudios= null;
	private float tamCubo;
	private static Usuarios loginUsuarios;


	public static CentroEstudios instanciaGlobal = null;
	private int generadorCodigoCampo;
	
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
			User use = new User ("1","local","1","Administrador","admin");
			CentroEstudios.getInstance().insertarUser(use);
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
	public static Usuarios getLoginUsuarios() {
		return loginUsuarios;
	}


	public static void setLoginUsuarios(Usuarios loginUsuarios) {
		CentroEstudios.loginUsuarios = loginUsuarios;
	}
	
	

	public static CentroEstudios getInstanciaGlobal() {
		return instanciaGlobal;
	}

	public static void setInstanciaGlobal(CentroEstudios instanciaGlobal) {
		CentroEstudios.instanciaGlobal = instanciaGlobal;
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

	
		public void RegUsuario(Usuarios usuarios) {
			misUsuarios.add(usuarios);
			
		}

		public static void setCentroestudios(CentroEstudios centroestudios) {
			CentroEstudios.centroestudios = centroestudios;
		}

		public void insertarGrupo(Grupo grupo) {
                    misGrupos.add(grupo);

			
		}
		

			public void cargarCentro()  {
				FileInputStream file;
				ObjectInputStream oos;
				try {
					file = new FileInputStream("CentroEstudios.dat");
					oos = new ObjectInputStream(file);
					CentroEstudios.setCentroestudios((CentroEstudios)oos.readObject());
					oos.close();
				} catch(IOException | ClassNotFoundException e) 
				{
					CentroEstudios.getInstance().guardarCentro();
				}
			}
			
			public void guardarCentro() {
				FileOutputStream file;
				try {
					file = new FileOutputStream("CentroEstudios.dat");
					ObjectOutputStream oos = new ObjectOutputStream(file);
					oos.writeObject(CentroEstudios.getInstance());
					oos.close();
				} catch(IOException e)
				{
					e.printStackTrace();


	
	}
			}
}




