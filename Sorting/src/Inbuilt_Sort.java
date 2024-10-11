import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort {
    public static void print(int[] sample){
        for (int i = 0; i < sample.length; i++){
            System.out.print(sample[i] + " ");
        }
    }
    public static void printColl(Integer[] sample){
        for (int i = 0; i < sample.length; i++){
            System.out.print(sample[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] sample = {5, 4, 1, 3, 2};
        Integer[] Samples = {4, 3, 1, 2, 5};
        Arrays.sort(sample, 0, 3);
        print(sample);
        System.out.println();
        Arrays.sort(Samples, Collections.reverseOrder());
        printColl(Samples);
        System.out.println();
        Arrays.sort(sample);
        print(sample);
    }
}
