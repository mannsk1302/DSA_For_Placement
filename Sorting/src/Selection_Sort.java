public class Selection_Sort {
    public static void selection(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            int minPosition = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[minPosition] > numbers[j]){
                    minPosition = j;
                }
            }
            int temp = numbers[minPosition];
            numbers[minPosition] = numbers[i];
            numbers[i] = temp;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] numbers = {5, 4, 1, 3, 2};
        selection(numbers);
    }
}
