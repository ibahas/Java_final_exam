# Line-by-Line Documentation / التوثيق سطر بسطر
# Ibrahim_120244273.java - Address Book Application

**Total Lines:** 430

---

## Lines 1-3: File Header / رأس الملف

### Line 1
```java
// 120244273 - Ibrahim Ali Ibrahim Abu Hassanein - Java Practical (101)
```
**English:** Comment line containing the first student's ID, full name, and course information.  
**العربية:** سطر تعليق يحتوي على رقم الطالب الأول، الاسم الكامل، ومعلومات المادة.

### Line 2
```java
// 120235430 - Bashar Mohammed Salem Al-Brim - Java Practical (101)
```
**English:** Comment line containing the second student's ID, full name, and course information.  
**العربية:** سطر تعليق يحتوي على رقم الطالب الثاني، الاسم الكامل، ومعلومات المادة.

### Line 3
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

---

## Lines 4-6: Import Statements / عبارات الاستيراد

### Line 4
```java
import java.util.ArrayList;
```
**English:** Imports the `ArrayList` class from `java.util` package. Used to create dynamic arrays for storing contacts, numbers, and types.  
**العربية:** يستورد كلاس `ArrayList` من حزمة `java.util`. يُستخدم لإنشاء مصفوفات ديناميكية لتخزين جهات الاتصال والأرقام والأنواع.

### Line 5
```java
import java.util.Scanner;
```
**English:** Imports the `Scanner` class from `java.util` package. Used to read user input from the console.  
**العربية:** يستورد كلاس `Scanner` من حزمة `java.util`. يُستخدم لقراءة إدخال المستخدم من وحدة التحكم.

### Line 6
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

---

## Lines 7-8: Class Declaration / إعلان الكلاس

### Line 7
```java
public class Ibrahim_120244273 {
```
**English:** Declares a public class named `Ibrahim_120244273`. This is the main class that contains all the program code. The class name follows the format: FirstName_StudentID.  
**العربية:** يعلن عن كلاس عام باسم `Ibrahim_120244273`. هذا هو الكلاس الرئيسي الذي يحتوي على كل كود البرنامج. اسم الكلاس يتبع الصيغة: الاسم الأول_رقم الطالب.

### Line 8
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

---

## Lines 9-14: Static Data Structures / هياكل البيانات الثابتة

### Line 9
```java
    // ===== Keep Definitions (deff) =====
```
**English:** Comment indicating the start of static variable definitions section.  
**العربية:** تعليق يشير إلى بداية قسم تعريف المتغيرات الثابتة.

### Line 10
```java
    static ArrayList<String> contacts = new ArrayList<>();
```
**English:** Declares a static ArrayList of Strings named `contacts` to store contact names. Initialized as an empty ArrayList. Static means it belongs to the class, not to instances.  
**العربية:** يعلن عن ArrayList ثابت من نوع String باسم `contacts` لتخزين أسماء جهات الاتصال. يتم تهيئته كمصفوفة ArrayList فارغة. الثابت يعني أنه ينتمي للكلاس وليس للكائنات.

### Line 11
```java
    static ArrayList<ArrayList<String>> nums_list = new ArrayList<>();
```
**English:** Declares a static ArrayList that contains ArrayLists of Strings. This nested structure stores multiple phone numbers for each contact. Each contact can have a list of phone numbers.  
**العربية:** يعلن عن ArrayList ثابت يحتوي على ArrayLists من نوع String. هذه البنية المتداخلة تخزن عدة أرقام هواتف لكل جهة اتصال. كل جهة اتصال يمكن أن تحتوي على قائمة أرقام هواتف.

### Line 12
```java
    static ArrayList<String> types = new ArrayList<>();
```
**English:** Declares a static ArrayList of Strings named `types` to store contact types (Family, Personal, Work, Other). Each index corresponds to the same index in `contacts` and `nums_list`.  
**العربية:** يعلن عن ArrayList ثابت من نوع String باسم `types` لتخزين أنواع جهات الاتصال (عائلة، شخصي، عمل، أخرى). كل فهرس يتوافق مع نفس الفهرس في `contacts` و `nums_list`.

### Line 13
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 14
```java
    static Scanner sc = new Scanner(System.in);
```
**English:** Declares a static Scanner object named `sc` initialized to read from `System.in` (standard input/console). This Scanner is used throughout the program to read user input.  
**العربية:** يعلن عن كائن Scanner ثابت باسم `sc` مهيأ للقراءة من `System.in` (الإدخال القياسي/وحدة التحكم). هذا Scanner يُستخدم في جميع أنحاء البرنامج لقراءة إدخال المستخدم.

---

## Lines 16-57: Main Method / الدالة الرئيسية

### Line 15
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 16
```java
    public static void main(String[] args) {
```
**English:** Declares the main method, which is the entry point of the Java program. `public` means accessible from anywhere, `static` means it belongs to the class, `void` means it returns nothing, `String[] args` is for command-line arguments (not used here).  
**العربية:** يعلن عن الدالة الرئيسية، وهي نقطة الدخول لبرنامج Java. `public` يعني أنه يمكن الوصول إليه من أي مكان، `static` يعني أنه ينتمي للكلاس، `void` يعني أنه لا يرجع قيمة، `String[] args` للمعاملات من سطر الأوامر (غير مستخدم هنا).

### Line 17
```java
        int choice = 0;
```
**English:** Declares and initializes an integer variable `choice` to store the user's menu selection. Initialized to 0.  
**العربية:** يعلن ويهيئ متغير عدد صحيح `choice` لتخزين اختيار المستخدم من القائمة. يتم تهيئته إلى 0.

### Line 18
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 19
```java
        do {
```
**English:** Starts a do-while loop. This loop will execute at least once, then continue while the condition is true.  
**العربية:** يبدأ حلقة do-while. هذه الحلقة ستنفذ مرة واحدة على الأقل، ثم تستمر بينما الشرط صحيح.

### Line 20
```java
            getMenu();
```
**English:** Calls the `getMenu()` function to display the menu options to the user.  
**العربية:** يستدعي دالة `getMenu()` لعرض خيارات القائمة للمستخدم.

### Line 21
```java
            String input = sc.nextLine().trim();
```
**English:** Reads a line of input from the user using `sc.nextLine()`, stores it in `input`, and removes leading/trailing whitespace using `.trim()`.  
**العربية:** يقرأ سطراً من إدخال المستخدم باستخدام `sc.nextLine()`، يخزنه في `input`، ويزيل المسافات الزائدة في البداية والنهاية باستخدام `.trim()`.

### Line 22
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 23
```java
            try {
```
**English:** Starts a try block to handle potential exceptions when converting the input string to an integer.  
**العربية:** يبدأ كتلة try للتعامل مع الاستثناءات المحتملة عند تحويل سلسلة الإدخال إلى عدد صحيح.

### Line 24
```java
                choice = Integer.parseInt(input);
```
**English:** Converts the input string to an integer using `Integer.parseInt()` and stores it in `choice`. This may throw a `NumberFormatException` if the input is not a valid number.  
**العربية:** يحول سلسلة الإدخال إلى عدد صحيح باستخدام `Integer.parseInt()` ويخزنه في `choice`. قد يرمي `NumberFormatException` إذا كان الإدخال ليس رقماً صحيحاً.

### Line 25
```java
            } catch (Exception e) {
```
**English:** Catches any exception (like `NumberFormatException`) that occurs in the try block. The exception object is stored in `e`.  
**العربية:** يلتقط أي استثناء (مثل `NumberFormatException`) يحدث في كتلة try. كائن الاستثناء يُخزن في `e`.

### Line 26
```java
                System.out.println("Invalid choice");
```
**English:** Prints an error message "Invalid choice" when the input cannot be converted to an integer.  
**العربية:** يطبع رسالة خطأ "Invalid choice" عندما لا يمكن تحويل الإدخال إلى عدد صحيح.

### Line 27
```java
                continue;
```
**English:** Skips the rest of the loop iteration and goes back to the beginning of the loop (line 19). This allows the user to try again.  
**العربية:** يتخطى باقي تكرار الحلقة ويعود إلى بداية الحلقة (السطر 19). هذا يسمح للمستخدم بالمحاولة مرة أخرى.

### Line 28
```java
            }
```
**English:** Closes the try-catch block.  
**العربية:** يغلق كتلة try-catch.

### Line 29
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 30
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 31
```java
            switch (choice) {
```
**English:** Starts a switch statement that checks the value of `choice` and executes different code blocks based on its value.  
**العربية:** يبدأ عبارة switch التي تتحقق من قيمة `choice` وتنفذ كتل كود مختلفة بناءً على قيمتها.

### Line 32
```java
                case 1:
```
**English:** Case label for when `choice` equals 1 (Add new contact).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 1 (إضافة جهة اتصال جديدة).

### Line 33
```java
                    addContact();
```
**English:** Calls the `addContact()` function to add a new contact to the address book.  
**العربية:** يستدعي دالة `addContact()` لإضافة جهة اتصال جديدة إلى دفتر العناوين.

### Line 34
```java
                    break;
```
**English:** Exits the switch statement to prevent falling through to the next case.  
**العربية:** يخرج من عبارة switch لمنع الانتقال إلى الحالة التالية.

### Line 35
```java
                case 2:
```
**English:** Case label for when `choice` equals 2 (Search by name).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 2 (البحث بالاسم).

### Line 36
```java
                    searchByName();
```
**English:** Calls the `searchByName()` function to search for contacts by name.  
**العربية:** يستدعي دالة `searchByName()` للبحث عن جهات الاتصال بالاسم.

### Line 37
```java
                    break;
```
**English:** Exits the switch statement.  
**العربية:** يخرج من عبارة switch.

### Line 38
```java
                case 3:
```
**English:** Case label for when `choice` equals 3 (Search by number).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 3 (البحث بالرقم).

### Line 39
```java
                    searchByNumber();
```
**English:** Calls the `searchByNumber()` function to search for contacts by phone number.  
**العربية:** يستدعي دالة `searchByNumber()` للبحث عن جهات الاتصال برقم الهاتف.

### Line 40
```java
                    break;
```
**English:** Exits the switch statement.  
**العربية:** يخرج من عبارة switch.

### Line 41
```java
                case 4:
```
**English:** Case label for when `choice` equals 4 (Delete contact by name).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 4 (حذف جهة اتصال بالاسم).

### Line 42
```java
                    deleteByName();
```
**English:** Calls the `deleteByName()` function to delete contacts by name.  
**العربية:** يستدعي دالة `deleteByName()` لحذف جهات الاتصال بالاسم.

### Line 43
```java
                    break;
```
**English:** Exits the switch statement.  
**العربية:** يخرج من عبارة switch.

