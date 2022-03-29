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
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	private JButton btnIngresar;
	private JButton btnRegistrar;
	

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPrincipal.class.getResource("/imagenes/icono.png")));
		setForeground(new Color(100, 149, 237));
		setTitle("CENTRO DE ESTUDIOS");
		setBackground(new Color(100, 149, 237));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim = getToolkit().getScreenSize();
		setSize(dim.width, dim.height-50);
		setLocationRelativeTo(null);
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
		lblTitulo.setBounds(64, 141, 545, 107);
		panel.add(lblTitulo);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IngresarU ingU = new IngresarU();
				ingU.setModal(true);
				ingU.setVisible(true);
				
			}
		});
		btnIngresar.setBackground(new Color(143, 188, 143));
		btnIngresar.setFont(new Font("Stencil", Font.ITALIC, 18));
		btnIngresar.setBounds(135, 247, 167, 27);
		panel.add(btnIngresar);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBackground(new Color(218, 165, 32));
		btnRegistrar.setFont(new Font("Stencil", Font.ITALIC, 18));
		btnRegistrar.setBounds(367, 247, 167, 27);
		panel.add(btnRegistrar);
		
		JLabel lblFondo1 = new JLabel("");
		lblFondo1.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/Fp.png")));
		lblFondo1.setBounds(0, 0, 727, 657);
		panel.add(lblFondo1);
		
		JLabel lblFondo2 = new JLabel("");
		lblFondo2.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/imagenes/Fp2.png")));
		lblFondo2.setBounds(346, 0, 984, 657);
		panel.add(lblFondo2);
	}
}
