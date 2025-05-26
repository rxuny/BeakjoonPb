import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < N-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < N-i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 다이아몬드모양 별찍기
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */
// 첫째 줄부터 2xN-1번째 줄까지 차례대로 별 출력
/* ex) 입력받는 N이 5일 경우에 총 9번째 줄까지 출력되고
1~5번째 줄은 공백이 43210, 별은 13579 순으로 출력되는데 별은 12345 / 01234 이런 식으로 출력을 나눠서 해줘야 함
밑에 감소하는 부분은 공백이 1234, 별은 7531 순으로 출력되고 별은 4321 / 3210으로 나눠서 출력
 */