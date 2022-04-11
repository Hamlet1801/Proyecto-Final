package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import logico.CentroEstudios;
import logico.Usuarios;


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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private JTextField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				FileInputStream CentroDeEstudio;
				FileOutputStream CentroDeEstudio2;
				ObjectInputStream CentroDeEstudioRead;
				ObjectOutputStream CentroDeEstudioWrite;
				try {
					CentroDeEstudio = new FileInputStream ("CentroDeEstudio.dat");
					CentroDeEstudioRead = new ObjectInputStream(CentroDeEstudio);
					CentroEstudios temp = (CentroEstudios)CentroDeEstudioRead.readObject();
					CentroEstudios.setCentroestudios(temp);
					CentroDeEstudio.close();
					CentroDeEstudioRead.close();
				} catch (FileNotFoundException e) {
					try {
						
						CentroDeEstudio2 = new  FileOutputStream("CentroDeEstudio.dat");
						CentroDeEstudioWrite = new ObjectOutputStream(CentroDeEstudio2);
					     //Usuarios aux = new Usuarios("Administrador", "Admin", "Admin", 1, 1, 2000);
						//CentroEstudios.getInstance1().RegUsuario(aux);
						CentroDeEstudioWrite.writeObject(CentroEstudios.getInstance1());
						CentroDeEstudio2.close();
						CentroDeEstudioWrite.close();
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					Login frame = new Login();
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
	
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/icono.png")));
		setTitle("Ingresar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 401);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.LIGHT_GRAY));
		panel.setBounds(10, 11, 451, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(26, 149, 236, 23);
		panel.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(Login.class.getResource("/imagenes/icono.png")));
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
				
				if(CentroEstudios.getInstance1().confirmLoging(txtUsuario.getText(),txtContraseña.getText())){
					JOptionPane.showMessageDialog(null, "BIENVENIDO A GEOMETRIA DIVERTIDA", "INGRESASTE",JOptionPane.INFORMATION_MESSAGE);
					MenuPrincipal frame = new MenuPrincipal();
					dispose();
					frame.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA", "ERROR", JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					txtContraseña.setText("");
					txtUsuario.requestFocus();
					
				}
				
			}
				
			
			
		});
		
		btnIngresar.setBackground(new Color(0, 255, 0));
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBounds(79, 233, 89, 23);
		panel.add(btnIngresar);
	}
}
