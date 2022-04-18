package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.CentroEstudios;

import logico.Triangulo;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SpinnerNumberModel;

public class TrianguloReg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static JLabel lblAreatotalr;
	private static JLabel lblArealateralr;
	private static JLabel lblVolumen;
	private JSpinner spnverticeX;
	private JSpinner spnverticeY;
	private JSpinner spnAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TrianguloReg dialog = new TrianguloReg();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TrianguloReg() {
		setTitle("Crear Triangulo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TrianguloReg.class.getResource("/imagenes/icono.png")));
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
			
			spnverticeX = new JSpinner();
			spnverticeX.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnverticeX.setBounds(80, 42, 172, 20);
			panel.add(spnverticeX);
			
			JLabel lblVerticeby = new JLabel("VerticeBY:");
			lblVerticeby.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblVerticeby.setForeground(new Color(255, 255, 255));
			lblVerticeby.setBounds(10, 85, 66, 14);
			panel.add(lblVerticeby);
			
			spnverticeY = new JSpinner();
			spnverticeY.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnverticeY.setBounds(80, 82, 172, 20);
			panel.add(spnverticeY);
			
			JLabel lblAltura = new JLabel("Altura:");
			lblAltura.setForeground(new Color(255, 255, 255));
			lblAltura.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblAltura.setBounds(10, 133, 54, 14);
			panel.add(lblAltura);
			
			spnAltura = new JSpinner();
			spnAltura.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnAltura.setBounds(80, 130, 172, 20);
			panel.add(spnAltura);
			
			JButton btncalcularRepresentar = new JButton("Calcular/Representar");
			btncalcularRepresentar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				Triangulo aux = null;	 
				float verticex = Float.valueOf(spnverticeX.getValue().toString());
				float verticey = Float.valueOf(spnverticeY.getValue().toString());
				float altura = Float.valueOf(spnAltura.getValue().toString());
				
				lblVolumen.getText().valueOf(verticex);
					
				}
			});
			btncalcularRepresentar.setBounds(295, 45, 144, 102);
			panel.add(btncalcularRepresentar);
			
			JLabel lblNewLabel_2 = new JLabel("Volumen:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBackground(Color.WHITE);
			lblNewLabel_2.setBounds(10, 195, 66, 14);
			panel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Area Lateral:");
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2_1.setBackground(Color.WHITE);
			lblNewLabel_2_1.setBounds(10, 252, 84, 14);
			panel.add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Area Total:");
			lblNewLabel_2_1_1.setForeground(Color.WHITE);
			lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2_1_1.setBackground(Color.WHITE);
			lblNewLabel_2_1_1.setBounds(10, 311, 84, 14);
			panel.add(lblNewLabel_2_1_1);
			
			lblVolumen = new JLabel("");
			lblVolumen.setForeground(Color.WHITE);
			lblVolumen.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblVolumen.setBackground(Color.WHITE);
			lblVolumen.setBounds(97, 195, 84, 14);
			panel.add(lblVolumen);
			
			lblArealateralr = new JLabel("");
			lblArealateralr.setForeground(Color.WHITE);
			lblArealateralr.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblArealateralr.setBackground(Color.WHITE);
			lblArealateralr.setBounds(97, 252, 84, 14);
			panel.add(lblArealateralr);
			
			lblAreatotalr = new JLabel("");
			lblAreatotalr.setForeground(Color.WHITE);
			lblAreatotalr.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblAreatotalr.setBackground(Color.WHITE);
			lblAreatotalr.setBounds(97, 311, 84, 14);
			panel.add(lblAreatotalr);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Triangulo aux = null;
						float verticex = Float.valueOf(spnverticeX.getValue().toString());
						float verticey = Float.valueOf(spnverticeY.getValue().toString());
						float altura = Float.valueOf(spnAltura.getValue().toString());
						
						aux = new Triangulo(verticex,verticey,altura);
						CentroEstudios.getInstance().insertarPrisma(aux);
						JOptionPane.showMessageDialog(null, "Operación exitosa", "Información", JOptionPane.INFORMATION_MESSAGE);
						lblResult();
						
						
					}
				});
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
	
	
	
	public static void lblResult() {

		int i = 0;
		float pre= 0 ;
		
       lblVolumen.setText (pre + " " +CentroEstudios.getInstance().getMisPrismas().get(i).Volumen());
       lblArealateralr.setText(pre + " " +CentroEstudios.getInstance().getMisPrismas().get(i).areaLaterales());
       lblAreatotalr.setText(pre + " " +CentroEstudios.getInstance().getMisPrismas().get(i).areaTotales());
       
       
		
	}
}
