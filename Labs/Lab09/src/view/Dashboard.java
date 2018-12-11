package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JButton;

// check this for creating a list of elements - http://www.java2s.com/Code/Java/Swing-Components/CheckListExample2.htm

public class Dashboard extends JFrame {
	public Dashboard() {
		getContentPane().setLayout(null);

		JLabel lblWelcomeFirstname = new JLabel("Welcome, first-name");
		lblWelcomeFirstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWelcomeFirstname.setBounds(10, 11, 203, 39);
		getContentPane().add(lblWelcomeFirstname);

		JLabel lblHereAreYour = new JLabel("Here are your tasks for:");
		lblHereAreYour.setBounds(10, 61, 187, 14);
		getContentPane().add(lblHereAreYour);

		JLabel lblToday = new JLabel("Today");
		lblToday.setBounds(10, 91, 46, 14);
		getContentPane().add(lblToday);

		JLabel lblDays = new JLabel("Upcoming 7 days");
		lblDays.setBounds(322, 91, 99, 14);
		getContentPane().add(lblDays);

		JList list = new JList();
		list.setBounds(10, 116, 187, 254);
		getContentPane().add(list);

		JList list_1 = new JList();
		list_1.setBounds(313, 116, 187, 254);
		getContentPane().add(list_1);

		JButton btnAddItem = new JButton("Add item");
		btnAddItem.setBounds(472, 431, 97, 25);
		getContentPane().add(btnAddItem);
	}
}
