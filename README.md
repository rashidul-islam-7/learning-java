## Java Variable 
## A variable is a container that stores data under a name.
     Syntax:
       dataType variableName = value;
     int age = 20;
     String name = "Rashidul";
     double salary = 25000.50;
     boolean isStudent = true;
     char grade = 'A';

## Data Types 
A data type defines the type of value a variable can hold and the operations that can be performed on it.
Or simply:
A data type tells Java what kind of data a variable will store.

## Java Data Types are Two Categories
## Primitive Data Types:
  - Store a single, simple value directly.
  - Built into Java.
     - byte - Stores an 8-bit signed integer.
     - short - Stores a 16-bit signed integer.
     - int - Stores a 32-bit signed integer.
     - long - Stores a 64-bit signed integer.
     - float - Stores a 32-bit floating-point number.
     - double - Stores a 64-bit floating-point number.
     - char - Stores a single Unicode character using single quotes ('A').
     - boolean - Stores one of two values: true or false
---------------------------------------------------------
 ## 2. Non-Primitive (Reference) Data Types
- Store references (memory addresses) to objects.
- Can represent complex data and collections of values.
- Created by Java or by the programmer.

- Examples:
     - String     - Stores a sequence of characters (text) using double quotes ("Hello").
     - Array      - Stores multiple values of the same data type.
     - Class      - A blueprint for creating objects.
     - Object     - An instance of a class.
     - Interface  - Defines a contract that classes can implement.
 ------------------------------------------------------------------------

 ## Java Operators
 An operator is a symbol or special character that performs arithmetic, logical, comparison, assignment, and other operations on one or more operands.
 or simple
 An operator is a symbol or special character that is used to perform operations on variables and values.
 # Syntax
 - operand operator operand; int sum = 10 + 20;
   
   - Arithmetic Operateos - Used to mathematical calculations.
   - Assignment Operators - Used to assign values to variables.
   - Relational (Comparison) Operators - Used to compare two values. The result is always true or false.
   - Logical Operators - Used to combine two or more conditions.
   - Bitwise Operators - Used to perform operations on the binary representation of integers.
   - Conditional or Tarnary Operatios - Used to chck two or more values.
   - Special Operaotrs - comma , instance of , dot operatos
   - Bainary Operaror -
   - Unary Operator -

1. Arithmetic Operators - Arithmetic operators are used to perform mathematical calculations.
               | Operator | Name                | Example   |
               | -------- | ------------------- | --------- |
               | `+`      | Addition            | `10 + 20` |
               | `-`      | Subtraction         | `20 - 10` |
               | `*`      | Multiplication      | `10 * 20` |
               | `/`      | Division            | `20 / 10` |
               | `%`      | Modulus (Remainder) | `20 % 3`  |

2. Assignment Operators - Assignment operators are used to assign values to variables.
     | Operator | Name                | Description                                                             | Example       |
     | -------- | ------------------- | ----------------------------------------------------------------------- | ------------- |
     | `=`      | Assignment          | Assigns a value to a variable.                                          | `int x = 10;` |
     | `+=`     | Add and Assign      | Adds the right value to the left variable and stores the result.        | `x += 5;`     |
     | `-=`     | Subtract and Assign | Subtracts the right value from the left variable and stores the result. | `x -= 5;`     |
     | `*=`     | Multiply and Assign | Multiplies the left variable by the right value and stores the result.  | `x *= 5;`     |
     | `/=`     | Divide and Assign   | Divides the left variable by the right value and stores the result.     | `x /= 5;`     |
     | `%=`     | Modulus and Assign  | Stores the remainder after division.                                    | `x %= 5;`     |

3. Relational (Comparison) Operators - Relational operators are used to compare two values or expressions. They always return true or false.
   
     | Operator | Name                     | Description                                                                              | Example  |
     | -------- | ------------------------ | ---------------------------------------------------------------------------------------- | -------- |
     | `==`     | Equal To                 | Compares two values or expressions. Returns `true` if they are equal; otherwise `false`. | `a == b` |
     | `!=`     | Not Equal To             | Returns `true` if two values are not equal.                                              | `a != b` |
     | `>`      | Greater Than             | Returns `true` if the left value is greater than the right value.                        | `a > b`  |
     | `<`      | Less Than                | Returns `true` if the left value is less than the right value.                           | `a < b`  |
     | `>=`     | Greater Than or Equal To | Returns `true` if the left value is greater than or equal to the right value.            | `a >= b` |
     | `<=`     | Less Than or Equal To    | Returns `true` if the left value is less than or equal to the right value.               | `a <= b` |

