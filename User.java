import java.util.Scanner;
import java.util.regex.Pattern;

public class User {
	public static boolean FirstNameCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name");
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", scanner.next())) {
			System.out.println("Not a valid First Name , Please repeat.");
			return FirstNameCheck();
		} else {
			System.out.println("Valid First Name");
			return true;
		}
	}
	public static boolean LastNameCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Last Name");
		if (!Pattern.matches("[A-Z]{1}[a-z]{2,}", scanner.next())) {
			System.out.println("Not a valid Last Name , Please repeat.");
			return FirstNameCheck();
		} else {
			System.out.println("Valid Last Name");
			return true;
		}
	}
	public static void main(String[] args) {

		FirstNameCheck();
		LastNameCheck();
	}
}
