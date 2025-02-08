public class MaxSubArray {

    public static void printMaxSubArraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currSum = numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sum = " + maxSum);

        // test case when it is all negative numbers in the array
        int minNum = numbers[0];

        if (maxSum == 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > minNum) {
                    minNum = numbers[i];
                }
            }
        }
        System.out.println("Max sum = " + minNum);
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -3, -4, 4, -5, 8 };
        kadanes(numbers);
    }
}