### Line 44
```java
                case 5:
```
**English:** Case label for when `choice` equals 5 (Delete contact by number).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 5 (حذف جهة اتصال بالرقم).

### Line 45
```java
                    deleteByNumber();
```
**English:** Calls the `deleteByNumber()` function to delete contacts by phone number.  
**العربية:** يستدعي دالة `deleteByNumber()` لحذف جهات الاتصال برقم الهاتف.

### Line 46
```java
                    break;
```
**English:** Exits the switch statement.  
**العربية:** يخرج من عبارة switch.

### Line 47
```java
                case 6:
```
**English:** Case label for when `choice` equals 6 (Show all contacts).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 6 (عرض جميع جهات الاتصال).

### Line 48
```java
                    allContacts();
```
**English:** Calls the `allContacts()` function to display all contacts in the address book.  
**العربية:** يستدعي دالة `allContacts()` لعرض جميع جهات الاتصال في دفتر العناوين.

### Line 49
```java
                    break;
```
**English:** Exits the switch statement.  
**العربية:** يخرج من عبارة switch.

### Line 50
```java
                case 7:
```
**English:** Case label for when `choice` equals 7 (Exit).  
**العربية:** تسمية حالة عندما يكون `choice` يساوي 7 (خروج).

### Line 51
```java
                    System.out.println("Goodbye!");
```
**English:** Prints "Goodbye!" message to the user before exiting.  
**العربية:** يطبع رسالة "Goodbye!" للمستخدم قبل الخروج.

### Line 52
```java
                    break;
```
**English:** Exits the switch statement.  
**العربية:** يخرج من عبارة switch.

### Line 53
```java
            }
```
**English:** Closes the switch statement.  
**العربية:** يغلق عبارة switch.

### Line 54
```java
        } while (choice != 7);
```
**English:** End of the do-while loop. The loop continues as long as `choice` is not equal to 7. When `choice` is 7, the loop exits and the program ends.  
**العربية:** نهاية حلقة do-while. تستمر الحلقة طالما أن `choice` لا يساوي 7. عندما يكون `choice` يساوي 7، تخرج الحلقة وينتهي البرنامج.

### Line 55
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 56
```java
        sc.close();
```
**English:** Closes the Scanner object to free system resources. This is good practice to prevent resource leaks.  
**العربية:** يغلق كائن Scanner لتحرير موارد النظام. هذه ممارسة جيدة لمنع تسرب الموارد.

### Line 57
```java
    }
```
**English:** Closes the main method.  
**العربية:** يغلق الدالة الرئيسية.

---

## Lines 59-70: getMenu() Function / دالة getMenu()

### Line 58
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 59
```java
    static void getMenu() {
```
**English:** Declares a static method `getMenu()` that returns nothing (`void`). This function displays the menu options.  
**العربية:** يعلن عن دالة ثابتة `getMenu()` لا ترجع قيمة (`void`). هذه الدالة تعرض خيارات القائمة.

### Line 60
```java
        System.out.print(
```
**English:** Starts a `System.out.print()` statement to print text without a newline at the end. The opening parenthesis indicates the start of the print statement that continues on multiple lines.  
**العربية:** يبدأ عبارة `System.out.print()` لطباعة نص بدون سطر جديد في النهاية. القوس المفتوح يشير إلى بداية عبارة الطباعة التي تستمر على عدة أسطر.

### Line 61
```java
                "\nWelcome to our Address book, please to find what you want\n" +
```
**English:** First part of the menu string. `\n` creates a newline. The `+` operator concatenates strings.  
**العربية:** الجزء الأول من سلسلة القائمة. `\n` ينشئ سطراً جديداً. عامل `+` يربط السلاسل.

### Line 62
```java
                        "\t1. Add new contact\n" +
```
**English:** Menu option 1 with a tab (`\t`) for indentation and newline (`\n`) at the end.  
**العربية:** خيار القائمة 1 مع مسافة جدولة (`\t`) للتراجع وسطر جديد (`\n`) في النهاية.

### Line 63
```java
                        "\t2. Search by name\n" +
```
**English:** Menu option 2 with tab and newline.  
**العربية:** خيار القائمة 2 مع مسافة جدولة وسطر جديد.

### Line 64
```java
                        "\t3. Search by number\n" +
```
**English:** Menu option 3 with tab and newline.  
**العربية:** خيار القائمة 3 مع مسافة جدولة وسطر جديد.

### Line 65
```java
                        "\t4. Delete contact by name\n" +
```
**English:** Menu option 4 with tab and newline.  
**العربية:** خيار القائمة 4 مع مسافة جدولة وسطر جديد.

### Line 66
```java
                        "\t5. Delete contact by number\n" +
```
**English:** Menu option 5 with tab and newline.  
**العربية:** خيار القائمة 5 مع مسافة جدولة وسطر جديد.

### Line 67
```java
                        "\t6. Show all contacts\n" +
```
**English:** Menu option 6 with tab and newline.  
**العربية:** خيار القائمة 6 مع مسافة جدولة وسطر جديد.

### Line 68
```java
                        "\t7. Exit\n" +
```
**English:** Menu option 7 with tab and newline.  
**العربية:** خيار القائمة 7 مع مسافة جدولة وسطر جديد.

### Line 69
```java
                        "Please to enter your choice : ");
```
**English:** Final part of the menu string prompting the user to enter their choice. Closes the `System.out.print()` statement.  
**العربية:** الجزء الأخير من سلسلة القائمة الذي يطلب من المستخدم إدخال اختياره. يغلق عبارة `System.out.print()`.

### Line 70
```java
    }
```
**English:** Closes the `getMenu()` function.  
**العربية:** يغلق دالة `getMenu()`.

---

## Lines 72-194: addContact() Function / دالة addContact()

### Line 71
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 72
```java
    // ===== Case 1: Add Contact (Bonus: multi numbers) =====
```
**English:** Comment describing this function as Case 1 (Add Contact) with bonus feature of supporting multiple numbers per contact.  
**العربية:** تعليق يصف هذه الدالة كحالة 1 (إضافة جهة اتصال) مع ميزة إضافية لدعم عدة أرقام لكل جهة اتصال.

### Line 73
```java
    static void addContact() {
```
**English:** Declares a static method `addContact()` that returns nothing. This function adds a new contact to the address book.  
**العربية:** يعلن عن دالة ثابتة `addContact()` لا ترجع قيمة. هذه الدالة تضيف جهة اتصال جديدة إلى دفتر العناوين.

### Line 74
```java
        String name;
```
**English:** Declares a String variable `name` to store the contact's name.  
**العربية:** يعلن عن متغير String `name` لتخزين اسم جهة الاتصال.

### Line 75
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 76
```java
        do {
```
**English:** Starts a do-while loop for name input validation.  
**العربية:** يبدأ حلقة do-while للتحقق من إدخال الاسم.

### Line 77
```java
            System.out.print("Enter name (type 'exit' to stop): ");
```
**English:** Prompts the user to enter a name or type 'exit' to cancel.  
**العربية:** يطلب من المستخدم إدخال اسم أو كتابة 'exit' للإلغاء.

### Line 78
```java
            name = sc.nextLine().trim();
```
**English:** Reads the user's input, stores it in `name`, and removes leading/trailing whitespace.  
**العربية:** يقرأ إدخال المستخدم، يخزنه في `name`، ويزيل المسافات الزائدة.

### Line 79
```java
            if (name.isEmpty()) {
```
**English:** Checks if the name string is empty (no characters entered).  
**العربية:** يتحقق من كون سلسلة الاسم فارغة (لم يتم إدخال أي أحرف).

### Line 80
```java
                System.out.println("Name cannot be empty.");
```
**English:** Prints an error message if the name is empty.  
**العربية:** يطبع رسالة خطأ إذا كان الاسم فارغاً.

### Line 81
```java
                continue;
```
**English:** Skips to the next iteration of the loop, asking for the name again.  
**العربية:** يتخطى إلى التكرار التالي من الحلقة، ويسأل عن الاسم مرة أخرى.

### Line 82
```java
            }
```
**English:** Closes the if statement checking for empty name.  
**العربية:** يغلق عبارة if التي تتحقق من الاسم الفارغ.

### Line 83
```java
            if (name.equalsIgnoreCase("exit")) {
```
**English:** Checks if the user typed "exit" (case-insensitive comparison).  
**العربية:** يتحقق من كتابة المستخدم "exit" (مقارنة غير حساسة لحالة الأحرف).

### Line 84
```java
                System.out.println("Cancelled adding contact.");
```
**English:** Prints a cancellation message.  
**العربية:** يطبع رسالة إلغاء.

### Line 85
```java
                return; // stop the whole function
```
**English:** Exits the function immediately, canceling the contact addition process.  
**العربية:** يخرج من الدالة فوراً، ملغياً عملية إضافة جهة الاتصال.

### Line 86
```java
            }
```
**English:** Closes the if statement checking for "exit".  
**العربية:** يغلق عبارة if التي تتحقق من "exit".

### Line 87
```java
            break;
```
**English:** Exits the do-while loop if a valid name was entered.  
**العربية:** يخرج من حلقة do-while إذا تم إدخال اسم صحيح.

### Line 88
```java
        } while (!name.equalsIgnoreCase("exit"));
```
**English:** End of do-while loop. Continues looping while name is not "exit" (though break exits earlier).  
**العربية:** نهاية حلقة do-while. تستمر الحلقة بينما الاسم ليس "exit" (رغم أن break يخرج قبل ذلك).

### Line 89
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 90
```java
        System.out.print("Enter type (Family/Personal/Work/Other) or (f/p/w/o): ");
```
**English:** Prompts the user to enter a contact type (full word or single letter).  
**العربية:** يطلب من المستخدم إدخال نوع جهة الاتصال (كلمة كاملة أو حرف واحد).

### Line 91
```java
        String typeInput = sc.nextLine().trim();
```
**English:** Reads the type input and stores it in `typeInput` after trimming whitespace.  
**العربية:** يقرأ إدخال النوع ويخزنه في `typeInput` بعد إزالة المسافات.

### Line 92
```java
        String lower = typeInput.toLowerCase();
```
**English:** Converts the input to lowercase for case-insensitive comparison.  
**العربية:** يحول الإدخال إلى أحرف صغيرة للمقارنة غير الحساسة لحالة الأحرف.

### Line 93
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 94
```java
        String type;
```
**English:** Declares a String variable `type` to store the normalized contact type.  
**العربية:** يعلن عن متغير String `type` لتخزين نوع جهة الاتصال الموحد.

### Line 95
```java
        if (lower.startsWith("f")) type = "Family";
```
**English:** Checks if the lowercase input starts with "f" and sets type to "Family".  
**العربية:** يتحقق من بدء الإدخال الصغير بـ "f" ويضبط النوع إلى "Family".

