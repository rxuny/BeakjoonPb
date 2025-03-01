import java.util.Scanner;

public class Pb_10810 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 바구니의 개수, 1~N번의 번호가 적힌 공
        int[] box = new int[N];

        int M = input.nextInt(); // M : 바구니에 공을 넣을 횟수
        for (int i = 0; i < M; i++) {
            int startNum = input.nextInt(); // start바구니부터 end바구니까지 공을 넣는다
            int endNum = input.nextInt();
            int ball = input.nextInt(); // ball : 공의 번호
            for (int j = startNum - 1; j < endNum; j++) { // 배열은 0번부터니까 시작번호에 1 뺴주기
                box[j] = ball;
            } // 바구니에 공이 들어있다면 그 공을 빼고 새로 넣는다.
        }
        for (int i = 0; i < N; i++) {
            System.out.print(box[i] + " ");
        }
        input.close();
    }
}
// 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백 구분해서 출력. 빈 바구니는 0 출력