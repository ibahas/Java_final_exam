# AI Test Report — Java Address Book App (Ibrahim_120244273)

**Project PDF:** Programming language 1 Project (Address Book System)  
**Source:** Ibrahim_120244273.java | **Dataset:** Examm.txt  
**Run:** Windows CMD / terminal (compiled with `javac Ibrahim_120244273.java`)

---

## 1) First-time bulk population (non-interactive)

**Command run:**  
`(type Examm.txt && echo 7) | java Ibrahim_120244273`  
*(Using `java Ibrahim_120244273 < Examm.txt` alone would stop after option 6 and wait for input; appending `7` exits cleanly.)*

**Result:**  
- Program **finished** without crash or hang.  
- Option 6 was reached and **printed all contacts** in a readable table (Name, Type, Numbers).  
- Final choice `7` printed "Goodbye!" and exited.

**Verdict:** **PASS**

---

## 2) Interactive functional tests

---

### (1) Add a contact with invalid type should fallback to Other

**Test name:** Invalid type → Other

**Steps / inputs:**
```
1
Edge Case One
invalidType
0500000000
n
6
7
```

**Expected result:**  
Prints message about invalid type and stores contact as "Other"; contact visible in "Show all contacts".

**Actual result:**  
- Printed: `Invalid type! It will be considered as Other it's : Other`  
- Contact added; option 6 showed: `Edge Case One - Other - [0500000000]`

**Pass/Fail:** **PASS**

---

### (2) Add a contact with duplicate number should be rejected

**Test name:** Duplicate number rejected

**Steps / inputs:**
```
1
Edge Case Two
f
0500000000
n
1
Duplicate Contact
f
0500000000
n
7
```
*(Second add uses the same number 0500000000.)*

**Expected result:**  
App says number already exists and does not add duplicate (or forces a different number).

**Actual result:**  
- First contact added with 0500000000.  
- Second add: on entering 0500000000, printed `Number already exists! Enter a different number.`  
- On entering `n` (no more numbers), printed `No number entered. Contact not added.` and did **not** add the second contact.  
- Exited with choice 7.

**Pass/Fail:** **PASS**

---

### (3) Search by name should NOT match substring

**Test name:** Search "Ali" — no substring match

**Steps / inputs:**  
*(One contact "Khalid" with number 0591000001 added first.)*
```
1
Khalid
p
0591000001
n
2
Ali
7
```

**Expected result:**  
Must NOT print any contact whose name does not contain the word "Ali" as a separate token; must NOT print "Khalid" just because it contains "ali" as letters.

**Actual result:**  
- Search "Ali" printed **Not found** (only contact was "Khalid"; no word "Ali").  
- No substring match.

**Pass/Fail:** **PASS**

---

### (4) Similar-name confusion check (hamad vs ahmad)

**Test name:** Mohammed hamad vs Mohammed Ahmad

**Steps / inputs:**  
*(One contact "Mohammed Ahmad" added first.)*
```
1
Mohammed Ahmad
p
0511000001
n
2
Mohammed hamad
7
```

**Expected result:**  
Should not return "Mohammed Ahmad" unless exact/intended match rules say so (hamad ≠ ahmad).

**Actual result:**  
- Search "Mohammed hamad" printed **Not found**.  
- "Mohammed Ahmad" was not incorrectly matched.

**Pass/Fail:** **PASS**

---

### (5) Search by number finds correct contact(s)

**Test name:** Search by number

**Steps / inputs:**  
*(One contact "Test Contact" with 0501234567 added first.)*
```
1
Test Contact
p
0501234567
n
3
0501234567
7
```

**Expected result:**  
Prints contact(s) that contain 0501234567.

**Actual result:**  
- Printed: `Test Contact - Personal - [0501234567]`

**Pass/Fail:** **PASS**

---

### (6) Delete by name removes all exact matches

**Test name:** Delete by name — all exact matches + count

**Steps / inputs:**  
*(Two contacts named "Rana Ali" with different numbers added first.)*
```
1
Rana Ali
f
0571000037
n
1
Rana Ali
p
0571000038
n
4
Rana Ali
6
7
```

**Expected result:**  
If multiple "Rana Ali" exist, all are deleted and count is printed; after deletion they do not appear in "Show all contacts".

**Actual result:**  
- Printed: `2 contact(s) deleted`  
- Option 6: `Your have a Zero contacts no contacts yet.`

**Pass/Fail:** **PASS**

---

### (7) Delete by number removes all contacts containing that number

**Test name:** Delete by number

**Steps / inputs:**  
*(One contact with number 0559876543 added first.)*
```
1
Contact One
f
0559876543
n
5
0559876543
6
7
```

**Expected result:**  
Any contact with 0559876543 is deleted; count printed; contact no longer in "Show all contacts".

**Actual result:**  
- Printed: `Deleted successfully (1)`  
- Option 6: `Your have a Zero contacts no contacts yet.`

**Pass/Fail:** **PASS**

---

## 3) Core requirements verification (summary)

| Requirement | Verification |
|-------------|--------------|
| **A) Add Contact** | Empty name rejected; type f/p/w/o or full words (case-insensitive), invalid → Other with message; digits-only numbers, no duplicate numbers, contact with no numbers not stored; new contact searchable and in "Show all". |
| **B) Search by Name** | Finds by name; no substring match (e.g. "Ali" does not match "Khalid"); similar-name logic does not confuse hamad/ahmad; effectively case-insensitive. |
| **C) Search by Number** | Input validated digits-only (rejects letters/symbols/empty); prints ALL contacts containing that number; "Not found" when none. |
| **D) Delete by Name** | Full match only; prints how many deleted; deleted contacts no longer in list or search. |
| **E) Delete by Number** | Deletes all contacts that have that number; prints count; deleted contacts no longer in list or search. |
| **F) Show All Contacts** | Empty message when no contacts; otherwise readable list (name, type, numbers). |

---

## 4) Summary

| # | Test name | Pass/Fail |
|---|-----------|-----------|
| Bulk | First-time run with Examm.txt | **PASS** |
| (1) | Invalid type → Other | **PASS** |
| (2) | Duplicate number rejected | **PASS** |
| (3) | Search by name — no substring | **PASS** |
| (4) | Similar name (hamad vs ahmad) | **PASS** |
| (5) | Search by number | **PASS** |
| (6) | Delete by name (all exact + count) | **PASS** |
| (7) | Delete by number | **PASS** |

**All tests PASS.** No bugs to report; the app meets the given requirements and aligns with the project PDF (menu, add/search/delete/show, validation, bonus multi-number and similar-name behavior).

---

*Report generated by automated testing (CMD/terminal).*
