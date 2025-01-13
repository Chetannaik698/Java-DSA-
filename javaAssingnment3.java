import java.util.Scanner;

public class javaAssingnment3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number;
        int choice;
        int evenTotal = 0;
        int oddTotal = 0;

        do {
            System.out.print("Enter a number: ");
            number = scn.nextInt();

            if (number % 2 == 0) {
                evenTotal += number;
            }
            else{
                oddTotal += number;
            }

            System.out.print("Do you want to continue please enter 1: ");
            choice = scn.nextInt();
        }while(choice == 1);

        System.out.println("Totla sum of Even numbers is: " + evenTotal);
        System.out.println("Totla sum of Odd numbers is: " + oddTotal);
    }
}
