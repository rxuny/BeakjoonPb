import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine(); // 단어 S가 주어짐
        String[] arr = S.split("");
        int i = Integer.parseInt(br.readLine()); // 정수 i가 주어짐
        br.close();

        System.out.print(arr[i-1]); // S의 i번째 글자 출력. 배열은 0번지부터라 -1해줌.

    }
}
// charAt(n) 사용해서 문자열의 n번째 문자 출력하는 방법도 있음!