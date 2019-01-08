package controller;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.UIManager;

import component.DatePicker;
import model.User;
import service.UserService;
import view.Dashboard;
import view.LoginView;
import view.RegisterView;

public class MainController {

	private UserService userService;

	private LoginView loginView;
	private RegisterView registerView;
	private Dashboard dashboard;

	public void start() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		loginView = new LoginView();
		registerView = new RegisterView();
		dashboard = new Dashboard();

		userService = new UserService();

		initializeButtonListeners();

		loginView.setVisible(true);

		DatePicker dp = new DatePicker(loginView);
		System.out.println(dp.setPickedDate());
		dp.getDialog().addComponentListener(new ComponentListener() {

			@Override
			public void componentShown(ComponentEvent e) {
				System.out.println("shown");
			}

			@Override
			public void componentResized(ComponentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println(dp.getDay());
			}
		});
	}

	private void initializeButtonListeners() {
		loginView.addLoginButtonActionListener(e -> {
			final String username = loginView.getUsername();
			final String password = loginView.getPassword();
			final User user = userService.get(username);
			if (user == null || password == null || !user.getPassword().equals(password)) {
				loginView.displayMessage("Username or password are not correct");
			} else {
				dashboard.setVisible(true);
			}
		});

		loginView.addNotRegisteredButtonActionListener(e -> {
			loginView.setVisible(false);
			registerView.setVisible(true);
			System.out.println("Register");
		});

		loginView.addPasswordToggleButtonMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				loginView.hidePassword();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				loginView.displayPassword();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		registerView.addRegisterButtonActionListener(e -> {
			final User user = new User();
			user.setFirstName(registerView.getFirstName());
			user.setLastName(registerView.getLastName());
			user.setUsername(registerView.getUsername());
			user.setPassword(registerView.getPassword());
			userService.create(user);
			registerView.setVisible(false);
			loginView.setVisible(true);
		});
	}
}
