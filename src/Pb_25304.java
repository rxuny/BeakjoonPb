import java.util.Scanner;

public class Pb_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        int T = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a * b;
        }
        for (int j = 0; j < N; j++) {
            T += arr[j];
        }
        sc.close();

        if (T == X) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
