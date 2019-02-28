import java.util.Scanner;

public class EmailValid {

	public static void main(String[] args) {
		System.out.println("Enter your mail id to evaluate:");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		for (int i = 0; i < email.length(); i++) {
			if (email.indexOf('@') >= 1) {
				if (email.indexOf(".") >= email.indexOf("@") + 2)
					if ((email.indexOf("@") + email.indexOf(".") - email.length() >= 1))
						System.out.println("The value is :" + email.length());
				System.out.println("The mail is valid");

			}
		}

	}

}
