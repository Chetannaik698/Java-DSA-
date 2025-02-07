public class BinarySearch {

    public static int binSearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            //COMPARISIONS
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            }
            if (numbers[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;

        System.out.println("The element index is: " + binSearch(numbers,key));
    }
}
