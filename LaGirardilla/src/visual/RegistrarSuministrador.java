package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.Almacen;
import logico.Suministrador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarSuministrador extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JSpinner spnEntrega;
	private JTextField textCodigo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JComboBox cmxSeleccionar;
	private JLabel lblNewLabel_4;
	private JTextArea textAreaDireccion;
	private JButton registrarButton;
	private JButton cancelButton;
	private JPanel panel;
	private JPanel buttonPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarSuministrador dialog = new RegistrarSuministrador();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarSuministrador() {
		setResizable(false);
		setTitle("Registrar Suministrador");
		setBounds(100, 100, 666, 418);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			lblNewLabel = new JLabel("C\u00F3digo:");
			lblNewLabel.setBounds(40, 45, 69, 20);
			panel.add(lblNewLabel);
			
			textCodigo = new JTextField();
			textCodigo.setBounds(108, 42, 146, 26);
			textCodigo.setText("S_"+Almacen.getInstacia().getGeneradorCodiSumi());
			panel.add(textCodigo);
			textCodigo.setColumns(10);
			{
				lblNewLabel_1 = new JLabel("Nombre:");
				lblNewLabel_1.setBounds(40, 105, 69, 20);
				panel.add(lblNewLabel_1);
			}
			{
				textNombre = new JTextField();
				textNombre.setBounds(108, 99, 146, 26);
				panel.add(textNombre);
				textNombre.setColumns(10);
			}
			{
				lblNewLabel_2 = new JLabel("D\u00EDa Entrega:");
				lblNewLabel_2.setBounds(40, 159, 95, 20);
				panel.add(lblNewLabel_2);
			}
			
			spnEntrega = new JSpinner();
			spnEntrega.setBounds(124, 156, 83, 26);
			panel.add(spnEntrega);
			{
				lblNewLabel_3 = new JLabel("Pa\u00EDs");
				lblNewLabel_3.setBounds(266, 159, 36, 20);
				panel.add(lblNewLabel_3);
			}
			{
				cmxSeleccionar = new JComboBox();
				cmxSeleccionar.setToolTipText("");
				cmxSeleccionar.setBounds(333, 159, 103, 26);
				panel.add(cmxSeleccionar);
				cmxSeleccionar.setEditable(true);
				cmxSeleccionar.setToolTipText("<SELECCIONE>");
				cmxSeleccionar.setBackground(Color.WHITE);
	            panel.add(cmxSeleccionar);
	            cmxSeleccionar.addItem("EEUU");
	            cmxSeleccionar.addItem("COSTA RICA");
	            cmxSeleccionar.addItem("CUBA");
	            cmxSeleccionar.addItem("PORTUGAL");
	            cmxSeleccionar.addItem("FRANCIA");
	            cmxSeleccionar.addItem("ITALIA");
			}
			{
				lblNewLabel_4 = new JLabel("Direccion:");
				lblNewLabel_4.setBounds(40, 222, 83, 20);
				panel.add(lblNewLabel_4);
			}
			{
				textAreaDireccion = new JTextArea();
				textAreaDireccion.setBounds(143, 222, 386, 88);
				panel.add(textAreaDireccion);
			}
		}
		{
			buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				registrarButton = new JButton("Registrar");
				registrarButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Suministrador sumi = new Suministrador(textCodigo.getText(), textNombre.getText(), cmxSeleccionar.getSelectedItem().toString(), Integer.valueOf(spnEntrega.getValue().toString()));
                        Almacen.getInstacia().inseetarSumi(sumi);
                        JOptionPane.showMessageDialog(null, "Operacion Satisfactoria", "Registro",JOptionPane.INFORMATION_MESSAGE);
                        Clean();
					}

					private void Clean() {
					 textNombre.setText("");
					 
						
					}
				});
				buttonPane.add(registrarButton);
				getRootPane().setDefaultButton(registrarButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
                cancelButton.addActionListener(e -> {
                    dispose();
                });
                buttonPane.add(cancelButton);
			}
		}
	}
}