4. Logical Operators - Logical operators are used to combine two or more conditions. They return true or false.
   
     | Operator | Name        | Description                                           | Example                |
     | -------- | ----------- | ----------------------------------------------------- | ---------------------- |
     | `&&`     | Logical AND | Returns `true` if **both** conditions are true.       | `(a > b) && (a > 0)`   |
     | `\|\|`   | Logical OR  | Returns `true` if **at least one** condition is true. | `(a > b) \|\| (a < 0)` |
     | `!`      | Logical NOT | Reverses the result of a condition.                   | `!(a > b)`             |

5. Bitwise Operators - Bitwise operators perform operations on the binary (bit-level) representation of integers.

     | Operator | Name                 | Description                                               | Example   |
     | -------- | -------------------- | --------------------------------------------------------- | --------- |
     | `&`      | Bitwise AND          | Performs AND operation on each bit.                       | `a & b`   |
     | `\|`     | Bitwise OR           | Performs OR operation on each bit.                        | `a \| b`  |
     | `^`      | Bitwise XOR          | Returns 1 when bits are different.                        | `a ^ b`   |
     | `~`      | Bitwise NOT          | Inverts all bits.                                         | `~a`      |
     | `<<`     | Left Shift           | Shifts bits to the left.                                  | `a << 2`  |
     | `>>`     | Right Shift          | Shifts bits to the right.                                 | `a >> 2`  |
     | `>>>`    | Unsigned Right Shift | Shifts bits to the right without preserving the sign bit. | `a >>> 2` |

6. Ternary (Conditional) Operator - The ternary operator is a shorthand way of writing an if-else statement.

     - syntex: condition ? expression1 : expression2;
     int age = 18;
     String result = (age >= 18) ? "Adult" : "Minor";

7. Unary Operator - Unary operators perform operations on only one operand.
   
     | Operator | Name        | Description                        | Example |
     | -------- | ----------- | ---------------------------------- | ------- |
     | `+`      | Unary Plus  | Indicates a positive value.        | `+a`    |
     | `-`      | Unary Minus | Negates a value.                   | `-a`    |
     | `++`     | Increment   | Increases a variable's value by 1. | `a++`   |
     | `--`     | Decrement   | Decreases a variable's value by 1. | `a--`   |
     | `!`      | Logical NOT | Reverses a boolean value.          | `!flag` |
     | `~`      | Bitwise NOT | Inverts all bits of an integer.    | `~a`    |
     
8. Binary Operators - Binary operators perform operations on two operands.

     | Operator | Description    | Example  |
     | -------- | -------------- | -------- |
     | `+`      | Addition       | `a + b`  |
     | `-`      | Subtraction    | `a - b`  |
     | `*`      | Multiplication | `a * b`  |
     | `==`     | Comparison     | `a == b` |
     | `&&`     | Logical AND    | `a && b` |

Note: Most Java operators (such as arithmetic, assignment, relational, logical, and bitwise operators) are binary operators because they operate on two operands.

9. Special Operators
- (a) Dot (.) Operator - The dot operator is used to access class members, object methods, and object properties.

Example
System.out.println("Hello Java");

- (b) instanceof Operator - The instanceof operator checks whether an object is an instance of a specific class or interface. It returns true or false.
  
Example
String name = "Java";
System.out.println(name instanceof String);

- (c) Comma (,) Operator - The comma is used to separate variables, parameters, or arguments.

Example
int x = 10, y = 20, z = 30;

----------------------------------------------------------------------------------

# Java Loops Statement

## What is a Loop?

A **loop** is used to execute the same block of code **repeatedly** until a specific condition becomes false.

Instead of writing the same code many times, we use a loop.

### Example

Without Loop:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

With Loop:

```java
for (int i = 1; i <= 3; i++) {
    System.out.println("Hello");
}
```

Output:

```
Hello
Hello
Hello
```

---

# Why Do We Use Loops?

Loops help us:

- Reduce duplicate code
- Save time
- Make programs shorter and cleaner
- Repeat tasks automatically

---

# Types of Loops in Java

Java provides three main loops:

1. `for` Loop
2. `while` Loop
3. `do...while` Loop

---

# for Loop

Use a **for loop** when you know how many times the loop should run.

### Syntax

```java
for (initialization; condition; update) {

    // Code to execute
}
```

### Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Output

```
1
2
3
4
5
```

### Parts of a for Loop

```java
for (int i = 1; i <= 5; i++)
```

| Part | Description |
|------|-------------|
| `int i = 1` | Starting value |
| `i <= 5` | Loop condition |
| `i++` | Increase value by 1 |

---

# while Loop

Use a **while loop** when you don't know exactly how many times the loop will run.

