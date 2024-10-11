import java.util.*;
public class Largest_Number {
    public static int smallestNum(int[] numbers){
        int smallest = Integer.MAX_VALUE;// + Infinity
        for (int i = 0; numbers.length > i; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static int largestNum(int[] numbers){
        int largest = Integer.MIN_VALUE;//- Infinity

        for (int i = 0; numbers.length > i; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8, 23, 16, 15};
        System.out.println("Largest number is " + largestNum(numbers));
        System.out.println("Smallest number is " + smallestNum(numbers));
    }
}
