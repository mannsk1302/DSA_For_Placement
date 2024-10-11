import java.util.Scanner;
public class InO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[20];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);

        marks[3] = 50;
        marks[4] = marks[4]+1;
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.length);
    }
}
