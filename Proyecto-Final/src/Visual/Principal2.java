package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Principal2 extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
	private JLabel lblFondo;
	private JLabel lblF2;
	private JLabel lblTitulo;
	private JMenuBar menuBar;
	private JMenu mnUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal2 frame = new Principal2();
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
	public Principal2() {
		setForeground(new Color(25, 25, 112));
		setFont(new Font("Jokerman", Font.PLAIN, 21));
		setBackground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal2.class.getResource("/Imagenes/icono.png")));
		setTitle("Centro De Estudio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 702);
		dim = getToolkit().getScreenSize();
		super.setSize(dim.width, dim.height-50);
		setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(100, 149, 237));
		setJMenuBar(menuBar);
		
		mnUsuario = new JMenu("Usuario");
		mnUsuario.setForeground(new Color(230, 230, 250));
		mnUsuario.setBackground(new Color(25, 25, 112));
		menuBar.add(mnUsuario);
		
		JMenu mnNewMenu = new JMenu("Lista");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 1330, 657);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblTitulo = new JLabel("GEOMETR\u00CDA");
		lblTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 53));
		lblTitulo.setBounds(154, 159, 387, 100);
		panel.add(lblTitulo);
		
		lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Principal2.class.getResource("/imagenes/Fp.png")));
		lblFondo.setBounds(0, 0, 644, 657);
		panel.add(lblFondo);
		
		lblF2 = new JLabel("");
		lblF2.setIcon(new ImageIcon(Principal2.class.getResource("/imagenes/Fp2.png")));
		lblF2.setBounds(383, 0, 947, 657);
		panel.add(lblF2);
	}
}
