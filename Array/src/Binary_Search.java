public class Binary_Search {
    public static int binarySearch(int numbers[], int keys){
        int start = 0, end = numbers.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == keys){
                return mid;
            }
            if(numbers[mid] < keys){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int keys = 9;
        
        System.out.println("Index for number is :" + binarySearch(numbers, keys));
    }
}
