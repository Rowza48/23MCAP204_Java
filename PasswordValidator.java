package javaprogram;

    import java.util.Scanner;
    class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String message) {
	super(message);
	}
	}
	public class PasswordValidator {
		public static void validatePassword(String password)
	throws InvalidPasswordException { if (password.length() < 8) {
	throw new InvalidPasswordException("Password must be at least 8 characters long.");
	}
	if (!password.matches(".*\\d.*")) { // Checks if password contains a digit (0-9)
	throw new InvalidPasswordException("Password must contain at least one number.");
	}
	if (!password.matches(".*[$#&].*")) { // Checks if password contains any of $, #, &
	throw new InvalidPasswordException("Password must contain at least one special character($, #, &).");

	

	}
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your password: ");
	String password = scanner.nextLine();
	scanner.close();
	try {
	validatePassword(password);
	System.out.println("Password is valid.");
	} catch (InvalidPasswordException e) {
	System.out.println("Error: " + e.getMessage());
	}
	}
	}

