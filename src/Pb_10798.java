import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[5][15]; // 5개의 단어를 만드는데, 한 줄의 단어는 최대 15글자로 이루어진다.

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                board[i][j] = s.charAt(j); // 한줄로 입력받은 문자열을 한 글자씩 char배열에 넣기
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] != 0) {
                    System.out.print(board[j][i]);
                }
            }
        }
    }
}
