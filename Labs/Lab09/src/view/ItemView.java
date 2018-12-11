package view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ItemView extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	public ItemView() {
		getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(29, 38, 225, 22);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setText("11-12-2018");
		textField_1.setBounds(29, 122, 116, 22);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Pick");
		btnNewButton.setBounds(157, 121, 97, 25);
		getContentPane().add(btnNewButton);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(29, 13, 77, 16);
		getContentPane().add(lblDescription);

		JLabel lblDueDate = new JLabel("Due date");
		lblDueDate.setBounds(29, 93, 67, 16);
		getContentPane().add(lblDueDate);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(29, 241, 97, 25);
		getContentPane().add(btnCancel);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(267, 241, 97, 25);
		getContentPane().add(btnSave);

	}
}