### Line 96
```java
        else if (lower.startsWith("p")) type = "Personal";
```
**English:** Otherwise, if input starts with "p", sets type to "Personal".  
**العربية:** وإلا، إذا بدأ الإدخال بـ "p"، يضبط النوع إلى "Personal".

### Line 97
```java
        else if (lower.startsWith("w")) type = "Work";
```
**English:** Otherwise, if input starts with "w", sets type to "Work".  
**العربية:** وإلا، إذا بدأ الإدخال بـ "w"، يضبط النوع إلى "Work".

### Line 98
```java
        else if (lower.startsWith("o")) type = "Other";
```
**English:** Otherwise, if input starts with "o", sets type to "Other".  
**العربية:** وإلا، إذا بدأ الإدخال بـ "o"، يضبط النوع إلى "Other".

### Line 99
```java
        else type = "Other";
```
**English:** If none of the above match, defaults to "Other".  
**العربية:** إذا لم يطابق أي من أعلاه، يفترض "Other".

### Line 100
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 101
```java
        // FIX #1: actually fallback to Other
```
**English:** Comment indicating a fix to ensure invalid types fallback to "Other".  
**العربية:** تعليق يشير إلى إصلاح لضمان أن الأنواع غير الصحيحة تصبح "Other".

### Line 102
```java
        if (!type.equalsIgnoreCase("Family") &&
```
**English:** Checks if type is NOT "Family" (case-insensitive). The `&&` operator continues the condition check.  
**العربية:** يتحقق من كون النوع ليس "Family" (غير حساس لحالة الأحرف). عامل `&&` يستمر في فحص الشرط.

### Line 103
```java
                !type.equalsIgnoreCase("Personal") &&
```
**English:** Also checks if type is NOT "Personal".  
**العربية:** يتحقق أيضاً من كون النوع ليس "Personal".

### Line 104
```java
                !type.equalsIgnoreCase("Work") &&
```
**English:** Also checks if type is NOT "Work".  
**العربية:** يتحقق أيضاً من كون النوع ليس "Work".

### Line 105
```java
                !type.equalsIgnoreCase("Other")) {
```
**English:** Also checks if type is NOT "Other". If all conditions are true (type is invalid), enters the if block.  
**العربية:** يتحقق أيضاً من كون النوع ليس "Other". إذا كانت جميع الشروط صحيحة (النوع غير صحيح)، يدخل كتلة if.

### Line 106
```java
            type = "Other";
```
**English:** Sets type to "Other" for invalid input.  
**العربية:** يضبط النوع إلى "Other" للإدخال غير الصحيح.

### Line 107
```java
            System.out.println("Invalid type! It will be considered as Other");
```
**English:** Prints a warning message that the type was invalid and defaulted to "Other".  
**العربية:** يطبع رسالة تحذير أن النوع كان غير صحيح وتم افتراض "Other".

### Line 108
```java
        } else {
```
**English:** Else block for when type is valid.  
**العربية:** كتلة else عندما يكون النوع صحيحاً.

### Line 109
```java
            type = type.substring(0, 1).toUpperCase() + type.substring(1).toLowerCase();
```
**English:** Formats the type string: first letter uppercase, rest lowercase (e.g., "family" → "Family").  
**العربية:** ينسق سلسلة النوع: الحرف الأول كبير، والباقي صغير (مثلاً، "family" → "Family").

### Line 110
```java
        }
```
**English:** Closes the if-else block.  
**العربية:** يغلق كتلة if-else.

### Line 111
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 112
```java
        ArrayList<String> nums = new ArrayList<>();
```
**English:** Creates a new ArrayList to store phone numbers for this contact.  
**العربية:** ينشئ ArrayList جديداً لتخزين أرقام الهواتف لهذه جهة الاتصال.

### Line 113
```java
        String more;
```
**English:** Declares a String variable `more` to store user's response about adding more numbers.  
**العربية:** يعلن عن متغير String `more` لتخزين رد المستخدم حول إضافة المزيد من الأرقام.

### Line 114
```java
        System.out.println("Enter 'exit' to exit");
```
**English:** Informs the user they can type 'exit' to stop entering numbers.  
**العربية:** يخبر المستخدم أنه يمكنه كتابة 'exit' لإيقاف إدخال الأرقام.

### Line 115
```java
        do {
```
**English:** Starts a do-while loop for entering multiple phone numbers.  
**العربية:** يبدأ حلقة do-while لإدخال عدة أرقام هواتف.

### Line 116
```java
            String number;
```
**English:** Declares a String variable `number` for the current phone number being entered.  
**العربية:** يعلن عن متغير String `number` لرقم الهاتف الحالي الذي يتم إدخاله.

### Line 117
```java
            boolean skippedThisEntry = false; // To continue & skip flow
```
**English:** Declares a boolean flag to track if the user skipped adding a number (by typing "n").  
**العربية:** يعلن عن علامة منطقية لتتبع ما إذا كان المستخدم قد تخطى إضافة رقم (بكتابة "n").

### Line 118
```java
            boolean exitNumbers = false;
```
**English:** Declares a boolean flag to track if the user typed "exit" to stop entering numbers.  
**العربية:** يعلن عن علامة منطقية لتتبع ما إذا كان المستخدم قد كتب "exit" لإيقاف إدخال الأرقام.

### Line 119
```java
            while (true) {
```
**English:** Starts an infinite while loop that continues until explicitly broken.  
**العربية:** يبدأ حلقة while لا نهائية تستمر حتى يتم كسرها صراحة.

### Line 120
```java
                System.out.print("Enter number: ");
```
**English:** Prompts the user to enter a phone number.  
**العربية:** يطلب من المستخدم إدخال رقم هاتف.

### Line 121
```java
                number = sc.nextLine().trim();
```
**English:** Reads the phone number input and trims whitespace.  
**العربية:** يقرأ إدخال رقم الهاتف ويزيل المسافات.

### Line 122
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 123
```java
                if (number.isEmpty()) {
```
**English:** Checks if the number input is empty.  
**العربية:** يتحقق من كون إدخال الرقم فارغاً.

### Line 124
```java
                    System.out.println("Number is required (can't be empty).");
```
**English:** Prints an error message for empty number input.  
**العربية:** يطبع رسالة خطأ لإدخال رقم فارغ.

### Line 125
```java
                    continue;
```
**English:** Skips to the next iteration, asking for the number again.  
**العربية:** يتخطى إلى التكرار التالي، ويسأل عن الرقم مرة أخرى.

### Line 126
```java
                }
```
**English:** Closes the if statement for empty number check.  
**العربية:** يغلق عبارة if للتحقق من الرقم الفارغ.

### Line 127
```java
                //number.equalsIgnoreCase
```
**English:** Comment (possibly leftover from development).  
**العربية:** تعليق (ربما متبقي من التطوير).

### Line 128
```java
                if(number.equalsIgnoreCase("exit")){
```
**English:** Checks if the user typed "exit" (case-insensitive).  
**العربية:** يتحقق من كتابة المستخدم "exit" (غير حساس لحالة الأحرف).

### Line 129
```java
                    exitNumbers = true;
```
**English:** Sets the `exitNumbers` flag to true to indicate the user wants to stop.  
**العربية:** يضبط علامة `exitNumbers` إلى true للإشارة إلى أن المستخدم يريد التوقف.

### Line 130
```java
                    break;
```
**English:** Exits the inner while loop.  
**العربية:** يخرج من حلقة while الداخلية.

### Line 131
```java
                }
```
**English:** Closes the if statement for "exit" check.  
**العربية:** يغلق عبارة if للتحقق من "exit".

### Line 132
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 133
```java
                // Allow N only if already has multiple numbers, or cancel contact when 0 numbers
```
**English:** Comment explaining the logic for handling "n" input.  
**العربية:** تعليق يشرح منطق التعامل مع إدخال "n".

### Line 134
```java
                if (number.equalsIgnoreCase("n") || number.equalsIgnoreCase("no")) {
```
**English:** Checks if the user typed "n" or "no" (case-insensitive).  
**العربية:** يتحقق من كتابة المستخدم "n" أو "no" (غير حساس لحالة الأحرف).

### Line 135
```java
                    if (nums.size() >= 1) {
```
**English:** Checks if the contact already has at least one number.  
**العربية:** يتحقق من وجود رقم واحد على الأقل لجهة الاتصال.

### Line 136
```java
                        skippedThisEntry = true; // skip adding another number
```
**English:** Sets flag to indicate user wants to skip adding more numbers (but keep existing ones).  
**العربية:** يضبط علامة للإشارة إلى أن المستخدم يريد تخطي إضافة المزيد من الأرقام (لكن الاحتفاظ بالموجودة).

### Line 137
```java
                        break;
```
**English:** Exits the inner while loop.  
**العربية:** يخرج من حلقة while الداخلية.

### Line 138
```java
                    } else {
```
**English:** Else block for when contact has no numbers yet.  
**العربية:** كتلة else عندما لا تحتوي جهة الاتصال على أرقام بعد.

### Line 139
```java
                        System.out.println("No number entered. Contact not added.");
```
**English:** Prints a message that the contact cannot be added without at least one number.  
**العربية:** يطبع رسالة أنه لا يمكن إضافة جهة الاتصال بدون رقم واحد على الأقل.

### Line 140
```java
                        return; // cancel adding this contact
```
**English:** Exits the function, canceling the entire contact addition.  
**العربية:** يخرج من الدالة، ملغياً إضافة جهة الاتصال بالكامل.

### Line 141
```java
                    }
```
**English:** Closes the if-else block for "n"/"no" handling.  
**العربية:** يغلق كتلة if-else للتعامل مع "n"/"no".

### Line 142
```java
                }
```
**English:** Closes the outer if statement for "n"/"no" check.  
**العربية:** يغلق عبارة if الخارجية للتحقق من "n"/"no".

### Line 143
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 144
```java
                if (!isValidNumber(number)) {
```
**English:** Checks if the number is valid (digits only) by calling the helper function `isValidNumber()`.  
**العربية:** يتحقق من صحة الرقم (أرقام فقط) عن طريق استدعاء الدالة المساعدة `isValidNumber()`.

### Line 145
```java
                    System.out.println("Invalid number! Enter digits only.");
```
**English:** Prints an error message for invalid number format.  
**العربية:** يطبع رسالة خطأ لتنسيق الرقم غير الصحيح.

### Line 146
```java
                    continue;
```
**English:** Skips to the next iteration, asking for the number again.  
**العربية:** يتخطى إلى التكرار التالي، ويسأل عن الرقم مرة أخرى.

