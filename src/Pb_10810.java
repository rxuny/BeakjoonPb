import java.util.Scanner;

public class Pb_10810 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] box = new int[N];

        int M = input.nextInt();
        for (int i = 0; i < M; i++) {
            int startNum = input.nextInt();
            int endNum = input.nextInt();
            int ball = input.nextInt();
            for (int j = startNum - 1; j < endNum; j++) {
                box[j] = ball;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(box[i] + " ");
        }
        input.close();
    }
}
