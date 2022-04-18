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
	 * Create the dialog.
	 */
	public RegUsuario() {
		setBounds(100, 100, 409, 343);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 11, 82, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Matricula:");
		lblNewLabel_1.setBounds(10, 71, 82, 14);
		panel.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 36, 363, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(10, 96, 363, 20);
		panel.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setBounds(10, 139, 57, 14);
		panel.add(lblNewLabel_2);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(10, 167, 104, 20);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_3.setBounds(156, 139, 104, 14);
		panel.add(lblNewLabel_3);
		
		txtContrasena = new JTextField();
		txtContrasena.setBounds(156, 167, 217, 20);
		panel.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		rbtnEstudiante = new JRadioButton("Estudiante");
		rbtnEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnEstudiante.isSelected()) {
					rbtnEstudiante.setSelected(true);
					rbtnProfesor.setSelected(false);
				}
			}
		});
		rbtnEstudiante.setSelected(true);
		rbtnEstudiante.setBounds(10, 208, 109, 23);
		panel.add(rbtnEstudiante);
		
		rbtnProfesor = new JRadioButton("Profesor");
		rbtnProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnProfesor.isSelected()) {
					rbtnProfesor.setSelected(true);
					rbtnEstudiante.setSelected(false);
				}
			}
		});
		rbtnProfesor.setBounds(201, 208, 109, 23);
		panel.add(rbtnProfesor);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Usuarios aux= null;
						String matricula= txtMatricula.getText();
						String nombre= txtNombre.getText();
						String edad= txtEdad.getText();
						String contrasena= txtContrasena.getText();
						
						if(rbtnEstudiante.isSelected()) {
							//aux= new Estudiantes(matricula, nombre, edad, contrasena, null);
						}
						
						if(rbtnProfesor.isSelected()) {
							//aux= new Profesor(matricula, nombre, edad, contrasena, null, 0);
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
