package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class LoginView extends JFrame {

	private JTextField usernameTextField;
	private JPasswordField passwordTextField;
	private JButton loginButton;
	private JButton notRegisteredButton;
	private JLabel messageLabel;
	private JButton passwordToggleButton;

	public LoginView() {
		this.setBounds(100, 100, 394, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setBounds(114, 32, 84, 14);
		getContentPane().add(usernameLabel);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(114, 84, 55, 14);
		getContentPane().add(passwordLabel);

		usernameTextField = new JTextField();
		usernameTextField.setBounds(114, 59, 162, 20);
		getContentPane().add(usernameTextField);

		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(114, 109, 162, 20);
		passwordTextField.setEchoChar('*');
		getContentPane().add(passwordTextField);

		loginButton = new JButton("Login");
		loginButton.setBounds(201, 157, 75, 23);
		getContentPane().add(loginButton);

		notRegisteredButton = new JButton("Not registered? Register..");
		notRegisteredButton.setBounds(114, 191, 162, 23);
		getContentPane().add(notRegisteredButton);

		messageLabel = new JLabel("New label");
		messageLabel.setBounds(12, 224, 356, 16);
		getContentPane().add(messageLabel);

		passwordToggleButton = new JButton("?");
		passwordToggleButton.setBounds(288, 107, 39, 22);
		getContentPane().add(passwordToggleButton);

		messageLabel.setVisible(false);
	}

	public void addLoginButtonActionListener(final ActionListener actionListener) {
		loginButton.addActionListener(actionListener);
	}

	public void addNotRegisteredButtonActionListener(final ActionListener actionListener) {
		notRegisteredButton.addActionListener(actionListener);
	}

	public void addPasswordToggleButtonMouseListener(final MouseListener mouseListener) {
		passwordToggleButton.addMouseListener(mouseListener);
	}

	public String getUsername() {
		return usernameTextField.getText();
	}

	public String getPassword() {
		return String.valueOf(passwordTextField.getPassword());
	}

	public void displayMessage(String messageText) {
		final Runnable runnable = new Runnable() {

			@Override
			public void run() {
				messageLabel.setText(messageText);
				messageLabel.setVisible(true);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					messageLabel.setVisible(false);
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

	public void hidePassword() {
		passwordTextField.setEchoChar('*');
	}

	public void displayPassword() {
		passwordTextField.setEchoChar((char) 0);
	}
}
