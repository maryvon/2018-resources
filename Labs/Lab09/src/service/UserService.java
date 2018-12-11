package service;

import java.util.HashMap;
import java.util.Map;

import model.User;

public class UserService {

	private Map<String, User> users = new HashMap<>();

	public void create(final User user) {
		final String username = user.getUsername();
		if (username != null) {
			users.put(username, user);
		}
	}

	public User get(final String username) {
		return users.get(username);
	}

	public void remove(final String username) {
		users.remove(username);
	}
}
