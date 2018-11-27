package lab07;

import org.junit.Before;
import org.junit.Test;

public class UserValidatorTest {

	private UserValidator userValidator;

	@Before
	public void setup() {
		userValidator = new UserValidator();
	}

	@Test
	public void testValidUsers() {

	}

	@Test
	public void testInvalidUser() {
		User user = new User("123456789");
		try {
			userValidator.validate(user);
		} catch (UserValidationFailedException e) {
			System.out.println(e.getMessage());
		}
		user = new User("1234567890000");
		try {
			userValidator.validate(user);
		} catch (UserValidationFailedException e) {
			System.out.println(e.getMessage());
		}
		user = new User("1830367890000");
		try {
			userValidator.validate(user);
		} catch (UserValidationFailedException e) {
			System.out.println(e.getMessage());
		}
		user = new User("1830313890000");
		try {
			userValidator.validate(user);
		} catch (UserValidationFailedException e) {
			System.out.println(e.getMessage());
		}
		user = new User("1830313125000");
		try {
			userValidator.validate(user);
		} catch (UserValidationFailedException e) {
			System.out.println(e.getMessage());
		}
	}
}
