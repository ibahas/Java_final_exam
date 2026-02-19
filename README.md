# Address Book System / نظام دفتر العناوين

A simple console-based Address Book Application built with Java that allows users to manage and organize their contacts efficiently.

تطبيق بسيط لدفتر العناوين يعمل من خلال وحدة التحكم مبني بلغة Java يسمح للمستخدمين بإدارة وتنظيم جهات اتصالهم بكفاءة.

---

## 📋 Table of Contents / جدول المحتويات

- [Features / الميزات](#features--الميزات)
- [Requirements / المتطلبات](#requirements--المتطلبات)
- [Installation / التثبيت](#installation--التثبيت)
- [Usage / الاستخدام](#usage--الاستخدام)
- [Project Structure / هيكل المشروع](#project-structure--هيكل-المشروع)
- [Functions / الدوال](#functions--الدوال)
- [Examples / أمثلة](#examples--أمثلة)
- [Testing / الاختبار](#testing--الاختبار)
- [Authors / المؤلفون](#authors--المؤلفون)
- [License / الترخيص](#license--الترخيص)

---

## ✨ Features / الميزات

### Core Features / الميزات الأساسية

- ✅ **Add Contacts** - Add new contacts with name, type, and phone numbers  
**إضافة جهات الاتصال** - إضافة جهات اتصال جديدة مع الاسم والنوع وأرقام الهواتف
- ✅ **Search by Name** - Search contacts by name with smart matching  
**البحث بالاسم** - البحث عن جهات الاتصال بالاسم مع مطابقة ذكية
- ✅ **Search by Number** - Find contacts by phone number  
**البحث بالرقم** - العثور على جهات الاتصال برقم الهاتف
- ✅ **Delete by Name** - Delete contacts by exact name match  
**الحذف بالاسم** - حذف جهات الاتصال بمطابقة الاسم الدقيقة
- ✅ **Delete by Number** - Delete contacts by phone number  
**الحذف بالرقم** - حذف جهات الاتصال برقم الهاتف
- ✅ **Show All Contacts** - Display all contacts in a formatted table  
**عرض جميع جهات الاتصال** - عرض جميع جهات الاتصال في جدول منسق

### Bonus Features / الميزات الإضافية

- 🎯 **Multiple Phone Numbers** - Each contact can have multiple phone numbers  
**عدة أرقام هواتف** - كل جهة اتصال يمكن أن تحتوي على عدة أرقام هواتف
- 🎯 **Smart Name Search** - Similar-name matching (e.g., "Mohammed" matches "Mohamad")  
**بحث ذكي بالاسم** - مطابقة الأسماء المشابهة (مثلاً، "Mohammed" يطابق "Mohamad")
- 🎯 **Word-Based Matching** - Prevents substring false positives (e.g., "Ali" won't match "Khalid")  
**مطابقة قائمة على الكلمات** - يمنع المطابقات الجزئية الخاطئة (مثلاً، "Ali" لن يطابق "Khalid")

---

## 🔧 Requirements / المتطلبات

- **Java Development Kit (JDK)** version 8 or higher  
**JDK** الإصدار 8 أو أحدث
- **Command Line Interface (CLI)** or Terminal  
**واجهة سطر الأوامر** أو Terminal
- **Text Editor** or IDE (optional, for viewing code)  
**محرر نصوص** أو IDE (اختياري، لعرض الكود)

---

## 📦 Installation / التثبيت

### Step 1: Download / الخطوة 1: التحميل

Clone or download this repository to your local machine.

قم بنسخ أو تحميل هذا المستودع إلى جهازك المحلي.

```bash
git clone https://github.com/ibahas/Java_final_exam
cd Java_final_exam
```

### Step 2: Compile / الخطوة 2: الترجمة

Compile the Java source file:

قم بترجمة ملف Java المصدر:

```bash
javac Ibrahim_120244273.java
```

This will create `Ibrahim_120244273.class` file.

سيتم إنشاء ملف `Ibrahim_120244273.class`.

### Step 3: Run / الخطوة 3: التشغيل

Run the compiled program:

قم بتشغيل البرنامج المترجم:

```bash
java Ibrahim_120244273
```

---

## 🚀 Usage / الاستخدام

### Interactive Mode / الوضع التفاعلي

Run the program and follow the menu prompts:

قم بتشغيل البرنامج واتبع مطالبات القائمة:

```
Welcome to our Address book, please to find what you want
	1. Add new contact
	2. Search by name
	3. Search by number
	4. Delete contact by name
	5. Delete contact by number
	6. Show all contacts
	7. Exit
Please to enter your choice :
```

### Bulk Import / الاستيراد الجماعي

You can use a text file to bulk import contacts:

يمكنك استخدام ملف نصي لاستيراد جهات الاتصال بشكل جماعي:

```bash
java Ibrahim_120244273 < Examm.txt
```

**Note:** Make sure `Examm.txt` follows the correct input format (see Examples section).

**ملاحظة:** تأكد من أن `Examm.txt` يتبع تنسيق الإدخال الصحيح (انظر قسم الأمثلة).

---

## 📁 Project Structure / هيكل المشروع

```
Tasks/
│
├── Ibrahim_120244273.java          # Main source file / الملف المصدر الرئيسي
├── Ibrahim_120244273.class          # Compiled bytecode / البايت كود المترجم
├── Examm.txt                        # Sample dataset for bulk import / مجموعة بيانات للاستيراد الجماعي
├── README.md                        # This file / هذا الملف
├── Technical_Documentation_*.md    # Technical documentation / التوثيق التقني
├── Line_By_Line_Documentation_*.md # Line-by-line documentation / التوثيق سطر بسطر
├── AI_Test_Report_*.md             # Test report / تقرير الاختبار
│
└── test*.txt                        # Test input files / ملفات إدخال الاختبار
```

---

## 🔨 Functions / الدوال

### Main Functions / الدوال الرئيسية


| Function           | Description                 | Description (AR)            |
| ------------------ | --------------------------- | --------------------------- |
| `main()`           | Entry point of the program  | نقطة الدخول للبرنامج        |
| `getMenu()`        | Displays the main menu      | يعرض القائمة الرئيسية       |
| `addContact()`     | Adds a new contact          | يضيف جهة اتصال جديدة        |
| `searchByName()`   | Searches contacts by name   | يبحث عن جهات الاتصال بالاسم |
| `searchByNumber()` | Searches contacts by number | يبحث عن جهات الاتصال بالرقم |
| `deleteByName()`   | Deletes contacts by name    | يحذف جهات الاتصال بالاسم    |
| `deleteByNumber()` | Deletes contacts by number  | يحذف جهات الاتصال بالرقم    |
| `allContacts()`    | Displays all contacts       | يعرض جميع جهات الاتصال      |


### Helper Functions / الدوال المساعدة


| Function                  | Description                        | Description (AR)                       |
| ------------------------- | ---------------------------------- | -------------------------------------- |
| `isNumberExists()`        | Checks if a number already exists  | يتحقق من وجود الرقم مسبقاً             |
| `isValidNumber()`         | Validates phone number format      | يتحقق من صحة تنسيق رقم الهاتف          |
| `normalize()`             | Normalizes text for comparison     | يوحد النص للمقارنة                     |
| `tokenize()`              | Splits text into words             | يقسم النص إلى كلمات                    |
| `matchByTokens()`         | Matches words (not substrings)     | يطابق الكلمات (وليس السلاسل الجزئية)   |
| `removeVowelsKeepFirst()` | Removes vowels, keeps first letter | يزيل حروف العلة، يحافظ على الحرف الأول |


---

## 💡 Examples / أمثلة

### Example 1: Adding a Contact / مثال 1: إضافة جهة اتصال

```
Please to enter your choice : 1
Enter name (type 'exit' to stop): Ahmed Ali
Enter type (Family/Personal/Work/Other) or (f/p/w/o): f
Enter 'exit' to exit
Enter number: 0501234567
Add another number? (yes/y or no/n): n
Contact added successfully
```

### Example 2: Searching by Name / مثال 2: البحث بالاسم

```
Please to enter your choice : 2
Enter name to search : Ali
Ahmed Ali - Family - [0501234567]
```

**Note:** Searching "Ali" will match "Ahmed Ali" but NOT "Khalid" (prevents substring matching).

**ملاحظة:** البحث عن "Ali" سيطابق "Ahmed Ali" لكن لن يطابق "Khalid" (يمنع المطابقة الجزئية).

### Example 3: Adding Multiple Numbers / مثال 3: إضافة عدة أرقام

```
Please to enter your choice : 1
Enter name (type 'exit' to stop): Sara
Enter type (Family/Personal/Work/Other) or (f/p/w/o): p
Enter 'exit' to exit
Enter number: 0501111111
Add another number? (yes/y or no/n): yes
Enter number: 0502222222
Add another number? (yes/y or no/n): n
Contact added successfully
```

### Example 4: Deleting by Name / مثال 4: الحذف بالاسم

```
Please to enter your choice : 4
Enter name to delete : Ahmed Ali
1 contact(s) deleted
```

### Example 5: Invalid Type Handling / مثال 5: التعامل مع النوع غير الصحيح

```
Please to enter your choice : 1
Enter name (type 'exit' to stop): Test User
Enter type (Family/Personal/Work/Other) or (f/p/w/o): invalidType
Invalid type! It will be considered as Other
Enter 'exit' to exit
Enter number: 0500000000
Add another number? (yes/y or no/n): n
Contact added successfully
```

The contact will be saved with type "Other".

سيتم حفظ جهة الاتصال بنوع "Other".

---

## 🧪 Testing / الاختبار

### Test Files / ملفات الاختبار

The repository includes test input files for automated testing:

يتضمن المستودع ملفات إدخال اختبار للاختبار الآلي:

- `test1_invalid_type.txt` - Tests invalid type fallback
- `test2_duplicate_number.txt` - Tests duplicate number rejection
- `test3_substring_search.txt` - Tests substring matching prevention
- `test4_hamad_ahmad.txt` - Tests similar-name matching
- `test5_search_number.txt` - Tests search by number
- `test6_delete_by_name.txt` - Tests delete by name
- `test7_delete_by_number.txt` - Tests delete by number

### Running Tests / تشغيل الاختبارات

Run individual tests:

قم بتشغيل الاختبارات الفردية:

```bash
# Windows CMD
type test1_invalid_type.txt | java Ibrahim_120244273

# Linux/Mac
cat test1_invalid_type.txt | java Ibrahim_120244273
```

### Test Report / تقرير الاختبار

See `AI_Test_Report_AddressBook.md` for detailed test results.

راجع `AI_Test_Report_AddressBook.md` للحصول على نتائج الاختبار التفصيلية.

---

## 📊 Data Structures / هياكل البيانات

The program uses three synchronized ArrayLists to store contact information:

يستخدم البرنامج ثلاث ArrayLists متزامنة لتخزين معلومات جهات الاتصال:

```java
static ArrayList<String> contacts;              // Contact names / أسماء جهات الاتصال
static ArrayList<ArrayList<String>> nums_list;  // Phone numbers lists / قوائم أرقام الهواتف
static ArrayList<String> types;                // Contact types / أنواع جهات الاتصال
```

**Important:** All three lists maintain the same index order (index 0 in all lists belongs to the same contact).

**مهم:** جميع القوائم الثلاث تحافظ على نفس ترتيب الفهرس (الفهرس 0 في جميع القوائم ينتمي لنفس جهة الاتصال).

---

## 🎓 Contact Types / أنواع جهات الاتصال

The program supports four contact types:

يدعم البرنامج أربعة أنواع من جهات الاتصال:


| Type     | Short Form        | Description                          |
| -------- | ----------------- | ------------------------------------ |
| Family   | `f` or `Family`   | Family contacts / جهات اتصال عائلية  |
| Personal | `p` or `Personal` | Personal contacts / جهات اتصال شخصية |
| Work     | `w` or `Work`     | Work contacts / جهات اتصال عمل       |
| Other    | `o` or `Other`    | Other contacts / جهات اتصال أخرى     |


**Note:** Invalid types automatically default to "Other" with a warning message.

**ملاحظة:** الأنواع غير الصحيحة تصبح تلقائياً "Other" مع رسالة تحذير.

---

## 🔍 Search Features / ميزات البحث

### Name Search / البحث بالاسم

The search uses two matching methods:

يستخدم البحث طريقتين للمطابقة:

1. **Exact Word Match** - Matches complete words (prevents substring matching)
  **مطابقة الكلمة الدقيقة** - تطابق الكلمات الكاملة (يمنع المطابقة الجزئية)
2. **Similar Name Match** - Matches names with vowel differences (e.g., "Mohammed" ≈ "Mohamad")
  **مطابقة الأسماء المشابهة** - تطابق الأسماء مع اختلافات حروف العلة (مثلاً، "Mohammed" ≈ "Mohamad")

**Example:**  

- ✅ "Ali" matches "Ahmed Ali" (word match)  
- ❌ "Ali" does NOT match "Khalid" (substring prevented)  
- ✅ "Mohammed" matches "Mohamad" (similar match)

### Number Search / البحث بالرقم

Searches for contacts that contain the entered number in their number list. Prints ALL matching contacts.

يبحث عن جهات الاتصال التي تحتوي على الرقم المدخل في قائمة أرقامها. يطبع جميع جهات الاتصال المطابقة.

---

## ⚠️ Important Notes / ملاحظات مهمة

### Phone Number Validation / التحقق من رقم الهاتف

- Phone numbers must contain **digits only** (no letters or symbols)  
يجب أن تحتوي أرقام الهواتف على **أرقام فقط** (بدون أحرف أو رموز)
- **No duplicate numbers** across the entire address book  
**لا توجد أرقام مكررة** عبر دفتر العناوين بالكامل
- A contact **must have at least one number** to be saved  
يجب أن تحتوي جهة الاتصال على **رقم واحد على الأقل** ليتم حفظها

### Name Matching / مطابقة الأسماء

- Delete by name uses **exact match** (case-sensitive)  
الحذف بالاسم يستخدم **مطابقة دقيقة** (حساسة لحالة الأحرف)
- Search by name uses **case-insensitive** matching  
البحث بالاسم يستخدم مطابقة **غير حساسة لحالة الأحرف**

### Deletion / الحذف

- Delete by name deletes **ALL contacts** with that exact name  
الحذف بالاسم يحذف **جميع جهات الاتصال** بهذا الاسم الدقيق
- Delete by number deletes **ALL contacts** containing that number  
الحذف بالرقم يحذف **جميع جهات الاتصال** التي تحتوي على هذا الرقم

---

## 👥 Authors / المؤلفون

- **Ibrahim Ali Ibrahim Abu Hassanein**  
Student ID: 120244273  
Java Practical (101)
- **Bashar Mohammed Salem Al-Brim**  
Student ID: 120235430  
Java Practical (101)

**Course:** Programming Language 1 (Java)  
**المادة:** لغة البرمجة 1 (Java)  
**Semester:** I 2025/2026  
**ال semester:** الأول 2025/2026

---

## 📚 Documentation / التوثيق

### Available Documentation Files / ملفات التوثيق المتاحة

1. **Technical_Documentation_Ibrahim_120244273.md**
  Comprehensive technical documentation with function descriptions and usage examples.  
   توثيق تقني شامل مع أوصاف الدوال وأمثلة الاستخدام.
2. **Line_By_Line_Documentation_Ibrahim_120244273.md**
  Complete line-by-line code explanation in English and Arabic.  
   شرح كامل سطر بسطر للكود بالإنجليزية والعربية.
3. **AI_Test_Report_AddressBook.md**
  Automated test report with pass/fail results and bug reports.  
   تقرير اختبار آلي مع نتائج النجاح/الفشل وتقارير الأخطاء.

---

## 🐛 Known Issues / المشاكل المعروفة

None currently. All tests pass successfully.

لا توجد حالياً. جميع الاختبارات تمر بنجاح.

---

## 🔮 Future Enhancements / التحسينات المستقبلية

Possible improvements for future versions:

التحسينات المحتملة للإصدارات المستقبلية:

- Save/load contacts from file  
حفظ/تحميل جهات الاتصال من ملف
- Edit existing contacts  
تعديل جهات الاتصال الموجودة
- Export contacts to CSV/JSON  
تصدير جهات الاتصال إلى CSV/JSON
- GUI (Graphical User Interface)  
واجهة المستخدم الرسومية
- Contact groups/categories  
مجموعات/فئات جهات الاتصال
- Search history  
سجل البحث

---

## 📝 License / الترخيص

This project is created for educational purposes as part of the Programming Language 1 course.

هذا المشروع تم إنشاؤه لأغراض تعليمية كجزء من مادة لغة البرمجة 1.

---

## 🙏 Acknowledgments / شكر وتقدير

- **Lab Lecturers / محاضرو المختبر:**
  - Eng. Mohammed Sh. Al-Dalo

---

## 📈 Project Status / حالة المشروع

✅ **Complete** - All requirements implemented and tested  
**مكتمل** - جميع المتطلبات منفذة ومختبرة

- ✅ Core features implemented  
الميزات الأساسية منفذة
- ✅ Bonus features implemented  
الميزات الإضافية منفذة
- ✅ All tests passing  
جميع الاختبارات تمر
- ✅ Documentation complete  
التوثيق مكتمل

---

**Last Updated:** February 2026  
**آخر تحديث:** فبراير 2026

---

*Made with ❤️ for Java Practical (101)*  
*صُنع بـ ❤️ للمختبر البرمجي (101)*