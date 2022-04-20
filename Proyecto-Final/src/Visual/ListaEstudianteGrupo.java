package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.CentroEstudios;
import logico.Estudiantes;

import logico.Usuarios;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListaEstudianteGrupo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	
    private DefaultTableModel model;
	private Object row[];
	private int mode ;
	protected Usuarios aux;
	protected String select;

	/**
	 * 
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public ListaEstudianteGrupo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaEstudianteGrupo.class.getResource("/imagenes/icono.png")));
		setTitle("Listado de Estudiantes");
		setBounds(100, 100, 598, 507);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				//CREACION DE LOS ENCABEZADOS******************
				String encabezados[]= {"Matricula", "Nombre", "Edad"};
				model= new DefaultTableModel();
				model.setColumnIdentifiers(encabezados);
				table = new JTable();
			
				table.setModel(model);
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				{
					JButton okButton = new JButton("Seleccionar");
					okButton.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							int row = 0;
				    		row = table.getSelectedRow();
				    		if(row>0){
				    			
									okButton.setEnabled(true);
									 aux = CentroEstudios.getInstance().buscarUserByMat((String)model.getValueAt(row, 0));
									
								}
						}	
								
						
							
						
					});
			
					okButton.setEnabled(false);
				
					okButton.setBackground(new Color(0, 255, 0));
					buttonPane.add(okButton);
				}
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		cargarTabla();
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

}



