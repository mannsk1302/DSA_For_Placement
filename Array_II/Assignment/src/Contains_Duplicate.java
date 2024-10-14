public class Contains_Duplicate {
    public static int checker(int[] sample){
        for(int i = 0; i < sample.length; i++){
            for(int j = i + 1; j < sample.length; j++){
                if(sample[i] == sample[j]){
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] sample = {1, 2, 3, 1};
        System.out.println(checker(sample));
    }
}
