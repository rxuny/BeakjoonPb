import java.util.Scanner;

public class Pb_2884 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45)
        {
            H--;
            M = M -45 + 60;
            if (H < 0) H = 23;
            System.out.print(H + " " + M);
        }
        else System.out.print(H + " " + (M - 45));
    }
}
// 설정한 알람 시각보다 45분 일찍 설정할 때 시각 계산하기