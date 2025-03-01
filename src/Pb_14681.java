import java.util.Scanner;

public class Pb_14681 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        short x = sc.nextShort();
        short y = sc.nextShort();

        if (x > 0 && y > 0) System.out.println("1");
        else if (x < 0 && y > 0) System.out.println("2");
        else if (x < 0 && y < 0) System.out.println("3");
        else System.out.println("4");
    }
}
// x,y 좌표가 그래프의 어느 사분면에 속하는지 구하기