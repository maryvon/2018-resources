package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

import view.LoginView;
import view.RegisterView;

public class MainController {

	private LoginView loginView;
	private RegisterView registerView;

	public void start() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		loginView = new LoginView();
		registerView = new RegisterView();

		initializeButtonListeners();

		loginView.setVisible(true);
	}

	private void initializeButtonListeners() {
		loginView.addLoginButtonActionListener(e -> {
			System.out.println(loginView.getUsername());
			System.out.println(loginView.getPassword());
			String username = loginView.getUsername();
			if (username.startsWith("a")) {
				loginView.displayMessage("Username taken");
			}
			//System.out.println("Login");

		});

		loginView.addNotRegisteredButtonActionListener(e -> {
			loginView.setVisible(false);
			registerView.setVisible(true);
			System.out.println("Register");
		});
	}
}
