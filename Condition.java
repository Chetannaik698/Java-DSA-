import java.util.Scanner;

public class Condition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.print("Enter calculation you want to perform +,-,*,/,%: ");
    String task = sc.next();

    switch (task) {
      case "+":
        System.out.println(num1 + num2);
        break;
      
        case "-":
        System.out.println(num1 - num2);
        break;

        case "*":
        System.out.println(num1 * num2);
        break;

        case "/":
        System.out.println(num1 / num2);
        break;

        case "%":
        System.out.println(num1 % num2);
        break;
    
      default: 
        System.err.println("Enter valid task");
        break;
    }
  }
}
