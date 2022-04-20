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
import logico.Profesor;
import java.awt.Toolkit;
import java.awt.Color;

public class ListProfesores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	//NEVAS VARIABLES PARA LA TABLA+****************************
    private DefaultTableModel model;
	private Object row[];

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public ListProfesores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListProfesores.class.getResource("/imagenes/icono.png")));
		setTitle("Listado de profesores");
		setBounds(100, 100, 639, 559);
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
			if(CentroEstudios.getInstance().getMisUsuarios().get(i) instanceof Profesor) {
				row[0]= CentroEstudios.getInstance().getMisUsuarios().get(i).getMatricula();
				row[1]= CentroEstudios.getInstance().getMisUsuarios().get(i).getNombre();
				row[2]= CentroEstudios.getInstance().getMisUsuarios().get(i).getEdad();			
				model.addRow(row);
			}
		}
	}

}
