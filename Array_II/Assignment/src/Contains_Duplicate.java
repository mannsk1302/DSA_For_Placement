public class Contains_Duplicate {
    public static int checker(int[] sample){
        for(int i = 0; i < sample.length; i++){
            if(i == i + 1){
                return 1;
            }else if(sample[i] != sample[i+1]){
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] sample = {1, 2, 3, 1};
        System.out.println(checker(sample));
    }
}
