public class NestedLoop {
    public static void main(String[] args) {
        int n = 4;
        int star = 5;
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=star; j++) {
               if (i==1 || i== star || j == 1 || j == n) {
                System.out.print("*");
               }
               else{
                System.out.println(" ");
               }
            }
            System.out.println();
        }
    }
}
