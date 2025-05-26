import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        StringTokenizer st = new StringTokenizer(S);
        StringBuilder sb = new StringBuilder();

        int[] arr = {1, 1, 2, 2, 2, 8};

        for(int i = 0; i < arr.length; i++) {
            int piece = Integer.parseInt(st.nextToken());
            sb.append(arr[i]-piece + " ");
        }
        System.out.print(sb);
    }
}
// 체스 흰색 피스의 개수가 주어졌을 때 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하기
// 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개 총 16개의 전체 피스에서 입력받는 수만큼 빼주면 됨