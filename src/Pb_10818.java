import java.util.Scanner;

public class Pb_10818 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.print(min + " " + max);
    }
}
