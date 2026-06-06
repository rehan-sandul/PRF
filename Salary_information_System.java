import java.util.*;

class Salary_information_System {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("| \t\t\t\t %-54s | %n", "SALARY INFORMATION SYSTEM");
        System.out.println("-----------------------------------------------------------------------------------------\n");

        System.out.println("\t [1] Calculate Income Tax");
        System.out.println("\t [2] Calculate Annual Bonus");
        System.out.println("\t [3] Calculate Loan Amount");

        System.out.print("\nEnter an option to continue > ");
        int num = input.nextInt();
        System.out.println();

        switch (num) {
            case 1: 
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.printf("| \t\t\t\t %-54s | %n", "Calculate Income Tax");
                System.out.println("-----------------------------------------------------------------------------------------\n");

                System.out.print("Input Employee name    - ");
                String name = input.next();
                System.out.print("Input Employee salary  - ");
                double salary = input.nextDouble();

                double tax = 0;
                if (salary <= 100000) {
                    tax = 0;
                } else if (salary <= 141667) {
                    tax = (salary - 100000) * 0.06;
                } else if (salary <= 183333) {
                    tax = (41667 * 0.06) + ((salary - 141667) * 0.12);
                } else if (salary <= 225000) {
                    tax = (41667 * 0.06) + (41667 * 0.12) + ((salary - 183333) * 0.18);
                } else if (salary <= 266667) {
                    tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + ((salary - 225000) * 0.24);
                } else if (salary <= 308333) {
                    tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + ((salary - 266667) * 0.30);
                } else {
                    tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (41667 * 0.30)+ ((salary - 308333) * 0.36);
                }

                System.out.printf("%nYour have to pay Income Tax per month : Rs %.0f%n", tax);
                break;

            case 2: 
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.printf("| \t\t\t\t %-54s | %n", "Calculate Annual Bonus");
                System.out.println("-----------------------------------------------------------------------------------------\n");

                System.out.print("Input Employee name    - ");
                name = input.next();
                System.out.print("Input Employee salary  - ");
                salary = input.nextDouble();

                double annualBonus = 5000;
                if (salary >= 400000) {
                    annualBonus = salary * 0.35;
                } else if (salary >= 300000) {
                    annualBonus = salary * 0.20;
                } else if (salary >= 200000) {
                    annualBonus = salary * 0.15;
                } else if (salary >= 100000) {
                    annualBonus = salary * 0.10;
                }

                System.out.printf("%nAnnual bonus    - %.1f%n", annualBonus);
                break;

            case 3: 
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.printf("| \t\t\t\t %-54s | %n", "Calculate Loan Amount");
                System.out.println("-----------------------------------------------------------------------------------------\n");

                System.out.print("Input Employee Name: ");
                name = input.next();
                System.out.print("Input Monthly Salary : ");
                salary = input.nextDouble();

                if (salary <= 50000) {
                    System.out.println("\n\tYou cannot get a loan because your salary is less than Rs.50000");
                } else {
                    System.out.print("Enter the number of years : ");
                    int years = input.nextInt();

                    if (years > 5) {
                        System.out.println("\n\tYou cannot get a loan because the maximum number of years is 5");
                    } else {
                        int n = years * 12;
                        double r = 0.15; 
                        double monthlyInstallment = 0.6 * salary;

                        double loanAmount = monthlyInstallment * (1 - (1 / Math.pow(1 + (r / 12), n))) / (r / 12);
                        loanAmount = Math.round(loanAmount / 1000) * 1000;

                        System.out.printf("%nYou can get Loan Amount : %.0f%n", loanAmount);
                    }
                }
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }

    }
}
