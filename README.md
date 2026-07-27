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