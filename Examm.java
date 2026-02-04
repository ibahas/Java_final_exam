// لغة برمجة (1) عملي (شعبة 101) - ابراهيم علي ابراهيم أبو حسنين - 120244273
// 
// لغة برمجة (1) عملي ( شعبة 101 ) - بشار محمد سالم البريم - 120235430

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Examm {

    // ===== Global Data =====
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<String> numbers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ===== Main =====
    public static void main(String[] args) {
        int choice;

        do {
            getMenu();
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

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
                //case 4:
                    //deleteByName(); // ⭐ new
                    //break;
                case 5:
                    deleteByNumber();
                    break;
                //case 6:
                    //allContacts();
                    //break;
                case 7:
                    System.out.println("Goodbye!");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);
        sc.close();
    }

    // ===== Menu =====
    static void getMenu() {
        System.out.println("Welcome to our Address book, please to find what you want\n" +
                "\t1. Add new contact\n" +
                "\t2. Search by name\n" +
                "\t3. Search by number\n" +
                "\t4. Delete contact by name\n" +
                "\t5. Delete contact by number\n" +
                "\t6. Show all contacts\n" +
                "\t7. Exit\n" +
                "Please to enter your choice :");
    }

    // ===== Functions =====
    static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter number: ");
        String number = sc.nextLine();

        if (numbers.contains(number)) {
            System.out.println("Number already exists!");
            return;
        }

        names.add(name);
        numbers.add(number);
        System.out.println("Contact added successfully");
    }

    static void searchByName() {
        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains(search)) {
                System.out.println(names.get(i) + " - " + numbers.get(i));
                found = true;
            }
        }

        if (!found)
            System.out.println("Not found");
    }

    static void searchByNumber() {
        System.out.print("Enter number: ");
        String number = sc.nextLine();

        int index = numbers.indexOf(number);
        if (index != -1)
            System.out.println(names.get(index) + " - " + number);
        else
            System.out.println("Not found");
    }

    static void deleteByNumber() {
        System.out.print("Enter number to delete: ");
        String number = sc.nextLine();

        int index = numbers.indexOf(number);
        if (index != -1) {
            names.remove(index);
            numbers.remove(index);
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Not found");
        }
    }

  
}
