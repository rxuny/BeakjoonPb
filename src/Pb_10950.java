import java.util.Scanner;

public class Pb_10950 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수
        int[] sum = new int[T];

        for(int i = 0; i < T; i++) {
             int A = sc.nextInt();
             int B = sc.nextInt();
             sum[i] = A + B;
        }
        sc.close();

        for(int j = 0; j < T; j++) System.out.println(sum[j]);
    }
}
// 각 테스트 케이스마다 A+B 출력