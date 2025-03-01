import java.util.Scanner;

public class Pb_10818 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];
        int max = -1000000; // -1,000,000보다 크거나 같고 1,000,000보다 작거나 같은 정수가 주어진다.
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) { // 두 값 비교해서 각각 큰값, 작은값 저장
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.print(min + " " + max);
    }
}
// 주어지는 N개의 정수 중에서 최솟값, 최댓값을 공백 구분해 출력하기