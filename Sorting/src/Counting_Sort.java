public class Counting_Sort {
    public static void counting(int[] sample){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < sample.length; i++){
            largest = Math.max(largest, sample[i]);
        }

        int[] count = new int[largest+1];
        for(int i = 0; i < sample.length; i++){
            count[sample[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while (count[i] > 0){
                sample[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i = 0; i < sample.length; i++){
            System.out.print(sample[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] sample = {1, 4, 1, 3, 2, 4, 3, 7};
        counting(sample);
    }
}
