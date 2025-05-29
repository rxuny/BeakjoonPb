import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Pb_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        int Palindrome = (str.equals(sb.toString())) ? 1 : 0;
        System.out.println(Palindrome);
    }
}
// 주어지는 단어가 팰린드롬(거꾸로 읽어도 똑같은 단어)인지 확인하기
// 자바 문자열 비교 equals() 메서드는 객체의 내용을 비교하여 같은지 확인함