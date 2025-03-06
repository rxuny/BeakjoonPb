import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        br.close();
        System.out.print(word.length()); // 문자열의 길이 구하기
    }
}
// 배열 길이를 구하는 length 뒤엔 괄호 안 쓰고, 문자열 길이 구할땐 쓴다.