package lab07;

import java.util.Arrays;
import java.util.List;

public class UserValidator {

	public List<String> cityCodes = Arrays.asList("125", "223", "478");

	// UserValidationFailedException
	public void validate(User user) {
		// SSN
		// GYYMMDDCCCXYZ - 13 characters long
		// G - gender (1/2)
		// YY - year
		// MM - month
		// DD - day
		// CCC - city code
		// XYZ - any characters
	}
}
