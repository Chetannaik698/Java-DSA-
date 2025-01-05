import java.util.*;

public class JavaBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values of Pen: ");
        float penAmt = sc.nextFloat();
        System.out.println("Enter Values of Pencl: ");
        float pencilAmt = sc.nextFloat();
        System.out.println("Enter Values of Eraser: ");
        float eraserAmt = sc.nextFloat();

        float TotalCost = penAmt + pencilAmt + eraserAmt;
        float OriginalCost = TotalCost/1+(18/100);

        System.out.println("Total Cost with 18% GST = " + OriginalCost);

        float num = 25.12f;
        int num2 = (int)num;
        System.out.println(num2);
    } 
}