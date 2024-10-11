public class Insertion_Sort {
    public static void insertion(int[] sample){
        for(int i = 1; i < sample.length; i++){
            int current = sample[i];
            int previous = i - 1;
            while(previous >= 0 && sample[previous] > current){
                sample[previous+1] = sample[previous];
                previous--;
            }
            sample[previous + 1] = current;
        }
        for (int i = 0; i < sample.length; i++){
            System.out.print(sample[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] sample = {5, 4, 1, 3, 2};
        insertion(sample);
    }
}
