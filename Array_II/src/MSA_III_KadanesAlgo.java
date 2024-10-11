public class MSA_III_KadanesAlgo {
    public static void kadanes(int[] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            currentSum = currentSum + numbers[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Maximum sum is: " + maxSum);
    }
    public static void main(String[] args) {
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
