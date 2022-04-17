package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Triangulo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Triangulo dialog = new Triangulo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Triangulo() {
		setTitle("Crear Triangulo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Triangulo.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 493, 462);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Crear Triangulo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("VerticeBX:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBounds(10, 45, 66, 14);
			panel.add(lblNewLabel);
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(80, 42, 172, 20);
			panel.add(spinner);
			
			JLabel lblVerticeby = new JLabel("VerticeBY:");
			lblVerticeby.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblVerticeby.setForeground(new Color(255, 255, 255));
			lblVerticeby.setBounds(10, 85, 66, 14);
			panel.add(lblVerticeby);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setBounds(80, 82, 172, 20);
			panel.add(spinner_1);
			
			JLabel lblNewLabel_1 = new JLabel("Altura:");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setBounds(10, 133, 54, 14);
			panel.add(lblNewLabel_1);
			
			JSpinner spinner_1_1 = new JSpinner();
			spinner_1_1.setBounds(80, 130, 172, 20);
			panel.add(spinner_1_1);
			
			JButton btncalcularRepresentar = new JButton("Calcular/Representar");
			btncalcularRepresentar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				
					
				}
			});
			btncalcularRepresentar.setBounds(295, 45, 144, 102);
			panel.add(btncalcularRepresentar);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	@Override
	public void paint (Graphics g) {
		
		super.paint(g);
		int[] puntosx = {200,100,300};
		int[] puntosy = {200,600,600};
		g.fillPolygon(puntosx, puntosy, 3);
	}
	
	
}
