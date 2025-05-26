import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        StringBuilder builder = new StringBuilder(S);
        builder.reverse();

        StringTokenizer tokenizer = new StringTokenizer(builder.toString(), " ");
        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());

        if(A > B) {
            System.out.print(A);
        } else {
            System.out.print(B);
        }
    }
}
// 두 수가 주어졌을 때 그 수를 거꾸로 뒤집은 수를 비교해서 더 큰 수를 출력하기