public class Linear_Search {
    public static int linearSearch(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 4;
        int index = linearSearch(numbers, target);
        if (index == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index " + index);
        }
    }
}
