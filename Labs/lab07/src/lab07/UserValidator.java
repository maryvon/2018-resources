package lab07;

import java.util.Arrays;
import java.util.List;

public class UserValidator {

	private final int SSN_LENGTH = 13;
	public List<String> cityCodes = Arrays.asList("125", "223", "478");
	private int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	// UserValidationFailedException
	public void validate(User user) throws UserValidationFailedException {
		// SSN
		// GYYMMDDCCCXYZ - 13 characters long
		// G - gender (1/2)
		// YY - year
		// MM - month
		// DD - day
		// CCC - city code
		// XYZ - any characters

		final String ssn = user.getSsn();

		if (ssn.length() != SSN_LENGTH) {
			throw new UserValidationFailedException("Wrong SSN length");
		}
		if (!Arrays.asList("1", "2").contains(String.valueOf(ssn.charAt(0)))) {
			throw new UserValidationFailedException("Wrong gender in SSN");
		}

		validateDate(ssn);

		String ccc = ssn.substring(7, 10);

		if (!cityCodes.contains(ccc)) {
			throw new UserValidationFailedException("Wrong city code in SSN");
		}
	}

	private void validateDate(String ssn) throws UserValidationFailedException {
		int year, month, day;
		year = getIntegerFor(ssn.substring(1, 3), "year");
		month = getIntegerFor(ssn.substring(3, 5), "month");
		if (month > 12 || month == 0) {
			throw new UserValidationFailedException("Month in SSN out of bounds");
		}
		day = getIntegerFor(ssn.substring(5, 7), "day");
		if ((year % 4 == 0 && month == 2 && day > 28) || day > daysInMonths[month]) {
			throw new UserValidationFailedException("Day in SSN out of bounds");
		}
	}

	public int getIntegerFor(String fromString, String field) throws UserValidationFailedException {
		try {
			return Integer.parseInt(fromString);
		}
		catch (NumberFormatException e) {
			throw new UserValidationFailedException("Invalid " + field + " in SSN");
		}
	}
}
