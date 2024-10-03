public class DemoString { // class name = file name
  public static void main(String[] args) {
    // Integer decimal place

    // email address
    // "vincentlau@gmail.com" is a string value
    // emailAddress is a string variable
    String emailAddress = "vincentlau@gmail.com";
    System.out.println(emailAddress); // vincentlau@gmail.com

    // NOT OK
    // because 2 is an int value, we cannot assign int value to String variable.
    // String x = 2;

    // String Operation: +
    String x1 = "hello";
    String x2 = "world";
    String x3 = x1 + x2;
    System.out.println("x3=" + x3 + ", x1=" + x1 + ", x2=" + x2); 
    // "x3=helloworld, x1=hello, x2=world"


  }
}
