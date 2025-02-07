import java.util.Scanner;

import javax.xml.ws.soap.MTOM;

public class FunctionOverloading {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b, float c) {
        return a + b + c;
    }

    // public static boolean isPrime(int n){
    // boolean isPrime = true;
    // for(int i=2; i<=n-1; i++){
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // return isPrime;
    // }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of " + myNum + " " +  "is: " + decNum);
    }

    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + myNum + "is: " + binNum );
    }

    public static void main(String[] args) {
        binToDec(101);
        decToBin(7);
    }
}