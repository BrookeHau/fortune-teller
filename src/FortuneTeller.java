import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
		
		System.out.println("Enter your age (as a number):");
		int age = input.nextInt();
		
		System.out.println("Enter your birth month (as a number):");
		int bMonth = input.nextInt();
		
		System.out.println("Enter your favorite ROYGBIV color (if you do not know what ROYGBIV is, type Help):");
		String color = input.nextLine();
		
		System.out.println("How many siblings do you have (as a number):");
		int siblingNum = input.nextInt();
		
				
	}

}
