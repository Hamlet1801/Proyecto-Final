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

public class Triangulo3D extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel Pnltriangulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Triangulo3D dialog = new Triangulo3D();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Triangulo3D() {
		setBounds(100, 100, 493, 462);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Crear Triangulo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			{
				
				
				Pnltriangulo = new JPanel();
				Pnltriangulo.setBorder(new TitledBorder(null, "Figura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				Pnltriangulo.setBounds(10, 189, 230, 167);
				panel.add(Pnltriangulo);
				Pnltriangulo.setLayout(null);
			
				
				
			}
			
			JLabel lblNewLabel = new JLabel("VerticeBX:");
			lblNewLabel.setBounds(10, 45, 66, 14);
			panel.add(lblNewLabel);
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(80, 42, 172, 20);
			panel.add(spinner);
			
			JLabel lblVerticeby = new JLabel("VerticeBY:");
			lblVerticeby.setBounds(10, 85, 66, 14);
			panel.add(lblVerticeby);
			
			JSpinner spinner_1 = new JSpinner();
			spinner_1.setBounds(80, 82, 172, 20);
			panel.add(spinner_1);
			
			JLabel lblNewLabel_1 = new JLabel("Altura:");
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
