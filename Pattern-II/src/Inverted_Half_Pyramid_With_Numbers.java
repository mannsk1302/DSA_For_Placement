public class Inverted_Half_Pyramid_With_Numbers {
    public static void inverted_h_p_Num(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_h_p_Num(5);
    }
}