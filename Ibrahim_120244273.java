    // 120244273 - Ibrahim Ali Ibrahim Abu Hassanein - Java Practical (101)
    // 120235430 - Bashar Mohammed Salem Al-Brim - Java Practical (101)

    import java.util.ArrayList;
    import java.util.Scanner;

    public class Ibrahim_120244273 {

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
                            "Please to enter your choice : ");
        }

        // ===== Case 1: Add Contact (Bonus: multi numbers) =====
        static void addContact() {
            String name;

            do {
                System.out.print("Enter name (type 'exit' to stop): ");
                name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty.");
                    continue;
                }
                if (name.equalsIgnoreCase("exit")) {
                    System.out.println("Cancelled adding contact.");
                    return; // stop the whole function
                }
                break;
            } while (!name.equalsIgnoreCase("exit"));

            System.out.print("Enter type (Family/Personal/Work/Other) or (f/p/w/o): ");
            String typeInput = sc.nextLine().trim();
            String lower = typeInput.toLowerCase();

            String type;
            if (lower.startsWith("f")) type = "Family";
            else if (lower.startsWith("p")) type = "Personal";
            else if (lower.startsWith("w")) type = "Work";
            else if (lower.startsWith("o")) type = "Other";
            else type = "Other";

            // FIX #1: actually fallback to Other
            if (!type.equalsIgnoreCase("Family") &&
                    !type.equalsIgnoreCase("Personal") &&
                    !type.equalsIgnoreCase("Work") &&
                    !type.equalsIgnoreCase("Other")) {
                type = "Other";
                System.out.println("Invalid type! It will be considered as Other");
            } else {
                type = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
            }

            ArrayList<String> nums = new ArrayList<>();
            String more;
            System.out.println("Enter 'exit' to exit");
            do {
                String number;
                boolean skippedThisEntry = false; // To continue & skip flow
                boolean exitNumbers = false;
                while (true) {
                    System.out.print("Enter number: ");
                    number = sc.nextLine().trim();

                    if (number.isEmpty()) {
                        System.out.println("Number is required (can't be empty).");
                        continue;
                    }
                    //number.equalsIgnoreCase
                    if(number.equalsIgnoreCase("exit")){
                        exitNumbers = true;
                        break;
                    }

                    // Allow N only if already has multiple numbers, or cancel contact when 0 numbers
                    if (number.equalsIgnoreCase("n") || number.equalsIgnoreCase("no")) {
                        if (nums.size() >= 1) {
                            skippedThisEntry = true; // skip adding another number
                            break;
                        } else {
                            System.out.println("No number entered. Contact not added.");
                            return; // cancel adding this contact
                        }
                    }

                    if (!isValidNumber(number)) {
                        System.out.println("Invalid number! Enter digits only.");
                        continue;
                    }

                    if (isNumberExists(number) || nums.contains(number)) {
                        if (nums.size() >= 1) {
                            System.out.println("Number already exists! Enter a different number or send (n) to skip.");
                        } else {
                            System.out.println("Number already exists! Enter a different number.");
                        }
                        continue;
                    }

                    nums.add(number);
                    System.out.println("Number added.");
                    break;
                }

                // If user skipped via N, stop the "add another?" flow immediately
                if (skippedThisEntry) {
                    more = "n";

                    if (exitNumbers) {
                        break; // NEW: break the do-while so it won't ask "Add another number?"
                    }

                } else {
                    System.out.print("Add another number? (yes/y or no/n): ");
                    more = sc.nextLine().trim();

                    while (!(more.equalsIgnoreCase("y") ||
                            more.equalsIgnoreCase("yes") ||
                            more.equalsIgnoreCase("n") ||
                            more.equalsIgnoreCase("no"))) {
                        System.out.print("Please enter yes/y or no/n: ");
                        more = sc.nextLine().trim();
                    }
                }

            } while (more.equalsIgnoreCase("y") || more.equalsIgnoreCase("yes"));

            if (!nums.isEmpty()) {
                contacts.add(name);
                types.add(type);
                nums_list.add(nums);
                System.out.println("Contact added successfully");
            } else {
                System.out.println("Contact not add any number...");
            }
        }

        // ===== Case 2: Search by Name (contains + Bonus similar by removing vowels) =====
        static void searchByName() {
            System.out.print("Enter name to search : ");
            String search = sc.nextLine().trim();

            if (search.isEmpty()) {
                System.out.println("Not found");
                return;
            }

            // Normalize input (lowercase, trim extra spaces)
            String searchNorm = normalize(search);

            // Similar search version (remove vowels but keep first letter)
            String searchSim  = removeVowelsKeepFirst(searchNorm);

            // Split search into separate words (tokens)
            String[] searchTokens = tokenize(searchNorm);
            String[] searchSimTokens = tokenize(searchSim);

            boolean found = false;


            // Loop through all saved contacts
            for (int i = 0; i < contacts.size(); i++) {
                String nameNorm = normalize(contacts.get(i));
                String nameSim  = removeVowelsKeepFirst(nameNorm);

                // 1) Exact word match
                // This prevents matching "Ali" inside "Khalid"
                if (matchByTokens(nameNorm, searchTokens)) {
                    System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
                    found = true;
                    continue;
                }

                // 2) Similar match (vowels removed but first letter preserved)
                // This prevents "hamad" from matching "ahmad"
                if (matchByTokens(nameSim, searchSimTokens)) {
                    System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
                    found = true;
                }
            }

            if (!found) System.out.println("Not found");
        }

        // ===== Case 3: Search by Number (must print ALL matches by numbers) =====
        static void searchByNumber() {
            String number = "";
            while (true) {
                System.out.print("Enter your number : ");
                number = sc.nextLine().trim();
                if (number.isEmpty()) {
                    System.out.println("Number is required (can't be empty).");
                    continue;
                }
                if (!isValidNumber(number)) {
                    System.out.println("Invalid number! Enter digits only.");
                    continue;
                }
                break;
            }

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
            String nameToDelete = sc.nextLine().trim();

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
        //== Old fun. ==
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

        // Normalize text:
    // - Convert to lowercase
        // - Remove extra spaces
        static String normalize(String s) {
            // lower + trim + collapse spaces
            s = s.toLowerCase().trim().replaceAll("\\s+", " ");
            return s;
        }

        // Split full name into separate words
    // Example: "ahmed ali" → ["ahmed", "ali"]
        static String[] tokenize(String s) {
            if (s.isEmpty()) return new String[0];
            return s.split(" ");
        }


        // Match full words only (NOT partial match)
    // Example:
    // search = "ali"
    // matches: "ahmed ali"
    // does NOT match: "khalid"
    static boolean matchByTokens(String fullNameNormalized, String[] searchTokens) {
            String[] nameTokens = tokenize(fullNameNormalized);

        // Each search word must exist as a full word inside the name
            for (String st : searchTokens) {
                boolean tokenFound = false;
                for (String nt : nameTokens) {
                    if (nt.equals(st)) {   //Full match
                        tokenFound = true;
                        break;
                    }
                }
                if (!tokenFound) return false;
            }
            return true;
        }

        // Remove vowels but keep the FIRST letter
    // This prevents mixing "hamad" with "ahmad"
    //
    // Example:
    // hamad  → hmd
    // ahmad  → ahmd   (different result → no wrong match)
    static String removeVowelsKeepFirst(String text) {
        text = normalize(text);
        if (text.isEmpty()) return "";

        String result = "";
        String[] words = tokenize(text);

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            if (word.isEmpty()) continue;

            String one = "" + word.charAt(0); // keep first letter

            for (int i = 1; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    one += c;
                }
            }

            if (!result.isEmpty()) result += " ";
            result += one;
        }

        return result;
    }
    }