### Syntax

```java
while (condition) {

    // Code
}
```

### Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

Output

```
1
2
3
4
5
```

---

# do...while Loop

The **do...while** loop executes the code **at least once**, even if the condition is false.

### Syntax

```java
do {

    // Code

} while (condition);
```

### Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

Output

```
1
2
3
4
5
```

# Difference Between Loops

| Feature | for | while | do...while |
|---------|-----|--------|------------|
| Known number of iterations | ✅ | ❌ | ❌ |
| Condition checked first | ✅ | ✅ | ❌ |
| Executes at least once | ❌ | ❌ | ✅ |

---

# Summary

- Use **for** when the number of iterations is known.
- Use **while** when the number of iterations is unknown.
- Use **do...while** when the code must run at least once.
- Use **if-else** to make decisions based on conditions.

----------------------------------------------------


# break and continue Statement with loops

## What is break?

The **break** statement is used to **immediately terminate a loop**.

When Java encounters a `break` statement, the loop stops, and the program continues with the next statement after the loop.

### Syntax

```java
break;
```

### Example

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

### Output

```
1
2
3
4
```

### How It Works

- The loop starts from `1`.
- Java prints `1`, `2`, `3`, and `4`.
- When `i` becomes `5`, the `break` statement is executed.
- The loop stops immediately.

---

# continue Statement

## What is continue?

The **continue** statement is used to **skip the current iteration** of a loop.

Unlike `break`, it does **not** stop the loop. Instead, it moves directly to the next iteration.

### Syntax

```java
continue;
```

### Example

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

### Output

```
1
2
4
5
```

### How It Works

- The loop starts from `1`.
- Java prints `1` and `2`.
- When `i` becomes `3`, `continue` skips that iteration.
- The loop continues with `4` and `5`.

---

# Difference Between break and continue

| Feature | break | continue |
|---------|-------|----------|
| Stops the loop | ✅ Yes | ❌ No |
| Skips the current iteration | ❌ No | ✅ Yes |
| Continues with the next iteration | ❌ No | ✅ Yes |
| Can be used inside loops | ✅ Yes | ✅ Yes |
| Can be used with switch | ✅ Yes | ❌ No |

---

# Example: break vs continue

### Using break

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        break;
    }

    System.out.println(i);
}
```

Output

```
1
2
```

---

### Using continue

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output

```
1
2
4
5
```

----------------------------------------------------------------------

# Java If, If-Else, and Else-If Statement

## What is a Decision Statement?

A **decision statement** allows a program to make choices based on a condition.

In Java, decision statements are used to execute different blocks of code depending on whether a condition is **true** or **false**.

---

# Types of Decision Statements

Java provides three common decision statements:

1. `if`
2. `if-else`
3. `else-if`

---

# 1. if Statement

The `if` statement executes a block of code **only when the condition is true**.

## Syntax

```java
if (condition) {

    // Code to execute

}
```

## Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are an adult.");
}
```

### Output

```
You are an adult.
```

### How It Works

- Check the condition.
- If the condition is `true`, the code inside the `if` block runs.
- If the condition is `false`, nothing happens.

---

# 2. if-else Statement

The `if-else` statement is used when there are **two possible outcomes**.

## Syntax

```java
if (condition) {

    // True Block

} else {

    // False Block

}
```

## Example

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
```

### Output

```
Odd Number
```

### How It Works

- If the condition is `true`, execute the `if` block.
- Otherwise, execute the `else` block.

---

# 3. else-if Statement

The `else-if` statement is used when there are **multiple conditions**.

Java checks the conditions from top to bottom.

As soon as one condition becomes **true**, the remaining conditions are skipped.

## Syntax

```java
if (condition1) {

    // Code

} else if (condition2) {

    // Code

} else if (condition3) {

    // Code

} else {

    // Default Code

}
```

---

# Example

```java
int marks = 75;

if (marks >= 80) {

    System.out.println("Grade A+");

} else if (marks >= 70) {

    System.out.println("Grade A");

} else if (marks >= 60) {

    System.out.println("Grade A-");

} else if (marks >= 50) {

    System.out.println("Grade B");

} else {

    System.out.println("Fail");

}
```

### Output

```
Grade A
```

---

# Flow of else-if

```
Start
   │
   ▼
Check Condition 1
   │
 ┌─┴────────────┐
 │ True         │
 ▼              │
Execute Code    │
 │              │
End             │
                ▼
       Check Condition 2
                │
          True / False
                │
                ▼
       Continue until a condition is true
                │
                ▼
        If none are true
                │
                ▼
          Execute else block
```

---

# Real-Life Example

```java
int temperature = 35;

