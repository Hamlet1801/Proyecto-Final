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
import logico.Estudiantes;
import logico.Grupo;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaGrupo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object row[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListaGrupo dialog = new ListaGrupo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListaGrupo() {
		
		setTitle("Lista De Los Grupos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaGrupo.class.getResource("/imagenes/icono.png")));
		setBounds(100, 100,  639, 559);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 603, 465);
		contentPanel.add(scrollPane);
		scrollPane.setViewportBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPanel.add(scrollPane, BorderLayout.CENTER);
		{
			
			String encabezados[]= { "Profesor", "Grupo", "Estudiantes"};
			model= new DefaultTableModel();
			model.setColumnIdentifiers(encabezados);
			table = new JTable();
			table.setModel(model);
			scrollPane.setViewportView(table);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setBackground(new Color(255, 140, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	
	cargarTabla();
	
	
}


private void cargarTabla() {
	model.setRowCount(0);
	row= new Object[model.getColumnCount()];
	for(int i=0; i< CentroEstudios.getInstance().getMisGrupos().size(); i++) {
		if(CentroEstudios.getInstance().getMisGrupos().get(i) instanceof Grupo) {
			row[0]= CentroEstudios.getInstance().getMisGrupos().get(i).getNombre();
			row[1]= CentroEstudios.getInstance().getMisGrupos().get(i).getProfesor();
			row[2]= CentroEstudios.getInstance().getMisUsuarios().get(i).getNombre();
			model.addRow(row);
		}
	}
}

}

