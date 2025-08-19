package package1;
import java.util.Scanner;
public class lab1file2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a username: ");
		String a = scan.next();
		System.out.print("Enter a password: ");
		String b = scan.next();
		if (a.toLowerCase().equals("admin") && b.equals("1234password")) {
			System.out.println("Login Successful!");
		} else {
			System.out.println("Please try again.");
		}
		scan.close();
	}
}
