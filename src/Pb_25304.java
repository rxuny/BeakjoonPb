import java.util.Scanner;

public class Pb_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // 영수증에 적힌 총 금액
        int N = sc.nextInt(); // 구매한 물건의 종류의 수
        int[] arr = new int[N];
        int Total = 0; // 구매한 물건의 총 금액

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); // 물건 가격
            int b = sc.nextInt(); // 물건 개수
            arr[i] = a * b;
        }
        for (int j = 0; j < N; j++) {
            Total += arr[j];
        }
        sc.close();

        if (Total == X) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
// 구매한 물건의 총 금액 Total과 영수증의 총 금액 X가 일치하면 Yes. 불일치면 No