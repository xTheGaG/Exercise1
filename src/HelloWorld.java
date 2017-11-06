import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.println("Enter your name: ");
		
		Scanner reader = new Scanner(System.in);		
		String username = reader.nextLine();
		
		HelloUser user = new HelloUser(username);
		user.greetUser();
		
		
	}

}
