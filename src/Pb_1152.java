import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S, " ");

        System.out.println(st.countTokens());
    }
}
// 영어 대소문자와 공백으로 구성된 문자열이 주어지면 그 문자열의 단어의 개수를 구하기