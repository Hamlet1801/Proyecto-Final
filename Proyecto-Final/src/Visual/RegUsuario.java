package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import logico.CentroEstudios;
import logico.Estudiantes;
import logico.Profesor;
import logico.Usuarios;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class RegUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtMatricula;
	private JTextField txtEdad;
	private JTextField txtContrasena;
	private JRadioButton rbtnEstudiante;
	private JRadioButton rbtnProfesor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegUsuario dialog = new RegUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	

	/**
	 * 
	 * Create the dialog.
	 */
	public RegUsuario() {
		setTitle("Registro Usuario");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegUsuario.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 587, 519);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(231, 82, 82, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(231, 166, 82, 14);
		panel.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(50, 118, 464, 23);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(50, 201, 464, 23);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(122, 254, 57, 14);
		panel.add(lblNewLabel_2);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(50, 305, 217, 23);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(342, 254, 104, 14);
		panel.add(lblNewLabel_3);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(303, 305, 217, 23);
		panel.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		rbtnEstudiante = new JRadioButton("Estudiante");
		rbtnEstudiante.setBackground(new Color(100, 149, 237));
		rbtnEstudiante.setFont(new Font("Tahoma", Font.BOLD, 15));
		rbtnEstudiante.setForeground(new Color(0, 0, 0));
		rbtnEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnEstudiante.isSelected()) {
					rbtnEstudiante.setSelected(true);
					rbtnProfesor.setSelected(false);
				}
			}
		});
		rbtnEstudiante.setSelected(true);
		rbtnEstudiante.setBounds(95, 367, 125, 23);
		panel.add(rbtnEstudiante);
		
		rbtnProfesor = new JRadioButton("Profesor");
		rbtnProfesor.setBackground(new Color(100, 149, 237));
		rbtnProfesor.setFont(new Font("Tahoma", Font.BOLD, 15));
		rbtnProfesor.setForeground(new Color(0, 0, 0));
		rbtnProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnProfesor.isSelected()) {
					rbtnProfesor.setSelected(true);
					rbtnEstudiante.setSelected(false);
				}
			}
		});
		rbtnProfesor.setBounds(364, 367, 125, 23);
		panel.add(rbtnProfesor);
		
		JLabel label = new JLabel("Registro de usurios");
		label.setForeground(new Color(0, 206, 209));
		label.setFont(new Font("Stencil", Font.PLAIN, 19));
		label.setBounds(201, 34, 239, 23);
		panel.add(label);
		
		JLabel lblIcon = new JLabel("New label");
		
		
		lblIcon.setBounds(97, 11, 82, 69);
		
		ImageIcon Icon = new ImageIcon(getClass().getResource("/imagenes/registro.png"));
		ImageIcon img = new ImageIcon(Icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH));
		lblIcon.setIcon(img);
		
		panel.add(lblIcon);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setBackground(new Color(0, 255, 0));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Usuarios aux= null;
						String matricula= txtMatricula.getText();
						String nombre= txtNombre.getText();
						String edad= txtEdad.getText();
						String contrasena= txtContrasena.getText();
						
						if(rbtnEstudiante.isSelected()) {
							aux= new Estudiantes(matricula, nombre,contrasena,edad, null,0);
						}
						
						if(rbtnProfesor.isSelected()) {
							aux= new Profesor(matricula, nombre, contrasena,edad, null, 0);
						}
						
						CentroEstudios.getInstance().insertarUser(aux);
						JOptionPane.showMessageDialog(null, "Registro Exitoso", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						Limpiar();
					}
					
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(new Color(255, 140, 0));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	private void Limpiar() {
		txtMatricula.setText("");
		txtNombre.setText("");
		txtContrasena.setText("");
		txtEdad.setText("");
		rbtnEstudiante.setSelected(true);
		rbtnProfesor.setSelected(false);
	}
}
