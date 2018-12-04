package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JButton loginButton;
	private JButton notRegisteredButton;
	private JLabel messageLabel;

	public LoginView() {
		this.setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(114, 32, 84, 14);
		getContentPane().add(usernameLabel);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(114, 84, 55, 14);
		getContentPane().add(passwordLabel);

		usernameTextField = new JTextField();
		usernameTextField.setBounds(114, 53, 162, 20);
		getContentPane().add(usernameTextField);

		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(114, 109, 162, 20);
		getContentPane().add(passwordTextField);

		loginButton = new JButton("Login");
		loginButton.setBounds(201, 157, 75, 23);
		getContentPane().add(loginButton);

		notRegisteredButton = new JButton("Not registered? Register..");
		notRegisteredButton.setBounds(114, 191, 162, 23);
		getContentPane().add(notRegisteredButton);

		messageLabel = new JLabel("New label");
		messageLabel.setBounds(12, 224, 56, 16);
		getContentPane().add(messageLabel);
		messageLabel.setVisible(false);
	}

	public void addLoginButtonActionListener(final ActionListener actionListener) {
		loginButton.addActionListener(actionListener);
	}

	public void addNotRegisteredButtonActionListener(final ActionListener actionListener) {
		notRegisteredButton.addActionListener(actionListener);
	}

	public String getUsername() {
		return usernameTextField.getText();
	}

	public char[] getPassword() {
		return passwordTextField.getPassword();
	}

	public void displayMessage(String messageText) {
		messageLabel.setText(messageText);
		messageLabel.setVisible(true);
	}
}