### Line 147
```java
                }
```
**English:** Closes the if statement for number validation.  
**العربية:** يغلق عبارة if للتحقق من الرقم.

### Line 148
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 149
```java
                if (isNumberExists(number) || nums.contains(number)) {
```
**English:** Checks if the number already exists in any contact OR if it's already in the current contact's number list.  
**العربية:** يتحقق من وجود الرقم مسبقاً في أي جهة اتصال أو إذا كان موجوداً بالفعل في قائمة أرقام جهة الاتصال الحالية.

### Line 150
```java
                    if (nums.size() >= 1) {
```
**English:** Checks if the current contact already has at least one number.  
**العربية:** يتحقق من وجود رقم واحد على الأقل لجهة الاتصال الحالية.

### Line 151
```java
                        System.out.println("Number already exists! Enter a different number or send (n) to skip.");
```
**English:** Prints a message suggesting the user can enter a different number or type "n" to skip.  
**العربية:** يطبع رسالة تقترح على المستخدم إدخال رقم مختلف أو كتابة "n" للتخطي.

### Line 152
```java
                    } else {
```
**English:** Else block for when contact has no numbers yet.  
**العربية:** كتلة else عندما لا تحتوي جهة الاتصال على أرقام بعد.

### Line 153
```java
                        System.out.println("Number already exists! Enter a different number.");
```
**English:** Prints a message that the number exists and user must enter a different one (can't skip since no numbers exist yet).  
**العربية:** يطبع رسالة أن الرقم موجود ويجب على المستخدم إدخال رقم مختلف (لا يمكن التخطي لأن لا توجد أرقام بعد).

### Line 154
```java
                    }
```
**English:** Closes the if-else block.  
**العربية:** يغلق كتلة if-else.

### Line 155
```java
                    continue;
```
**English:** Skips to the next iteration, asking for the number again.  
**العربية:** يتخطى إلى التكرار التالي، ويسأل عن الرقم مرة أخرى.

### Line 156
```java
                }
```
**English:** Closes the if statement for duplicate number check.  
**العربية:** يغلق عبارة if للتحقق من الرقم المكرر.

### Line 157
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 158
```java
                nums.add(number);
```
**English:** Adds the valid, non-duplicate number to the current contact's number list.  
**العربية:** يضيف الرقم الصحيح غير المكرر إلى قائمة أرقام جهة الاتصال الحالية.

### Line 159
```java
                System.out.println("Number added.");
```
**English:** Prints a confirmation message that the number was added successfully.  
**العربية:** يطبع رسالة تأكيد أن الرقم تمت إضافته بنجاح.

### Line 160
```java
                break;
```
**English:** Exits the inner while loop since a valid number was added.  
**العربية:** يخرج من حلقة while الداخلية لأن رقم صحيح تمت إضافته.

### Line 161
```java
            }
```
**English:** Closes the inner while loop.  
**العربية:** يغلق حلقة while الداخلية.

### Line 162
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 163
```java
            // If user skipped via N, stop the "add another?" flow immediately
```
**English:** Comment explaining the logic for handling skipped entries.  
**العربية:** تعليق يشرح منطق التعامل مع الإدخالات المتخطاة.

### Line 164
```java
            if (skippedThisEntry) {
```
**English:** Checks if the user skipped adding a number by typing "n".  
**العربية:** يتحقق من تخطي المستخدم إضافة رقم بكتابة "n".

### Line 165
```java
                more = "n";
```
**English:** Sets `more` to "n" to indicate no more numbers should be added.  
**العربية:** يضبط `more` إلى "n" للإشارة إلى عدم إضافة المزيد من الأرقام.

### Line 166
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 167
```java
                if (exitNumbers) {
```
**English:** Checks if the user typed "exit" to stop entering numbers.  
**العربية:** يتحقق من كتابة المستخدم "exit" لإيقاف إدخال الأرقام.

### Line 168
```java
                    break; // NEW: break the do-while so it won't ask "Add another number?"
```
**English:** Exits the outer do-while loop to prevent asking "Add another number?" when user already exited.  
**العربية:** يخرج من حلقة do-while الخارجية لمنع السؤال "إضافة رقم آخر؟" عندما يكون المستخدم قد خرج بالفعل.

### Line 169
```java
                }
```
**English:** Closes the if statement for exitNumbers check.  
**العربية:** يغلق عبارة if للتحقق من exitNumbers.

### Line 170
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 171
```java
            } else {
```
**English:** Else block for when user did not skip (normal flow).  
**العربية:** كتلة else عندما لم يتخط المستخدم (التدفق العادي).

### Line 172
```java
                System.out.print("Add another number? (yes/y or no/n): ");
```
**English:** Asks the user if they want to add another phone number.  
**العربية:** يسأل المستخدم إذا كان يريد إضافة رقم هاتف آخر.

### Line 173
```java
                more = sc.nextLine().trim();
```
**English:** Reads the user's response and stores it in `more` after trimming.  
**العربية:** يقرأ رد المستخدم ويخزنه في `more` بعد إزالة المسافات.

### Line 174
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 175
```java
                while (!(more.equalsIgnoreCase("y") ||
```
**English:** Starts a while loop that continues while the response is NOT "y" (case-insensitive).  
**العربية:** يبدأ حلقة while تستمر بينما الرد ليس "y" (غير حساس لحالة الأحرف).

### Line 176
```java
                        more.equalsIgnoreCase("yes") ||
```
**English:** Also checks if response is NOT "yes".  
**العربية:** يتحقق أيضاً من كون الرد ليس "yes".

### Line 177
```java
                        more.equalsIgnoreCase("n") ||
```
**English:** Also checks if response is NOT "n".  
**العربية:** يتحقق أيضاً من كون الرد ليس "n".

### Line 178
```java
                        more.equalsIgnoreCase("no"))) {
```
**English:** Also checks if response is NOT "no". If none of these match, the loop continues asking for valid input.  
**العربية:** يتحقق أيضاً من كون الرد ليس "no". إذا لم يطابق أي من هذه، تستمر الحلقة في طلب إدخال صحيح.

### Line 179
```java
                    System.out.print("Please enter yes/y or no/n: ");
```
**English:** Prompts the user again for valid input (yes/y/no/n).  
**العربية:** يطلب من المستخدم مرة أخرى إدخال صحيح (yes/y/no/n).

### Line 180
```java
                    more = sc.nextLine().trim();
```
**English:** Reads the user's response again.  
**العربية:** يقرأ رد المستخدم مرة أخرى.

### Line 181
```java
                }
```
**English:** Closes the while loop for input validation.  
**العربية:** يغلق حلقة while للتحقق من الإدخال.

### Line 182
```java
            }
```
**English:** Closes the else block.  
**العربية:** يغلق كتلة else.

### Line 183
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 184
```java
        } while (more.equalsIgnoreCase("y") || more.equalsIgnoreCase("yes"));
```
**English:** End of do-while loop. Continues looping if user answered "y" or "yes" (wants to add more numbers).  
**العربية:** نهاية حلقة do-while. تستمر الحلقة إذا أجاب المستخدم "y" أو "yes" (يريد إضافة المزيد من الأرقام).

### Line 185
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 186
```java
        if (!nums.isEmpty()) {
```
**English:** Checks if at least one number was added to the contact.  
**العربية:** يتحقق من إضافة رقم واحد على الأقل لجهة الاتصال.

### Line 187
```java
            contacts.add(name);
```
**English:** Adds the contact name to the `contacts` ArrayList.  
**العربية:** يضيف اسم جهة الاتصال إلى ArrayList `contacts`.

### Line 188
```java
            types.add(type);
```
**English:** Adds the contact type to the `types` ArrayList at the same index.  
**العربية:** يضيف نوع جهة الاتصال إلى ArrayList `types` في نفس الفهرس.

### Line 189
```java
            nums_list.add(nums);
```
**English:** Adds the list of phone numbers to the `nums_list` ArrayList at the same index.  
**العربية:** يضيف قائمة أرقام الهواتف إلى ArrayList `nums_list` في نفس الفهرس.

### Line 190
```java
            System.out.println("Contact added successfully");
```
**English:** Prints a success message confirming the contact was added.  
**العربية:** يطبع رسالة نجاح تؤكد إضافة جهة الاتصال.

### Line 191
```java
        } else {
```
**English:** Else block for when no numbers were added.  
**العربية:** كتلة else عندما لم تتم إضافة أرقام.

### Line 192
```java
            System.out.println("Contact not add any number...");
```
**English:** Prints a message that the contact was not added because no numbers were entered.  
**العربية:** يطبع رسالة أن جهة الاتصال لم تتم إضافتها لأن لم يتم إدخال أرقام.

### Line 193
```java
        }
```
**English:** Closes the if-else block.  
**العربية:** يغلق كتلة if-else.

### Line 194
```java
    }
```
**English:** Closes the `addContact()` function.  
**العربية:** يغلق دالة `addContact()`.

---

## Lines 196-241: searchByName() Function / دالة searchByName()

### Line 195
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 196
```java
    // ===== Case 2: Search by Name (contains + Bonus similar by removing vowels) =====
```
**English:** Comment describing this function as Case 2 (Search by Name) with bonus feature of similar-name matching.  
**العربية:** تعليق يصف هذه الدالة كحالة 2 (البحث بالاسم) مع ميزة إضافية لمطابقة الأسماء المشابهة.

### Line 197
```java
    static void searchByName() {
```
**English:** Declares a static method `searchByName()` that returns nothing. This function searches for contacts by name.  
**العربية:** يعلن عن دالة ثابتة `searchByName()` لا ترجع قيمة. هذه الدالة تبحث عن جهات الاتصال بالاسم.

### Line 198
```java
        System.out.print("Enter name to search : ");
```
**English:** Prompts the user to enter a name to search for.  
**العربية:** يطلب من المستخدم إدخال اسم للبحث عنه.

### Line 199
```java
        String search = sc.nextLine().trim();
```
**English:** Reads the search query and stores it in `search` after trimming whitespace.  
**العربية:** يقرأ استعلام البحث ويخزنه في `search` بعد إزالة المسافات.

### Line 200
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 201
```java
        if (search.isEmpty()) {
```
**English:** Checks if the search query is empty.  
**العربية:** يتحقق من كون استعلام البحث فارغاً.

### Line 202
```java
            System.out.println("Not found");
```
**English:** Prints "Not found" if search query is empty.  
**العربية:** يطبع "Not found" إذا كان استعلام البحث فارغاً.

### Line 203
```java
            return;
```
**English:** Exits the function early if search is empty.  
**العربية:** يخرج من الدالة مبكراً إذا كان البحث فارغاً.

### Line 204
```java
        }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 205
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 206
```java
        // Normalize input (lowercase, trim extra spaces)
```
**English:** Comment explaining normalization process.  
**العربية:** تعليق يشرح عملية التوحيد.

### Line 207
```java
        String searchNorm = normalize(search);
```
**English:** Normalizes the search query by calling `normalize()` helper function (converts to lowercase, trims, collapses spaces).  
**العربية:** يوحد استعلام البحث عن طريق استدعاء الدالة المساعدة `normalize()` (تحويل إلى أحرف صغيرة، إزالة المسافات، دمج المسافات).

### Line 208
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 209
```java
        // Similar search version (remove vowels but keep first letter)
```
**English:** Comment explaining similar-name search feature.  
**العربية:** تعليق يشرح ميزة البحث عن الأسماء المشابهة.

### Line 210
```java
        String searchSim  = removeVowelsKeepFirst(searchNorm);
```
**English:** Creates a similar search version by removing vowels but keeping the first letter of each word. Calls `removeVowelsKeepFirst()` helper function.  
**العربية:** ينشئ نسخة بحث مشابهة بإزالة حروف العلة لكن الاحتفاظ بالحرف الأول من كل كلمة. يستدعي الدالة المساعدة `removeVowelsKeepFirst()`.

### Line 211
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 212
```java
        // Split search into separate words (tokens)
```
**English:** Comment explaining tokenization.  
**العربية:** تعليق يشرح التقسيم إلى رموز.

### Line 213
```java
        String[] searchTokens = tokenize(searchNorm);
```
**English:** Splits the normalized search query into an array of words (tokens) by calling `tokenize()` helper function.  
**العربية:** يقسم استعلام البحث الموحد إلى مصفوفة من الكلمات (الرموز) عن طريق استدعاء الدالة المساعدة `tokenize()`.

### Line 214
```java
        String[] searchSimTokens = tokenize(searchSim);
```
**English:** Splits the similar search version into tokens as well.  
**العربية:** يقسم نسخة البحث المشابهة إلى رموز أيضاً.

### Line 215
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 216
```java
        boolean found = false;
```
**English:** Declares a boolean flag to track if any matches were found.  
**العربية:** يعلن عن علامة منطقية لتتبع ما إذا تم العثور على أي مطابقات.

### Line 217
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 218
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 219
```java
        // Loop through all saved contacts
```
**English:** Comment explaining the loop that checks all contacts.  
**العربية:** تعليق يشرح الحلقة التي تتحقق من جميع جهات الاتصال.

### Line 220
```java
        for (int i = 0; i < contacts.size(); i++) {
```
**English:** Starts a for loop that iterates through all contacts using index `i` from 0 to contacts.size()-1.  
**العربية:** يبدأ حلقة for تتكرر عبر جميع جهات الاتصال باستخدام الفهرس `i` من 0 إلى contacts.size()-1.

### Line 221
```java
            String nameNorm = normalize(contacts.get(i));
```
**English:** Normalizes the current contact's name for comparison.  
**العربية:** يوحد اسم جهة الاتصال الحالية للمقارنة.

### Line 222
```java
            String nameSim  = removeVowelsKeepFirst(nameNorm);
```
**English:** Creates a similar version of the contact's name (vowels removed, first letter kept).  
**العربية:** ينشئ نسخة مشابهة من اسم جهة الاتصال (حروف العلة محذوفة، الحرف الأول محفوظ).

### Line 223
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 224
```java
            // 1) Exact word match
```
**English:** Comment indicating first matching method (exact word match).  
**العربية:** تعليق يشير إلى طريقة المطابقة الأولى (مطابقة الكلمة الدقيقة).

### Line 225
```java
            // This prevents matching "Ali" inside "Khalid"
```
**English:** Comment explaining that exact word matching prevents substring false positives.  
**العربية:** تعليق يشرح أن مطابقة الكلمة الدقيقة تمنع المطابقات الجزئية الخاطئة.

### Line 226
```java
            if (matchByTokens(nameNorm, searchTokens)) {
```
**English:** Checks if the normalized name matches the search tokens using exact word matching. Calls `matchByTokens()` helper function.  
**العربية:** يتحقق من مطابقة الاسم الموحد لرموز البحث باستخدام مطابقة الكلمة الدقيقة. يستدعي الدالة المساعدة `matchByTokens()`.

### Line 227
```java
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
```
**English:** Prints the matching contact's information: name, type, and phone numbers.  
**العربية:** يطبع معلومات جهة الاتصال المطابقة: الاسم، النوع، وأرقام الهواتف.

### Line 228
```java
                found = true;
```
**English:** Sets the `found` flag to true indicating a match was found.  
**العربية:** يضبط علامة `found` إلى true للإشارة إلى العثور على مطابقة.

### Line 229
```java
                continue;
```
**English:** Skips to the next iteration of the loop (checks similar match next).  
**العربية:** يتخطى إلى التكرار التالي من الحلقة (يتحقق من المطابقة المشابهة بعد ذلك).

### Line 230
```java
            }
```
**English:** Closes the if statement for exact word match.  
**العربية:** يغلق عبارة if لمطابقة الكلمة الدقيقة.

### Line 231
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 232
```java
            // 2) Similar match (vowels removed but first letter preserved)
```
**English:** Comment indicating second matching method (similar-name match).  
**العربية:** تعليق يشير إلى طريقة المطابقة الثانية (مطابقة الأسماء المشابهة).

### Line 233
```java
            // This prevents "hamad" from matching "ahmad"
```
**English:** Comment explaining that keeping the first letter prevents wrong matches between similar names.  
**العربية:** تعليق يشرح أن الاحتفاظ بالحرف الأول يمنع المطابقات الخاطئة بين الأسماء المشابهة.

### Line 234
```java
            if (matchByTokens(nameSim, searchSimTokens)) {
```
**English:** Checks if the similar-name version matches the similar search tokens.  
**العربية:** يتحقق من مطابقة نسخة الاسم المشابه لرموز البحث المشابهة.

### Line 235
```java
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
```
**English:** Prints the matching contact's information.  
**العربية:** يطبع معلومات جهة الاتصال المطابقة.

### Line 236
```java
                found = true;
```
**English:** Sets the `found` flag to true.  
**العربية:** يضبط علامة `found` إلى true.

### Line 237
```java
            }
```
**English:** Closes the if statement for similar match.  
**العربية:** يغلق عبارة if للمطابقة المشابهة.

### Line 238
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 239
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 240
```java
        if (!found) System.out.println("Not found");
```
**English:** If no matches were found (`found` is still false), prints "Not found".  
**العربية:** إذا لم يتم العثور على مطابقات (`found` لا يزال false)، يطبع "Not found".

### Line 241
```java
    }
```
**English:** Closes the `searchByName()` function.  
**العربية:** يغلق دالة `searchByName()`.

---

## Lines 243-270: searchByNumber() Function / دالة searchByNumber()

### Line 242
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 243
```java
    // ===== Case 3: Search by Number (must print ALL matches by numbers) =====
```
**English:** Comment describing this function as Case 3 (Search by Number) that prints all matching contacts.  
**العربية:** تعليق يصف هذه الدالة كحالة 3 (البحث بالرقم) التي تطبع جميع جهات الاتصال المطابقة.

### Line 244
```java
    static void searchByNumber() {
```
**English:** Declares a static method `searchByNumber()` that returns nothing. This function searches for contacts by phone number.  
**العربية:** يعلن عن دالة ثابتة `searchByNumber()` لا ترجع قيمة. هذه الدالة تبحث عن جهات الاتصال برقم الهاتف.

### Line 245
```java
        String number = "";
```
**English:** Declares and initializes a String variable `number` to store the search number.  
**العربية:** يعلن ويهيئ متغير String `number` لتخزين رقم البحث.

### Line 246
```java
        while (true) {
```
**English:** Starts an infinite while loop for input validation.  
**العربية:** يبدأ حلقة while لا نهائية للتحقق من الإدخال.

### Line 247
```java
            System.out.print("Enter your number : ");
```
**English:** Prompts the user to enter a phone number to search for.  
**العربية:** يطلب من المستخدم إدخال رقم هاتف للبحث عنه.

### Line 248
```java
            number = sc.nextLine().trim();
```
**English:** Reads the number input and trims whitespace.  
**العربية:** يقرأ إدخال الرقم ويزيل المسافات.

### Line 249
```java
            if (number.isEmpty()) {
```
**English:** Checks if the number input is empty.  
**العربية:** يتحقق من كون إدخال الرقم فارغاً.

### Line 250
```java
                System.out.println("Number is required (can't be empty).");
```
**English:** Prints an error message for empty input.  
**العربية:** يطبع رسالة خطأ للإدخال الفارغ.

### Line 251
```java
                continue;
```
**English:** Skips to the next iteration, asking for input again.  
**العربية:** يتخطى إلى التكرار التالي، ويسأل عن الإدخال مرة أخرى.

### Line 252
```java
            }
```
**English:** Closes the if statement for empty check.  
**العربية:** يغلق عبارة if للتحقق من الفارغ.

### Line 253
```java
            if (!isValidNumber(number)) {
```
**English:** Checks if the number contains only digits by calling `isValidNumber()` helper function.  
**العربية:** يتحقق من احتواء الرقم على أرقام فقط عن طريق استدعاء الدالة المساعدة `isValidNumber()`.

### Line 254
```java
                System.out.println("Invalid number! Enter digits only.");
```
**English:** Prints an error message for invalid number format.  
**العربية:** يطبع رسالة خطأ لتنسيق الرقم غير الصحيح.

### Line 255
```java
                continue;
```
**English:** Skips to the next iteration, asking for input again.  
**العربية:** يتخطى إلى التكرار التالي، ويسأل عن الإدخال مرة أخرى.

### Line 256
```java
            }
```
**English:** Closes the if statement for validation.  
**العربية:** يغلق عبارة if للتحقق.

### Line 257
```java
            break;
```
**English:** Exits the while loop when valid input is received.  
**العربية:** يخرج من حلقة while عند استلام إدخال صحيح.

### Line 258
```java
        }
```
**English:** Closes the while loop.  
**العربية:** يغلق حلقة while.

### Line 259
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 260
```java
        boolean found = false;
```
**English:** Declares a boolean flag to track if any matches were found.  
**العربية:** يعلن عن علامة منطقية لتتبع ما إذا تم العثور على أي مطابقات.

### Line 261
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 262
```java
        for (int i = 0; i < nums_list.size(); i++) {
```
**English:** Starts a for loop that iterates through all contacts' number lists.  
**العربية:** يبدأ حلقة for تتكرر عبر قوائم أرقام جميع جهات الاتصال.

### Line 263
```java
            if (nums_list.get(i).contains(number)) {
```
**English:** Checks if the current contact's number list contains the search number.  
**العربية:** يتحقق من احتواء قائمة أرقام جهة الاتصال الحالية على رقم البحث.

### Line 264
```java
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
```
**English:** Prints the matching contact's information.  
**العربية:** يطبع معلومات جهة الاتصال المطابقة.

### Line 265
```java
                found = true;
```
**English:** Sets the `found` flag to true.  
**العربية:** يضبط علامة `found` إلى true.

### Line 266
```java
            }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 267
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 268
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 269
```java
        if (!found) System.out.println("Not found");
```
**English:** If no matches were found, prints "Not found".  
**العربية:** إذا لم يتم العثور على مطابقات، يطبع "Not found".

### Line 270
```java
    }
```
**English:** Closes the `searchByNumber()` function.  
**العربية:** يغلق دالة `searchByNumber()`.

---

## Lines 272-290: deleteByName() Function / دالة deleteByName()

### Line 271
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 272
```java
    // ===== Case 4: Delete by Name (delete ALL full matches + print count) =====
```
**English:** Comment describing this function as Case 4 (Delete by Name) that deletes all exact matches and prints count.  
**العربية:** تعليق يصف هذه الدالة كحالة 4 (حذف بالاسم) التي تحذف جميع المطابقات الدقيقة وتطبع العدد.

### Line 273
```java
    static void deleteByName() {
```
**English:** Declares a static method `deleteByName()` that returns nothing. This function deletes contacts by name.  
**العربية:** يعلن عن دالة ثابتة `deleteByName()` لا ترجع قيمة. هذه الدالة تحذف جهات الاتصال بالاسم.

### Line 274
```java
        System.out.print("Enter name to delete : ");
```
**English:** Prompts the user to enter a name to delete.  
**العربية:** يطلب من المستخدم إدخال اسم للحذف.

### Line 275
```java
        String nameToDelete = sc.nextLine().trim();
```
**English:** Reads the name to delete and trims whitespace.  
**العربية:** يقرأ الاسم للحذف ويزيل المسافات.

### Line 276
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 277
```java
        int deleted = 0;    
```
**English:** Declares and initializes an integer counter `deleted` to track how many contacts were deleted.  
**العربية:** يعلن ويهيئ عداد عدد صحيح `deleted` لتتبع عدد جهات الاتصال المحذوفة.

### Line 278
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 279
```java
        for (int i = contacts.size() - 1; i >= 0; i--) {
```
**English:** Starts a for loop that iterates backwards through contacts (from last to first). This prevents index shifting issues when removing elements.  
**العربية:** يبدأ حلقة for تتكرر عكسياً عبر جهات الاتصال (من الأخير إلى الأول). هذا يمنع مشاكل تحول الفهرس عند إزالة العناصر.

### Line 280
```java
            if (contacts.get(i).equals(nameToDelete)) {
```
**English:** Checks if the current contact's name exactly equals the name to delete (case-sensitive exact match).  
**العربية:** يتحقق من كون اسم جهة الاتصال الحالية يساوي تماماً الاسم للحذف (مطابقة دقيقة حساسة لحالة الأحرف).

### Line 281
```java
                contacts.remove(i);
```
**English:** Removes the contact name at index `i` from the `contacts` ArrayList.  
**العربية:** يزيل اسم جهة الاتصال في الفهرس `i` من ArrayList `contacts`.

### Line 282
```java
                types.remove(i);
```
**English:** Removes the contact type at the same index from the `types` ArrayList.  
**العربية:** يزيل نوع جهة الاتصال في نفس الفهرس من ArrayList `types`.

### Line 283
```java
                nums_list.remove(i);
```
**English:** Removes the phone numbers list at the same index from the `nums_list` ArrayList.  
**العربية:** يزيل قائمة أرقام الهواتف في نفس الفهرس من ArrayList `nums_list`.

### Line 284
```java
                deleted++;
```
**English:** Increments the deletion counter by 1.  
**العربية:** يزيد عداد الحذف بمقدار 1.

### Line 285
```java
            }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 286
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 287
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 288
```java
        if (deleted > 0) System.out.println(deleted + " contact(s) deleted");
```
**English:** If any contacts were deleted (`deleted` > 0), prints the count of deleted contacts.  
**العربية:** إذا تم حذف أي جهات اتصال (`deleted` > 0)، يطبع عدد جهات الاتصال المحذوفة.

### Line 289
```java
        else System.out.println("Not found");
```
**English:** If no contacts were deleted (`deleted` is 0), prints "Not found".  
**العربية:** إذا لم يتم حذف أي جهات اتصال (`deleted` هو 0)، يطبع "Not found".

### Line 290
```java
    }
```
**English:** Closes the `deleteByName()` function.  
**العربية:** يغلق دالة `deleteByName()`.

---

## Lines 292-310: deleteByNumber() Function / دالة deleteByNumber()

### Line 291
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 292
```java
    // ===== Case 5: Delete by Number (delete ALL contacts having that number) =====
```
**English:** Comment describing this function as Case 5 (Delete by Number) that deletes all contacts containing the number.  
**العربية:** تعليق يصف هذه الدالة كحالة 5 (حذف بالرقم) التي تحذف جميع جهات الاتصال التي تحتوي على الرقم.

### Line 293
```java
    static void deleteByNumber() {
```
**English:** Declares a static method `deleteByNumber()` that returns nothing. This function deletes contacts by phone number.  
**العربية:** يعلن عن دالة ثابتة `deleteByNumber()` لا ترجع قيمة. هذه الدالة تحذف جهات الاتصال برقم الهاتف.

### Line 294
```java
        System.out.print("Enter number to delete : ");
```
**English:** Prompts the user to enter a phone number to delete.  
**العربية:** يطلب من المستخدم إدخال رقم هاتف للحذف.

### Line 295
```java
        String number = sc.nextLine().trim();
```
**English:** Reads the number to delete and trims whitespace.  
**العربية:** يقرأ الرقم للحذف ويزيل المسافات.

### Line 296
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 297
```java
        int deleted = 0;
```
**English:** Declares and initializes an integer counter `deleted` to track how many contacts were deleted.  
**العربية:** يعلن ويهيئ عداد عدد صحيح `deleted` لتتبع عدد جهات الاتصال المحذوفة.

### Line 298
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 299
```java
        for (int i = nums_list.size() - 1; i >= 0; i--) {
```
**English:** Starts a for loop that iterates backwards through contacts' number lists (from last to first).  
**العربية:** يبدأ حلقة for تتكرر عكسياً عبر قوائم أرقام جهات الاتصال (من الأخير إلى الأول).

### Line 300
```java
            if (nums_list.get(i).contains(number)) {
```
**English:** Checks if the current contact's number list contains the number to delete.  
**العربية:** يتحقق من احتواء قائمة أرقام جهة الاتصال الحالية على الرقم للحذف.

### Line 301
```java
                contacts.remove(i);
```
**English:** Removes the contact name at index `i`.  
**العربية:** يزيل اسم جهة الاتصال في الفهرس `i`.

### Line 302
```java
                types.remove(i);
```
**English:** Removes the contact type at the same index.  
**العربية:** يزيل نوع جهة الاتصال في نفس الفهرس.

### Line 303
```java
                nums_list.remove(i);
```
**English:** Removes the phone numbers list at the same index.  
**العربية:** يزيل قائمة أرقام الهواتف في نفس الفهرس.

### Line 304
```java
                deleted++;
```
**English:** Increments the deletion counter by 1.  
**العربية:** يزيد عداد الحذف بمقدار 1.

### Line 305
```java
            }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 306
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 307
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 308
```java
        if (deleted > 0) System.out.println("Deleted successfully (" + deleted + ")");
```
**English:** If any contacts were deleted, prints a success message with the count.  
**العربية:** إذا تم حذف أي جهات اتصال، يطبع رسالة نجاح مع العدد.

### Line 309
```java
        else System.out.println("Not found");
```
**English:** If no contacts were deleted, prints "Not found".  
**العربية:** إذا لم يتم حذف أي جهات اتصال، يطبع "Not found".

### Line 310
```java
    }
```
**English:** Closes the `deleteByNumber()` function.  
**العربية:** يغلق دالة `deleteByNumber()`.

---

## Lines 312-326: allContacts() Function / دالة allContacts()

### Line 311
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 312
```java
    // ===== Case 6: Show all contacts =====
```
**English:** Comment describing this function as Case 6 (Show all contacts).  
**العربية:** تعليق يصف هذه الدالة كحالة 6 (عرض جميع جهات الاتصال).

### Line 313
```java
    static void allContacts() {
```
**English:** Declares a static method `allContacts()` that returns nothing. This function displays all contacts.  
**العربية:** يعلن عن دالة ثابتة `allContacts()` لا ترجع قيمة. هذه الدالة تعرض جميع جهات الاتصال.

### Line 314
```java
        if (contacts.isEmpty()) {
```
**English:** Checks if the contacts list is empty.  
**العربية:** يتحقق من كون قائمة جهات الاتصال فارغة.

### Line 315
```java
            System.out.println("Your have a Zero contacts no contacts yet.");
```
**English:** Prints a message indicating the address book is empty.  
**العربية:** يطبع رسالة تشير إلى أن دفتر العناوين فارغ.

### Line 316
```java
        } else {
```
**English:** Else block for when contacts exist.  
**العربية:** كتلة else عندما تكون جهات الاتصال موجودة.

### Line 317
```java
            System.out.println("\nYour count is " + contacts.size() + " Here are your contacts:");
```
**English:** Prints a header showing the total number of contacts. `\n` creates a newline.  
**العربية:** يطبع رأساً يوضح العدد الإجمالي لجهات الاتصال. `\n` ينشئ سطراً جديداً.

### Line 318
```java
            System.out.println("------------------------------------------------------------");
```
**English:** Prints a separator line for the table.  
**العربية:** يطبع سطر فاصل للجدول.

### Line 319
```java
            System.out.println("\tName\t\tType\t\tNumbers");
```
**English:** Prints the table header with column names (Name, Type, Numbers). `\t` creates tabs for alignment.  
**العربية:** يطبع رأس الجدول مع أسماء الأعمدة (الاسم، النوع، الأرقام). `\t` ينشئ مسافات جدولة للمحاذاة.

### Line 320
```java
            System.out.println("------------------------------------------------------------");
```
**English:** Prints another separator line below the header.  
**العربية:** يطبع سطر فاصل آخر أسفل الرأس.

### Line 321
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 322
```java
            for (int i = 0; i < contacts.size(); i++) {
```
**English:** Starts a for loop that iterates through all contacts.  
**العربية:** يبدأ حلقة for تتكرر عبر جميع جهات الاتصال.

### Line 323
```java
                System.out.println("\t" + contacts.get(i) + "\t\t" + types.get(i) + "\t\t" + nums_list.get(i));
```
**English:** Prints each contact's information in a formatted row: name, type, and phone numbers list.  
**العربية:** يطبع معلومات كل جهة اتصال في صف منسق: الاسم، النوع، وقائمة أرقام الهواتف.

### Line 324
```java
            }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 325
```java
        }
```
**English:** Closes the if-else block.  
**العربية:** يغلق كتلة if-else.

### Line 326
```java
    }
```
**English:** Closes the `allContacts()` function.  
**العربية:** يغلق دالة `allContacts()`.

---

## Lines 328-341: removeVowels() Function (Legacy) / دالة removeVowels() (قديمة)

### Line 327
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 328
```java
    // Bonus helper: remove vowels for similar search
```
**English:** Comment indicating this is a helper function for similar search feature.  
**العربية:** تعليق يشير إلى أن هذه دالة مساعدة لميزة البحث المشابه.

### Line 329
```java
    //== Old fun. ==
```
**English:** Comment indicating this is an old/unused function.  
**العربية:** تعليق يشير إلى أن هذه دالة قديمة/غير مستخدمة.

### Line 330
```java
    static String removeVowels(String text) {
```
**English:** Declares a static method `removeVowels()` that takes a String parameter and returns a String. This function is not currently used (replaced by `removeVowelsKeepFirst()`).  
**العربية:** يعلن عن دالة ثابتة `removeVowels()` تأخذ معامل String وترجع String. هذه الدالة غير مستخدمة حالياً (تم استبدالها بـ `removeVowelsKeepFirst()`).

### Line 331
```java
        text = text.toLowerCase();
```
**English:** Converts the input text to lowercase.  
**العربية:** يحول نص الإدخال إلى أحرف صغيرة.

### Line 332
```java
        String result = "";
```
**English:** Declares and initializes an empty String to store the result.  
**العربية:** يعلن ويهيئ String فارغ لتخزين النتيجة.

### Line 333
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 334
```java
        for (int i = 0; i < text.length(); i++) {
```
**English:** Starts a for loop that iterates through each character in the text.  
**العربية:** يبدأ حلقة for تتكرر عبر كل حرف في النص.

### Line 335
```java
            char c = text.charAt(i);
```
**English:** Gets the character at position `i` in the text.  
**العربية:** يحصل على الحرف في الموضع `i` في النص.

### Line 336
```java
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
```
**English:** Checks if the character is NOT a vowel (a, e, i, o, u).  
**العربية:** يتحقق من كون الحرف ليس حرف علة (a, e, i, o, u).

### Line 337
```java
                result += c;
```
**English:** If the character is not a vowel, appends it to the result string.  
**العربية:** إذا كان الحرف ليس حرف علة، يضيفه إلى سلسلة النتيجة.

### Line 338
```java
            }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 339
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 340
```java
        return result;
```
**English:** Returns the result string with all vowels removed.  
**العربية:** يرجع سلسلة النتيجة مع إزالة جميع حروف العلة.

### Line 341
```java
    }
```
**English:** Closes the `removeVowels()` function.  
**العربية:** يغلق دالة `removeVowels()`.

---

## Lines 343-349: isNumberExists() Helper Function / الدالة المساعدة isNumberExists()

### Line 342
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 343
```java
    // ===== Helpers =====
```
**English:** Comment indicating the start of helper functions section.  
**العربية:** تعليق يشير إلى بداية قسم الدوال المساعدة.

### Line 344
```java
    static boolean isNumberExists(String number) {
```
**English:** Declares a static method `isNumberExists()` that takes a String parameter and returns a boolean. Checks if a phone number exists in any contact.  
**العربية:** يعلن عن دالة ثابتة `isNumberExists()` تأخذ معامل String وترجع boolean. تتحقق من وجود رقم هاتف في أي جهة اتصال.

### Line 345
```java
        for (ArrayList<String> list : nums_list) {
```
**English:** Starts an enhanced for loop (for-each) that iterates through each number list in `nums_list`.  
**العربية:** يبدأ حلقة for محسنة (for-each) تتكرر عبر كل قائمة أرقام في `nums_list`.

### Line 346
```java
            if (list.contains(number)) return true;
```
**English:** Checks if the current number list contains the search number. If found, immediately returns `true`.  
**العربية:** يتحقق من احتواء قائمة الأرقام الحالية على رقم البحث. إذا تم العثور عليه، يرجع `true` فوراً.

### Line 347
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 348
```java
        return false;
```
**English:** Returns `false` if the number was not found in any contact's number list.  
**العربية:** يرجع `false` إذا لم يتم العثور على الرقم في قائمة أرقام أي جهة اتصال.

### Line 349
```java
    }
```
**English:** Closes the `isNumberExists()` function.  
**العربية:** يغلق دالة `isNumberExists()`.

---

## Lines 351-357: isValidNumber() Helper Function / الدالة المساعدة isValidNumber()

### Line 350
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 351
```java
    static boolean isValidNumber(String number) {
```
**English:** Declares a static method `isValidNumber()` that takes a String parameter and returns a boolean. Validates that a string contains only digits.  
**العربية:** يعلن عن دالة ثابتة `isValidNumber()` تأخذ معامل String وترجع boolean. تتحقق من احتواء السلسلة على أرقام فقط.

### Line 352
```java
        if (number.isEmpty()) return false;
```
**English:** If the number string is empty, immediately returns `false` (invalid).  
**العربية:** إذا كانت سلسلة الرقم فارغة، يرجع `false` فوراً (غير صحيح).

### Line 353
```java
        for (int i = 0; i < number.length(); i++) {
```
**English:** Starts a for loop that iterates through each character in the number string.  
**العربية:** يبدأ حلقة for تتكرر عبر كل حرف في سلسلة الرقم.

### Line 354
```java
            if (!Character.isDigit(number.charAt(i))) return false;
```
**English:** Checks if the character at position `i` is NOT a digit. If any character is not a digit, immediately returns `false`.  
**العربية:** يتحقق من كون الحرف في الموضع `i` ليس رقماً. إذا كان أي حرف ليس رقماً، يرجع `false` فوراً.

### Line 355
```java
        }
```
**English:** Closes the for loop.  
**العربية:** يغلق حلقة for.

### Line 356
```java
        return true;
```
**English:** Returns `true` if all characters are digits (valid number).  
**العربية:** يرجع `true` إذا كانت جميع الأحرف أرقاماً (رقم صحيح).

### Line 357
```java
    }
```
**English:** Closes the `isValidNumber()` function.  
**العربية:** يغلق دالة `isValidNumber()`.

---

## Lines 359-366: normalize() Helper Function / الدالة المساعدة normalize()

### Line 358
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 359
```java
    // Normalize text:
```
**English:** Comment explaining normalization.  
**العربية:** تعليق يشرح التوحيد.

### Line 360
```java
// - Convert to lowercase
```
**English:** Comment listing normalization step 1: convert to lowercase.  
**العربية:** تعليق يسرد خطوة التوحيد 1: تحويل إلى أحرف صغيرة.

### Line 361
```java
    // - Remove extra spaces
```
**English:** Comment listing normalization step 2: remove extra spaces.  
**العربية:** تعليق يسرد خطوة التوحيد 2: إزالة المسافات الزائدة.

### Line 362
```java
    static String normalize(String s) {
```
**English:** Declares a static method `normalize()` that takes a String parameter and returns a String. Normalizes text for comparison.  
**العربية:** يعلن عن دالة ثابتة `normalize()` تأخذ معامل String وترجع String. توحد النص للمقارنة.

### Line 363
```java
        // lower + trim + collapse spaces
```
**English:** Comment explaining what the normalization does.  
**العربية:** تعليق يشرح ما يفعله التوحيد.

### Line 364
```java
        s = s.toLowerCase().trim().replaceAll("\\s+", " ");
```
**English:** Normalizes the string: converts to lowercase, trims whitespace, and replaces multiple spaces with a single space using regex `\\s+`.  
**العربية:** يوحد السلسلة: يحول إلى أحرف صغيرة، يزيل المسافات، ويستبدل المسافات المتعددة بمسافة واحدة باستخدام regex `\\s+`.

### Line 365
```java
        return s;
```
**English:** Returns the normalized string.  
**العربية:** يرجع السلسلة الموحدة.

### Line 366
```java
    }
```
**English:** Closes the `normalize()` function.  
**العربية:** يغلق دالة `normalize()`.

---

## Lines 368-373: tokenize() Helper Function / الدالة المساعدة tokenize()

### Line 367
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 368
```java
    // Split full name into separate words
```
**English:** Comment explaining tokenization.  
**العربية:** تعليق يشرح التقسيم إلى رموز.

### Line 369
```java
// Example: "ahmed ali" → ["ahmed", "ali"]
```
**English:** Comment providing an example of tokenization.  
**العربية:** تعليق يقدم مثالاً على التقسيم إلى رموز.

### Line 370
```java
    static String[] tokenize(String s) {
```
**English:** Declares a static method `tokenize()` that takes a String parameter and returns an array of Strings. Splits a string into words.  
**العربية:** يعلن عن دالة ثابتة `tokenize()` تأخذ معامل String وترجع مصفوفة من Strings. تقسم سلسلة إلى كلمات.

### Line 371
```java
        if (s.isEmpty()) return new String[0];
```
**English:** If the input string is empty, returns an empty String array.  
**العربية:** إذا كانت سلسلة الإدخال فارغة، يرجع مصفوفة String فارغة.

### Line 372
```java
        return s.split(" ");
```
**English:** Splits the string by spaces and returns an array of words.  
**العربية:** يقسم السلسلة بالمسافات ويرجع مصفوفة من الكلمات.

### Line 373
```java
    }
```
**English:** Closes the `tokenize()` function.  
**العربية:** يغلق دالة `tokenize()`.

---

## Lines 375-396: matchByTokens() Helper Function / الدالة المساعدة matchByTokens()

### Line 374
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 375
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 376
```java
    // Match full words only (NOT partial match)
```
**English:** Comment explaining that this function matches complete words, not substrings.  
**العربية:** تعليق يشرح أن هذه الدالة تطابق الكلمات الكاملة، وليس السلاسل الجزئية.

### Line 377
```java
// Example:
```
**English:** Comment indicating examples will follow.  
**العربية:** تعليق يشير إلى أن أمثلة ستتبع.

### Line 378
```java
// search = "ali"
```
**English:** Comment showing example search query.  
**العربية:** تعليق يوضح مثال استعلام البحث.

### Line 379
```java
// matches: "ahmed ali"
```
**English:** Comment showing what it matches (full word "ali" in "ahmed ali").  
**العربية:** تعليق يوضح ما يطابقه (كلمة كاملة "ali" في "ahmed ali").

### Line 380
```java
// does NOT match: "khalid"
```
**English:** Comment showing what it does NOT match (substring "ali" inside "khalid" is ignored).  
**العربية:** تعليق يوضح ما لا يطابقه (السلسلة الجزئية "ali" داخل "khalid" يتم تجاهلها).

### Line 381
```java
static boolean matchByTokens(String fullNameNormalized, String[] searchTokens) {
```
**English:** Declares a static method `matchByTokens()` that takes a normalized name and an array of search tokens, returns a boolean. Checks if all search tokens exist as complete words in the name.  
**العربية:** يعلن عن دالة ثابتة `matchByTokens()` تأخذ اسماً موحداً ومصفوفة من رموز البحث، ترجع boolean. تتحقق من وجود جميع رموز البحث ككلمات كاملة في الاسم.

### Line 382
```java
        String[] nameTokens = tokenize(fullNameNormalized);
```
**English:** Splits the normalized full name into an array of word tokens by calling `tokenize()`.  
**العربية:** يقسم الاسم الكامل الموحد إلى مصفوفة من رموز الكلمات عن طريق استدعاء `tokenize()`.

### Line 383
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 384
```java
    // Each search word must exist as a full word inside the name
```
**English:** Comment explaining the matching logic.  
**العربية:** تعليق يشرح منطق المطابقة.

### Line 385
```java
        for (String st : searchTokens) {
```
**English:** Starts an enhanced for loop that iterates through each search token.  
**العربية:** يبدأ حلقة for محسنة تتكرر عبر كل رمز بحث.

### Line 386
```java
            boolean tokenFound = false;
```
**English:** Declares a boolean flag to track if the current search token was found.  
**العربية:** يعلن عن علامة منطقية لتتبع ما إذا تم العثور على رمز البحث الحالي.

### Line 387
```java
            for (String nt : nameTokens) {
```
**English:** Starts an enhanced for loop that iterates through each name token.  
**العربية:** يبدأ حلقة for محسنة تتكرر عبر كل رمز اسم.

### Line 388
```java
                if (nt.equals(st)) {   //Full match
```
**English:** Checks if the name token exactly equals the search token (full word match, not substring).  
**العربية:** يتحقق من كون رمز الاسم يساوي تماماً رمز البحث (مطابقة كلمة كاملة، وليس سلسلة جزئية).

### Line 389
```java
                    tokenFound = true;
```
**English:** Sets the flag to true indicating the token was found.  
**العربية:** يضبط العلامة إلى true للإشارة إلى العثور على الرمز.

### Line 390
```java
                    break;
```
**English:** Exits the inner for loop since the token was found.  
**العربية:** يخرج من حلقة for الداخلية لأن الرمز تم العثور عليه.

### Line 391
```java
                }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 392
```java
            }
```
**English:** Closes the inner for loop.  
**العربية:** يغلق حلقة for الداخلية.

### Line 393
```java
            if (!tokenFound) return false;
```
**English:** If the current search token was not found in any name token, immediately returns `false` (not all tokens matched).  
**العربية:** إذا لم يتم العثور على رمز البحث الحالي في أي رمز اسم، يرجع `false` فوراً (لم تطابق جميع الرموز).

### Line 394
```java
        }
```
**English:** Closes the outer for loop.  
**العربية:** يغلق حلقة for الخارجية.

### Line 395
```java
        return true;
```
**English:** Returns `true` if all search tokens were found as complete words in the name.  
**العربية:** يرجع `true` إذا تم العثور على جميع رموز البحث ككلمات كاملة في الاسم.

### Line 396
```java
    }
