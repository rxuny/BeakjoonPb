import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Pb_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char Ascii = S.charAt(0); // 입력받은 문자열을 문자로 변환

        br.close();
        System.out.println((int) Ascii); // 정수형으로 출력해서 문자에 대응되는 아스키 코드 값 출력

    }
}
// 알파벳 대/소문자, 숫자 0~9 중 하나가 주어지면 그 글자의 아스키 코드 값을 출력하기