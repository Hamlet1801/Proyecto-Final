package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearFigura extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearFigura frame = new CrearFigura();
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
	public CrearFigura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearFigura.class.getResource("/imagenes/icono.png")));
		setTitle("Crear Figura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 526);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 112));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 11, 606, 465);
		contentPane.add(panel);
		
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setBounds(165, 22, 92, 26);
		panel.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(267, 26, 298, 23);
		panel.add(txtUsuario);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(151, 85, 92, 26);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(267, 89, 298, 23);
		panel.add(txtNombre);
		
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(25, 22, 106, 83);
		ImageIcon Icon = new ImageIcon(getClass().getResource("/imagenes/geometria.png" ));
		ImageIcon img = new ImageIcon(Icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH));
		lblIcon.setIcon(img);
		panel.add(lblIcon);
		
		JButton btnRectangulo3Dy2D = new JButton("RECTANGULO 3D/2D");
		btnRectangulo3Dy2D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrearRectangulo cRect = new CrearRectangulo();
				cRect.setVisible(true);
			}
		});
		btnRectangulo3Dy2D.setBounds(49, 231, 138, 35);
		panel.add(btnRectangulo3Dy2D);
		
		JButton btnCuadrado3D = new JButton("Cuadrado 3D/2D");
		btnCuadrado3D.setBounds(238, 231, 138, 35);
		panel.add(btnCuadrado3D);
		
		JButton btnTriangulo = new JButton("Triangulo 3D/2D");
		btnTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Triangulo3D tri = new Triangulo3D();
				tri.setVisible(true);
				
				
			}
		});
		btnTriangulo.setBounds(427, 231, 138, 35);
		panel.add(btnTriangulo);
	}
}