```
**English:** Closes the `matchByTokens()` function.  
**العربية:** يغلق دالة `matchByTokens()`.

---

## Lines 398-429: removeVowelsKeepFirst() Helper Function / الدالة المساعدة removeVowelsKeepFirst()

### Line 397
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 398
```java
    // Remove vowels but keep the FIRST letter
```
**English:** Comment explaining that this function removes vowels but preserves the first letter of each word.  
**العربية:** تعليق يشرح أن هذه الدالة تزيل حروف العلة لكن تحافظ على الحرف الأول من كل كلمة.

### Line 399
```java
// This prevents mixing "hamad" with "ahmad"
```
**English:** Comment explaining why keeping the first letter is important (prevents wrong matches).  
**العربية:** تعليق يشرح لماذا الاحتفاظ بالحرف الأول مهم (يمنع المطابقات الخاطئة).

### Line 400
```java
//
```
**English:** Empty comment line.  
**العربية:** سطر تعليق فارغ.

### Line 401
```java
// Example:
```
**English:** Comment indicating examples will follow.  
**العربية:** تعليق يشير إلى أن أمثلة ستتبع.

### Line 402
```java
// hamad  → hmd
```
**English:** Comment showing example: "hamad" becomes "hmd" (first letter 'h' kept, vowels removed).  
**العربية:** تعليق يوضح مثالاً: "hamad" يصبح "hmd" (الحرف الأول 'h' محفوظ، حروف العلة محذوفة).

### Line 403
```java
// ahmad  → ahmd   (different result → no wrong match)
```
**English:** Comment showing example: "ahmad" becomes "ahmd" (different from "hmd", so they won't incorrectly match).  
**العربية:** تعليق يوضح مثالاً: "ahmad" يصبح "ahmd" (مختلف عن "hmd"، لذلك لن يطابقا بشكل خاطئ).

### Line 404
```java
static String removeVowelsKeepFirst(String text) {
```
**English:** Declares a static method `removeVowelsKeepFirst()` that takes a String parameter and returns a String. Removes vowels but keeps the first letter of each word.  
**العربية:** يعلن عن دالة ثابتة `removeVowelsKeepFirst()` تأخذ معامل String وترجع String. تزيل حروف العلة لكن تحافظ على الحرف الأول من كل كلمة.

### Line 405
```java
    text = normalize(text);
```
**English:** Normalizes the input text first (lowercase, trim, collapse spaces) by calling `normalize()`.  
**العربية:** يوحد نص الإدخال أولاً (أحرف صغيرة، إزالة مسافات، دمج مسافات) عن طريق استدعاء `normalize()`.

### Line 406
```java
    if (text.isEmpty()) return "";
```
**English:** If the text is empty after normalization, returns an empty string.  
**العربية:** إذا كان النص فارغاً بعد التوحيد، يرجع سلسلة فارغة.

### Line 407
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 408
```java
    String result = "";
```
**English:** Declares and initializes an empty String to store the result.  
**العربية:** يعلن ويهيئ String فارغ لتخزين النتيجة.

### Line 409
```java
    String[] words = tokenize(text);
```
**English:** Splits the text into an array of words by calling `tokenize()`.  
**العربية:** يقسم النص إلى مصفوفة من الكلمات عن طريق استدعاء `tokenize()`.

### Line 410
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 411
```java
    for (int w = 0; w < words.length; w++) {
```
**English:** Starts a for loop that iterates through each word in the array.  
**العربية:** يبدأ حلقة for تتكرر عبر كل كلمة في المصفوفة.

### Line 412
```java
        String word = words[w];
```
**English:** Gets the current word from the array.  
**العربية:** يحصل على الكلمة الحالية من المصفوفة.

### Line 413
```java
        if (word.isEmpty()) continue;
```
**English:** If the word is empty, skips to the next iteration.  
**العربية:** إذا كانت الكلمة فارغة، يتخطى إلى التكرار التالي.

### Line 414
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 415
```java
        String one = "" + word.charAt(0); // keep first letter
```
**English:** Creates a string starting with the first character of the word (preserves first letter).  
**العربية:** ينشئ سلسلة تبدأ بالحرف الأول من الكلمة (يحافظ على الحرف الأول).

### Line 416
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 417
```java
        for (int i = 1; i < word.length(); i++) {
```
**English:** Starts a for loop that iterates through characters starting from index 1 (skips first letter).  
**العربية:** يبدأ حلقة for تتكرر عبر الأحرف بدءاً من الفهرس 1 (يتخطى الحرف الأول).

### Line 418
```java
            char c = word.charAt(i);
```
**English:** Gets the character at position `i` in the word.  
**العربية:** يحصل على الحرف في الموضع `i` في الكلمة.

### Line 419
```java
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
```
**English:** Checks if the character is NOT a vowel.  
**العربية:** يتحقق من كون الحرف ليس حرف علة.

### Line 420
```java
                one += c;
```
**English:** If the character is not a vowel, appends it to the result string for this word.  
**العربية:** إذا كان الحرف ليس حرف علة، يضيفه إلى سلسلة النتيجة لهذه الكلمة.

### Line 421
```java
            }
```
**English:** Closes the if statement.  
**العربية:** يغلق عبارة if.

### Line 422
```java
        }
```
**English:** Closes the inner for loop.  
**العربية:** يغلق حلقة for الداخلية.

### Line 423
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 424
```java
        if (!result.isEmpty()) result += " ";
```
**English:** If the result string is not empty (not the first word), adds a space before adding the next word.  
**العربية:** إذا كانت سلسلة النتيجة غير فارغة (ليست الكلمة الأولى)، يضيف مسافة قبل إضافة الكلمة التالية.

### Line 425
```java
        result += one;
```
**English:** Appends the processed word (first letter + consonants) to the result string.  
**العربية:** يضيف الكلمة المعالجة (الحرف الأول + الحروف الساكنة) إلى سلسلة النتيجة.

### Line 426
```java
    }
