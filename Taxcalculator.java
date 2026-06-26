import java.util.Scanner;

class Example {
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("\t\t\t\t\t\t  __  _______  ________ ________   ");
		System.out.println("\t\t\t\t\t\t |  \\/       \\|        |        \\   ");
		System.out.println("\t\t\t\t\t\t  \\$|   $$$$$$| $$$$$$$$\\$$$$$$$$  ");
		System.out.println("\t\t\t\t\t\t |  | $$    \\$| $$__      | $$");
		System.out.println("\t\t\t\t\t\t | $| $$      | $$  \\     | $$");
		System.out.println("\t\t\t\t\t\t | $| $$    __| $$$$$     | $$");
		System.out.println("\t\t\t\t\t\t | $| $$___/  | $$_____   | $$");
		System.out.println("\t\t\t\t\t\t | $$\\$$     $| $$     \\  | $$");
		System.out.println("\t\t\t\t\t\t  \\$$ \\$$$$$$  \\$$$$$$$$   \\$$ \n\n");
		System.out.println(
				"   ________            __    __    _____              _         _____   _     _   _                  _______    ____    ______");
		System.out.println(
				"  |__   ___|    /\\     \\ \\  / /   / ____|     /\\     | |       / ____| | |   | | | |          /\\    |__   __|  / __ \\  |  __  \\");
		System.out.println(
				"     | |       /  \\     \\ \\/ /   | |         /  \\    | |      | |      | |   | | | |         /  \\      | |    | |  | | | |__) |");
		System.out.println(
				"     | |      / /\\ \\     >  <    | |        / /\\ \\   | |      | |      | |   | | | |        / /\\ \\     | |    | |  | | |  _  /");
		System.out.println(
				"     | |     / ____ \\   / . \\    | |____   / ____ \\  | |____  | |____  | |___| | | |____   / ____ \\    | |    | |__| | | | \\ \\");
		System.out.println(
				"     |_|    /_/    \\_\\ /_/ \\_\\    \\_____| /_/    \\_\\ |______|  \\_____|  \\_____/  |______| /_/    \\_\\   |_|     \\____/  |_|  \\_\\ \n\n");
		System.out.println(
				"========================================================================================================================================\n\n");
		System.out.println("\t [1] Withholding Tax \n ");
		System.out.println("\t [2] Payable Tax \n");
		System.out.println("\t [3] Income Tax \n");
		System.out.println("\t [4] Social Security Contribution Levy (SSCL) Tax \n");
		System.out.println("\t [5] Leasing Payment \n");
		System.out.println("\t [6] Exit \n\n");

		while (true) {
			System.out.print("Enter an option to continue -> ");
			int option = input.nextInt();
			switch (option) {
				case 1:
					withholdingTaxMenu();
				case 2:
					PayableTax();
				case 3:
					IncomeTax();
				case 4:
					SSCLTax();
				case 5:
					LeasingPayment();
				case 6:
					exit();
					break;
				default:
					System.out.print("Invalid option ");
			}
		}

	}

	public static void withholdingTaxMenu() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t WITHHOLDING TAX \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");

		System.out.println("\t [1] Rent Tax \n");
		System.out.println("\t [2] Bank Interest Tax \n");
		System.out.println("\t [3] Dividend Tax \n");
		System.out.println("\t [4] Exit \n");

		L1: while (true) {
			System.out.print("Enter an option to continue -> ");
			int option1 = input.nextInt();
			switch (option1) {
				case 1:
					rentTax();
					break L1;
				case 2:
					bankInterestTax();
					break L1;
				case 3:
					dividendTax();
					break L1;
				case 4:
					exit();
					break L1;
				default:
					System.out.print("Invalid option! ");
					continue L1;
			}
		}

	}

	public static void PayableTax() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t PAYABLE TAX \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void IncomeTax() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t INCOME TAX \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void SSCLTax() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void LeasingPayment() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t LEASING PAYMENT \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("\t [1] calculate Monthly Installment \n");
		System.out.println("\t [2] Search Leasing Category \n");
		System.out.println("\t [3] Find Leasing Amount\n");
		System.out.println("\t [4] Exit \n\n");
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();

		while (true) {
			switch (option) {
				case 1:
					calculateMonthlyInstallment();
					break;
				case 2:
					searchLeasingCategory();
					break;
				case 3:
					findLeasingAmount();
					break;
				case 4:
					exit();
					break;
				default:
					System.out.println("Invalid option!");
					break;
			}
		}
	}

	public static void exit() {
		System.out.println(" EXIT....... ");
	}

	public static void rentTax() {

		String again = "Y";

		while (again.equals("Y")) {

			System.out.println("=================================================");
			System.out.println("                  RENT TAX                      ");
			System.out.println("=================================================");

			System.out.print("  Enter your rent : ");
			double rent = input.nextDouble();

			if (rent <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			if (rent <= 100000) {
				System.out.println("  You dont have to pay Rent Tax...");
			} else {
				double tax = (rent - 100000) * 0.10;
				System.out.printf("  You have to pay Rent Tax : %.2f%n", tax);
			}

			System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
			again = input.next().toUpperCase();
		}
	}

	public static void bankInterestTax() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t BANK INTEREST TAX \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void dividendTax() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t DIVIDEND TAX \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void calculateMonthlyInstallment() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t CALCULATE MONTHLY INSTALLMENT \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void searchLeasingCategory() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t SEARCH LEASING CATEGORY \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

	public static void findLeasingAmount() {
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|\t\t\t FIND LEASING AMOUNT \t\t\t  |");
		System.out.println("+-----------------------------------------------------------------+");
	}

}
