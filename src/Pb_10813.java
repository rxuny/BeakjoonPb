import java.util.Scanner;

public class Pb_10813 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 바구니 갯수
        int[] box = new int[N];
        for (int i = 0; i < N; i++) {
            box[i] = i + 1; // 처음에 바구니 번호와 동일한 번호의 공이 들어있음
        }

        int M = input.nextInt(); // 공을 바꿀 횟수
        for (int i = 0; i < M; i++) {
            int startNum = input.nextInt();
            int endNum = input.nextInt();
            int temp;

            temp = box[startNum-1]; // 두 바구니의 공을 서로 교환
            box[startNum-1] = box[endNum-1];
            box[endNum-1] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(box[i] + " ");
        }
        input.close();
    }
}
// M번만큼 공을 바꾼 후 각 바구니에 어떤 공이 들어있는지