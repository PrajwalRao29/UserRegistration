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
			return LastNameCheck();
		} else {
			System.out.println("Valid Last Name");
			return true;
		}
	}

	public static boolean emailCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your email");
		if (Pattern.matches("[\\w]{2,}([.][a-zA-Z]{2,})*[@]{1}[a-zA-Z]{2,}[.]{1}[a-zA-Z]{2,}([.][a-zA-Z]{2,})*",
				scanner.next())) {
			System.out.println("Valid Email");
			return true;
		} else {
			System.out.println("Invalid Email , Please repeat.");
			return emailCheck();
		}
	}

	public static boolean mobileCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mobile number along with country code");
		String s=scanner.nextLine();
		if (Pattern.matches("[1-9]{1}[0-9]{1}[\\s]{1}[1-9]{1}[0-9]{9}", s)) {
			System.out.println("Valid mobile phone");
			return true;
		} else {
			System.out.println("Invalid mobile number , Please repeat.");
			return mobileCheck();
		}
	}

	public static boolean passwordCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password");
		String s=scanner.next();
		if (Pattern.matches("(.*[A-Z].*)",s) && Pattern.matches("[\\S]{8,}",s) && Pattern.matches("(.*[0-9].*)",s) && Pattern.matches("(.*[\\W]{1}.*)",s)) {
			System.out.println("Valid password");
			return true;
		} else {
			System.out.println("Invalid password , Please repeat.");
			return passwordCheck();
		}
	}

	public static void main(String[] args) {

		FirstNameCheck();
		LastNameCheck();
		emailCheck();
		mobileCheck();
		passwordCheck();
	}
}
