import java.util.*;

public class Function {

    public static void printHelloWorld() {
        System.out.println("hello Word");
    }

    public static void calSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int fact(int n){
        int f = 1;;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    } 

    public static int binCoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
    }
}
