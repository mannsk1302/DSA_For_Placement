public class Pass_By_Value {
    public static void update(int[] marks, int nonChangable){
        nonChangable = 10;
        for(int i = 0; i< marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args){
        int[] marks = {90,95,77,90,92,57};
        int nonChangable = 15;
        update(marks, nonChangable);

//      print our marks
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println(nonChangable);
    }
}
