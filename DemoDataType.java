public class DemoDataType {
  public static void main(String[] args) {
    // CPU, Memory, Harddisk

    // number (integer, decimal), text

    // declaration + assignment
     int x = 3;

     // declaration
     int y;

     // assignment (assign value 4 into a variable y)
     // variable -> y
     // 4 -> value
     y = 4;

     // The value inside variable y can be updated.
     y = 100;

     // ! We cannot re-declare the same variable name.
     // int y;

     System.out.println(x); // 3
     System.out.println(y); // 100

     // double (type to store decimal number)
     double price = 9.99;
     int quantity = 8;
     
     double totalAmount = price * quantity; // camelcase
     System.out.println(totalAmount); // 79.92

     // int g = 9.99;
     // Assign int value into double variable (Conversion 9 -> 9.0)
     double d1 = 9;
     System.out.println(d1); // 9.0

     // text
     String s = "I love Java.";
     System.out.println(s);

    // Java String -> + 
    String s2 = "hello" + "world";
    System.out.println(s2); // helloworld

    // String + Anything -> String
    s2 = s2 + 10;
    System.out.println(s2); // helloworld10

    // +, -, *, /
    int q = 8 + 9 * 7;
    System.out.println(q);

    int w = (8 + 9) * 7;
    System.out.println(w);

    // ! divide 0
    // System.out.println(w / 0); // error
    System.out.println(0 / w); // 0

    // int +,-,*,/ double -> double
    // Step 1: 8.8 * 3 -> double value
    // Step 2: assign double value into double variable
    double k = 3 * 8.8;

    // Step 1: 8.8 * 3 -> double value
    // ! Step 2: assign double value into int variable (Not Allow)
    // int k2 = 3 * 8.8;

    // 
    int englishScore = 79;
    int mathScore = 82;
    int chinScore = 90;

    // ! Example (Solution: divide 3.0)
    // Step 1: (int + int + int) / int -> int (83)
    // Step 2: Assign int value 83 into double variable (83 -> 83.0)
    double averageScore = (englishScore + mathScore + chinScore) / 3;
    System.out.println(averageScore); // 83.0 (wrong. Correct -> 83.6666)

    double a = 0.1;
    double b = 0.2;
    System.out.println(a + b); // 0.30000000000000004 ????
  }
}
