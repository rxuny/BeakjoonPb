import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase();

        int[] alphabet = new int[26];
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 65]++;
        }

        int count = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > alphabet[max]) {
                count = 0;
                max = i;
            }
            if (alphabet[i] == alphabet[max]) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("?");
        } else {
            char result = (char)('A'+ max);
            System.out.println(result);
        }
    }
}
// 대소문자 구분 없이 주어진 문자열에서 가장 많이 사용된 알파벳을 출력하기
// 가장 많이 사용된 알파벳이 여러개일 경우 ?를 출력하기