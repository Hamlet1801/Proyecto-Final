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
import logico.Cuadrado;
import logico.Estudiantes;
import logico.Profesor;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class ListPrismas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	//NEVAS VARIABLES PARA LA TABLA+****************************
    private DefaultTableModel model;
	private Object row[];
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListPrismas dialog = new ListPrismas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListPrismas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListPrismas.class.getResource("/imagenes/icono.png")));
		setTitle("Listado de prismas");
		setBounds(100, 100, 583, 501);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(25, 25, 112));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					//CREACION DE LOS ENCABEZADOS******************
					String encabezados[]= {"Matricula Usuario", "Nombre Usuario", "Figura"};
					model= new DefaultTableModel();
					model.setColumnIdentifiers(encabezados);
					table = new JTable();
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Salir");
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
			if(CentroEstudios.getInstance().getMisUsuarios().get(i) instanceof Estudiantes) {
				row[0]= CentroEstudios.getInstance().getMisUsuarios().get(i).getMatricula();
				row[1]= CentroEstudios.getInstance().getMisUsuarios().get(i).getNombre();
				model.addRow(row);
			}
			
			if(CentroEstudios.getInstance().getMisUsuarios().get(i) instanceof Profesor) {
				row[0]= CentroEstudios.getInstance().getMisUsuarios().get(i).getMatricula();
				row[1]= CentroEstudios.getInstance().getMisUsuarios().get(i).getNombre();
				model.addRow(row);
			}
			
			if(CentroEstudios.getInstance().getMisPrismas().get(i) instanceof Cuadrado) {
				
			}

			
		}
	}

}
