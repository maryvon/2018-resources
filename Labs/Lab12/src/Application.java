
public class Application {

	public static void main(String[] args) {
		UserService userService = new UserService();

		User user = new User();
		user.setUsername("hello");
		user.setPassword("password");

		userService.save(user);
	}

}
