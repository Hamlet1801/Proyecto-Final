package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.CentroEstudios;
import logico.Estudiantes;
import logico.Profesor;
import logico.Usuarios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.SpinnerNumberModel;

public class RegUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtMatricula;
	private JTextField txtNombre;
	private JTextField txtContraseña;
	private JRadioButton rbdtEstudiante;
	private JRadioButton rbdtProfesor;
	private JSpinner SpnAño;
	private JSpinner spnDia;
	private JSpinner spnMes;

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
		setTitle("Registro de Usuarios");
		setBounds(100, 100, 377, 369);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Matricula:");
				lblNewLabel.setBounds(10, 11, 80, 14);
				panel.add(lblNewLabel);
			}
			{
				txtMatricula = new JTextField();
				txtMatricula.setBounds(100, 8, 241, 20);
				panel.add(txtMatricula);
				txtMatricula.setColumns(10);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre:");
				lblNewLabel_1.setBounds(10, 57, 80, 14);
				panel.add(lblNewLabel_1);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(100, 54, 241, 20);
				panel.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Fecha de nacimineto:");
				lblNewLabel_2.setBounds(10, 108, 122, 14);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a:");
				lblNewLabel_3.setBounds(10, 160, 80, 14);
				panel.add(lblNewLabel_3);
			}
			{
				txtContraseña = new JTextField();
				txtContraseña.setBounds(100, 157, 241, 20);
				panel.add(txtContraseña);
				txtContraseña.setColumns(10);
			}
			{
				rbdtEstudiante = new JRadioButton("Estudiante");
				rbdtEstudiante.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbdtEstudiante.setSelected(true);
						rbdtProfesor.setSelected(false);
					}
				});
				rbdtEstudiante.setSelected(true);
				rbdtEstudiante.setBounds(64, 215, 109, 23);
				panel.add(rbdtEstudiante);
			}
			{
				rbdtProfesor = new JRadioButton("Profesor");
				rbdtProfesor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbdtProfesor.setSelected(true);
						rbdtEstudiante.setSelected(false);
					}
				});
				rbdtProfesor.setBounds(210, 215, 109, 23);
				panel.add(rbdtProfesor);
			}
			{
				spnDia = new JSpinner();
				spnDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
				spnDia.setBounds(142, 105, 43, 20);
				panel.add(spnDia);
			}
			
			spnMes = new JSpinner();
			spnMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
			spnMes.setBounds(199, 105, 43, 20);
			panel.add(spnMes);
			
			SpnAño = new JSpinner();
			SpnAño.setModel(new SpinnerDateModel(new Date(1648440000000L), null, new Date(1648440000000L), Calendar.DAY_OF_YEAR));
			SpnAño.setEditor(new JSpinner.DateEditor(SpnAño, "yyyy"));
			SpnAño.setBounds(258, 105, 83, 20);
			panel.add(SpnAño);
		}
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
						String contraseña= txtContraseña.getText();
						int dia= Integer.parseInt(spnDia.getValue().toString());
						int mes= Integer.parseInt(spnMes.getValue().toString());
						SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
						String spinnerValue= formater.format(SpnAño.getValue());
						int año= Integer.parseInt(spinnerValue.substring(0, 4));
						
						if(rbdtEstudiante.isSelected()) {
							aux= new Estudiantes(matricula, nombre, contraseña, dia, mes, año, null, null);
						}
						
						if(rbdtProfesor.isSelected()) {
							aux= new Profesor(matricula, nombre, contraseña, dia, mes, año, null, 1);
						}
						
						CentroEstudios.getInstance1().insertarUser(aux);
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
	
	public void Limpiar() {
		txtMatricula.setText("");
		txtNombre.setText("");
		txtContraseña.setText("");
		spnDia.setValue(Integer.parseInt("1"));
		spnMes.setValue(Integer.parseInt("1"));
		SpnAño.setValue(new Date());
		rbdtEstudiante.setSelected(true);
		rbdtProfesor.setSelected(false);
	}
}
