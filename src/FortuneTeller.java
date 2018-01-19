import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
		
		System.out.println("Enter your age (as a whole number):");
		int age = input.nextInt();
		
		System.out.println("Enter your birth month (as a number):");
		int bMonth = input.nextInt();
		
		System.out.println("Enter your favorite ROYGBIV color (if you don't know what ROYGBIV is type Help):");
		String color = input.nextLine();
		input.nextLine();
		
		System.out.println("How many siblings do you have (as a number):");
		int sibling = input.nextInt();
		
//		if (age % 2 == 0 ){
//			System.out.println(12);
//		} else {
//			System.out.println(26);
//		}
		input.close();		
	}

}
