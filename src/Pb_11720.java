import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        int N = Integer.parseInt(br.readLine()); // 숫자의 개수
        String[] arr = br.readLine().split(""); // N개의 숫자가 공백 없이 입력됨
        for (int i = 0; i < N; i++) {
            sum += (arr[i].charAt(0)) - '0';
            // 문자열의 i번째 문자에 '0'(48)을 빼주면 해당 문자의 정수값이 나오고, sum에 더해줌
        }
        br.close();
        System.out.println(sum);
    }
}
// 숫자 N개의 합을 출력하기. 정수를 문자열로 입력받는 문제