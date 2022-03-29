package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class IngresarU extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JTextField suario;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			IngresarU dialog = new IngresarU();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public IngresarU() {
		setTitle("INGRESAR ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(IngresarU.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 543, 295);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBounds(10, 11, 507, 196);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblUsuario = new JLabel("MATRICULA :");
				lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblUsuario.setForeground(new Color(255, 255, 255));
				lblUsuario.setBounds(10, 29, 122, 14);
				panel.add(lblUsuario);
			}
			
			suario = new JTextField();
			suario.setBounds(23, 56, 295, 23);
			panel.add(suario);
			suario.setColumns(10);
			
			JLabel lblContraseña = new JLabel("CONTRESE\u00D1A");
			lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblContraseña.setForeground(new Color(255, 255, 255));
			lblContraseña.setBounds(10, 99, 243, 14);
			panel.add(lblContraseña);
			
			textField = new JTextField();
			textField.setBounds(23, 126, 295, 23);
			panel.add(textField);
			textField.setColumns(10);
			{
				JLabel lblFondo = new JLabel("");
				lblFondo.setIcon(new ImageIcon(IngresarU.class.getResource("/imagenes/icono.png")));
				lblFondo.setBounds(0, 0, 507, 196);
				panel.add(lblFondo);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(25, 25, 112));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Ingresar");
				okButton.setBackground(new Color(154, 205, 50));
				okButton.setEnabled(false);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(new Color(255, 69, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
