package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.CentroEstudios;
import logico.Cilindro;
import logico.Cono;
import logico.Cuadrado;
import logico.Esfera;
import logico.Prisma;
import logico.Rectangulo;
import logico.Usuarios;

import javax.swing.JRadioButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Regfigura extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JRadioButton rbtnCubo;
	private JRadioButton rbtnRectangulo;
	private JRadioButton rbtnCono;
	private JRadioButton rbtnEsfera;
	private JRadioButton rbtnCilindro;
	private JPanel PanelCubo;
	private JSpinner spnAlturaCubo;
	private JTextField txtBusqueda;
	private JTextField txtNombusqueda;
	private JTextField txtMatbusqueda;
	private JSpinner spnBaseCubo;
	private JSpinner spnProfundidadCubo;
	private JPanel panelCono;
	private JLabel lblNewLabel_6;
	private JSpinner spnAlturaCono;
	private JLabel lblNewLabel_7;
	private JSpinner spnBaseCono;
	private JPanel panelEsfera;
	private JLabel lblNewLabel_8;
	private JSpinner spnDiametro;
	private JButton btnCancelar;
	private JButton btnBuscar;
	private JButton btnCrear;
	private JButton btnSalir;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Regfigura dialog = new Regfigura();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Create the dialog.
	 */
	public Regfigura() {
		setTitle("Crear Figuras");
		setBounds(100, 100, 589, 458);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelFigura = new JPanel();
			panelFigura.setBorder(new TitledBorder(null, "Figuras:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelFigura.setBounds(0, 182, 567, 80);
			contentPanel.add(panelFigura);
			panelFigura.setLayout(null);
			{
				rbtnCubo = new JRadioButton("Cubo");
				rbtnCubo.setEnabled(false);
				rbtnCubo.setSelected(true);
				rbtnCubo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(rbtnCubo.isSelected()) {
							rbtnCubo.setSelected(true);
							rbtnRectangulo.setSelected(false);
							rbtnCono.setSelected(false);
							rbtnEsfera.setSelected(false);
							rbtnCilindro.setSelected(false);
							PanelCubo.setVisible(true);
							panelCono.setVisible(false);
							panelEsfera.setVisible(false);
							
						}
					}
				});
				rbtnCubo.setBounds(6, 30, 67, 23);
				panelFigura.add(rbtnCubo);
			}
			{
				rbtnRectangulo = new JRadioButton("Rectangulo");
				rbtnRectangulo.setEnabled(false);
				rbtnRectangulo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbtnRectangulo.setSelected(true);
						rbtnCubo.setSelected(false);
						rbtnCono.setSelected(false);
						rbtnEsfera.setSelected(false);
						rbtnCilindro.setSelected(false);	
						PanelCubo.setVisible(true);
						panelCono.setVisible(false);
						panelEsfera.setVisible(false);
					}
				});
				rbtnRectangulo.setBounds(117, 30, 97, 23);
				panelFigura.add(rbtnRectangulo);
			}
			{
				rbtnCono = new JRadioButton("Cono");
				rbtnCono.setEnabled(false);
				rbtnCono.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbtnCono.setSelected(true);
						rbtnCubo.setSelected(false);
						rbtnRectangulo.setSelected(false);
						rbtnEsfera.setSelected(false);
						rbtnCilindro.setSelected(false);
						panelCono.setVisible(true);
						PanelCubo.setVisible(false);
						panelEsfera.setVisible(false);
						
					}
				});
				rbtnCono.setBounds(252, 30, 85, 23);
				panelFigura.add(rbtnCono);
			}
			{
				rbtnEsfera = new JRadioButton("Esfera");
				rbtnEsfera.setEnabled(false);
				rbtnEsfera.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbtnEsfera.setSelected(true);	
						rbtnCubo.setSelected(false);
						rbtnRectangulo.setSelected(false);
						rbtnCono.setSelected(false);
						rbtnCilindro.setSelected(false);
						panelEsfera.setVisible(true);
						panelCono.setVisible(false);
						PanelCubo.setVisible(false);
					}
				});
				rbtnEsfera.setBounds(356, 30, 85, 23);
				panelFigura.add(rbtnEsfera);
			}
			{
				rbtnCilindro = new JRadioButton("Cilindro");
				rbtnCilindro.setEnabled(false);
				rbtnCilindro.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbtnCilindro.setSelected(true);
						rbtnCubo.setSelected(false);
						rbtnRectangulo.setSelected(false);
						rbtnCono.setSelected(false);
						rbtnEsfera.setSelected(false);
						panelCono.setVisible(true);
						PanelCubo.setVisible(false);
						panelEsfera.setVisible(false);
					}
				});
				rbtnCilindro.setBounds(476, 30, 85, 23);
				panelFigura.add(rbtnCilindro);
			}
		}
		{
			PanelCubo = new JPanel();
			PanelCubo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			PanelCubo.setBounds(0, 273, 567, 99);
			contentPanel.add(PanelCubo);
			PanelCubo.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Altura:");
				lblNewLabel.setBounds(10, 11, 58, 14);
				PanelCubo.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Base:");
				lblNewLabel_1.setBounds(230, 11, 58, 14);
				PanelCubo.add(lblNewLabel_1);
			}
			
			spnAlturaCubo = new JSpinner();
			spnAlturaCubo.setEnabled(false);
			spnAlturaCubo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnAlturaCubo.setBounds(10, 36, 86, 20);
			PanelCubo.add(spnAlturaCubo);
			
			spnBaseCubo = new JSpinner();
			spnBaseCubo.setEnabled(false);
			spnBaseCubo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnBaseCubo.setBounds(230, 36, 86, 20);
			PanelCubo.add(spnBaseCubo);
			
			JLabel lblNewLabel_2 = new JLabel("Profundidad:");
			lblNewLabel_2.setBounds(418, 11, 73, 14);
			PanelCubo.add(lblNewLabel_2);
			
			spnProfundidadCubo = new JSpinner();
			spnProfundidadCubo.setEnabled(false);
			spnProfundidadCubo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnProfundidadCubo.setBounds(418, 36, 86, 20);
			PanelCubo.add(spnProfundidadCubo);
		}
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuario:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelUsuario.setBounds(0, 0, 557, 171);
		contentPanel.add(panelUsuario);
		panelUsuario.setLayout(null);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(359, 33, 188, 20);
		panelUsuario.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_3.setBounds(474, 11, 73, 14);
		panelUsuario.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setBounds(10, 33, 102, 14);
		panelUsuario.add(lblNewLabel_4);
		
		txtNombusqueda = new JTextField();
		txtNombusqueda.setEditable(false);
		txtNombusqueda.setBounds(10, 58, 289, 20);
		panelUsuario.add(txtNombusqueda);
		txtNombusqueda.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Matricula:");
		lblNewLabel_5.setBounds(10, 89, 73, 14);
		panelUsuario.add(lblNewLabel_5);
		
		txtMatbusqueda = new JTextField();
		txtMatbusqueda.setEditable(false);
		txtMatbusqueda.setBounds(10, 114, 289, 20);
		panelUsuario.add(txtMatbusqueda);
		txtMatbusqueda.setColumns(10);
		
		btnBuscar = new JButton("Aceptar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contrasenaTemp= txtBusqueda.getText();
				Usuarios usuario= null;
				
				for (Usuarios userr : CentroEstudios.getInstance().getMisUsuarios()) {
					if(userr.getContraseña().equalsIgnoreCase(contrasenaTemp)) {
						txtNombusqueda.setText(userr.getNombre());
						txtMatbusqueda.setText(userr.getMatricula());
						rbtnCubo.setEnabled(true);
						rbtnRectangulo.setEnabled(true);
						rbtnCono.setEnabled(true);
						rbtnEsfera.setEnabled(true);
						rbtnCilindro.setEnabled(true);
						spnAlturaCubo.setEnabled(true);
						spnBaseCubo.setEnabled(true);
						spnProfundidadCubo.setEnabled(true);
					}else {
						txtNombusqueda.setText("");
						txtMatbusqueda.setText("");
						rbtnCubo.setEnabled(false);
						rbtnRectangulo.setEnabled(false);
						rbtnCono.setEnabled(false);
						rbtnEsfera.setEnabled(false);
						rbtnCilindro.setEnabled(false);
						spnAlturaCubo.setEnabled(false);
						spnBaseCubo.setEnabled(false);
						spnProfundidadCubo.setEnabled(false);
						JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Informacion", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		btnBuscar.setBounds(458, 64, 89, 23);
		panelUsuario.add(btnBuscar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombusqueda.setText("");
				txtMatbusqueda.setText("");
				rbtnCubo.setEnabled(false);
				rbtnRectangulo.setEnabled(false);
				rbtnCono.setEnabled(false);
				rbtnEsfera.setEnabled(false);
				rbtnCilindro.setEnabled(false);
				spnAlturaCubo.setEnabled(false);
				spnBaseCubo.setEnabled(false);
				spnProfundidadCubo.setEnabled(false);
			}
		});
		btnSalir.setBounds(359, 64, 89, 23);
		panelUsuario.add(btnSalir);
		
		panelCono = new JPanel();
		panelCono.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCono.setBounds(0, 273, 567, 99);
		contentPanel.add(panelCono);
		panelCono.setLayout(null);
		
		lblNewLabel_6 = new JLabel("Altura:");
		lblNewLabel_6.setSize(58, 14);
		lblNewLabel_6.setLocation(10, 11);
		panelCono.add(lblNewLabel_6);
		
		spnAlturaCono = new JSpinner();
		spnAlturaCono.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnAlturaCono.setBounds(10, 36, 86, 20);
		panelCono.add(spnAlturaCono);
		
		lblNewLabel_7 = new JLabel("Base:");
		lblNewLabel_7.setBounds(230, 11, 58, 14);
		panelCono.add(lblNewLabel_7);
		
		spnBaseCono = new JSpinner();
		spnBaseCono.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnBaseCono.setBounds(230, 36, 86, 20);
		panelCono.add(spnBaseCono);
		
		panelEsfera = new JPanel();
		panelEsfera.setBounds(0, 273, 567, 99);
		contentPanel.add(panelEsfera);
		panelEsfera.setLayout(null);
		
		lblNewLabel_8 = new JLabel("Diametro:");
		lblNewLabel_8.setSize(73, 14);
		lblNewLabel_8.setLocation(10, 11);
		panelEsfera.add(lblNewLabel_8);
		
		spnDiametro = new JSpinner();
		spnDiametro.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnDiametro.setBounds(10, 36, 86, 20);
		panelEsfera.add(spnDiametro);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnCrear = new JButton("Crear");
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Prisma prisma= null;
						
						if(rbtnCubo.isSelected()) {
							float altura= Float.valueOf(spnAlturaCubo.getValue().toString());
							float base= Float.valueOf(spnBaseCubo.getValue().toString());
							float profundidad= Float.valueOf(spnProfundidadCubo.getValue().toString());
							if(altura== base) {
								prisma= new Cuadrado (altura, base, profundidad);
								CentroEstudios.getInstance().setTamCubo(altura);
								cubo cubox = new cubo();
								cubox.setModal(true);
								cubox.setVisible(true);
							}else {
								JOptionPane.showMessageDialog(null, "Base y altura deben ser iguales", "Informacion", JOptionPane.INFORMATION_MESSAGE);
							}
							
						}
						
						if(rbtnRectangulo.isSelected()) {
							float altura= Float.valueOf(spnAlturaCubo.getValue().toString());
							float base= Float.valueOf(spnBaseCubo.getValue().toString());
							float profundidad= Float.valueOf(spnProfundidadCubo.getValue().toString());	
							prisma= new Rectangulo(altura, base, profundidad);
						}
						
						if(rbtnCono.isSelected()) {
							float altura= Float.valueOf(spnAlturaCono.getValue().toString());
							float base= Float.valueOf(spnBaseCono.getValue().toString());
							prisma= new Cono(altura, base);
						}
						
						if(rbtnCilindro.isSelected()) {
							float altura= Float.valueOf(spnAlturaCono.getValue().toString());
							float base= Float.valueOf(spnBaseCono.getValue().toString());
							prisma= new Cilindro(altura, base);
						}
						
						if(rbtnEsfera.isSelected()) {
							float diametro= Float.valueOf(spnDiametro.getValue().toString());
							prisma= new Esfera(diametro);
						}
						
						
						CentroEstudios.getInstance().insertarPrisma(prisma);
						CentroEstudios.getInstance().insertarPrismaUsuario(txtMatbusqueda.getText(), prisma);
						Limpiar();
					}
				});
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
					
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
	private void Limpiar() {
		
		spnAlturaCubo.setValue(new Float(0.0));
		spnBaseCubo.setValue(new Float(0.0));
		spnProfundidadCubo.setValue(new Float(0.0));
		spnAlturaCono.setValue(new Float(0.0));
		spnBaseCono.setValue(new Float(0.0));
		spnDiametro.setValue(new Float(0.0));
		
	}
}
