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
					break;
				case 2:
					PayableTax();
					break;
				case 3:
					IncomeTax();
					break;
				case 4:
					SSCLTax();
					break;
				case 5:
					LeasingPayment();
					break;
				case 6:
					exit();
					return;
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
		String again = "Y";

		while (again.equals("Y")) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t PAYABLE TAX \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");
			System.out.print("  Enter your employee payment per month : ");
			double salary = input.nextDouble();

			if (salary <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			if (salary <= 100000) {
				System.out.println("  You don't have to pay Payable Tax...");
			} else {
				double tax = 0;

				if (salary > 100000) {
					double amount = Math.min(salary, 141667) - 100000;
					tax = tax + amount * 0.06;
				}
				if (salary > 141667) {
					double amount = Math.min(salary, 183333) - 141667;
					tax = tax + amount * 0.12;
				}
				if (salary > 183333) {
					double amount = Math.min(salary, 225000) - 183333;
					tax = tax + amount * 0.18;
				}
				if (salary > 225000) {
					double amount = Math.min(salary, 266667) - 225000;
					tax = tax + amount * 0.24;
				}
				if (salary > 266667) {
					double amount = Math.min(salary, 308333) - 266667;
					tax = tax + amount * 0.30;
				}
				if (salary > 308333) {
					double amount = salary - 308333;
					tax = tax + amount * 0.36;
				}

				System.out.printf("  You have to pay Payable Tax per month : %.2f%n", tax);
			}

			System.out.print("Do you want to calculate another Payable Tax (Y/N): ");
			again = input.next().toUpperCase();
		}
	}

	public static void IncomeTax() {
		String again = "Y";

		while (again.equals("Y")) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t INCOME TAX \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");
			System.out.print("  Enter your total income per year : ");
			double income = input.nextDouble();

			if (income <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			if (income <= 1200000) {
				System.out.println("  You don't have to pay Income Tax...");
			} else {
				double tax = 0;

				if (income > 1200000) {
					double amount = Math.min(income, 1700000) - 1200000;
					tax = tax + amount * 0.06;
				}
				if (income > 1700000) {
					double amount = Math.min(income, 2200000) - 1700000;
					tax = tax + amount * 0.12;
				}
				if (income > 2200000) {
					double amount = Math.min(income, 2700000) - 2200000;
					tax = tax + amount * 0.18;
				}
				if (income > 2700000) {
					double amount = Math.min(income, 3200000) - 2700000;
					tax = tax + amount * 0.24;
				}
				if (income > 3200000) {
					double amount = Math.min(income, 3700000) - 3200000;
					tax = tax + amount * 0.30;
				}
				if (income > 3700000) {
					double amount = income - 3700000;
					tax = tax + amount * 0.36;
				}

				System.out.printf("  You have to pay Income Tax per year : %.2f%n", tax);
			}

			System.out.print("Do you want to calculate another Income Tax (Y/N): ");
			again = input.next().toUpperCase();
		}
	}

	public static void SSCLTax() {

		String again = "Y";

		while (again.equals("Y")) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");
			System.out.print("  Enter value of Good or Service : ");
			double value = input.nextDouble();

			if (value <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			double saleTax = value * 0.025;
			double afterSaleTax = value + saleTax;
			double vat = afterSaleTax * 0.15;
			double totalTax = saleTax + vat;

			System.out.printf("  You have to pay SSCL Tax : %.2f%n", totalTax);

			System.out.print("Do you want to calculate another SSCL Tax (Y/N): ");
			again = input.next().toUpperCase();
		}
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
				return;
			default:
				System.out.println("Invalid option!");
				break;
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

		String again = "Y";

		while (again.equals("Y")) {

			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t BANK INTEREST TAX \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");

			System.out.print("  Enter your bank interest per year : ");
			double interest = input.nextDouble();

			if (interest <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			double tax = interest * 0.05;
			System.out.printf("  You have to pay Bank Interest Tax per year : %.2f%n", tax);

			System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
			again = input.next().toUpperCase();
		}
	}

	public static void dividendTax() {

		String again = "Y";

		while (again.equals("Y")) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t DIVIDEND TAX \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");

			System.out.print("  Enter your total dividend per year : ");
			double dividend = input.nextDouble();

			if (dividend <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			if (dividend <= 100000) {
				System.out.println("  You dont have to pay Dividend Tax...");
			} else {
				double tax = (dividend - 100000) * 0.14;
				System.out.printf("  You have to pay Dividend Tax per year : %.2f%n", tax);
			}

			System.out.print("Do you want to calculate another Dividend Tax (Y/N): ");
			again = input.next().toUpperCase();
		}
	}

	public static void calculateMonthlyInstallment() {
		String again = "Y";

		while (again.equals("Y")) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t CALCULATE MONTHLY INSTALLMENT \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");

			System.out.print("  Enter lease amount          : ");
			double leaseAmount = input.nextDouble();

			if (leaseAmount <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			System.out.print("  Enter annual interest rate  : ");
			double annualRate = input.nextDouble();

			if (annualRate <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			System.out.print("  Enter number of year        : ");
			int years = input.nextInt();

			if (years <= 0 || years > 5) {
				System.out.println("  Invalid number of year... Enter the correct value again...");
				System.out.print("  Enter number of year        : ");
				years = input.nextInt();
			}

			double i = (annualRate / 100) / 12;
			int n = years * 12;
			double monthly = leaseAmount * i / (1 - Math.pow(1 + i, -n));

			System.out.printf("  Your monthly instalment : %.2f%n", monthly);

			System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
			again = input.next().toUpperCase();
		}
	}

	public static void searchLeasingCategory() {
		String again = "Y";

		while (again.equals("Y")) {
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t SEARCH LEASING CATEGORY \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");

			System.out.print("  Enter lease amount         : ");
			double leaseAmount = input.nextDouble();

			if (leaseAmount <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			System.out.print("  Enter annual interest rate : ");
			double annualRate = input.nextDouble();

			if (annualRate <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			double i = (annualRate / 100) / 12;

			double monthly3 = leaseAmount * i / (1 - Math.pow(1 + i, -(3 * 12)));
			double monthly4 = leaseAmount * i / (1 - Math.pow(1 + i, -(4 * 12)));
			double monthly5 = leaseAmount * i / (1 - Math.pow(1 + i, -(5 * 12)));

			System.out.printf("  Your monthly instalment for 3 year leasing plan - %.2f%n", monthly3);
			System.out.printf("  Your monthly instalment for 4 year leasing plan - %.2f%n", monthly4);
			System.out.printf("  Your monthly instalment for 5 year leasing plan - %.2f%n", monthly5);

			System.out.print("Do you want to Search another Leasing Category (Y/N): ");
			again = input.next().toUpperCase();
		}
	}

	public static void findLeasingAmount() {

		String again = "Y";

		while (again.equals("Y")) {

			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|\t\t\t FIND LEASING AMOUNT \t\t\t  |");
			System.out.println("+-----------------------------------------------------------------+");
			System.out.print("  Enter the monthly lease payment amount you can afford : ");
			double monthly = input.nextDouble();

			if (monthly <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			System.out.print("  Enter number of year                                  : ");
			int years = input.nextInt();

			if (years <= 0 || years > 5) {
				System.out.println("  Invalid number of year... Enter the correct value again...");
				System.out.print("  Enter number of year                                  : ");
				years = input.nextInt();
			}

			System.out.print("  Enter annual interest rate                            : ");
			double annualRate = input.nextDouble();

			if (annualRate <= 0) {
				System.out.println("  Invalid input...");
				System.out.print("Do you want to enter the correct value again (Y/N): ");
				again = input.next().toUpperCase();
				continue;
			}

			double i = (annualRate / 100) / 12;
			int n = years * 12;
			double leaseAmount = monthly * (1 - Math.pow(1 + i, -n)) / i;

			System.out.printf("  You can get Lease Amount : %.2f%n", leaseAmount);

			System.out.print("Do you want to calculate another monthly instalment (Y/N): ");
			again = input.next().toUpperCase();
		}
	}
}
