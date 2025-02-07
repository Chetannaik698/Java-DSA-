import java.util.Scanner;

public class Assingnment {

    public static float calAvg(float a, float b, float c) {
        return a + b + c / 2;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkPalindrone(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }

        return original == reversed;
    }

    public static int computeSum(int n){
        int sum = 0;
        int lastDigit = 0;

        while (n > 0) {
            lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its sum: ");
        int n = sc.nextInt();

        // if (checkPalindrone(n)) {
        //     System.out.println("The number" + " " + n + " " + "is Palindrone");
        // }
        // else{
        //     System.out.println("The number" + " " + n + " " + "is not a Palindrone");
        // }

        System.out.println("The compute sum of number" + " " + n + " " + "is: " + " " + computeSum(n));
    }
}
