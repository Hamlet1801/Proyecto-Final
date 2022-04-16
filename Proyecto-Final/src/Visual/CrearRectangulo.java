package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearRectangulo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVerticeX;
	private JTextField txtVerticeY;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrearRectangulo dialog = new CrearRectangulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearRectangulo() {
		setTitle("Crear Rectangulo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearRectangulo.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 580, 428);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 544, 329);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				
				JLabel lblVecticeX = new JLabel("Vertice X:");
				lblVecticeX.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblVecticeX.setForeground(new Color(255, 255, 255));
				lblVecticeX.setBounds(20, 33, 106, 29);
				panel.add(lblVecticeX);
			}
			{
				txtVerticeX = new JTextField();
				txtVerticeX.setText("");
				txtVerticeX.setBounds(136, 33, 196, 23);
				panel.add(txtVerticeX);
				txtVerticeX.setColumns(10);
			}
			{
				txtVerticeY = new JTextField();
				txtVerticeY.setFont(new Font("Tahoma", Font.PLAIN, 11));
				txtVerticeY.setBounds(136, 82, 196, 23);
				panel.add(txtVerticeY);
				txtVerticeY.setColumns(10);
			}
			{
				JLabel lblVericeY = new JLabel("Vertice Y:");
				lblVericeY.setForeground(new Color(255, 255, 255));
				lblVericeY.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblVericeY.setBounds(20, 88, 95, 14);
				panel.add(lblVericeY);
			}
			{
				JLabel lblAncho = new JLabel("Ancho;");
				lblAncho.setForeground(new Color(255, 255, 255));
				lblAncho.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblAncho.setBounds(20, 144, 82, 14);
				panel.add(lblAncho);
			}
			{
				textField = new JTextField();
				textField.setBounds(136, 143, 196, 23);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblIcono = new JLabel("New label");
				lblIcono.setBackground(new Color(102, 205, 170));
				
				lblIcono.setBounds(388, 57, 135, 72);
				ImageIcon Icon = new ImageIcon(getClass().getResource("/imagenes/rectangulo (1).png" ));
				ImageIcon img = new ImageIcon(Icon.getImage().getScaledInstance(lblIcono.getWidth(), lblIcono.getHeight(), Image.SCALE_SMOOTH));
				lblIcono.setIcon(img);
				panel.add(lblIcono);
				{
					JButton btnCrear = new JButton("Crear");
					btnCrear.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Rectangulo3D rect = new Rectangulo3D ();
							rect.setVisible(true);
						}
					});
					btnCrear.setBackground(new Color(0, 255, 0));
					btnCrear.setFont(new Font("Tahoma", Font.BOLD, 15));
					btnCrear.setBounds(200, 238, 172, 43);
					panel.add(btnCrear);
				}
				;
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setBackground(Color.ORANGE);
				cancelButton.setFont(new Font("Tahoma", Font.BOLD, 11));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
