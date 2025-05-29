import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int row = 0;
        int col = 0;

        int[][] arr = new int[9][9];

        StringTokenizer st;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        if (max == 0) {
            row++;
            col++;
        }

        System.out.println(max);
        System.out.print(row + " " + col);
    }
}
// 9X9 크기의 격자판에 81개의 자연수 또는 0이 채워졌을 때 최댓값을 구하고 최댓값이 위치한 행과 열을 출력하기.
// 모두 0이 채워진 경우를 주의해야 함