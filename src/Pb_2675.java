import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for(int j = 0; j <S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
// 문자열을 입력받고 각 문자를 R번 반복해서 새 문자열을 만들어 출력하기