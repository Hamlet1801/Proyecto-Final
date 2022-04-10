
package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;




import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Dialog;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FileOutputStream CentroDeEstudio2;
			ObjectOutputStream CentroDeEstudioWrite;
				try {
					CentroDeEstudio2 = new  FileOutputStream("CentroDeEstudio.dat");
				CentroDeEstudioWrite = new ObjectOutputStream(CentroDeEstudio2);
					
				}catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/imagenes/icono.png")));
		setForeground(new Color(100, 149, 237));
		setTitle("CENTRO DE ESTUDIOS");
		setBackground(new Color(100, 149, 237));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim = getToolkit().getScreenSize();
		setSize(dim.width, dim.height-50);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(100, 149, 237));
		setJMenuBar(menuBar);
		
		JMenu mnUsuario = new JMenu("Usuario");
		menuBar.add(mnUsuario);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mntmRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegUsuario regU = new RegUsuario();
				regU.setModal(true);
				regU.setVisible(true);
				
				
			}
		});
		mnUsuario.add(mntmRegistrar);
		
		JMenu mnListaDeLosU = new JMenu("Lista De  Los Usuarios");
		mnUsuario.add(mnListaDeLosU);
		
		JMenuItem mntmListaProfesores = new JMenuItem("Lista Profesores");
		mntmListaProfesores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListProfesores lP = new ListProfesores();
				lP.setModal(true);
				lP.setVisible(true);
				
			}
		});
		mnListaDeLosU.add(mntmListaProfesores);
		
		JMenuItem mntmListaEstudiantes = new JMenuItem("Lista Estudiante");
		mntmListaEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListEstudiantes lE = new ListEstudiantes();
				lE.setModal(true);
				lE.setVisible(true);	
				
			}
		});
		mnListaDeLosU.add(mntmListaEstudiantes);
		
		
		
		JMenu mnFigura = new JMenu("Figuras");
		menuBar.add(mnFigura);
		
		JMenuItem mntmCrearFigura = new JMenuItem("Crear Figura");
		mntmCrearFigura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearFigura fig = new CrearFigura();
				fig.setVisible(true);
			 
			}
		});
		
		
		mnFigura.add(mntmCrearFigura);
		
		JMenu mnListaDeFigura = new JMenu("Lista de Figuras");
		mnFigura.add(mnListaDeFigura);
		
		JMenuItem mntmListaDelProfesor = new JMenuItem("Lista de Figuras del Profesor");
		mnListaDeFigura.add(mntmListaDelProfesor);
		
		JMenuItem mntmListaDelEstudiantes = new JMenuItem("Lista de Figuras del Estudiantes");
		mnListaDeFigura.add(mntmListaDelEstudiantes);
		
		JMenu mnProfesor = new JMenu("Profesor");
		menuBar.add(mnProfesor);
		
		JMenuItem mntmCrearGrupo = new JMenuItem("Crear Grupo");
		mntmCrearGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearGrupo cG = new CrearGrupo();
				cG.setModal(true);
				cG.setVisible(true);
			}
			
		});
		mnProfesor.add(mntmCrearGrupo);
		
		JMenuItem mntmListaDeGrupos = new JMenuItem("Lista de Grupos ");
		mntmListaDeGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaGrupo lG = new ListaGrupo();
				
				lG.setVisible(true);
				
				
			}
		});
		mnProfesor.add(mntmListaDeGrupos);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(25, 25, 112)));
		panel.setBounds(10, 11, 1330, 657);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("GEOMETR\u00CDA \r\nDIVERTIDA");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Ravie", Font.PLAIN, 28));
		lblTitulo.setBounds(59, 170, 545, 107);
		panel.add(lblTitulo);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/Fp.png")));
		lblFondo1.setBounds(-3, 11, 727, 657);
		panel.add(lblFondo1);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/Fp2.png")));
		lblFondo2.setBounds(346, 0, 984, 657);
		panel.add(lblFondo2);
	}
}

