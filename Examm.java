// لغة برمجة (1) عملي (شعبة 101) - ابراهيم علي ابراهيم أبو حسنين - 120244273
// لغة برمجة (1) عملي (شعبة 101) - بشار محمد سالم البريم - 120235430

import java.util.ArrayList;
import java.util.Scanner;

public class Examm {

    // ===== Keep Definitions (deff) =====
    static ArrayList<String> contacts = new ArrayList<>();
    static ArrayList<ArrayList<String>> nums_list = new ArrayList<>();
    static ArrayList<String> types = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            getMenu();
            String input = sc.nextLine().trim();

            if (input.startsWith("#")) {
                runPattern(input);
                continue;
            }

            try {
                choice = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Invalid choice");
                continue;
            }


            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByNumber();
                    break;
                case 4:
                    deleteByName();
                    break;
                case 5:
                    deleteByNumber();
                    break;
                case 6:
                    allContacts();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                case 8:
                    getPath();
            }
        } while (choice != 7);

        sc.close();
    }

    static void getMenu() {
        System.out.print(
            "\nWelcome to our Address book, please to find what you want\n" +
                "\t1. Add new contact\n" +
                "\t2. Search by name\n" +
                "\t3. Search by number\n" +
                "\t4. Delete contact by name\n" +
                "\t5. Delete contact by number\n" +
                "\t6. Show all contacts\n" +
                "\t7. Exit\n" +
                "\t8. Show Flow charts\n" +
                "Please to enter your choice : ");
    }

    // ===== Case 1: Add Contact (Bonus: multi numbers) =====
    static void addContact() {
        System.out.print("Enter name : ");
        String name = sc.nextLine();

        System.out.print("Enter type (Family/Personal/Work/Other) or (f/p/w/o): ");
        String typeInput = sc.nextLine().trim();
        String lower = typeInput.toLowerCase();

        String type;
        if (lower.startsWith("f")) type = "Family";
        else if (lower.startsWith("p")) type = "Personal";
        else if (lower.startsWith("w")) type = "Work";
        else if (lower.startsWith("o")) type = "Other";
        else type = typeInput; // will be validated below

        // validate type (required)
        if (!type.equalsIgnoreCase("Family") &&
                !type.equalsIgnoreCase("Personal") &&
                !type.equalsIgnoreCase("Work") &&
                !type.equalsIgnoreCase("Other")) {
            System.out.println("Invalid type! It will be considered as Other.");
            type = "Other";
        } else {
            type = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
        }

        // Bonus: one contact has many numbers
        ArrayList<String> nums = new ArrayList<>();
        String more;

        do {
            System.out.print("Enter number : ");
            String number = sc.nextLine().trim();

            // simple validation: digits only (you can allow + if you want)
            while (!isValidNumber(number)) {
                System.out.print("Invalid number! Enter digits only: ");
                number = sc.nextLine().trim();
            }

            // prevent duplicates: system-wide + inside current contact
            if (isNumberExists(number) || nums.contains(number)) {
                System.out.println("Number already exists!");
            } else {
                nums.add(number);
                System.out.println("Number added.");
            }

            System.out.print("Add another number? (y/ else (n)) : ");
            more = sc.nextLine().trim();

        } while (more.equalsIgnoreCase("y"));

        contacts.add(name);
        types.add(type);
        nums_list.add(nums);

        System.out.println("Contact added successfully");
    }

    // ===== Case 2: Search by Name (contains + Bonus similar by removing vowels) =====
    static void searchByName() {
        System.out.print("Enter name to search : ");
        String search = sc.nextLine();

        String searchNoVowels = removeVowels(search);

        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {
            String nameNoVowels = removeVowels(contacts.get(i));

            if (contacts.get(i).contains(search) || nameNoVowels.contains(searchNoVowels)) {
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
                found = true;
            }
        }

        if (!found) System.out.println("Not found");
    }

    // ===== Case 3: Search by Number (must print ALL matches) =====
    static void searchByNumber() {
        System.out.print("Enter number : ");
        String number = sc.nextLine().trim();

        boolean found = false;

        for (int i = 0; i < nums_list.size(); i++) {
            if (nums_list.get(i).contains(number)) {
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
                found = true;
            }
        }

        if (!found) System.out.println("Not found");
    }

    // ===== Case 4: Delete by Name (delete ALL full matches + print count) =====
    static void deleteByName() {
        System.out.print("Enter name to delete : ");
        String nameToDelete = sc.nextLine();

        int deleted = 0;

        for (int i = contacts.size() - 1; i >= 0; i--) {
            if (contacts.get(i).equals(nameToDelete)) {
                contacts.remove(i);
                types.remove(i);
                nums_list.remove(i);
                deleted++;
            }
        }

        if (deleted > 0) System.out.println(deleted + " contact(s) deleted");
        else System.out.println("Not found");
    }

    // ===== Case 5: Delete by Number (delete ALL contacts having that number) =====
    static void deleteByNumber() {
        System.out.print("Enter number to delete : ");
        String number = sc.nextLine().trim();

        int deleted = 0;

        for (int i = nums_list.size() - 1; i >= 0; i--) {
            if (nums_list.get(i).contains(number)) {
                contacts.remove(i);
                types.remove(i);
                nums_list.remove(i);
                deleted++;
            }
        }

        if (deleted > 0) System.out.println("Deleted successfully (" + deleted + ")");
        else System.out.println("Not found");
    }

    // ===== Case 6: Show all contacts =====
    static void allContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Your have a Zero contacts no contacts yet.");
        } else {
            System.out.println("\nYour count is " + contacts.size() + " Here are your contacts:");
            System.out.println("------------------------------------------------------------");
            System.out.println("\tName\t\tType\t\tNumbers");
            System.out.println("------------------------------------------------------------");

            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\t" + contacts.get(i) + "\t\t" + types.get(i) + "\t\t" + nums_list.get(i));
            }
        }
    }

    // Bonus helper: remove vowels for similar search
    static String removeVowels(String text) {
        text = text.toLowerCase();
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result += c;
            }
        }
        return result;
    }

    static void getPath() {
        System.out.println("\n========== Flow Charts ==========\n");

        printRow(flowAdd(), flowSearchByName());
        System.out.println();

        printRow(flowSearchByNumber(), flowDeleteByName());
        System.out.println();

        printRow(flowDeleteByNumber(), flowShowAll());
    }

    static String flowAdd() {
        return
                "1) Add new contact\n" +
                        "\tFlow:\n" +
                        "\t\t- Enter name\n" +
                        "\t\t- Enter type (Family/Personal/Work/Other) or (f/p/w/o)\n" +
                        "\t\t- Enter number\n" +
                        "\t\t- Add another number? (y/n)\n" +
                        "\t\t- Saved: name + type + numbers\n" +
                        "\tPattern:\n" +
                        "\t\t#1#<Name>#<Type>#<NumbersCSV>#\n" +
                        "\t\tExample:\n" +
                        "\t\t#1#Mohammed#Work#1,2,3#\n"
        ;
    }

    static String flowSearchByName() {
        return
                "2) Search by name\n" +
                        "\tFlow:\n" +
                        "\t\t- Enter name keyword\n" +
                        "\t\t- System prints all matches\n" +
                        "\tPattern:\n" +
                        "\t\t#2#<NameKeyword>#\n" +
                        "\t\tExample:\n" +
                        "\t\t#2#Mohammed#\n"
        ;
    }

    static String flowSearchByNumber() {
        return
                "3) Search by number\n" +
                        "\tFlow:\n" +
                        "\t\t- Enter number\n" +
                        "\t\t- System prints ALL matches\n" +
                        "\tPattern:\n" +
                        "\t\t#3#<Number>#\n" +
                        "\t\tExample:\n" +
                        "\t\t#3#0591234567#\n"
        ;
    }

    static String flowDeleteByName() {
    return

                "4) Delete by name\n" +
                        "\tFlow:\n" +
                        "\t\t- Enter full name (exact match)\n" +
                        "\t\t- System deletes ALL full matches + prints count\n" +
                        "\tPattern:\n" +
                        "\t\t#4#<FullName>#\n" +
                        "\t\tExample:\n" +
                        "\t\t#4#Mohmme Ali#\n"
        ;
    }
    static String flowDeleteByNumber() {
    return
                "5) Delete by number\n" +
                        "\tFlow:\n" +
                        "\t\t- Enter number\n" +
                        "\t\t- System deletes ALL contacts having this number\n" +
                        "\tPattern:\n" +
                        "\t\t#5#<Number>#\n" +
                        "\t\tExample:\n" +
                        "\t\t#5#0591234567#\n"
        ;
    }

    static String flowShowAll() {
    return
                "6) Show all contacts\n" +
                        "\tFlow:\n" +
                        "\t\t- System prints table of all contacts\n" +
                        "\tPattern:\n" +
                        "\t\t#6#\n" +
                        "\t\tExample:\n" +
                        "\t\t#6#\n"
        ;
    }



    static void runPattern(String pattern) {

        String[] raw = pattern.split("#");
        ArrayList<String> t = new ArrayList<>();
        for (String s : raw) {
            s = s.trim();
            if (!s.isEmpty()) t.add(s);
        }

        if (t.isEmpty()) {
            System.out.println("Empty pattern!");
            return;
        }

        int i = 0;
        while (i < t.size()) {
            String cmdStr = t.get(i++);

            if (!isInt(cmdStr)) {
                System.out.println("Pattern error: expected command number, got: " + cmdStr);
                return;
            }

            int cmd = Integer.parseInt(cmdStr);

            if (cmd == 1) {                 // #1#Name#Type#n1,n2#
                if (i + 2 >= t.size()) {
                    System.out.println("Pattern Add: #1#Name#Type#n1,n2#");
                    return;
                }
                String name = t.get(i++);
                String type = t.get(i++);
                String csv  = t.get(i++);
                jobAdd(name, type, csv);
            }
            else if (cmd == 2) {            // #2#keyword#
                if (i >= t.size()) {
                    System.out.println("Pattern Search Name: #2#keyword#");
                    return;
                }
                jobSearchName(t.get(i++));
            }
            else if (cmd == 3) {            // #3#number#
                if (i >= t.size()) {
                    System.out.println("Pattern Search Number: #3#number#");
                    return;
                }
                jobSearchNumber(t.get(i++));
            }
            else if (cmd == 4) {            // #4#fullName#
                if (i >= t.size()) {
                    System.out.println("Pattern Delete Name: #4#fullName#");
                    return;
                }
                jobDeleteName(t.get(i++));
            }
            else if (cmd == 5) {            // #5#number#
                if (i >= t.size()) {
                    System.out.println("Pattern Delete Number: #5#number#");
                    return;
                }
                jobDeleteNumber(t.get(i++));
            }
            else if (cmd == 6) {            // #6#
                allContacts();
            }
            else if (cmd == 7) {            // #7#
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else if (cmd == 8) {            // #8#
                getPath();
            }
            else {
                System.out.println("Unknown command in pattern: " + cmd);
                return;
            }
        }
    }

    // ===== jobs (prepare input then call existing functions) =====
    static void jobAdd(String name, String type, String numbersCsv) {
        String[] nums = numbersCsv.split(",");

        StringBuilder fake = new StringBuilder();
        fake.append(name).append("\n");
        fake.append(type).append("\n");

        int count = 0;
        for (String num : nums) {
            num = num.trim();
            if (num.isEmpty()) continue;

            count++;
            fake.append(num).append("\n");
            fake.append("y").append("\n");
        }

        if (count == 0) {
            fake.append("0\n");
            fake.append("n\n");
        } else {
            int lastY = fake.lastIndexOf("y\n");
            if (lastY != -1) {
                fake.replace(lastY, lastY + 2, "n\n");
            }
        }

        runWithFakeScanner(fake.toString(), () -> addContact());
    }


    static void jobSearchName(String keyword) {
        runWithFakeScanner(keyword + "\n", () -> searchByName());
    }

    static void jobSearchNumber(String number) {
        runWithFakeScanner(number.trim() + "\n", () -> searchByNumber());
    }

    static void jobDeleteName(String fullName) {
        runWithFakeScanner(fullName + "\n", () -> deleteByName());
    }

    static void jobDeleteNumber(String number) {
        runWithFakeScanner(number.trim() + "\n", () -> deleteByNumber());
    }

    // run any existing function using temporary scanner input
    static void runWithFakeScanner(String fakeInput, Runnable action) {
        Scanner old = sc;
        sc = new Scanner(fakeInput);
        try {
            action.run();
        } finally {
            sc = old;
        }
    }

    static boolean isInt(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }


    // ===== Helpers =====
    static boolean isNumberExists(String number) {
        for (ArrayList<String> list : nums_list) {
            if (list.contains(number)) return true;
        }
        return false;
    }

    static boolean isValidNumber(String number) {
        if (number.isEmpty()) return false;
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) return false;
        }
        return true;
    }

    static void printRow(String left, String right) {
        final int TAB_SIZE = 4;
        final int COL_GAP  = 6;

        String[] L = left.split("\n");
        String[] R = right.split("\n");

        for (int i = 0; i < L.length; i++) L[i] = expandTabs(L[i], TAB_SIZE);
        for (int i = 0; i < R.length; i++) R[i] = expandTabs(R[i], TAB_SIZE);

        int leftWidth = 0;
        for (String line : L) {
            if (line.length() > leftWidth) leftWidth = line.length();
        }

        int max = Math.max(L.length, R.length);
        for (int i = 0; i < max; i++) {
            String leftLine  = (i < L.length) ? L[i] : "";
            String rightLine = (i < R.length) ? R[i] : "";

            System.out.println(padRight(leftLine, leftWidth) + spaces(COL_GAP) + rightLine);
        }
    }

    static String expandTabs(String s, int tabSize) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\t') result += spaces(tabSize);
            else result += c;
        }
        return result;
    }

    static String padRight(String s, int width) {
        if (s.length() >= width) return s;
        return s + spaces(width - s.length());
    }

    static String spaces(int n) {
        String s = "";
        for (int i = 0; i < n; i++) s += " ";
        return s;
    }
    // === End Helpers ====
}


/**
 * -1 المطلوب الأول هو التحقق من انه ممنوع اضافة بدون رقم جوال.
 * 2-
 */