```
**English:** Closes the outer for loop.  
**العربية:** يغلق حلقة for الخارجية.

### Line 427
```java
```
**English:** Empty line for readability.  
**العربية:** سطر فارغ للقراءة.

### Line 428
```java
    return result;
```
**English:** Returns the result string with vowels removed but first letters preserved.  
**العربية:** يرجع سلسلة النتيجة مع إزالة حروف العلة لكن الحروف الأولى محفوظة.

### Line 429
```java
}
```
**English:** Closes the `removeVowelsKeepFirst()` function.  
**العربية:** يغلق دالة `removeVowelsKeepFirst()`.

---

## Line 430: Class Closing Brace / القوس الختامي للكلاس

### Line 430
```java
}
```
**English:** Closes the `Ibrahim_120244273` class. This is the final closing brace of the entire program.  
**العربية:** يغلق كلاس `Ibrahim_120244273`. هذا هو القوس الختامي النهائي للبرنامج بالكامل.

---

## Summary / الملخص

**Total Lines Documented:** 430  
**Functions:** 12 (7 main + 5 helpers)  
**Language:** Java  
**Documentation:** Complete line-by-line explanation in English and Arabic

---

*End of Complete Line-by-Line Documentation*  
*نهاية التوثيق الكامل سطر بسطر*
