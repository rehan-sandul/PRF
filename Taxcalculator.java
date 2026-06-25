import java.util.Scanner;
class Example {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

		System.out.println("\t\t\t\t\t\t  __  _______  ________ ________   ");
		System.out.println("\t\t\t\t\t\t |  \\/       \\|        |        \\   ");
		System.out.println("\t\t\t\t\t\t  \\$|   $$$$$$| $$$$$$$$\\$$$$$$$$  ");
		System.out.println("\t\t\t\t\t\t |  | $$    \\$| $$__      | $$");
		System.out.println("\t\t\t\t\t\t | $| $$      | $$  \\     | $$");
		System.out.println("\t\t\t\t\t\t | $| $$    __| $$$$$     | $$");
		System.out.println("\t\t\t\t\t\t | $| $$___/  | $$_____   | $$");
		System.out.println("\t\t\t\t\t\t | $$\\$$     $| $$     \\  | $$");
		System.out.println("\t\t\t\t\t\t  \\$$ \\$$$$$$  \\$$$$$$$$   \\$$ \n\n");
		System.out.println("   ________            __    __    _____              _         _____   _     _   _                  _______    ____    ______");
		System.out.println("  |__   ___|    /\\     \\ \\  / /   / ____|     /\\     | |       / ____| | |   | | | |          /\\    |__   __|  / __ \\  |  __  \\");
		System.out.println("     | |       /  \\     \\ \\/ /   | |         /  \\    | |      | |      | |   | | | |         /  \\      | |    | |  | | | |__) |");
		System.out.println("     | |      / /\\ \\     >  <    | |        / /\\ \\   | |      | |      | |   | | | |        / /\\ \\     | |    | |  | | |  _  /");
		System.out.println("     | |     / ____ \\   / . \\    | |____   / ____ \\  | |____  | |____  | |___| | | |____   / ____ \\    | |    | |__| | | | \\ \\");
		System.out.println("     |_|    /_/    \\_\\ /_/ \\_\\    \\_____| /_/    \\_\\ |______|  \\_____|  \\_____/  |______| /_/    \\_\\   |_|     \\____/  |_|  \\_\\ \n\n");
		System.out.println("========================================================================================================================================\n\n");
		System.out.println("\t [1] Withholding Tax \n ");
		System.out.println("\t [2] Payable Tax \n");
		System.out.println("\t [3] Income Tax \n");
		System.out.println("\t [4] Social Security Contribution Levy (SSCL) Tax \n");
		System.out.println("\t [5] Leasing Payment \n");
		System.out.println("\t [6] Exit \n\n");
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();

		switch (option){
			case 1:
				System.out.println("+-----------------------------------------------------------------+");
				System.out.println("|\t\t\t WITHHOLDING TAX \t\t\t  |");
				System.out.println("+-----------------------------------------------------------------+");
				
				System.out.println("\t [1] Rent Tax \n");
				System.out.println("\t [2] Bank Interest Tax \n");
				System.out.println("\t [3] Dividend Tax \n");
				System.out.println("\t [4] Exit \n");
				System.out.print("Enter an option to continue -> ");
				int option1 =input.nextInt();
				L1:while (true){
					switch (option1){
						case 1:
							System.out.println("+-----------------------------------------------------------------+");
							System.out.println("|\t\t\t RENT TAX \t\t\t  |");
							System.out.println("+-----------------------------------------------------------------+");
							System.out.println("Enter your rent  : ");
							break L1;
							
						case 2:
							System.out.println("+-----------------------------------------------------------------+");
							System.out.println("|\t\t\t  Bank Interest Tax \t\t\t  |");
							System.out.println("+-----------------------------------------------------------------+");						
							break L1;
						
						case 3:
							System.out.println("+-----------------------------------------------------------------+");
							System.out.println("|\t\t\t Dividend TAX \t\t\t  |");
							System.out.println("+-----------------------------------------------------------------+");
							break L1;
						
						case 4:
							System.out.println(" EXIT....... ");
							break L1;
							
						default:
							System.out.print("Invalid option ");
						continue L1;
					}	
				}
			default:
				System.out.print("Invalid option ");
		}
		


    }
}
