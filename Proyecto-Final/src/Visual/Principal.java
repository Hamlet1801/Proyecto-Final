package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	
	private Dimension dim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/icono.png")));
		setTitle("Centro de estudios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim= getToolkit().getScreenSize();
		setSize(dim.width, dim.height-50);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Usuarios");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registrar usuario");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegUsuario regusuario = new RegUsuario();
				regusuario.setModal(true);
				regusuario.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listado de Estudiantes");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListEstudiantes listestudiantes= new ListEstudiantes();
				listestudiantes.setModal(true);
				listestudiantes.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Listado de profesores");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListProfesores listprofesores= new ListProfesores();
				listprofesores.setModal(true);
				listprofesores.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu = new JMenu("Prismas");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Crear prisma");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Regfigura regfigura= new Regfigura();
				regfigura.setModal(true);
				regfigura.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Prismas Creados");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListPrismas listprimas = new ListPrismas();
				listprimas.setModal(true);
				listprimas.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("Grupos");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmCrearGrupo = new JMenuItem("Crear Grupo");
		mntmCrearGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearGrupo cG = new CrearGrupo();
				cG.setModal(true);
				cG.setVisible(true);
				
			}
		});
		mnNewMenu_2.add(mntmCrearGrupo);
		
		JMenuItem mntmListaDeGrupo = new JMenuItem("Lista De Grupo");
		mntmListaDeGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   ListaGrupo lG = new ListaGrupo();
				
				lG.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmListaDeGrupo);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 1330, 636);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("GEOMETR\u00CDA \r\nDIVERTIDA");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Ravie", Font.PLAIN, 28));
		label.setBounds(67, 148, 545, 107);
		panel.add(label);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Fp.png")));
		lblFondo1.setBounds(0, 0, 685, 636);
		panel.add(lblFondo1);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/Fp2.png")));
		lblFondo2.setBounds(392, 0, 938, 636);
		panel.add(lblFondo2);
	}
}

