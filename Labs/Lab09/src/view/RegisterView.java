package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class RegisterView extends JFrame {
	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JTextField lastNameTextField;
	private JTextField firstNameTextField;

	public RegisterView() {
		this.setBounds(100, 100, 404, 357);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel label = new JLabel("Username");
		label.setBounds(119, 126, 76, 14);
		getContentPane().add(label);

		usernameTextField = new JTextField();
		usernameTextField.setBounds(119, 147, 162, 20);
		getContentPane().add(usernameTextField);

		JLabel label_1 = new JLabel("Password");
		label_1.setBounds(119, 178, 55, 14);
		getContentPane().add(label_1);

		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(119, 203, 162, 20);
		getContentPane().add(passwordTextField);

		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setBounds(119, 74, 76, 14);
		getContentPane().add(lblLastName);

		lastNameTextField = new JTextField();
		lastNameTextField.setBounds(119, 95, 162, 20);
		getContentPane().add(lastNameTextField);

		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setBounds(119, 22, 76, 14);
		getContentPane().add(lblFirstName);

		firstNameTextField = new JTextField();
		firstNameTextField.setBounds(119, 43, 162, 20);
		getContentPane().add(firstNameTextField);

		JButton registerButton = new JButton("Register");
		registerButton.setBounds(187, 265, 89, 23);
		getContentPane().add(registerButton);
	}

}
