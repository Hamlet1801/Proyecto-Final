package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearGrupo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrearGrupo dialog = new CrearGrupo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearGrupo() {
		setModal(true);
		setTitle("Crear Grupo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearGrupo.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 698, 542);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 662, 448);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Grupo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(340, 45, 148, 33);
		panel.add(lblTitulo);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(196, 25, 105, 83);
		ImageIcon Icon = new ImageIcon(getClass().getResource("/imagenes/trabajo-en-equipo.png" ));
		ImageIcon img = new ImageIcon(Icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH));
		lblIcon.setIcon(img);
		panel.add(lblIcon);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(71, 140, 99, 33);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(225, 147, 376, 23);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setForeground(new Color(255, 255, 255));
		lblProfesor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProfesor.setBounds(71, 210, 117, 33);
		panel.add(lblProfesor);
		
		textField = new JTextField();
		textField.setBounds(225, 217, 376, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblEstudiantes = new JLabel("Estudiantes");
		lblEstudiantes.setForeground(new Color(255, 255, 255));
		lblEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstudiantes.setBounds(71, 301, 105, 14);
		panel.add(lblEstudiantes);
		
		JButton btnListaDeEstudiantes = new JButton("Lista De estudiantes");
		btnListaDeEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListEstudiantes lE = new ListEstudiantes();
				lE.setModal(true);
				lE.setVisible(true);
			}
		});
		btnListaDeEstudiantes.setBackground(new Color(135, 206, 235));
		btnListaDeEstudiantes.setForeground(new Color(0, 0, 0));
		btnListaDeEstudiantes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnListaDeEstudiantes.setBounds(44, 349, 156, 41);
		panel.add(btnListaDeEstudiantes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(225, 278, 376, 144);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 356, 122);
		panel_1.add(scrollPane);
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Crear");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
