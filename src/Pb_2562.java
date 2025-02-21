import java.util.Scanner;

public class Pb_2562 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[9];
        int max = -1;
        int location = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
                location = i;
            }
        }
        System.out.println(max);
        System.out.print(location + 1);
    }
}
// 주어진 수 중 최댓값을 찾고 그 값이 몇 번째 수인지 구하기
