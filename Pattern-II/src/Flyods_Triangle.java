public class Flyods_Triangle {
    public static void flyodsTriangle(int n){
//        int n = 5;
        int counter = 1;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        flyodsTriangle(5);
    }
}
