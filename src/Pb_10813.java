import java.util.Scanner;

public class Pb_10813 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] box = new int[N];
        for (int i = 0; i < N; i++) {
            box[i] = i + 1;
        }

        int M = input.nextInt();
        for (int i = 0; i < M; i++) {
            int startNum = input.nextInt();
            int endNum = input.nextInt();
            int temp;

            temp = box[startNum-1];
            box[startNum-1] = box[endNum-1];
            box[endNum-1] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(box[i] + " ");
        }
        input.close();
    }
}
