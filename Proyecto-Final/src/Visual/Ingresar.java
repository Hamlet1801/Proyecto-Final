package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;

public class Ingresar extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private JPasswordField jpassClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingresar frame = new Ingresar();
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
	public Ingresar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ingresar.class.getResource("/imagenes/icono.png")));
		setTitle("Ingresar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 401);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel.setBounds(10, 11, 451, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Ingresar.class.getResource("/imagenes/icono.png")));
		lblFondo.setBounds(0, 0, 451, 340);
		panel.add(lblFondo);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(26, 62, 236, 23);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario :");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setBounds(26, 28, 118, 23);
		panel.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setForeground(new Color(255, 255, 255));
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContraseña.setBounds(26, 115, 118, 23);
		panel.add(lblContraseña);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char[] clave = jpassClave.getPassword();
				String claveFinal =new String(clave);
				
				
				if (txtUsuario.getText().equals("Dibujo") && claveFinal.equals("123")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido/a a Geometria Divertida", "Ingresaste", JOptionPane.INFORMATION_MESSAGE);
					 MenuPrincipal mP = new MenuPrincipal();
					 mP.setVisible(true);
					 
				}else {
					
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
					
					txtUsuario.setText("");
					jpassClave.setText("");
					txtUsuario.requestFocus();
				}
				
				
			}
		
			
		});
		
		btnIngresar.setBackground(new Color(0, 255, 0));
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBounds(79, 233, 89, 23);
		panel.add(btnIngresar);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(26, 157, 236, 23);
		panel.add(jpassClave);
	}
}
