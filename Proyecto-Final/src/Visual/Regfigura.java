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
import java.awt.Toolkit;
import java.awt.Font;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Regfigura.class.getResource("/imagenes/icono.png")));
		setTitle("Crear Figuras");
		setBounds(100, 100, 593, 457);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelFigura = new JPanel();
			panelFigura.setBackground(new Color(0, 0, 0));
			panelFigura.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Figuras:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
			panelFigura.setBounds(10, 182, 557, 80);
			contentPanel.add(panelFigura);
			panelFigura.setLayout(null);
			{
				rbtnCubo = new JRadioButton("Cuadrado");
				rbtnCubo.setBackground(new Color(0, 0, 0));
				rbtnCubo.setForeground(new Color(255, 255, 255));
				rbtnCubo.setFont(new Font("Tahoma", Font.BOLD, 11));
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
				rbtnCubo.setBounds(26, 30, 86, 23);
				panelFigura.add(rbtnCubo);
			}
			{
				rbtnRectangulo = new JRadioButton("Rectangulo");
				rbtnRectangulo.setBackground(new Color(0, 0, 0));
				rbtnRectangulo.setForeground(new Color(255, 255, 255));
				rbtnRectangulo.setFont(new Font("Tahoma", Font.BOLD, 11));
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
				rbtnRectangulo.setBounds(125, 30, 106, 23);
				panelFigura.add(rbtnRectangulo);
			}
			{
				rbtnCono = new JRadioButton("Triangulo");
				rbtnCono.setBackground(new Color(0, 0, 0));
				rbtnCono.setForeground(new Color(255, 255, 255));
				rbtnCono.setFont(new Font("Tahoma", Font.BOLD, 11));
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
				rbtnCono.setBounds(233, 30, 106, 23);
				panelFigura.add(rbtnCono);
			}
			{
				rbtnEsfera = new JRadioButton("Esfera");
				rbtnEsfera.setBackground(new Color(0, 0, 0));
				rbtnEsfera.setForeground(new Color(255, 255, 255));
				rbtnEsfera.setFont(new Font("Tahoma", Font.BOLD, 11));
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
				rbtnEsfera.setBounds(341, 30, 86, 23);
				panelFigura.add(rbtnEsfera);
			}
			{
				rbtnCilindro = new JRadioButton("Cilindro");
				rbtnCilindro.setForeground(new Color(255, 255, 255));
				rbtnCilindro.setBackground(new Color(0, 0, 0));
				rbtnCilindro.setFont(new Font("Tahoma", Font.BOLD, 11));
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
				rbtnCilindro.setBounds(429, 30, 96, 23);
				panelFigura.add(rbtnCilindro);
			}
		}
		{
			PanelCubo = new JPanel();
			PanelCubo.setBackground(Color.BLACK);
			PanelCubo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			PanelCubo.setBounds(10, 273, 557, 99);
			contentPanel.add(PanelCubo);
			PanelCubo.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Altura:");
				lblNewLabel.setForeground(Color.WHITE);
				lblNewLabel.setBounds(20, 11, 58, 14);
				PanelCubo.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("VerticeX:");
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setBounds(200, 11, 58, 14);
				PanelCubo.add(lblNewLabel_1);
			}
			
			spnAltura = new JSpinner();
			spnAltura.setEnabled(false);
			spnAltura.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnAltura.setBounds(20, 36, 100, 23);
			PanelCubo.add(spnAltura);
			
			spnVerticex = new JSpinner();
			spnVerticex.setEnabled(false);
			spnVerticex.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnVerticex.setBounds(200, 36, 100, 23);
			PanelCubo.add(spnVerticex);
			
			JLabel lblNewLabel_2 = new JLabel("VerticeY:");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(390, 11, 73, 14);
			PanelCubo.add(lblNewLabel_2);
			
			spnVerticey = new JSpinner();
			spnVerticey.setEnabled(false);
			spnVerticey.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
			spnVerticey.setBounds(390, 36, 100, 23);
			PanelCubo.add(spnVerticey);
		}
		
		JPanel panelUsuario = new JPanel();
		panelUsuario.setBackground(new Color(0, 0, 0));
		panelUsuario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuario:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(100, 149, 237)));
		panelUsuario.setBounds(10, 11, 557, 160);
		contentPanel.add(panelUsuario);
		panelUsuario.setLayout(null);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(340, 68, 188, 23);
		panelUsuario.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(371, 33, 130, 14);
		panelUsuario.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 33, 102, 14);
		panelUsuario.add(lblNewLabel_4);
		
		txtNombusqueda = new JTextField();
		txtNombusqueda.setEditable(false);
		txtNombusqueda.setBounds(10, 58, 289, 23);
		panelUsuario.add(txtNombusqueda);
		txtNombusqueda.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Matricula:");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(10, 89, 89, 14);
		panelUsuario.add(lblNewLabel_5);
		
		txtMatbusqueda = new JTextField();
		txtMatbusqueda.setEditable(false);
		txtMatbusqueda.setBounds(10, 114, 289, 23);
		panelUsuario.add(txtMatbusqueda);
		txtMatbusqueda.setColumns(10);
		
		btnBuscar = new JButton("Aceptar");
		btnBuscar.setBackground(new Color(0, 255, 0));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contrasenaTemp= txtBusqueda.getText();
				//Usuarios usuario= null;
				
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
						txtBusqueda.setText("");
						txtBusqueda.requestFocus();
					}
				}
			}
		});
		btnBuscar.setBounds(439, 114, 89, 23);
		panelUsuario.add(btnBuscar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(255, 165, 0));
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
		btnSalir.setBounds(340, 114, 89, 23);
		panelUsuario.add(btnSalir);
		
		panelTriangulo = new JPanel();
		panelTriangulo.setBackground(Color.BLACK);
		panelTriangulo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTriangulo.setBounds(10, 273, 557, 99);
		contentPanel.add(panelTriangulo);
		panelTriangulo.setLayout(null);
		
		lblNewLabel_6 = new JLabel("VerticeX:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setSize(58, 14);
		lblNewLabel_6.setLocation(20, 11);
		panelTriangulo.add(lblNewLabel_6);
		
		spnverticeXTriangulo = new JSpinner();
		spnverticeXTriangulo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnverticeXTriangulo.setBounds(20, 36, 100, 23);
		panelTriangulo.add(spnverticeXTriangulo);
		
		lblNewLabel_7 = new JLabel("VerticeY");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(200, 11, 58, 14);
		panelTriangulo.add(lblNewLabel_7);
		
		spnverticeYTriangulo = new JSpinner();
		spnverticeYTriangulo.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnverticeYTriangulo.setBounds(200, 36, 100, 23);
		panelTriangulo.add(spnverticeYTriangulo);
		
		JLabel lblNewLabel_9 = new JLabel("Altura:");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(390, 11, 73, 14);
		panelTriangulo.add(lblNewLabel_9);
		
		spnAlturatriangulo = new JSpinner();
		spnAlturatriangulo.setBounds(390, 36, 100, 23);
		panelTriangulo.add(spnAlturatriangulo);
		
		panelEsfera = new JPanel();
		panelEsfera.setBackground(new Color(0, 0, 0));
		panelEsfera.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEsfera.setBounds(10, 273, 557, 99);
		contentPanel.add(panelEsfera);
		panelEsfera.setLayout(null);
		
		lblNewLabel_8 = new JLabel("Diametro:");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setSize(73, 14);
		lblNewLabel_8.setLocation(20, 11);
		panelEsfera.add(lblNewLabel_8);
		
		spnDiametro = new JSpinner();
		spnDiametro.setModel(new SpinnerNumberModel(new Float(0), new Float(0), null, new Float(1)));
		spnDiametro.setBounds(20, 36, 100, 23);
		panelEsfera.add(spnDiametro);
		
		JPanel panelRectangulo = new JPanel();
		panelRectangulo.setBackground(new Color(0, 0, 0));
		panelRectangulo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelRectangulo.setBounds(10, 273, 557, 99);
		contentPanel.add(panelRectangulo);
		panelRectangulo.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("VerticeX:");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(20, 11, 80, 14);
		panelRectangulo.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("VerticeY:");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setBounds(200, 11, 80, 14);
		panelRectangulo.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBounds(390, 11, 80, 14);
		panelRectangulo.add(lblNewLabel_12);
		
		spnverticexRectangulo = new JSpinner();
		spnverticexRectangulo.setBounds(20, 36, 100, 23);
		panelRectangulo.add(spnverticexRectangulo);
		
		spnverticeyRectangulo = new JSpinner();
		spnverticeyRectangulo.setBounds(200, 36, 100, 23);
		panelRectangulo.add(spnverticeyRectangulo);
		
		spnalturaRectangulo = new JSpinner();
		spnalturaRectangulo.setBounds(390, 36, 100, 23);
		panelRectangulo.add(spnalturaRectangulo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setForeground(new Color(0, 0, 0));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnCrear = new JButton("Crear");
				btnCrear.setBackground(new Color(0, 255, 0));
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
						//CentroEstudios.getInstance().insertarPrismaUsuario(txtMatbusqueda.getText(), prisma);
						JOptionPane.showMessageDialog(null, "Registro Exitoso", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						Limpiar();
					}
				});
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setBackground(new Color(255, 165, 0));
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
