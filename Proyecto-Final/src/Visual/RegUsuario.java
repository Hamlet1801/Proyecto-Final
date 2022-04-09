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
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegUsuario.class.getResource("/imagenes/icono.png")));
		getContentPane().setBackground(new Color(25, 25, 112));
		setTitle("Registro de Usuarios");
		setBounds(100, 100, 580, 494);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Matricula:");
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNewLabel.setBounds(52, 86, 80, 23);
				panel.add(lblNewLabel);
			}
			{
				txtMatricula = new JTextField();
				txtMatricula.setBounds(166, 88, 320, 23);
				panel.add(txtMatricula);
				txtMatricula.setColumns(10);
			}
			{
				JLabel lblNombre = new JLabel("Nombre:");
				lblNombre.setForeground(new Color(255, 255, 255));
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblNombre.setBounds(52, 133, 80, 23);
				panel.add(lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(166, 135, 320, 23);
				panel.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimineto:");
				lblFechaDeNacimiento.setForeground(new Color(255, 255, 255));
				lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblFechaDeNacimiento.setBounds(52, 192, 142, 23);
				panel.add(lblFechaDeNacimiento);
			}
			{
				JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
				lblContraseña.setForeground(new Color(255, 255, 255));
				lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblContraseña.setBounds(52, 272, 104, 23);
				panel.add(lblContraseña);
			}
			{
				txtContraseña = new JTextField();
				txtContraseña.setBounds(166, 274, 320, 23);
				panel.add(txtContraseña);
				txtContraseña.setColumns(10);
			}
			{
				rbdtEstudiante = new JRadioButton("Estudiante");
				rbdtEstudiante.setBackground(new Color(176, 196, 222));
				rbdtEstudiante.setForeground(new Color(0, 0, 0));
				rbdtEstudiante.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbdtEstudiante.setSelected(true);
						rbdtProfesor.setSelected(false);
					}
				});
				rbdtEstudiante.setSelected(true);
				rbdtEstudiante.setBounds(141, 339, 109, 23);
				panel.add(rbdtEstudiante);
			}
			{
				rbdtProfesor = new JRadioButton("Profesor");
				rbdtProfesor.setBackground(new Color(173, 216, 230));
				rbdtProfesor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbdtProfesor.setSelected(true);
						rbdtEstudiante.setSelected(false);
					}
				});
				rbdtProfesor.setBounds(310, 339, 109, 23);
				panel.add(rbdtProfesor);
			}
			{
				spnDia = new JSpinner();
				spnDia.setModel(new SpinnerNumberModel(1, 1, 31, 1));
				spnDia.setBounds(217, 193, 83, 23);
				panel.add(spnDia);
			}
			
			spnMes = new JSpinner();
			spnMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
			spnMes.setBounds(310, 193, 83, 23);
			panel.add(spnMes);
			
			SpnAño = new JSpinner();
			SpnAño.setModel(new SpinnerDateModel(new Date(1648440000000L), null, new Date(1648440000000L), Calendar.DAY_OF_YEAR));
			SpnAño.setEditor(new JSpinner.DateEditor(SpnAño, "yyyy"));
			SpnAño.setBounds(403, 193, 83, 23);
			panel.add(SpnAño);
			
			JLabel lblTitulo = new JLabel("Registro de usurios");
			lblTitulo.setForeground(new Color(0, 206, 209));
			lblTitulo.setFont(new Font("Stencil", Font.PLAIN, 19));
			lblTitulo.setBounds(234, 30, 239, 23);
			panel.add(lblTitulo);
			
			JLabel lblIcon = new JLabel("");
			
			lblIcon.setBounds(141, 11, 69, 54);
			
			ImageIcon Icon = new ImageIcon(getClass().getResource("/imagenes/registro.png"));
			ImageIcon img = new ImageIcon(Icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH));
			lblIcon.setIcon(img);
			panel.add(lblIcon);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(25, 25, 112));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setBackground(new Color(0, 128, 0));
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