if (temperature >= 40) {

    System.out.println("Very Hot");

} else if (temperature >= 30) {

    System.out.println("Hot");

} else if (temperature >= 20) {

    System.out.println("Warm");

} else {

    System.out.println("Cold");

}
```

### Output

```
Hot
```

---

# Comparison

| Statement | Purpose |
|-----------|---------|
| `if` | Executes code only if the condition is true. |
| `if-else` | Chooses between two possible outcomes. |
| `else-if` | Chooses from multiple conditions. |

---

# Important Notes

- Every condition must return `true` or `false`.
- The `else` block is optional.
- Only one `else` block is allowed.
- You can use multiple `else-if` blocks.
- Java checks conditions from top to bottom.
- Once a condition is true, Java skips the remaining `else-if` statements.

---

# Summary

- Use **if** when you have one condition.
- Use **if-else** when you have two choices.
- Use **else-if** when you have multiple choices.
- Write conditions carefully because Java executes the **first matching condition**.

---------------------------------------------------------------------------

# Java Switch, Break, and Continue Statement

## What are Control Statements?

Control statements are used to control the flow of execution in a Java program.

This chapter covers:

- switch statement
- break statement
- continue statement

---

# 1. Switch Statement

## What is a Switch Statement?

The **switch** statement is a decision-making statement used to execute one block of code from multiple options.

It is a better alternative to using many `else-if` statements when checking the same variable.

---

## Syntax

```java
switch (expression) {

    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    case value3:
        // Code
        break;

    default:
        // Default Code
}
```

---

## Example

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-3): ");
        int number = input.nextInt();

        switch (number) {

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Invalid Number");
        }

        input.close();
    }
}
```

---

## Output

Input

```
2
```

Output

```
Two
```

---

## How Switch Works

1. Java checks the expression.
2. It finds the matching case.
3. Executes that case.
4. Stops when it reaches `break`.
5. If no case matches, the `default` block executes.

---

# What is break?

The **break** statement immediately terminates a loop or switch statement.

---

## break with Loop

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output

```
1
2
3
4
```

### Explanation

When `i` becomes **5**, the `break` statement immediately stops the loop.

---

## break with Switch

```java
int day = 2;

switch (day) {

    case 1:
        System.out.println("Saturday");
        break;

    case 2:
        System.out.println("Sunday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

Output

```
Sunday
```

Without `break`, Java continues executing the next case. This is called **fall-through**.

---

# What is continue?

The **continue** statement skips the current iteration and moves directly to the next iteration of the loop.

Unlike `break`, it does **not** stop the loop.

---

## Example

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output

```
1
2
4
5
```

---

## Explanation

When `i` becomes **3**, Java skips that iteration.

It immediately moves to the next loop.

So **3 is never printed.**

---

# Difference Between break and continue

| break | continue |
|--------|----------|
| Stops the loop completely. | Skips only the current iteration. |
| Exits the loop. | Continues with the next iteration. |
| Can be used in loops and switch. | Used only in loops. |

---

# When to Use switch?

Use `switch` when:

- You have multiple choices.
- You are checking the same variable.
- You want cleaner code than multiple `else-if` statements.

---

# Summary

## switch

- Used for multiple conditions.
- Executes the matching case.
- Uses `break` to stop execution.
- Uses `default` if no case matches.

---

## break

- Stops a loop immediately.
- Stops a switch case.
- Control moves outside the loop or switch.

---

## continue

- Skips the current iteration.
- Continues with the next iteration.
- Does not stop the loop.

---

# Quick Comparison

| Statement | Purpose |
|-----------|---------|
| switch | Select one block from multiple options |
| break | Exit a loop or switch immediately |
| continue | Skip the current iteration and continue the loop |


-------------------------------------------------------------------------------


# Java Arrays (1D & 2D)

## What is an Array?

An **Array** is a **Non-Primitive (Reference) Data Type** in Java that is used to store **multiple values of the same data type** in a single variable.

Instead of creating many variables, we can store all values inside one array.

---

# Types of Arrays in Java

Java arrays are mainly divided into two types:

1. **One-Dimensional Array (1D Array)**
2. **Two-Dimensional Array (2D Array)**

---

# 1. One-Dimensional Array (1D Array)

A **One-Dimensional Array** stores multiple values in a **single row (linear list)**.

## Example Without Array

```java
int mark1 = 85;
int mark2 = 90;
int mark3 = 95;
int mark4 = 88;
```

## Example With Array

```java
int[] marks = {85, 90, 95, 88};
```

Here,

- `int` → Data type
- `[]` → One-Dimensional Array
- `marks` → Array variable
- `{85, 90, 95, 88}` → Values

---

## 1D Array Structure

| Index | Value |
|------:|------:|
| 0 | 85 |
| 1 | 90 |
| 2 | 95 |
| 3 | 88 |

> **Note:** Array index always starts from **0**.

---

## Access Elements

```java
System.out.println(marks[0]); // 85
System.out.println(marks[2]); // 95
```

---

## Array Length

```java
System.out.println(marks.length);
```

Output

```text
4
```

---

## Print Using for Loop

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

---

## Print Using For-Each Loop

```java
for (int mark : marks) {
    System.out.println(mark);
}
```

---

# Example Program (1D Array)

```java
public class OneDimensionalArray {

