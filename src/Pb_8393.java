import java.util.Scanner;

public class Pb_8393 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        sc.close();
        System.out.println(result);
    }
}
// 1부터 n까지의 합 구하기