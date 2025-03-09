import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pb_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder(); // 가변 문자열
        for(int i = 0; i < T; i++) {
            String word = br.readLine();
            sb.append(word.charAt(0)); // append : 문자열 추가하기
            sb.append(word.charAt((word.length()-1))).append("\n");
            // 첫글자, 마지막 글자 추가하고 \n으로 개행(줄바꿈)해주기
        }
        br.close();
        System.out.print(sb);
    }
}
// T 개수만큼 문자열 입력받고 각 문자열의 첫 글자와 마지막 글자를 출력하기