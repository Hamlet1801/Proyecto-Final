package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setTitle("CENTRO DE ESTUDIOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/icono.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim = getToolkit().getScreenSize();
		setSize(dim.width, dim.height-50);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 1330, 657);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("GEOMETR\u00CDA \r\nDIVERTIDA");
		lblTitulo.setBackground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(0, 255, 255));
		lblTitulo.setFont(new Font("Ravie", Font.PLAIN, 28));
		lblTitulo.setBounds(23, 47, 545, 107);
		panel.add(lblTitulo);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/icono.png")));
		lblFondo.setBounds(418, 0, 912, 657);
		panel.add(lblFondo);
		
		JTextPane txtpnInformacion = new JTextPane();
		txtpnInformacion.setForeground(new Color(192, 192, 192));
		txtpnInformacion.setBackground(new Color(0, 0, 0));
		txtpnInformacion.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnInformacion.setEditable(false);
		txtpnInformacion.setText("En este centro de estudio podras aprendren de forma dinamica y divertida, las diferentes formas geometricas, asi como tambien el \u00E1rea y volumen de las misma.\r\n\r\nEsperamos que te diviertas, mientras aprendes sobre geometr\u00EDa.");
		txtpnInformacion.setBounds(60, 165, 501, 128);
		panel.add(txtpnInformacion);
		
		JLabel lblentrar = new JLabel("Ingresa para comenzar esta aventura ");
		lblentrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblentrar.setForeground(new Color(255, 0, 0));
		lblentrar.setBounds(127, 304, 441, 89);
		panel.add(lblentrar);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ingresar ing = new Ingresar();
				
				ing.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD, 21));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(172, 418, 236, 67);
		panel.add(btnNewButton);
	}
}
