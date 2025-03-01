import java.util.Scanner;

public class Pb_10871 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];

        int X = input.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
// 정수 N개로 이루어진 수열에서 X보다 작은 수를 모두 출력하기