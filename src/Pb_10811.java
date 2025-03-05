import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백단위로 구분

        int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
        int[] box = new int[N];
        for (int i = 0; i < N; i++) {
            box[i] = i + 1; // 바구니에 1~N번까지 번호 매기기
        }

        int M = Integer.parseInt(st.nextToken()); // 바구니 순서 바꿀 횟수
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            while (left < right) { // 오른쪽 바구니 번호가 더 클때만 바꾸기
                int temp = box[left-1]; // 배열은 0번지부터니까 -1 해줌.
                box[left-1] = box[right-1];
                box[right-1] = temp;
                left++;
                right--;
            }
        }
        br.close();

        for (int i = 0; i < N; i++) {
            System.out.print(box[i] + " ");
        }
    }
}
// 바구니의 순서를 역순으로 만들어 왼쪽부터 출력.