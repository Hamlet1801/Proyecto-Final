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
import logico.Triangulo;
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
	private JSpinner spnAltura;
	private JTextField txtBusqueda;
	private JTextField txtNombusqueda;
	private JTextField txtMatbusqueda;
	private JSpinner spnVerticex;
	private JSpinner spnVerticey;
	private JPanel panelTriangulo;
	private JLabel lblNewLabel_6;
	private JSpinner spnverticeXTriangulo;
	private JLabel lblNewLabel_7;
	private JSpinner spnverticeYTriangulo;
	private JPanel panelEsfera;
	private JLabel lblNewLabel_8;
	private JSpinner spnDiametro;
	private JButton btnCancelar;
	private JButton btnBuscar;
	private JButton btnCrear;
	private JButton btnSalir;
	private JSpinner spnAlturatriangulo;
	private JSpinner spnverticexRectangulo;
	private JSpinner spnverticeyRectangulo;
	private JSpinner spnalturaRectangulo;

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
				rbtnCubo = new JRadioButton("Cuadrado");
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
							panelTriangulo.setVisible(false);
							panelEsfera.setVisible(false);
							
						}
					}
				});
				rbtnCubo.setBounds(6, 30, 85, 23);
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
						panelTriangulo.setVisible(false);
						panelEsfera.setVisible(false);
					}
				});
				rbtnRectangulo.setBounds(117, 30, 97, 23);
				panelFigura.add(rbtnRectangulo);
			}
			{
				rbtnCono = new JRadioButton("Triangulo");
				rbtnCono.setEnabled(false);
				rbtnCono.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rbtnCono.setSelected(true);
						rbtnCubo.setSelected(false);
						rbtnRectangulo.setSelected(false);
						rbtnEsfera.setSelected(false);
						rbtnCilindro.setSelected(false);
						panelTriangulo.setVisible(true);
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
						panelTriangulo.setVisible(false);
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
						panelTriangulo.setVisible(true);
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
				JLabel lblNewLabel_1 = new JLabel("VerticeX:");
				lblNewLabel_1.setBounds(230, 11, 58, 14);
				PanelCubo.add(lblNewLabel_1);
			}
			
			spnAltura = new JSpinner();
			spnAltura.setEnabled(false);
			spnAltura.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnAltura.setBounds(10, 36, 86, 20);
			PanelCubo.add(spnAltura);
			
			spnVerticex = new JSpinner();
			spnVerticex.setEnabled(false);
			spnVerticex.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnVerticex.setBounds(230, 36, 86, 20);
			PanelCubo.add(spnVerticex);
			
			JLabel lblNewLabel_2 = new JLabel("VerticeY:");
			lblNewLabel_2.setBounds(418, 11, 73, 14);
			PanelCubo.add(lblNewLabel_2);
			
			spnVerticey = new JSpinner();
			spnVerticey.setEnabled(false);
			spnVerticey.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnVerticey.setBounds(418, 36, 86, 20);
			PanelCubo.add(spnVerticey);
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
						spnAltura.setEnabled(true);
						spnVerticex.setEnabled(true);
						spnVerticey.setEnabled(true);
					}else {
						txtNombusqueda.setText("");
						txtMatbusqueda.setText("");
						rbtnCubo.setEnabled(false);
						rbtnRectangulo.setEnabled(false);
						rbtnCono.setEnabled(false);
						rbtnEsfera.setEnabled(false);
						rbtnCilindro.setEnabled(false);
						spnAltura.setEnabled(false);
						spnVerticex.setEnabled(false);
						spnVerticey.setEnabled(false);
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
				spnAltura.setEnabled(false);
				spnVerticex.setEnabled(false);
				spnVerticey.setEnabled(false);
			}
		});
		btnSalir.setBounds(359, 64, 89, 23);
		panelUsuario.add(btnSalir);
		
		panelTriangulo = new JPanel();
		panelTriangulo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTriangulo.setBounds(0, 273, 567, 99);
		contentPanel.add(panelTriangulo);
		panelTriangulo.setLayout(null);
		
		lblNewLabel_6 = new JLabel("VerticeX:");
		lblNewLabel_6.setSize(58, 14);
		lblNewLabel_6.setLocation(10, 11);
		panelTriangulo.add(lblNewLabel_6);
		
		spnverticeXTriangulo = new JSpinner();
		spnverticeXTriangulo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnverticeXTriangulo.setBounds(10, 36, 86, 20);
		panelTriangulo.add(spnverticeXTriangulo);
		
		lblNewLabel_7 = new JLabel("VerticeY");
		lblNewLabel_7.setBounds(230, 11, 58, 14);
		panelTriangulo.add(lblNewLabel_7);
		
		spnverticeYTriangulo = new JSpinner();
		spnverticeYTriangulo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnverticeYTriangulo.setBounds(230, 36, 86, 20);
		panelTriangulo.add(spnverticeYTriangulo);
		
		JLabel lblNewLabel_9 = new JLabel("Altura:");
		lblNewLabel_9.setBounds(418, 11, 73, 14);
		panelTriangulo.add(lblNewLabel_9);
		
		spnAlturatriangulo = new JSpinner();
		spnAlturatriangulo.setBounds(418, 36, 86, 20);
		panelTriangulo.add(spnAlturatriangulo);
		
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
		
		JPanel panelRectangulo = new JPanel();
		panelRectangulo.setBounds(0, 273, 567, 99);
		contentPanel.add(panelRectangulo);
		panelRectangulo.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("VerticeX:");
		lblNewLabel_10.setBounds(10, 11, 80, 14);
		panelRectangulo.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("VerticeY:");
		lblNewLabel_11.setBounds(230, 11, 80, 14);
		panelRectangulo.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(418, 11, 80, 14);
		panelRectangulo.add(lblNewLabel_12);
		
		spnverticexRectangulo = new JSpinner();
		spnverticexRectangulo.setBounds(10, 36, 86, 20);
		panelRectangulo.add(spnverticexRectangulo);
		
		spnverticeyRectangulo = new JSpinner();
		spnverticeyRectangulo.setBounds(230, 36, 86, 20);
		panelRectangulo.add(spnverticeyRectangulo);
		
		spnalturaRectangulo = new JSpinner();
		spnalturaRectangulo.setBounds(418, 36, 86, 20);
		panelRectangulo.add(spnalturaRectangulo);
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
							float altura= Float.valueOf(spnAltura.getValue().toString());
							float base= Float.valueOf(spnVerticex.getValue().toString());
							float profundidad= Float.valueOf(spnVerticey.getValue().toString());
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
							float verticex= Float.valueOf(spnverticexRectangulo.getValue().toString());
							float verticey= Float.valueOf(spnverticeyRectangulo.getValue().toString());
							float altura= Float.valueOf(spnalturaRectangulo.getValue().toString());	
							prisma= new Rectangulo(verticex, verticey, altura);
						}
						
						if(rbtnCono.isSelected()) {
							float verticex= Float.valueOf(spnverticeXTriangulo.getValue().toString());
							float verticey= Float.valueOf(spnverticeYTriangulo.getValue().toString());
							float altura1 =  Float.valueOf(spnAlturatriangulo.getValue().toString());
							prisma= new Triangulo(verticex,verticey,altura1);
						}
						
						if(rbtnCilindro.isSelected()) {
							float altura= Float.valueOf(spnverticeXTriangulo.getValue().toString());
							float base= Float.valueOf(spnverticeYTriangulo.getValue().toString());
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
		
		spnAltura.setValue(new Float(0.0));
		spnVerticex.setValue(new Float(0.0));
		spnVerticey.setValue(new Float(0.0));
		spnverticeXTriangulo.setValue(new Float(0.0));
		spnverticeYTriangulo.setValue(new Float(0.0));
		spnDiametro.setValue(new Float(0.0));
		
	}
}
