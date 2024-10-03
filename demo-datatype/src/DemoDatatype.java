public class DemoDatatype {
  public static void main(String[] args) {
    // I'm Vincent. 你好. Welcome to bootcamp.
    // You can drop notes here ...
    
    // data type
    // "int" -> Integer 整數 (both positive & negative)
    // x -> variable 變量
    // from right to left -> assign value integer 1 to a variable x
    int x = 2;
    int y = 10;

    int a = x + y; // 12
    // Tool: System.out.println()
    // print out
    System.out.println(a); // 12

    // Math Operation: +, -, *, /
    int result = a - y * x;
    System.out.println(result); // -8

    // Math Operation: %
    // remainder
    int remainder = 10 % 3;
    System.out.println(remainder); // 1

    // double (a number with decimal places)
    double w = 10.5;
    
    // shortcut: sysout
    System.out.println(w); // 10.5
    
    // ! what is 10?
    // 10 is an int value
    // ! what is w2?
    // w2 is an int variable

    // Assign an int value to a double variable
    // int value -> double value
    // assign double value to double variable
    double w2 = 10;
    System.out.println(w2); // 10.0

    // Naming convention: camel case
    int englishScore = 70;
    int historyScore = 85;
    int mathScore = 90;

    // averageScore
    // int + int -> int
    // int + double -> double + double -> double

    // !!!!! why 81.0 ?
    // Step 1: int + int + int -> int
    // Step 2: int / int -> int
    // Step 3: assign int value to double variable
    double averageScore = (englishScore + historyScore + mathScore) / 3;
    System.out.println(averageScore); // 81.0
    
    // Variable

    // Re-assignment
    x = 20;
    a = -40;

    // code block: main(String[] args) {}
    // ! int x = 9; // we cannot reuse the same variable name within a code block
    int x2 = 9;

    // how to backup a value?
    int backup = x;
    x = 25;

    // Operators: +=, -=, *=, /=
    int e = 9;
    // From right to left
    // 9 + 1 -> assign to variable e
    e = e + 1;
    System.out.println("e=" + e); // 10
    e += 1;
    System.out.println("e=" + e); // 11
    e = e - 1;
    System.out.println("e=" + e); // 10
    e -= 1;
    System.out.println("e=" + e); // 9
    e *= 2;
    System.out.println("e=" + e); // 18
    e /= 3;
    System.out.println("e=" + e); // 6

    // ++
    e++; // increment by 1
    System.out.println("e=" + e); // 7
    // --
    e--; // decrement by 1
    System.out.println("e=" + e); // 6
    ++e; // increment by 1
    System.out.println("e=" + e); // 7
    --e; // decrement by 1
    System.out.println("e=" + e); // 6

  }
}