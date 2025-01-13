import java.util.Scanner;

public class Assingnment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = 33;
        System.out.print("Guess a number: ");
        int userNum = sc.nextInt();

        for(int i=0; i<=5; i++ ){
            if ( i != 5) {
                if (userNum == randomNum) {
                    System.out.println("Congragulation!, Your guess is correct");
                }else {
                    System.out.println("Guess once again: ");
                }
            }else {
                System.out.println("You attempted all your 5 attempt");
            }
        }
    }
}
