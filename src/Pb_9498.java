import java.util.Scanner;

public class Pb_9498 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        byte grade = sc.nextByte();

        if (grade >= 90) System.out.println("A");
        else if (grade >= 80) System.out.println("B");
        else if (grade >=70) System.out.println("C");
        else if (grade >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
