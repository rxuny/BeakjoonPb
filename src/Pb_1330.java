import java.util.Scanner;

public class Pb_1330 {
    public static void main(String args[]) {
        Scanner compare = new Scanner(System.in);

        int A = compare.nextInt();
        int B = compare.nextInt();

        if (A > B) System.out.print(">");
        else if (A < B) System.out.print("<");
        else System.out.print("==");;
    }
}
// 두 수 비교하기.
