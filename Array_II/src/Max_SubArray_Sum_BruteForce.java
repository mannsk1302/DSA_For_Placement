public class Max_SubArray_Sum_BruteForce {
    public static void maxSubArray(int[] numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++){
                    currentSum += numbers[k];
                }
                System.out.println(currentSum);
                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max sum :" + maxSum);
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        maxSubArray(numbers);
    }
}
