package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class CrearFigura extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                     Figuras");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 424, 42);
		panel.add(lblNewLabel);
		
		JButton btnCuadrado = new JButton("Cuadrado");
		btnCuadrado.setBounds(10, 70, 119, 117);
		panel.add(btnCuadrado);
		
		JButton btnTriangulo = new JButton("Triangulo");
		btnTriangulo.setBounds(158, 70, 107, 117);
		panel.add(btnTriangulo);
		
		JButton btnRectangulo = new JButton("Rectangulo");
		btnRectangulo.setBounds(307, 70, 107, 117);
		panel.add(btnRectangulo);
		
		JButton btnRombo = new JButton("Rombo");
		btnRombo.setBounds(10, 241, 107, 117);
		panel.add(btnRombo);
		
		JButton btnTrapecio = new JButton("Trapecio");
		btnTrapecio.setBounds(307, 241, 107, 117);
		panel.add(btnTrapecio);
	}
}
