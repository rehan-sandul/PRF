import java.util.Scanner;

class iFriend_Contact_Organizer {
    static Scanner sc = new Scanner(System.in);

    
    static String[] ids = new String[100];
    static String[] names = new String[100];
    static String[] phones = new String[100];
    static String[] companies = new String[100];
    static double[] salaries = new double[100];
    static String[] birthdays = new String[100];
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            showHomePage();
            System.out.print("Enter an option to continue -> ");
            String option = sc.nextLine().trim();
            switch (option) {
                case "01":
                case "1": addContacts(); break;
                case "02":
                case "2": updateContacts(); break;
                case "03": 
                case "3": deleteContacts(); break;
                case "04": 
                case "4": searchContacts(); break;
                case "05": 
                case "5": listContacts(); break;
                case "06": 
                case "6":
                    System.out.println("\n  Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("  Invalid option. Try again.");
            }
        }
    }

    // ─────────────────────────────────────────
    // HOME PAGE
    // ─────────────────────────────────────────
    static void showHomePage() {
        clearConsole();
        System.out.println("\t\t  /$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$");
        System.out.println("\t\t  |__/| $$_____/| $$__  $$|_  $$_/| $$_____/| $$$ | $$| $$__  $$");
        System.out.println("\t\t   /$$| $$      | $$  \\ $$  | $$  | $$      | $$$$| $$| $$  \\ $$");
        System.out.println("\t\t  | $$| $$$$$   | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$");
        System.out.println("\t\t  | $$| $$__/   | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$");
        System.out.println("\t\t  | $$| $$      | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$");
        System.out.println("\t\t  | $$| $$      | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/");
        System.out.println("\t\t  |__/|__/      |__/  |__/|______/|________/|__/  \\__/|_______/");
        System.out.print("\n\n\n");
        System.out.println("  ______             _             _            _____         	             _				");
        System.out.println(" / _____|           | |           | |          / ___ \\        	            (_)				");
        System.out.println("| |      ____  _ __ | |_ __ _  ___| |_ ____   | |   | |_ __ __ _  __ _ _ __  _ _______ _ __	");
        System.out.println("| |     / __ \\| '_ \\| __/ _' |/ __| __/ ___|  | |   | | '__/ _' |/ _' | '_ \\| |_  / _ \\ '__|");
        System.out.println("| |____| (__) | | | | || |_| | |__| |_\\___ \\  | |___| | | | |_| | |_| | | | | |/ /  __/ |   ");
        System.out.println(" \\______\\____/|_| |_|\\__\\__,_|\\___|\\__|____/   \\_____/|_|  \\__, |\\__, |_| |_|_/___\\___|_|   ");
        System.out.println("	                                                          __/ |		            		");
        System.out.println("	                                                         |___/							");
        System.out.println("																							");
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println("        [01] ADD Contacts");
        System.out.println("        [02] UPDATE Contacts");
        System.out.println("        [03] DELETE Contacts");
        System.out.println("        [04] SEARCH Contacts");
        System.out.println("        [05] LIST Contacts");
        System.out.println("        [06] Exit");
        System.out.println();
    }

    // ─────────────────────────────────────────
    // 01. ADD CONTACTS
    // ─────────────────────────────────────────
    static void addContacts() {
        boolean addAnother = true;
        while (addAnother) {
            clearConsole();
            System.out.println("+--------------------------------------------------+");
            System.out.println("|              Add Contact to the list              |");
            System.out.println("+--------------------------------------------------+");
            System.out.println();

            if (count >= 100) {
                System.out.println("  Contact list is full!");
                return;
            }

            // Generate next contact ID
            String newId = generateId();
            System.out.println(" " + newId);
            System.out.println(" =======");
            System.out.println();

            System.out.print(" Name             : ");
            String name = sc.nextLine().trim();

            // Phone validation
            String phone = inputValidPhone();

            System.out.print(" Company Name     : ");
            String company = sc.nextLine().trim();

            // Salary validation
            double salary = inputValidSalary();

            // Birthday validation
            String birthday = inputValidBirthday();

            // Save contact
            ids[count] = newId;
            names[count] = name;
            phones[count] = phone;
            companies[count] = company;
            salaries[count] = salary;
            birthdays[count] = birthday;
            count++;

            System.out.println();
            System.out.println("        Contact has been added successfully...");
            System.out.println();
            System.out.print(" Do you want to add another Contact(Y/N): ");
            String ans = sc.nextLine().trim();
            addAnother = ans.equalsIgnoreCase("Y");
        }
    }

    // ─────────────────────────────────────────
    // 02. UPDATE CONTACTS
    // ─────────────────────────────────────────
    static void updateContacts() {
        boolean updateAnother = true;
        while (updateAnother) {
            clearConsole();
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                  UPDATE Contact                   |");
            System.out.println("+--------------------------------------------------+");
            System.out.println();

            System.out.print(" Search Contact by Name or Phone Number - ");
            String query = sc.nextLine().trim();

            int idx = findContact(query);
            if (idx == -1) {
                System.out.println("        No contact found for " + query + "...");
                System.out.println();
                System.out.print(" Do you want to update another Contact (Y/N): ");
                String ans = sc.nextLine().trim();
                updateAnother = ans.equalsIgnoreCase("Y");
                continue;
            }

            printContact(idx);

            System.out.println();
            System.out.println(" What do you want to update...");
            System.out.println();
            System.out.println("        [01] Name");
            System.out.println("        [02] Phone Number");
            System.out.println("        [03] Company Name");
            System.out.println("        [04] Salary");
            System.out.println();
            System.out.print(" Enter an option to continue -> ");
            String opt = sc.nextLine().trim();

            switch (opt) {
                case "01": case "1":
                    System.out.println();
                    System.out.println(" Update Name");
                    System.out.println(" ===========");
                    System.out.print(" Input new name - ");
                    names[idx] = sc.nextLine().trim();
                    break;
                case "02": case "2":
                    System.out.println();
                    System.out.println(" Update Phone Number");
                    System.out.println(" ====================");
                    System.out.print(" Input new phone number - ");
                    phones[idx] = inputValidPhone();
                    break;
                case "03": case "3":
                    System.out.println();
                    System.out.println(" Update Company Name");
                    System.out.println(" ====================");
                    System.out.print(" Input new company name - ");
                    companies[idx] = sc.nextLine().trim();
                    break;
                case "04": case "4":
                    System.out.println();
                    System.out.println(" Update Salary");
                    System.out.println(" =============");
                    System.out.print(" Input new salary - ");
                    salaries[idx] = inputValidSalary();
                    break;
                default:
                    System.out.println("  Invalid option.");
            }

            System.out.println();
            System.out.println("        Contact has been updated successfully...");
            System.out.println();
            System.out.print(" Do you want to update another Contact (Y/N): ");
            String ans = sc.nextLine().trim();
            updateAnother = ans.equalsIgnoreCase("Y");
        }
    }

    // ─────────────────────────────────────────
    // 03. DELETE CONTACTS
    // ─────────────────────────────────────────
    static void deleteContacts() {
        boolean deleteAnother = true;
        while (deleteAnother) {
            clearConsole();
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                  DELETE Contact                   |");
            System.out.println("+--------------------------------------------------+");
            System.out.println();

            System.out.print(" Search Contact by Name or Phone Number - ");
            String query = sc.nextLine().trim();

            int idx = findContact(query);
            if (idx == -1) {
                System.out.println("        No contact found for " + query + "...");
            } else {
                printContact(idx);
                System.out.println();
                System.out.print(" Do you want to delete this Contact (Y/N): ");
                String confirm = sc.nextLine().trim();
                if (confirm.equalsIgnoreCase("Y")) {
                    removeContact(idx);
                    System.out.println("        Customer has been deleted successfully...");
                } else {
                    System.out.println("        Delete cancelled.");
                }
            }

            System.out.println();
            System.out.print(" Do you want to delete another Contact (Y/N): ");
            String ans = sc.nextLine().trim();
            deleteAnother = ans.equalsIgnoreCase("Y");
        }
    }

    // ─────────────────────────────────────────
    // 04. SEARCH CONTACTS
    // ─────────────────────────────────────────
    static void searchContacts() {
        boolean searchAnother = true;
        while (searchAnother) {
            clearConsole();
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                  SEARCH Contact                   |");
            System.out.println("+--------------------------------------------------+");
            System.out.println();

            System.out.print(" Search Contact by Name or Phone Number - ");
            String query = sc.nextLine().trim();

            int idx = findContact(query);
            if (idx == -1) {
                System.out.println("        No contact found for " + query + "...");
            } else {
                printContact(idx);
            }

            System.out.println();
            System.out.print(" Do you want to search another contact (Y/N): ");
            String ans = sc.nextLine().trim();
            searchAnother = ans.equalsIgnoreCase("Y");
        }
    }

    // ─────────────────────────────────────────
    // 05. LIST CONTACTS
    // ─────────────────────────────────────────
    static void listContacts() {
        boolean stayHere = true;
        while (stayHere) {
            clearConsole();
            System.out.println("+------------------------------------------+");
            System.out.println("|               SORT Contact                |");
            System.out.println("+------------------------------------------+");
            System.out.println();
            System.out.println("        [01] Sorting by Name");
            System.out.println("        [02] Sorting by Salary");
            System.out.println("        [03] Sorting by Birthday");
            System.out.println();
            System.out.print(" Enter an option to continue -> ");
            String opt = sc.nextLine().trim();

            int[] order = getSortedOrder(opt);
            if (order == null) {
                System.out.println("  Invalid option.");
                System.out.print(" Press Enter to continue...");
                sc.nextLine();
                continue;
            }

            String title = "";
            if (opt.equals("01") || opt.equals("1")) title = "List Contact by Name";
            else if (opt.equals("02") || opt.equals("2")) title = "List Contact by Salary";
            else title = "List Contact by Birthday";

            clearConsole();
            System.out.println("+--------------------------------------------------+");
            System.out.println("|  " + title);
            System.out.println("+--------------------------------------------------+");
            System.out.println();
            System.out.printf("| %-8s | %-10s | %-12s | %-10s | %-10s | %-12s |%n",
                    "Contact ID", "Name", "Phone Number", "Company", "Salary", "Birthday");
            System.out.println("+----------+------------+--------------+------------+------------+--------------+");
            for (int i = 0; i < count; i++) {
                int j = order[i];
                System.out.printf("| %-8s | %-10s | %-12s | %-10s | %-10.1f | %-12s |%n",
                        ids[j], names[j], phones[j], companies[j], salaries[j], birthdays[j]);
            }
            System.out.println("+----------+------------+--------------+------------+------------+--------------+");
            System.out.println();
            System.out.print(" Do you want to go Home Page (Y/N): ");
            String ans = sc.nextLine().trim();
            stayHere = !ans.equalsIgnoreCase("Y");
        }
    }

    // ─────────────────────────────────────────
    // HELPER METHODS
    // ─────────────────────────────────────────

    static String generateId() {
        if (count == 0) return "C0001";
        // Get last used number from last id in the ids array
        int lastNum = 0;
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(ids[i].substring(1));
            if (num > lastNum) lastNum = num;
        }
        int next = lastNum + 1;
        return "C" + String.format("%04d", next);
    }

    static String inputValidPhone() {
        while (true) {
            System.out.print(" Phone Number     : ");
            String phone = sc.nextLine().trim();
            if (isValidPhone(phone)) return phone;
            System.out.println("        Invalid phone number...");
            System.out.print(" Do you want to add phone number again (Y/N): ");
            String retry = sc.nextLine().trim();
            if (!retry.equalsIgnoreCase("Y")) return phone; // allow exit if needed
        }
    }

    static boolean isValidPhone(String phone) {
        if (phone.length() != 10) return false;
        if (phone.charAt(0) != '0') return false;
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) return false;
        }
        return true;
    }

    static double inputValidSalary() {
        while (true) {
            System.out.print(" Salary           : ");
            String input = sc.nextLine().trim();
            try {
                double sal = Double.parseDouble(input);
                if (sal > 0) return sal;
            } catch (NumberFormatException e) {}
            System.out.println("        Invalid salary. Must be a positive number.");
        }
    }

    static String inputValidBirthday() {
        while (true) {
            System.out.print(" B'Day(YYYY-MM-DD): ");
            String bday = sc.nextLine().trim();
            if (isValidBirthday(bday)) return bday;
            System.out.println("        Invalid Birthday...");
            System.out.print(" Do you want to input birthday again (Y/N): ");
            String retry = sc.nextLine().trim();
            if (!retry.equalsIgnoreCase("Y")) return bday;
        }
    }

    static boolean isValidBirthday(String bday) {
        if (bday.length() != 10) return false;
        if (bday.charAt(4) != '-' || bday.charAt(7) != '-') return false;
        try {
            int year  = Integer.parseInt(bday.substring(0, 4));
            int month = Integer.parseInt(bday.substring(5, 7));
            int day   = Integer.parseInt(bday.substring(8, 10));
            if (month < 1 || month > 12) return false;
            if (day < 1 || day > daysInMonth(year, month)) return false;
            // Check not future date — today is 2026-06-07
            int todayYear = 2026, todayMonth = 6, todayDay = 7;
            if (year > todayYear) return false;
            if (year == todayYear && month > todayMonth) return false;
            if (year == todayYear && month == todayMonth && day > todayDay) return false;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static int daysInMonth(int year, int month) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month];
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int findContact(String query) {
        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(query) || phones[i].equals(query)) {
                return i;
            }
        }
        return -1;
    }

    static void printContact(int idx) {
        System.out.println();
        System.out.println("        Contact ID       : " + ids[idx]);
        System.out.println("        Name             : " + names[idx]);
        System.out.println("        Phone Number     : " + phones[idx]);
        System.out.println("        Company Name     : " + companies[idx]);
        System.out.println("        Salary           : " + salaries[idx]);
        System.out.println("        B'Day(YYYY-MM-DD): " + birthdays[idx]);
    }

    static void removeContact(int idx) {
        for (int i = idx; i < count - 1; i++) {
            ids[i] = ids[i + 1];
            names[i] = names[i + 1];
            phones[i] = phones[i + 1];
            companies[i] = companies[i + 1];
            salaries[i] = salaries[i + 1];
            birthdays[i] = birthdays[i + 1];
        }
        count--;
    }

    // Returns sorted index array based on option
    static int[] getSortedOrder(String opt) {
        int[] order = new int[count];
        for (int i = 0; i < count; i++) order[i] = i;

        if (opt.equals("01") || opt.equals("1")) {
            // Sort by Name (bubble sort)
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count - i - 1; j++) {
                    if (names[order[j]].compareToIgnoreCase(names[order[j + 1]]) > 0) {
                        int tmp = order[j]; order[j] = order[j + 1]; order[j + 1] = tmp;
                    }
                }
            }
        } else if (opt.equals("02") || opt.equals("2")) {
            // Sort by Salary ascending
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count - i - 1; j++) {
                    if (salaries[order[j]] > salaries[order[j + 1]]) {
                        int tmp = order[j]; order[j] = order[j + 1]; order[j + 1] = tmp;
                    }
                }
            }
        } else if (opt.equals("03") || opt.equals("3")) {
            // Sort by Birthday ascending
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count - i - 1; j++) {
                    if (birthdays[order[j]].compareTo(birthdays[order[j + 1]]) > 0) {
                        int tmp = order[j]; order[j] = order[j + 1]; order[j + 1] = tmp;
                    }
                }
            }
        } else {
            return null;
        }
        return order;
    }

    public static final void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
