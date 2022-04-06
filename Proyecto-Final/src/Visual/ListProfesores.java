package Visual;

import java.awt.BorderLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.CentroEstudios;
import logico.Profesor;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListProfesores extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	//NEVAS VARIABLES PARA LA TABLA+****************************
    private DefaultTableModel model;
	private Object row[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListEstudiantes dialog = new ListEstudiantes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public ListProfesores() {
		setTitle("Listado de profesores");
		setBounds(100, 100, 502, 425);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{
				//CREACION DE LOS ENCABEZADOS******************
				String encabezados[]= {"Matricula", "Nombre", "Fecha de nacimiento"};
				model= new DefaultTableModel();
				model.setColumnIdentifiers(encabezados);
				table = new JTable();
				table.setModel(model);
				scrollPane.setViewportView(table);
			}
		}
		{
			JPanel buttonPane = new JPanel();
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
		for(int i=0; i< CentroEstudios.getInstance1().getMisUsuarios().size(); i++) {
			if(CentroEstudios.getInstance1().getMisUsuarios().get(i) instanceof Profesor) {
				row[0]= CentroEstudios.getInstance1().getMisUsuarios().get(i).getMatricula();
				row[1]= CentroEstudios.getInstance1().getMisUsuarios().get(i).getNombre();
				row[2]= CentroEstudios.getInstance1().getMisUsuarios().get(i).getDiaNacimiento();
				row[2]= CentroEstudios.getInstance1().getMisUsuarios().get(i).getMesNacimiento();
				row[2]= CentroEstudios.getInstance1().getMisUsuarios().get(i).getAņoNacimiento();
				model.addRow(row);
			}
		}
	}

}
