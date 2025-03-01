import java.util.Scanner;

public class Pb_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];
        int x = 1; // 테스트 케이스 번호는 1부터 시작

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }
            for (int j = 0; j < T; j++) {
                System.out.println("Case #" + x + ": " + arr[j]);
                x++;
            }
            sc.close();
        }
}
// 각 테스트 케이스마다 "Case #x: " 출력한 다음 a+b 출력