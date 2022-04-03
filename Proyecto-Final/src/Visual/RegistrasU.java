
package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class RegistrasU extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JTextField txtGrupo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtContrasna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrasU dialog = new RegistrasU();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrasU() {
		setTitle("REGISTRO");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrasU.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 568, 513);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ELIJA SU CATEGORIA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
			panel.setBounds(10, 11, 532, 62);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JRadioButton rdbtnProfesor = new JRadioButton("PROFESOR");
			rdbtnProfesor.setFont(new Font("Tahoma", Font.BOLD, 13));
			rdbtnProfesor.setBackground(new Color(100, 149, 237));
			rdbtnProfesor.setSelected(true);
			rdbtnProfesor.setBounds(115, 17, 99, 23);
			panel.add(rdbtnProfesor);
			
			JRadioButton rdbtnEstudiante = new JRadioButton("ESTUDIANTE");
			rdbtnEstudiante.setFont(new Font("Tahoma", Font.BOLD, 13));
			rdbtnEstudiante.setBackground(new Color(100, 149, 237));
			rdbtnEstudiante.setBounds(292, 17, 107, 23);
			panel.add(rdbtnEstudiante);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "LLENE LOS CAMPOS ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
			panel.setBounds(10, 78, 532, 347);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblID = new JLabel("ID:");
				lblID.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblID.setForeground(new Color(255, 255, 255));
				lblID.setBounds(29, 31, 46, 14);
				panel.add(lblID);
			}
			{
				JTextField txtId = new JTextField();
				txtId.setEditable(false);
				txtId.setBounds(85, 29, 150, 23);
				panel.add(txtId);
				txtId.setColumns(10);
			}
			{
				JLabel lblGrupo = new JLabel("GRUPO:");
				lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblGrupo.setForeground(new Color(255, 255, 255));
				lblGrupo.setBounds(271, 32, 76, 14);
				panel.add(lblGrupo);
			}
			{
				txtGrupo = new JTextField();
				txtGrupo.setEditable(false);
				txtGrupo.setBounds(357, 29, 150, 23);
				panel.add(txtGrupo);
				txtGrupo.setColumns(10);
			}
			{
				JLabel lblMatricula = new JLabel("MATRICULA:");
				lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblMatricula.setForeground(new Color(255, 255, 255));
				lblMatricula.setBounds(29, 86, 90, 23);
				panel.add(lblMatricula);
			}
			{
				textField = new JTextField();
				textField.setBounds(129, 88, 378, 23);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblNombre = new JLabel("NOMBRE:");
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblNombre.setForeground(new Color(255, 255, 255));
				lblNombre.setBounds(29, 147, 90, 14);
				panel.add(lblNombre);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(129, 145, 378, 23);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblFechaDN = new JLabel("FECHA DE NACIMIENTO");
				lblFechaDN.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblFechaDN.setForeground(new Color(255, 255, 255));
				lblFechaDN.setBounds(29, 198, 150, 32);
				panel.add(lblFechaDN);
			}
			{
				JSpinner spnDia = new JSpinner();
				spnDia.setBounds(98, 231, 69, 20);
				panel.add(spnDia);
			}
			{
				JSpinner spnMes = new JSpinner();
				spnMes.setBounds(98, 259, 69, 20);
				panel.add(spnMes);
			}
			{
				JSpinner spnano = new JSpinner();
				spnano.setBounds(98, 293, 69, 20);
				panel.add(spnano);
			}
			{
				JLabel lblDia = new JLabel("DIA");
				lblDia.setForeground(new Color(255, 255, 255));
				lblDia.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblDia.setBounds(29, 234, 46, 14);
				panel.add(lblDia);
			}
			{
				JLabel lblMes = new JLabel("MES");
				lblMes.setForeground(new Color(255, 255, 255));
				lblMes.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblMes.setBounds(29, 262, 46, 14);
				panel.add(lblMes);
			}
			{
				JLabel lblAno = new JLabel("A\u00D1O");
				lblAno.setForeground(new Color(255, 255, 255));
				lblAno.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblAno.setBounds(29, 296, 46, 14);
				panel.add(lblAno);
			}
			{
				JLabel lblContraseña = new JLabel("CONTRASE\u00D1A");
				lblContraseña.setForeground(new Color(255, 255, 255));
				lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblContraseña.setBounds(236, 207, 117, 14);
				panel.add(lblContraseña);
			}
			{
				txtContrasna = new JTextField();
				txtContrasna.setBounds(236, 231, 271, 23);
				panel.add(txtContrasna);
				txtContrasna.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(25, 25, 112));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Registrar");
				okButton.setEnabled(false);
				okButton.setBackground(new Color(154, 205, 50));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(new Color(255, 140, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
=======
package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class RegistrasU extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JTextField txtGrupo;
	private JTextField txtMatricula;
	private JTextField txtNombre;
	private JTextField txtContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrasU dialog = new RegistrasU();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrasU() {
		setTitle("REGISTRO");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrasU.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 568, 513);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ELIJA SU CATEGORIA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
			panel.setBounds(10, 11, 532, 62);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JRadioButton rdbtnProfesor = new JRadioButton("PROFESOR");
			rdbtnProfesor.setFont(new Font("Tahoma", Font.BOLD, 13));
			rdbtnProfesor.setBackground(new Color(100, 149, 237));
			rdbtnProfesor.setSelected(true);
			rdbtnProfesor.setBounds(115, 17, 107, 23);
			panel.add(rdbtnProfesor);
			
			JRadioButton rdbtnEstudiante = new JRadioButton("ESTUDIANTE");
			rdbtnEstudiante.setFont(new Font("Tahoma", Font.BOLD, 13));
			rdbtnEstudiante.setBackground(new Color(100, 149, 237));
			rdbtnEstudiante.setBounds(292, 17, 107, 23);
			panel.add(rdbtnEstudiante);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "LLENE LOS CAMPOS ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
			panel.setBounds(10, 78, 532, 347);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblID = new JLabel("ID:");
				lblID.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblID.setForeground(new Color(255, 255, 255));
				lblID.setBounds(29, 31, 46, 14);
				panel.add(lblID);
			}
			{
				JTextField txtId = new JTextField();
				txtId.setEditable(false);
				txtId.setBounds(85, 29, 150, 23);
				panel.add(txtId);
				txtId.setColumns(10);
			}
			{
				JLabel lblGrupo = new JLabel("GRUPO:");
				lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblGrupo.setForeground(new Color(255, 255, 255));
				lblGrupo.setBounds(271, 32, 76, 14);
				panel.add(lblGrupo);
			}
			{
				txtGrupo = new JTextField();
				txtGrupo.setEditable(false);
				txtGrupo.setBounds(357, 29, 150, 23);
				panel.add(txtGrupo);
				txtGrupo.setColumns(10);
			}
			{
				JLabel lblMatricula = new JLabel("MATRICULA:");
				lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblMatricula.setForeground(new Color(255, 255, 255));
				lblMatricula.setBounds(29, 86, 90, 23);
				panel.add(lblMatricula);
			}
			{
				txtMatricula = new JTextField();
				txtMatricula.setBounds(129, 88, 378, 23);
				panel.add(txtMatricula);
				txtMatricula.setColumns(10);
			}
			{
				JLabel lblNombre = new JLabel("NOMBRE:");
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblNombre.setForeground(new Color(255, 255, 255));
				lblNombre.setBounds(29, 147, 90, 14);
				panel.add(lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(129, 145, 378, 23);
				panel.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				JLabel lblFechaDN = new JLabel("FECHA DE NACIMIENTO");
				lblFechaDN.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblFechaDN.setForeground(new Color(255, 255, 255));
				lblFechaDN.setBounds(29, 198, 150, 32);
				panel.add(lblFechaDN);
			}
			{
				JSpinner spnFechaDeNacimiento = new JSpinner();
				spnFechaDeNacimiento.setModel(new SpinnerDateModel(new Date(1648612800000L), null, null, Calendar.DAY_OF_YEAR));
				spnFechaDeNacimiento.setBounds(29, 231, 150, 23);
				panel.add(spnFechaDeNacimiento);
			}
			{
				JLabel lblContraseña = new JLabel("CONTRASE\u00D1A");
				lblContraseña.setForeground(new Color(255, 255, 255));
				lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblContraseña.setBounds(236, 207, 117, 14);
				panel.add(lblContraseña);
			}
			{
				txtContrasena = new JTextField();
				txtContrasena.setBounds(236, 231, 271, 23);
				panel.add(txtContrasena);
				txtContrasena.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(25, 25, 112));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Registrar");
				okButton.setEnabled(false);
				okButton.setBackground(new Color(154, 205, 50));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(new Color(255, 140, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

