# Technical Documentation - Address Book Application
# التوثيق التقني - تطبيق دفتر العناوين

**File:** `Ibrahim_120244273.java`  
**Project:** Address Book System (نظام دفتر العناوين)  
**Language:** Java  
**Total Lines:** 430

---

## Table of Contents / جدول المحتويات

1. [Class Structure / هيكل الكلاس](#class-structure)
2. [Main Method / الدالة الرئيسية](#main-method)
3. [Menu Functions / دوال القائمة](#menu-functions)
4. [Helper Functions / الدوال المساعدة](#helper-functions)
5. [Complete Code Listing / قائمة الكود الكاملة](#complete-code-listing)

---

## Class Structure / هيكل الكلاس

### Lines 1-15: Class Declaration and Data Structures

**English:**
- **Lines 1-2:** Group member comments (student IDs and names)
- **Lines 4-5:** Import statements for `ArrayList` and `Scanner`
- **Line 7:** Public class declaration `Ibrahim_120244273`
- **Lines 10-12:** Static ArrayLists to store contacts data:
  - `contacts`: Stores contact names
  - `nums_list`: Stores lists of phone numbers (supports multiple numbers per contact)
  - `types`: Stores contact types (Family/Personal/Work/Other)
- **Line 14:** Scanner object for user input

**العربية:**
- **السطران 1-2:** تعليقات أعضاء المجموعة (أرقام الطلاب والأسماء)
- **السطران 4-5:** استيراد المكتبات `ArrayList` و `Scanner`
- **السطر 7:** إعلان الكلاس العام `Ibrahim_120244273`
- **السطور 10-12:** مصفوفات ديناميكية ثابتة لتخزين بيانات جهات الاتصال:
  - `contacts`: تخزين أسماء جهات الاتصال
  - `nums_list`: تخزين قوائم أرقام الهواتف (يدعم عدة أرقام لكل جهة اتصال)
  - `types`: تخزين أنواع جهات الاتصال (عائلة/شخصي/عمل/أخرى)
- **السطر 14:** كائن Scanner لإدخال المستخدم

---

## Main Method / الدالة الرئيسية

### Lines 16-57: `main(String[] args)`

**English:**
The main entry point of the program. It displays a menu in a loop until the user chooses option 7 (Exit).

**Functionality:**
- **Line 17:** Initialize choice variable
- **Lines 19-54:** Do-while loop that continues until choice is 7
- **Line 20:** Call `getMenu()` to display options
- **Line 21:** Read user input and trim whitespace
- **Lines 23-28:** Try-catch block to validate integer input; prints "Invalid choice" if non-numeric
- **Lines 31-53:** Switch statement to call appropriate function based on user choice:
  - Case 1: `addContact()`
  - Case 2: `searchByName()`
  - Case 3: `searchByNumber()`
  - Case 4: `deleteByName()`
  - Case 5: `deleteByNumber()`
  - Case 6: `allContacts()`
  - Case 7: Print "Goodbye!" and exit
- **Line 56:** Close Scanner

**Usage Example:**
```
Program starts → Menu displayed → User enters 1 → addContact() called → Menu displayed again → ...
```

**العربية:**
نقطة الدخول الرئيسية للبرنامج. تعرض قائمة في حلقة حتى يختار المستخدم الخيار 7 (خروج).

**الوظيفة:**
- **السطر 17:** تهيئة متغير الاختيار
- **السطور 19-54:** حلقة do-while تستمر حتى يكون الاختيار 7
- **السطر 20:** استدعاء `getMenu()` لعرض الخيارات
- **السطر 21:** قراءة إدخال المستخدم وإزالة المسافات
- **السطور 23-28:** كتلة try-catch للتحقق من صحة الإدخال الرقمي؛ يطبع "Invalid choice" إذا لم يكن رقماً
- **السطور 31-53:** عبارة switch لاستدعاء الدالة المناسبة حسب اختيار المستخدم

**مثال الاستخدام:**
```
يبدأ البرنامج → عرض القائمة → المستخدم يدخل 1 → استدعاء addContact() → عرض القائمة مرة أخرى → ...
```

---

## Menu Functions / دوال القائمة

### Lines 59-70: `getMenu()`

**English:**
Displays the main menu with 7 options.

**Functionality:**
- Prints welcome message and numbered options
- No parameters, no return value

**Usage Example:**
```java
getMenu(); // Called automatically in main loop
```

**Output:**
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

**العربية:**
تعرض القائمة الرئيسية مع 7 خيارات.

**الوظيفة:**
- طباعة رسالة الترحيب والخيارات المرقمة
- لا تأخذ معاملات، لا ترجع قيمة

**مثال الاستخدام:**
```java
getMenu(); // يتم استدعاؤها تلقائياً في الحلقة الرئيسية
```

---

### Lines 72-194: `addContact()`

**English:**
Adds a new contact to the address book. Supports multiple phone numbers per contact (bonus feature).

**Functionality:**
- **Lines 76-88:** Name input loop:
  - Validates name is not empty
  - Allows "exit" to cancel
- **Lines 90-110:** Type input and validation:
  - Accepts: Family/Personal/Work/Other or f/p/w/o (case-insensitive)
  - Invalid types default to "Other" with warning message
- **Lines 112-184:** Phone number input loop:
  - Supports multiple numbers per contact
  - Validates digits only (calls `isValidNumber()`)
  - Prevents duplicate numbers (calls `isNumberExists()`)
  - User can type "n" or "no" to stop adding numbers
  - If no numbers entered and user types "n", contact is cancelled
- **Lines 186-193:** Save contact if at least one number was added

**Usage Examples:**

**Example 1: Simple contact**
```
Input:
Name: Ahmed Ali
Type: f
Number: 0501234567
Add another? n
Result: Contact added successfully
```

**Example 2: Multiple numbers**
```
Input:
Name: Sara
Type: Personal
Number: 0501111111
Add another? yes
Number: 0502222222
Add another? n
Result: Contact added with 2 numbers
```

**Example 3: Invalid type**
```
Input:
Name: Test
Type: invalidType
Result: "Invalid type! It will be considered as Other"
Contact saved as "Other"
```

**Example 4: Duplicate number**
```
Input:
Name: Contact1
Number: 0501234567
(Contact1 saved)

Name: Contact2
Number: 0501234567
Result: "Number already exists! Enter a different number."
Contact2 not added
```

**Example 5: Cancel adding**
```
Input:
Name: exit
Result: "Cancelled adding contact."
No contact added
```

**العربية:**
تضيف جهة اتصال جديدة إلى دفتر العناوين. تدعم عدة أرقام هاتف لكل جهة اتصال (ميزة إضافية).

**الوظيفة:**
- **السطور 76-88:** حلقة إدخال الاسم:
  - التحقق من أن الاسم غير فارغ
  - السماح بـ "exit" للإلغاء
- **السطور 90-110:** إدخال النوع والتحقق:
  - يقبل: عائلة/شخصي/عمل/أخرى أو f/p/w/o (غير حساس لحالة الأحرف)
  - الأنواع غير الصحيحة تصبح "أخرى" مع رسالة تحذير
- **السطور 112-184:** حلقة إدخال رقم الهاتف:
  - يدعم عدة أرقام لكل جهة اتصال
  - التحقق من الأرقام فقط (استدعاء `isValidNumber()`)
  - منع الأرقام المكررة (استدعاء `isNumberExists()`)
  - المستخدم يمكنه كتابة "n" أو "no" لإيقاف إضافة الأرقام
  - إذا لم يتم إدخال أرقام وكتابة "n"، يتم إلغاء جهة الاتصال
- **السطور 186-193:** حفظ جهة الاتصال إذا تم إدخال رقم واحد على الأقل

**أمثلة الاستخدام:**

**مثال 1: جهة اتصال بسيطة**
```
الإدخال:
الاسم: أحمد علي
النوع: f
الرقم: 0501234567
إضافة أخرى؟ n
النتيجة: تمت إضافة جهة الاتصال بنجاح
```

**مثال 2: عدة أرقام**
```
الإدخال:
الاسم: سارة
النوع: Personal
الرقم: 0501111111
إضافة أخرى؟ yes
الرقم: 0502222222
إضافة أخرى؟ n
النتيجة: جهة اتصال مع رقمين
```

**مثال 3: نوع غير صحيح**
```
الإدخال:
الاسم: اختبار
النوع: invalidType
النتيجة: "Invalid type! It will be considered as Other"
يتم حفظ جهة الاتصال كـ "Other"
```

**مثال 4: رقم مكرر**
```
الإدخال:
الاسم: Contact1
الرقم: 0501234567
(تم حفظ Contact1)

الاسم: Contact2
الرقم: 0501234567
النتيجة: "Number already exists! Enter a different number."
لم يتم إضافة Contact2
```

**مثال 5: إلغاء الإضافة**
```
الإدخال:
الاسم: exit
النتيجة: "Cancelled adding contact."
لم يتم إضافة جهة اتصال
```

---

### Lines 196-241: `searchByName()`

**English:**
Searches for contacts by name using token-based matching and similar-name matching (bonus feature).

**Functionality:**
- **Line 199:** Read search query
- **Lines 201-204:** Return "Not found" if empty
- **Line 207:** Normalize search string (calls `normalize()`)
- **Line 210:** Create similar search version (calls `removeVowelsKeepFirst()`)
- **Lines 213-214:** Tokenize search query (calls `tokenize()`)
- **Lines 220-238:** Loop through all contacts:
  - **Line 226:** Check exact word match (calls `matchByTokens()`)
  - **Line 234:** Check similar match (vowel-removed version)
- **Line 240:** Print "Not found" if no matches

**Key Features:**
- **No substring matching:** Searching "Ali" will NOT match "Khalid" (prevents false positives)
- **Word-based matching:** "Ahmed Ali" matches search "Ali" (full word match)
- **Similar-name matching:** "Mohammed" matches "Mohamad" (vowel differences ignored, but first letter preserved)

**Usage Examples:**

**Example 1: Exact match**
```
Contacts: ["Ahmed Ali", "Sara"]
Search: "Ali"
Result: "Ahmed Ali - Personal - [0501234567]"
(Does NOT match "Sara")
```

**Example 2: No substring match**
```
Contacts: ["Khalid"]
Search: "Ali"
Result: "Not found"
(Does NOT match "Khalid" even though it contains "ali" as letters)
```

**Example 3: Similar name**
```
Contacts: ["Mohammed Ahmad"]
Search: "Mohammed Ahmad"
Result: "Mohammed Ahmad - Personal - [0501234567]"
```

**Example 4: Multiple words**
```
Contacts: ["Ahmed Ali", "Ali Hassan"]
Search: "Ali"
Result: Both contacts printed
```

**العربية:**
يبحث عن جهات الاتصال بالاسم باستخدام مطابقة الكلمات ومطابقة الأسماء المشابهة (ميزة إضافية).

**الوظيفة:**
- **السطر 199:** قراءة استعلام البحث
- **السطور 201-204:** إرجاع "Not found" إذا كان فارغاً
- **السطر 207:** توحيد سلسلة البحث (استدعاء `normalize()`)
- **السطر 210:** إنشاء نسخة بحث مشابهة (استدعاء `removeVowelsKeepFirst()`)
- **السطور 213-214:** تقسيم استعلام البحث (استدعاء `tokenize()`)
- **السطور 220-238:** حلقة عبر جميع جهات الاتصال:
  - **السطر 226:** التحقق من مطابقة الكلمات الدقيقة (استدعاء `matchByTokens()`)
  - **السطر 234:** التحقق من المطابقة المشابهة (نسخة بدون حروف علة)
- **السطر 240:** طباعة "Not found" إذا لم توجد مطابقات

**الميزات الرئيسية:**
- **لا مطابقة جزئية:** البحث عن "Ali" لن يطابق "Khalid" (يمنع النتائج الخاطئة)
- **مطابقة قائمة على الكلمات:** "Ahmed Ali" يطابق البحث "Ali" (مطابقة كلمة كاملة)
- **مطابقة الأسماء المشابهة:** "Mohammed" يطابق "Mohamad" (تجاهل اختلافات حروف العلة، لكن الحرف الأول محفوظ)

**أمثلة الاستخدام:**

**مثال 1: مطابقة دقيقة**
```
جهات الاتصال: ["Ahmed Ali", "Sara"]
البحث: "Ali"
النتيجة: "Ahmed Ali - Personal - [0501234567]"
(لا يطابق "Sara")
```

**مثال 2: لا مطابقة جزئية**
```
جهات الاتصال: ["Khalid"]
البحث: "Ali"
النتيجة: "Not found"
(لا يطابق "Khalid" رغم احتوائه على "ali" كأحرف)
```

**مثال 3: اسم مشابه**
```
جهات الاتصال: ["Mohammed Ahmad"]
البحث: "Mohammed Ahmad"
النتيجة: "Mohammed Ahmad - Personal - [0501234567]"
```

**مثال 4: عدة كلمات**
```
جهات الاتصال: ["Ahmed Ali", "Ali Hassan"]
البحث: "Ali"
النتيجة: طباعة جهتي الاتصال
```

---

### Lines 243-270: `searchByNumber()`

**English:**
Searches for contacts by phone number. Prints ALL contacts that contain the entered number.

**Functionality:**
- **Lines 246-258:** Input validation loop:
  - Checks for empty input
  - Validates digits only (calls `isValidNumber()`)
- **Lines 262-267:** Loop through all contacts and check if number exists in their number list
- **Line 269:** Print "Not found" if no matches

**Usage Examples:**

**Example 1: Single match**
```
Contacts: ["Ahmed" with number "0501234567"]
Search: "0501234567"
Result: "Ahmed - Personal - [0501234567]"
```

**Example 2: Multiple matches**
```
Contacts: 
  - "Ahmed" with numbers ["0501234567", "0501111111"]
  - "Sara" with number "0501234567"
Search: "0501234567"
Result: Both contacts printed
```

**Example 3: Invalid input**
```
Search: "abc"
Result: "Invalid number! Enter digits only."
(Repeats until valid number entered)
```

**Example 4: No match**
```
Search: "9999999999"
Result: "Not found"
```

**العربية:**
يبحث عن جهات الاتصال برقم الهاتف. يطبع جميع جهات الاتصال التي تحتوي على الرقم المدخل.

**الوظيفة:**
- **السطور 246-258:** حلقة التحقق من الإدخال:
  - التحقق من الإدخال الفارغ
  - التحقق من الأرقام فقط (استدعاء `isValidNumber()`)
- **السطور 262-267:** حلقة عبر جميع جهات الاتصال والتحقق من وجود الرقم في قائمة أرقامها
- **السطر 269:** طباعة "Not found" إذا لم توجد مطابقات

**أمثلة الاستخدام:**

**مثال 1: مطابقة واحدة**
```
جهات الاتصال: ["Ahmed" برقم "0501234567"]
البحث: "0501234567"
النتيجة: "Ahmed - Personal - [0501234567]"
```

**مثال 2: عدة مطابقات**
```
جهات الاتصال: 
  - "Ahmed" بأرقام ["0501234567", "0501111111"]
  - "Sara" برقم "0501234567"
البحث: "0501234567"
النتيجة: طباعة جهتي الاتصال
```

**مثال 3: إدخال غير صحيح**
```
البحث: "abc"
النتيجة: "Invalid number! Enter digits only."
(يكرر حتى إدخال رقم صحيح)
```

**مثال 4: لا مطابقة**
```
البحث: "9999999999"
النتيجة: "Not found"
```

---

### Lines 272-290: `deleteByName()`

**English:**
Deletes ALL contacts whose name exactly matches the entered string. Prints count of deleted contacts.

**Functionality:**
- **Line 275:** Read name to delete (trimmed)
- **Line 277:** Initialize deletion counter
- **Lines 279-286:** Loop backwards through contacts (to avoid index issues when removing):
  - If name matches exactly, remove contact, type, and numbers
  - Increment deletion counter
- **Lines 288-289:** Print result (count or "Not found")

**Usage Examples:**

**Example 1: Single deletion**
```
Contacts: ["Ahmed Ali"]
Delete: "Ahmed Ali"
Result: "1 contact(s) deleted"
```

**Example 2: Multiple deletions**
```
Contacts: 
  - "Rana Ali" (Family)
  - "Rana Ali" (Personal)
Delete: "Rana Ali"
Result: "2 contact(s) deleted"
(Both contacts removed)
```

**Example 3: No match**
```
Contacts: ["Ahmed Ali"]
Delete: "Sara"
Result: "Not found"
```

**Example 4: Case-sensitive exact match**
```
Contacts: ["Ahmed Ali"]
Delete: "ahmed ali"
Result: "Not found"
(Exact match required, case-sensitive)
```

**العربية:**
يحذف جميع جهات الاتصال التي تطابق اسمها تماماً السلسلة المدخلة. يطبع عدد جهات الاتصال المحذوفة.

**الوظيفة:**
- **السطر 275:** قراءة الاسم للحذف (مع إزالة المسافات)
- **السطر 277:** تهيئة عداد الحذف
- **السطور 279-286:** حلقة عكسية عبر جهات الاتصال (لتجنب مشاكل الفهرس عند الحذف):
  - إذا طابق الاسم تماماً، احذف جهة الاتصال والنوع والأرقام
  - زيادة عداد الحذف
- **السطور 288-289:** طباعة النتيجة (العدد أو "Not found")

**أمثلة الاستخدام:**

**مثال 1: حذف واحد**
```
جهات الاتصال: ["Ahmed Ali"]
الحذف: "Ahmed Ali"
النتيجة: "1 contact(s) deleted"
```

**مثال 2: عدة حذوفات**
```
جهات الاتصال: 
  - "Rana Ali" (عائلة)
  - "Rana Ali" (شخصي)
الحذف: "Rana Ali"
النتيجة: "2 contact(s) deleted"
(تم حذف جهتي الاتصال)
```

**مثال 3: لا مطابقة**
```
جهات الاتصال: ["Ahmed Ali"]
الحذف: "Sara"
النتيجة: "Not found"
```

**مثال 4: مطابقة دقيقة حساسة لحالة الأحرف**
```
جهات الاتصال: ["Ahmed Ali"]
الحذف: "ahmed ali"
النتيجة: "Not found"
(مطابقة دقيقة مطلوبة، حساسة لحالة الأحرف)
```

---

### Lines 292-310: `deleteByNumber()`

**English:**
Deletes ALL contacts that have the entered number in their number list. Prints count of deleted contacts.

**Functionality:**
- **Line 295:** Read number to delete (trimmed)
- **Line 297:** Initialize deletion counter
- **Lines 299-306:** Loop backwards through contacts:
  - If contact's number list contains the entered number, delete entire contact
  - Increment deletion counter
- **Lines 308-309:** Print result (count or "Not found")

**Usage Examples:**

**Example 1: Single deletion**
```
Contacts: ["Ahmed" with number "0501234567"]
Delete: "0501234567"
Result: "Deleted successfully (1)"
```

**Example 2: Multiple deletions**
```
Contacts:
  - "Ahmed" with numbers ["0501234567", "0501111111"]
  - "Sara" with number "0501234567"
Delete: "0501234567"
Result: "Deleted successfully (2)"
(Both contacts removed)
```

**Example 3: No match**
```
Delete: "9999999999"
Result: "Not found"
```

**Example 4: Contact with multiple numbers**
```
Contact: "Ahmed" with numbers ["0501234567", "0501111111"]
Delete: "0501234567"
Result: Entire contact deleted (including both numbers)
```

**العربية:**
يحذف جميع جهات الاتصال التي تحتوي على الرقم المدخل في قائمة أرقامها. يطبع عدد جهات الاتصال المحذوفة.

**الوظيفة:**
- **السطر 295:** قراءة الرقم للحذف (مع إزالة المسافات)
- **السطر 297:** تهيئة عداد الحذف
- **السطور 299-306:** حلقة عكسية عبر جهات الاتصال:
  - إذا كانت قائمة أرقام جهة الاتصال تحتوي على الرقم المدخل، احذف جهة الاتصال بالكامل
  - زيادة عداد الحذف
- **السطور 308-309:** طباعة النتيجة (العدد أو "Not found")

**أمثلة الاستخدام:**

**مثال 1: حذف واحد**
```
جهات الاتصال: ["Ahmed" برقم "0501234567"]
الحذف: "0501234567"
النتيجة: "Deleted successfully (1)"
```

**مثال 2: عدة حذوفات**
```
جهات الاتصال:
  - "Ahmed" بأرقام ["0501234567", "0501111111"]
  - "Sara" برقم "0501234567"
الحذف: "0501234567"
النتيجة: "Deleted successfully (2)"
(تم حذف جهتي الاتصال)
```

**مثال 3: لا مطابقة**
```
الحذف: "9999999999"
النتيجة: "Not found"
```

**مثال 4: جهة اتصال بعدة أرقام**
```
جهة الاتصال: "Ahmed" بأرقام ["0501234567", "0501111111"]
الحذف: "0501234567"
النتيجة: حذف جهة الاتصال بالكامل (بما في ذلك كلا الرقمين)
```

---

### Lines 312-326: `allContacts()`

**English:**
Displays all contacts in a formatted table. Shows empty message if no contacts exist.

**Functionality:**
- **Lines 314-315:** Check if contacts list is empty; print empty message if true
- **Lines 317-324:** If contacts exist:
  - Print header with contact count
  - Print table header (Name, Type, Numbers)
  - Loop through all contacts and print each in a row

**Usage Examples:**

**Example 1: Empty address book**
```
Result: "Your have a Zero contacts no contacts yet."
```

**Example 2: With contacts**
```
Contacts:
  - "Ahmed Ali" (Personal) [0501234567]
  - "Sara" (Family) [0501111111, 0502222222]

Result:
Your count is 2 Here are your contacts:
------------------------------------------------------------
	Name		Type		Numbers
------------------------------------------------------------
	Ahmed Ali		Personal		[0501234567]
	Sara		Family		[0501111111, 0502222222]
```

**العربية:**
تعرض جميع جهات الاتصال في جدول منسق. تعرض رسالة فارغة إذا لم توجد جهات اتصال.

**الوظيفة:**
- **السطور 314-315:** التحقق من كون قائمة جهات الاتصال فارغة؛ طباعة رسالة فارغة إذا كانت كذلك
- **السطور 317-324:** إذا كانت جهات الاتصال موجودة:
  - طباعة رأس مع عدد جهات الاتصال
  - طباعة رأس الجدول (الاسم، النوع، الأرقام)
  - حلقة عبر جميع جهات الاتصال وطباعة كل واحدة في صف

**أمثلة الاستخدام:**

**مثال 1: دفتر عناوين فارغ**
```
النتيجة: "Your have a Zero contacts no contacts yet."
```

**مثال 2: مع جهات اتصال**
```
جهات الاتصال:
  - "Ahmed Ali" (شخصي) [0501234567]
  - "Sara" (عائلة) [0501111111, 0502222222]

النتيجة:
Your count is 2 Here are your contacts:
------------------------------------------------------------
	Name		Type		Numbers
------------------------------------------------------------
	Ahmed Ali		Personal		[0501234567]
	Sara		Family		[0501111111, 0502222222]
```

---

## Helper Functions / الدوال المساعدة

### Lines 344-349: `isNumberExists(String number)`

**English:**
Checks if a phone number already exists in any contact's number list.

**Parameters:**
- `number`: Phone number string to check

**Returns:**
- `true` if number exists in any contact
- `false` if number does not exist

**Usage Example:**
```java
if (isNumberExists("0501234567")) {
    System.out.println("Number already exists!");
}
```

**Called by:** `addContact()` at line 149

**العربية:**
يتحقق من وجود رقم هاتف في قائمة أرقام أي جهة اتصال.

**المعاملات:**
- `number`: سلسلة رقم الهاتف للتحقق

**الإرجاع:**
- `true` إذا كان الرقم موجوداً في أي جهة اتصال
- `false` إذا لم يكن الرقم موجوداً

**مثال الاستخدام:**
```java
if (isNumberExists("0501234567")) {
    System.out.println("Number already exists!");
}
```

**يتم استدعاؤها من:** `addContact()` في السطر 149

---

### Lines 351-357: `isValidNumber(String number)`

**English:**
Validates that a string contains only digits (no letters or symbols).

**Parameters:**
- `number`: String to validate

**Returns:**
- `true` if string contains only digits
- `false` if empty or contains non-digit characters

**Usage Examples:**

**Example 1: Valid number**
```java
isValidNumber("0501234567") // returns true
```

**Example 2: Invalid number**
```java
isValidNumber("abc123") // returns false
isValidNumber("") // returns false
isValidNumber("050-123-4567") // returns false (contains '-')
```

**Called by:** 
- `addContact()` at line 144
- `searchByNumber()` at line 253

**العربية:**
يتحقق من أن السلسلة تحتوي على أرقام فقط (بدون أحرف أو رموز).

**المعاملات:**
- `number`: السلسلة للتحقق

**الإرجاع:**
- `true` إذا كانت السلسلة تحتوي على أرقام فقط
- `false` إذا كانت فارغة أو تحتوي على أحرف غير رقمية

**أمثلة الاستخدام:**

**مثال 1: رقم صحيح**
```java
isValidNumber("0501234567") // يرجع true
```

**مثال 2: رقم غير صحيح**
```java
isValidNumber("abc123") // يرجع false
isValidNumber("") // يرجع false
isValidNumber("050-123-4567") // يرجع false (يحتوي على '-')
```

**يتم استدعاؤها من:** 
- `addContact()` في السطر 144
- `searchByNumber()` في السطر 253

---

### Lines 362-366: `normalize(String s)`

**English:**
Normalizes a string by converting to lowercase, trimming whitespace, and collapsing multiple spaces into one.

**Parameters:**
- `s`: String to normalize

**Returns:**
- Normalized string (lowercase, trimmed, single spaces)

**Usage Examples:**

**Example 1: Basic normalization**
```java
normalize("  AHMED  ALI  ") // returns "ahmed ali"
```

**Example 2: Multiple spaces**
```java
normalize("Ahmed    Ali") // returns "ahmed ali"
```

**Called by:** 
- `searchByName()` at lines 207, 221
- `removeVowelsKeepFirst()` at line 405

**العربية:**
يوحد السلسلة بتحويلها إلى أحرف صغيرة، وإزالة المسافات الزائدة، ودمج المسافات المتعددة في مسافة واحدة.

**المعاملات:**
- `s`: السلسلة للتوحيد

**الإرجاع:**
- سلسلة موحدة (أحرف صغيرة، بدون مسافات زائدة، مسافات مفردة)

**أمثلة الاستخدام:**

**مثال 1: توحيد أساسي**
```java
normalize("  AHMED  ALI  ") // يرجع "ahmed ali"
```

**مثال 2: عدة مسافات**
```java
normalize("Ahmed    Ali") // يرجع "ahmed ali"
```

**يتم استدعاؤها من:** 
- `searchByName()` في السطور 207, 221
- `removeVowelsKeepFirst()` في السطر 405

---

### Lines 370-373: `tokenize(String s)`

**English:**
Splits a string into an array of words (tokens) separated by spaces.

**Parameters:**
- `s`: String to tokenize

**Returns:**
- Array of strings (words), or empty array if input is empty

**Usage Examples:**

**Example 1: Basic tokenization**
```java
tokenize("ahmed ali") // returns ["ahmed", "ali"]
```

**Example 2: Single word**
```java
tokenize("ahmed") // returns ["ahmed"]
```

**Example 3: Empty string**
```java
tokenize("") // returns []
```

**Called by:** 
- `searchByName()` at lines 213, 214
- `matchByTokens()` at line 382
- `removeVowelsKeepFirst()` at line 409

**العربية:**
يقسم السلسلة إلى مصفوفة من الكلمات (الرموز) مفصولة بمسافات.

**المعاملات:**
- `s`: السلسلة للتقسيم

**الإرجاع:**
- مصفوفة من السلاسل (الكلمات)، أو مصفوفة فارغة إذا كان الإدخال فارغاً

**أمثلة الاستخدام:**

**مثال 1: تقسيم أساسي**
```java
tokenize("ahmed ali") // يرجع ["ahmed", "ali"]
```

**مثال 2: كلمة واحدة**
```java
tokenize("ahmed") // يرجع ["ahmed"]
```

**مثال 3: سلسلة فارغة**
```java
tokenize("") // يرجع []
```

**يتم استدعاؤها من:** 
- `searchByName()` في السطور 213, 214
- `matchByTokens()` في السطر 382
- `removeVowelsKeepFirst()` في السطر 409

---

### Lines 381-396: `matchByTokens(String fullNameNormalized, String[] searchTokens)`

**English:**
Checks if all search tokens exist as complete words in the normalized full name. Prevents substring matching (e.g., "Ali" won't match "Khalid").

**Parameters:**
- `fullNameNormalized`: Normalized full name to search in
- `searchTokens`: Array of search words (tokens)

**Returns:**
- `true` if all search tokens are found as complete words
- `false` if any token is missing

**Usage Examples:**

**Example 1: Match**
```java
matchByTokens("ahmed ali", ["ali"]) // returns true
```

**Example 2: No substring match**
```java
matchByTokens("khalid", ["ali"]) // returns false
(Prevents "Ali" matching inside "Khalid")
```

**Example 3: Multiple tokens**
```java
matchByTokens("ahmed ali hassan", ["ahmed", "ali"]) // returns true
matchByTokens("ahmed ali hassan", ["ahmed", "sara"]) // returns false
```

**Called by:** `searchByName()` at lines 226, 234

**العربية:**
يتحقق من وجود جميع رموز البحث ككلمات كاملة في الاسم الكامل الموحد. يمنع المطابقة الجزئية (مثلاً، "Ali" لن يطابق "Khalid").

**المعاملات:**
- `fullNameNormalized`: الاسم الكامل الموحد للبحث فيه
- `searchTokens`: مصفوفة كلمات البحث (الرموز)

**الإرجاع:**
- `true` إذا تم العثور على جميع رموز البحث ككلمات كاملة
- `false` إذا كان أي رمز مفقوداً

**أمثلة الاستخدام:**

**مثال 1: مطابقة**
```java
matchByTokens("ahmed ali", ["ali"]) // يرجع true
```

**مثال 2: لا مطابقة جزئية**
```java
matchByTokens("khalid", ["ali"]) // يرجع false
(يمنع مطابقة "Ali" داخل "Khalid")
```

**مثال 3: عدة رموز**
```java
matchByTokens("ahmed ali hassan", ["ahmed", "ali"]) // يرجع true
matchByTokens("ahmed ali hassan", ["ahmed", "sara"]) // يرجع false
```

**يتم استدعاؤها من:** `searchByName()` في السطور 226, 234

---

### Lines 404-429: `removeVowelsKeepFirst(String text)`

**English:**
Removes vowels from a string but keeps the first letter of each word. Used for similar-name matching (bonus feature). Prevents confusion between names like "hamad" and "ahmad".

**Parameters:**
- `text`: String to process

**Returns:**
- String with vowels removed but first letter preserved

**Usage Examples:**

**Example 1: Basic usage**
```java
removeVowelsKeepFirst("hamad") // returns "hmd"
removeVowelsKeepFirst("ahmad") // returns "ahmd"
(Different results prevent wrong matches)
```

**Example 2: Multiple words**
```java
removeVowelsKeepFirst("mohammed ali") // returns "mhmmd al"
```

**Example 3: Why it's useful**
```java
// Without first letter preservation:
removeVowels("hamad") // would be "hmd"
removeVowels("ahmad") // would be "hmd" (SAME - wrong match!)

// With first letter preservation:
removeVowelsKeepFirst("hamad") // "hmd"
removeVowelsKeepFirst("ahmad") // "ahmd" (DIFFERENT - correct!)
```

**Called by:** `searchByName()` at lines 210, 222

**العربية:**
يزيل حروف العلة من السلسلة لكن يحافظ على الحرف الأول من كل كلمة. يُستخدم لمطابقة الأسماء المشابهة (ميزة إضافية). يمنع الخلط بين أسماء مثل "hamad" و "ahmad".

**المعاملات:**
- `text`: السلسلة للمعالجة

**الإرجاع:**
- سلسلة مع إزالة حروف العلة لكن الحرف الأول محفوظ

**أمثلة الاستخدام:**

**مثال 1: استخدام أساسي**
```java
removeVowelsKeepFirst("hamad") // يرجع "hmd"
removeVowelsKeepFirst("ahmad") // يرجع "ahmd"
(نتائج مختلفة تمنع المطابقات الخاطئة)
```

**مثال 2: عدة كلمات**
```java
removeVowelsKeepFirst("mohammed ali") // يرجع "mhmmd al"
```

**مثال 3: لماذا هو مفيد**
```java
// بدون الحفاظ على الحرف الأول:
removeVowels("hamad") // سيكون "hmd"
removeVowels("ahmad") // سيكون "hmd" (نفس الشيء - مطابقة خاطئة!)

// مع الحفاظ على الحرف الأول:
removeVowelsKeepFirst("hamad") // "hmd"
removeVowelsKeepFirst("ahmad") // "ahmd" (مختلف - صحيح!)
```

**يتم استدعاؤها من:** `searchByName()` في السطور 210, 222

---

### Lines 330-341: `removeVowels(String text)` (Legacy/Unused)

**English:**
Old helper function that removes all vowels from a string. **Not currently used** in the main code (replaced by `removeVowelsKeepFirst()`).

**Note:** This function is kept for reference but not called anywhere in the active code.

**العربية:**
دالة مساعدة قديمة تزيل جميع حروف العلة من السلسلة. **غير مستخدمة حالياً** في الكود الرئيسي (تم استبدالها بـ `removeVowelsKeepFirst()`).

**ملاحظة:** هذه الدالة محفوظة للرجوع إليها لكن لا يتم استدعاؤها في أي مكان في الكود النشط.

---

## Complete Code Listing / قائمة الكود الكاملة

```java
// Line 1: Group member comment
// 120244273 - Ibrahim Ali Ibrahim Abu Hassanein - Java Practical (101)
// 120235430 - Bashar Mohammed Salem Al-Brim - Java Practical (101)

// Lines 4-5: Imports
import java.util.ArrayList;
import java.util.Scanner;

// Line 7: Class declaration
public class Ibrahim_120244273 {

    // Lines 10-12: Static data structures
    static ArrayList<String> contacts = new ArrayList<>();
    static ArrayList<ArrayList<String>> nums_list = new ArrayList<>();
    static ArrayList<String> types = new ArrayList<>();

    // Line 14: Scanner for input
    static Scanner sc = new Scanner(System.in);

    // Lines 16-57: Main method
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
                case 1: addContact(); break;
                case 2: searchByName(); break;
                case 3: searchByNumber(); break;
                case 4: deleteByName(); break;
                case 5: deleteByNumber(); break;
                case 6: allContacts(); break;
                case 7: System.out.println("Goodbye!"); break;
            }
        } while (choice != 7);

        sc.close();
    }

    // Lines 59-70: getMenu()
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

    // Lines 72-194: addContact()
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
                return;
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
            boolean skippedThisEntry = false;
            boolean exitNumbers = false;
            while (true) {
                System.out.print("Enter number: ");
                number = sc.nextLine().trim();

                if (number.isEmpty()) {
                    System.out.println("Number is required (can't be empty).");
                    continue;
                }
                if(number.equalsIgnoreCase("exit")){
                    exitNumbers = true;
                    break;
                }

                if (number.equalsIgnoreCase("n") || number.equalsIgnoreCase("no")) {
                    if (nums.size() >= 1) {
                        skippedThisEntry = true;
                        break;
                    } else {
                        System.out.println("No number entered. Contact not added.");
                        return;
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

            if (skippedThisEntry) {
                more = "n";
                if (exitNumbers) {
                    break;
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

    // Lines 196-241: searchByName()
    static void searchByName() {
        System.out.print("Enter name to search : ");
        String search = sc.nextLine().trim();

        if (search.isEmpty()) {
            System.out.println("Not found");
            return;
        }

        String searchNorm = normalize(search);
        String searchSim  = removeVowelsKeepFirst(searchNorm);
        String[] searchTokens = tokenize(searchNorm);
        String[] searchSimTokens = tokenize(searchSim);

        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {
            String nameNorm = normalize(contacts.get(i));
            String nameSim  = removeVowelsKeepFirst(nameNorm);

            if (matchByTokens(nameNorm, searchTokens)) {
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
                found = true;
                continue;
            }

            if (matchByTokens(nameSim, searchSimTokens)) {
                System.out.println(contacts.get(i) + " - " + types.get(i) + " - " + nums_list.get(i));
                found = true;
            }
        }

        if (!found) System.out.println("Not found");
    }

    // Lines 243-270: searchByNumber()
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

    // Lines 272-290: deleteByName()
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

    // Lines 292-310: deleteByNumber()
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

    // Lines 312-326: allContacts()
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

    // Lines 330-341: removeVowels() (Legacy - not used)
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

    // Lines 344-349: isNumberExists()
    static boolean isNumberExists(String number) {
        for (ArrayList<String> list : nums_list) {
            if (list.contains(number)) return true;
        }
        return false;
    }

    // Lines 351-357: isValidNumber()
    static boolean isValidNumber(String number) {
        if (number.isEmpty()) return false;
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) return false;
        }
        return true;
    }

    // Lines 362-366: normalize()
    static String normalize(String s) {
        s = s.toLowerCase().trim().replaceAll("\\s+", " ");
        return s;
    }

    // Lines 370-373: tokenize()
    static String[] tokenize(String s) {
        if (s.isEmpty()) return new String[0];
        return s.split(" ");
    }

    // Lines 381-396: matchByTokens()
    static boolean matchByTokens(String fullNameNormalized, String[] searchTokens) {
        String[] nameTokens = tokenize(fullNameNormalized);

        for (String st : searchTokens) {
            boolean tokenFound = false;
            for (String nt : nameTokens) {
                if (nt.equals(st)) {
                    tokenFound = true;
                    break;
                }
            }
            if (!tokenFound) return false;
        }
        return true;
    }

    // Lines 404-429: removeVowelsKeepFirst()
    static String removeVowelsKeepFirst(String text) {
        text = normalize(text);
        if (text.isEmpty()) return "";

        String result = "";
        String[] words = tokenize(text);

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            if (word.isEmpty()) continue;

            String one = "" + word.charAt(0);

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
```

---

## Summary / الملخص

**Total Functions:** 12  
**Main Functions:** 7 (getMenu, addContact, searchByName, searchByNumber, deleteByName, deleteByNumber, allContacts)  
**Helper Functions:** 5 (isNumberExists, isValidNumber, normalize, tokenize, matchByTokens, removeVowelsKeepFirst)  
**Legacy Function:** 1 (removeVowels - not used)

**Total Lines:** 430

---

*Documentation generated for Ibrahim_120244273.java*  
*التوثيق المُنشأ لملف Ibrahim_120244273.java*
