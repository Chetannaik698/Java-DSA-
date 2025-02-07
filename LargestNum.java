public class LargestNum {

    public static int getLargest(int numbers[]){
        int largest = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] < largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {0, 2, 4, 8, 12, 4};
        System.out.println("The Smallest number is: " + getLargest(numbers));
    }
}