    public static void main(String[] args) {

        int[] marks = {85, 90, 95, 88};

        System.out.println("===== One-Dimensional Array =====");

        System.out.println("First Mark  : " + marks[0]);
        System.out.println("Second Mark : " + marks[1]);
        System.out.println("Third Mark  : " + marks[2]);
        System.out.println("Fourth Mark : " + marks[3]);

        System.out.println("\nUsing For Loop");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("\nUsing For-Each Loop");

        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
```

---

# 2. Two-Dimensional Array (2D Array)

A **Two-Dimensional Array** is an **array of arrays**.

It stores data in **Rows and Columns**, just like a table.

---

## Example

```java
int[][] marks = {
    {85, 90, 95},
    {70, 75, 80},
    {88, 92, 86}
};
```

Here,

- `int` → Data type
- `[][]` → Two-Dimensional Array
- `marks` → Array variable

---

## 2D Array Structure

| Row | Column 0 | Column 1 | Column 2 |
|----:|---------:|---------:|---------:|
| 0 | 85 | 90 | 95 |
| 1 | 70 | 75 | 80 |
| 2 | 88 | 92 | 86 |

---

## Access Elements

```java
marks[0][0] // 85
marks[0][2] // 95

marks[1][1] // 75

marks[2][0] // 88
```

The first index represents the **Row**.

The second index represents the **Column**.

---

## Number of Rows

```java
System.out.println(marks.length);
```

Output

```text
3
```

---

## Number of Columns

```java
System.out.println(marks[0].length);
```

Output

```text
3
```

---

## Print Using Nested for Loop

```java
for (int i = 0; i < marks.length; i++) {

    for (int j = 0; j < marks[i].length; j++) {

        System.out.print(marks[i][j] + " ");

    }

    System.out.println();
}
```

---

# Example Program (2D Array)

```java
public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] marks = {
                {85, 90, 95},
                {70, 75, 80},
                {88, 92, 86}
        };

        System.out.println("===== Two-Dimensional Array =====");

        System.out.println("marks[0][0] = " + marks[0][0]);
        System.out.println("marks[1][2] = " + marks[1][2]);
        System.out.println("marks[2][1] = " + marks[2][1]);

        System.out.println("\nAll Elements:");

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < marks[i].length; j++) {

                System.out.print(marks[i][j] + " ");

            }

            System.out.println();
        }
    }
}
```

---

# Difference Between 1D and 2D Array

| Feature | 1D Array | 2D Array |
|----------|----------|----------|
| Structure | Single Row | Rows & Columns |
| Declaration | `int[] arr` | `int[][] arr` |
| Index | One Index | Two Indexes |
| Example | `arr[2]` | `arr[1][2]` |
| Loop | Single Loop | Nested Loop |
| Use Case | List of Values | Table / Matrix |

---

# Advantages of Arrays

- Stores multiple values in one variable.
- Stores only the same data type.
- Easy to process using loops.
- Fast access using indexes.
- Reduces code duplication.

---

# Limitations of Arrays

- Fixed size.
- Can store only one data type.
- Insertion and deletion are difficult.

---

# Key Points

- Array is a **Non-Primitive (Reference) Data Type**.
- Stores multiple values of the same data type.
- Index always starts from **0**.
- Use `.length` to get the total number of elements.
- Use `for` or `for-each` loop for a 1D Array.
- Use **Nested for Loop** for a 2D Array.

---

# Practice

## One-Dimensional Array

1. Print all elements.
2. Find the sum.
3. Find the average.
4. Find the maximum value.
5. Find the minimum value.
6. Search an element.
7. Reverse an array.
8. Take array input using Scanner.

---

## Two-Dimensional Array

1. Print all elements.
2. Find the sum of all elements.
3. Find the maximum value.
4. Find the minimum value.
5. Print a specific row.
6. Print a specific column.
7. Take 2D Array input using Scanner.
8. Add two matrices.
9. Transpose a matrix.
10. Print the diagonal elements.

