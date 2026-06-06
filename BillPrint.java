import java.util.Scanner;
class BillPrint{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.print("==========================================================================================");
		System.out.println("");
		System.out.println("__          __  _                             _           _ __  __            _");
		System.out.println("\\ \\        / / | |                           | |         (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___   | |_ ___     _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ' _ \\ / _ \\  | __/ _ \\   | | |\\/| |/ _' | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/  | || (_) |  | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println("");
		System.out.println("==========================================================================================");
		System.out.println("");
		
		System.out.print("Enter Customer Phone NO : ");
		String customerPhoneNo = input.nextLine();

		System.out.println("");
		System.out.print("Enter Customer Name : ");
		String customerName = input.nextLine();

		System.out.println("");
		System.out.println("==========================================================================================");
		System.out.println("");

		System.out.print("Basmathi Qty(Kg)   - ");
		int basmathiQTY=input.nextInt();
		System.out.println("");

		System.out.print("Dhal Qty(Kg)       - ");
		int dhalQTY=input.nextInt();
		System.out.println("");

		System.out.print("Sugar Qty(Kg)      - ");
		int sugarQTY=input.nextInt();
		System.out.println("");

		System.out.print("Higland Qty        - ");
		int highlandQTY=input.nextInt();
		System.out.println("");

		System.out.print("Yoghurt Qty        - ");
		int yoghurtQTY=input.nextInt();
		System.out.println("");

		System.out.print("Flour Qty(Kg)      - ");
		int flourQTY=input.nextInt();
		System.out.println("");

		System.out.print("Soap Qty           - ");
		int soapQTY=input.nextInt();
		System.out.println("");

		System.out.println("");
		
		double basmathiPrice = 250.00;
		double dhalPrice = 180.00;
		double sugarPrice = 150.00;
		double highlandPrice = 1200.00;
		double yoghurtPrice = 50.00;
		double flourPrice = 80.00;
		double soapPrice = 100.00;

		double basmathiTotal = basmathiPrice * basmathiQTY;
		double dhalTotal = dhalPrice * dhalQTY;
		double sugarTotal = sugarPrice * sugarQTY;
		double highlandTotal = highlandPrice * highlandQTY;
		double yoghurtTotal = yoghurtPrice * yoghurtQTY;
		double flourTotal = flourPrice * flourQTY;
		double soapTotal = soapPrice * soapQTY;

		double total = basmathiTotal + dhalTotal + sugarTotal + highlandTotal + yoghurtTotal + flourTotal+ soapTotal;

		double discount = total * 0.1;

		double price = total - discount;


		System.out.println("+-------------------------------------------------------------------------------------+");
		System.out.println("|                           _    __  __          _____ ______                         |");
		System.out.println("|                          (_)  |  \\/  |   /\\   |  __ \\__  __|                        |");
		System.out.println("|                           _   | \\  / |  /  \\  | |__) | | |                          |");
		System.out.println("|                          | |  | |\\/| | / /\\ \\ |  _  /  | |                          |");
		System.out.println("|                          | |  | |  | |/ ____ \\| | \\ \\  | |                          |");
		System.out.println("|                          |_|  |_|  |_/_/    \\_\\_|  \\_\\ |_|                          |");
		System.out.println("|                               225,Galle Road,Panadura.                              |");
		System.out.println("|                                                                                     |");
		System.out.println("+-------------------------------------------------------------------------------------+");
		System.out.printf("| %40s : %-40s | \n"," # Tel ", customerPhoneNo);
		System.out.printf("| %40s : %-40s | \n"," # Name", customerName);
		System.out.println("+-------------------------+----------------+---------------------+--------------------+");
		System.out.printf("| %23s | %14s | %19s | %18s | \n","         "," Qty     "," unit price    ","price       ");
		System.out.println("+-------------------------+----------------+---------------------+--------------------+");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Basmathi","      "+basmathiQTY,"      "+basmathiPrice,basmathiTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Dhal","      "+dhalQTY,"      "+dhalPrice,dhalTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Sugar","      "+sugarQTY,"      "+sugarPrice,sugarTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Highland","      "+highlandQTY,"      "+highlandPrice,highlandTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Yoghurt","      "+yoghurtQTY,"      "+yoghurtPrice,yoghurtTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Flour","      "+flourQTY,"      "+flourPrice,flourTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		System.out.printf("| %-23s | %-14s | %-19s | \t %-12.1f | \n","# Soap","      "+soapQTY,"      "+soapPrice,soapTotal);
		System.out.println("|		 	  |		   |		         |		      |");

		

		System.out.println("+-------------------------+----------------+---------------------+--------------------+");

		System.out.printf("| %23s   %14s | %-19s | \t %-12.1f | \n","         ","  "," Total ",total);

		System.out.println("|                                          +---------------------+--------------------+");

		System.out.printf("| %23s   %14s | %-19s | \t %-12.1f | \n","         ","  "," Discount(10%) ",discount);

		System.out.println("|                                          +---------------------+--------------------+");

		System.out.printf("| %23s   %14s | %-19s | \t %-12.1f | \n","         ","  ","Price ", price);

		System.out.println("+------------------------------------------+---------------------+--------------------+");
		System.out.println("");
		System.out.print("Enter Customer given amount - ");
		double cashgiven = input.nextDouble();
		
		int change =(int) (cashgiven - price);

 
		System.out.println("+---------------------+---------------------+");
		System.out.printf("| %-19s | \t %-10.1f | \n","Net Amount",price);
		System.out.println("+---------------------+---------------------+");
		System.out.printf("| %-19s | \t %-10.1f | \n","Cash ",cashgiven);
		System.out.println("+---------------------+---------------------+");	
		System.out.printf("| %-19s | \t %-10d | \n","Change", change);
		System.out.println("+---------------------+---------------------+");
		System.out.println("");
		System.out.println("");

		int r5000 = change / 5000;
		change = change % 5000;
		
		int r2000 = change / 2000;
		change = change % 2000;
		
		int r1000 = change / 1000;
		change = change % 1000;
		
		int r500 = change / 500;
		change = change % 500;
		
		int r100 = change / 100;
		change = change % 100;
		
		int r50 = change / 50;
		change = change % 50;
		
		int r20 = change / 20;
		change = change % 20;

		int r10 = change / 10;
		change = change % 10;
		
		int r5 = change / 5;
		change = change % 5;
		
		int r2 = change / 2;
		change = change % 2;
		
		int r1 = change % 2 ;
		
		int notes = r5000 + r2000 + r1000 + r500 + r100 + r50 + r20;
		int coins = r10 + r5 + r2 + r1;
		

		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8s | \n","Value","No");
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.5000",r5000);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.2000",r2000);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.1000",r1000);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.500",r500);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.100",r100);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.50",r50);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.20",r20);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.10",r10);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.5",r5);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.2",r2);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t %-12s | \t\b\b %-8d | \n","Rs.1",r1);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t\b\b\b %-15s | \t\b\b %-8d | \n","No of Note",notes);
		System.out.println("+---------------------+-----------------+");
		System.out.printf("| \t\b\b\b %-15s | \t\b\b %-8d | \n","No of Coins",coins);
		System.out.println("+---------------------+-----------------+");
		System.out.println("\n\n");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t\t THANK YOU FOR SHOPPING WITH US ");
	System.out.println("----------------------------------------------------------------------");


	}
} 
