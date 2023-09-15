package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logico.Almacen;

public class ListarSuministrador extends JDialog {
	
	private static DefaultTableModel model;
	private static Object[] row;
	private static Almacen alma;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JButton modificarButton;
	private JButton eliminarButton;
	private JButton cancelarButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarSuministrador dialog = new ListarSuministrador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarSuministrador() {
		setTitle("Listar Suministrador");
		setBounds(100, 100, 459, 512);
		getContentPane().setLayout(new BorderLayout());
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
					//
					model = new DefaultTableModel();
					String[] header = {"Id", "Nombre", "Pais", "Tiempo"};
					model.setColumnIdentifiers(header);
					table = new JTable();
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				modificarButton = new JButton("Modificar");
				modificarButton.setEnabled(false);
				buttonPane.add(modificarButton);
			}
			{
				eliminarButton = new JButton("Eliminar");
				eliminarButton.setEnabled(false);
				eliminarButton.setActionCommand("OK");
				buttonPane.add(eliminarButton);
				getRootPane().setDefaultButton(eliminarButton);
			}
			{
				cancelarButton = new JButton("Cancelar");
				cancelarButton.setActionCommand("Cancel");
				buttonPane.add(cancelarButton);
			}
			public static void loadSuministrdores() {
				model.setRowCount(0);
				row = new Object[model.getColumnCount()];
				for(int i=0; i<Almacen.getCantSumi(); i++) {
					row[0] = alma.getMisSumi()[i].getId();
					row[1] = alma.getMisSumi()[i].getNombre();
					row[2] = alma.getMisSumi()[i].getPais();
					row[3] = alma.getMisSumi()[i].getTiempoEntrega();
					model.addRow(row);
				}
			}
		}
	}
}
