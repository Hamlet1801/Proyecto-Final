package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.CentroEstudios;
import logico.Estudiantes;
import logico.Grupo;
import logico.Usuarios;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CrearGrupo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JTextField txtProfesor;
	  private DefaultTableModel model;
		private Object row[];
		 
			private JTable table;
			private JButton btnCrear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrearGrupo dialog = new CrearGrupo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 * Create the dialog.
	 */
	public CrearGrupo() {
		setModal(true);
		setTitle("Crear Grupo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CrearGrupo.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100, 698, 542);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(10, 11, 662, 448);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Crear Grupo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(340, 45, 148, 33);
		panel.add(lblTitulo);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(196, 25, 105, 83);
		ImageIcon Icon = new ImageIcon(getClass().getResource("/imagenes/trabajo-en-equipo.png" ));
		ImageIcon img = new ImageIcon(Icon.getImage().getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH));
		lblIcon.setIcon(img);
		panel.add(lblIcon);
		
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setBounds(71, 140, 99, 33);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(225, 147, 388, 23);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setForeground(new Color(255, 255, 255));
		lblProfesor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProfesor.setBounds(71, 210, 117, 33);
		panel.add(lblProfesor);
		
		txtProfesor = new JTextField();
		txtProfesor.setBounds(225, 217, 388, 23);
		panel.add(txtProfesor);
		txtProfesor.setColumns(10);
		
		JLabel label = new JLabel("Estudiantes");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(71, 297, 105, 14);
		panel.add(label);
		
		JButton btnlista = new JButton("Lista De estudiantes");
		btnlista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTabla();
				
			}
		});
		btnlista.setForeground(Color.BLACK);
		btnlista.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlista.setBackground(new Color(135, 206, 235));
		btnlista.setBounds(52, 341, 156, 41);
		panel.add(btnlista);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(25, 25, 112));
		panel_1.setBounds(237, 263, 376, 174);
		panel.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = -1;
	    		row = table.getSelectedRow();
	    		if(row>-1){
	    			btnCrear.setEnabled(true);
						
						 Usuarios aux1 = CentroEstudios.getInstance().buscarUserByMat((String)model.getValueAt(row, 0));
						 
	    			
			}
			}});
		scrollPane.setBounds(10, 11, 356, 152);
		panel_1.add(scrollPane);
		
		String encabezados[]= {"Matricula", "Nombre", "Edad"};
		model= new DefaultTableModel();
		model.setColumnIdentifiers(encabezados);
		table = new JTable();
		table.setModel(model);
		scrollPane.setViewportView(table);
	
	
	
	{
		
			
		
		
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnCrear = new JButton("Crear");
				btnCrear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Grupo aux = null;
						String aux1 = "";
						String nombre= textNombre.getText();
						String profesor = txtProfesor.getText();
						aux = new Grupo(null, nombre, null,profesor);
						CentroEstudios.getInstance().buscarUserByMat(aux1);
						CentroEstudios.getInstance().insertarGrupo(aux);
						
						JOptionPane.showMessageDialog(null, "Creacion De Grupo Exitoso", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						Limpiar();
						
						
					}
				});
				
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			
			
		}
	}
		
	
		
	}
	
	
	private void cargarTabla() {
		model.setRowCount(0);
		row= new Object[model.getColumnCount()];
		for(int i=0; i< CentroEstudios.getInstance().getMisUsuarios().size(); i++) {
			if(CentroEstudios.getInstance().getMisUsuarios().get(i) instanceof Estudiantes) {
				row[0]= CentroEstudios.getInstance().getMisUsuarios().get(i).getMatricula();
				row[1]= CentroEstudios.getInstance().getMisUsuarios().get(i).getNombre();
				row[2]= CentroEstudios.getInstance().getMisUsuarios().get(i).getEdad();
				model.addRow(row);
			}
		}
	}

	



	private void Limpiar() {
		
		textNombre.setText("");
		txtProfesor.setText("");
		table.setToolTipText("");
		
	}
	
}

