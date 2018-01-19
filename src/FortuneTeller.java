import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// start of fortune questions
		System.out.println("Enter your first name:");
		String firstName = input.nextLine().trim();
		// quit statement
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(-1);
		}

		System.out.println("Enter your last name:");
		String lastName = input.nextLine().trim();
		// quit statement
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(-1);
		}

		System.out.println("Enter your age (as a whole number):");
		String ageStr = input.nextLine();// age as string
		int age = 0;// assign age as integer
		// quit statement
		if (ageStr.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(-1);
		} else {
			age = Integer.parseInt(ageStr); // convert ageStr string to integer
		}

		System.out.println("Enter your birth month (as a number):");
		String bMonthStr = input.nextLine();
		int bMonth = 0;// assign bMonth as integer
		// quit statement
		if (bMonthStr.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(-1);
		} else {
			bMonth = Integer.parseInt(bMonthStr); // convert bMonthStr string to integer
		}

		System.out.println("Enter your favorite ROYGBIV color (if you don't know what ROYGBIV is type Help):");
		String color = input.next();
		// quit statement
		if (color.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(-1);
		}
		// statement for if the user does not know what ROYGBIV stands for
		else if (color.toLowerCase().equals("help")) {
			System.out.println("ROYGBIV stands for red, orange, yellow, green, blue, indigo, and violet");
			System.out.println("Enter another color");
			color = input.next();
		} else {
			input.nextLine();
		}

		System.out.println("How many siblings do you have (as a number):");
		String siblingStr = input.nextLine();
		int sibling = 0;
		// quit statement
		if (siblingStr.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(-1);
		} else {
			sibling = Integer.parseInt(bMonthStr); // convert siblingStr string to integer
		}

		// statement to determine years to retire
		int Retirement;
		if (age % 2 == 0) {
			Retirement = 12;
		} else {
			Retirement = 26;
		}

		// statement to determine vacation home location
		String vacationHome = null;
		if (sibling == 0) {
			vacationHome = "Dallas, TX";
		} else {
			if (sibling == 1) {
				vacationHome = "Seattle, WA";
			}
			if (sibling == 2) {
				vacationHome = "The Hamptons";
			}
			if (sibling == 3) {
				vacationHome = "Telluride, CO";
			}
			if (sibling > 3) {
				vacationHome = "San Francisco, CA";
			}
			if (sibling < 0) {
				vacationHome = "Russia";
			}
		}

		// statement to determine mode of transportation
		String transportation = null;
		if (color.toLowerCase().equals("red")) {
			transportation = "Tesla";
		} else {
			if (color.toLowerCase().equals("red")) {
				transportation = "Tesla";
			}
			if (color.toLowerCase().equals("orange")) {
				transportation = "Jeep";
			}
			if (color.toLowerCase().equals("yellow")) {
				transportation = "Toyota";
			}
			if (color.toLowerCase().equals("green")) {
				transportation = "GMC";
			}
			if (color.toLowerCase().equals("blue")) {
				transportation = "Moped";
			}
			if (color.toLowerCase().equals("indigo")) {
				transportation = "Chevy";
			}
			if (color.toLowerCase().equals("violet")) {
				transportation = "Buggy";
			}

		}

		// Bank balance statement
		String bankBalance = null;
		if (bMonth >= 1 && bMonth <= 4) {
			bankBalance = "$365,000.00";
		} else if (bMonth >= 5 && bMonth <= 7) {
			bankBalance = "$550.00";
		} else if (bMonth >= 8 && bMonth <= 10) {
			bankBalance = "$575,000.00";
		} else if (bMonth >= 11 && bMonth <= 12) {
			bankBalance = "6,750,000.00";
		} else {
			bankBalance = "$0.00";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + Retirement + " years with " + bankBalance
				+ " in the bank, a vacation home in " + vacationHome + " and travel by " + transportation + ".");

		input.close();
	}

}
