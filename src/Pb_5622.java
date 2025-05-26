import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = 0;

        int[] arr = new int[26];
        arr[0] = arr[1] = arr[2] = 3;
        arr[3] = arr[4] = arr[5] = 4;
        arr[6] = arr[7] = arr[8] = 5;
        arr[9] = arr[10] = arr[11] = 6;
        arr[12] = arr[13] = arr[14] = 7;
        arr[15] = arr[16] = arr[17] = arr[18] = 8;
        arr[19] = arr[20] = arr[21] = 9;
        arr[22] = arr[23] = arr[24] = arr[25] = 10;

        String S = br.readLine();

        for(int i = 0; i<S.length(); i++) {
            char c = S.charAt(i);
            time += arr[(int)c - 65];
        }
        System.out.print(time);
    }
}
// 다이얼 전화기. 숫자 1을 걸려면 총 2초가 필요하고 그보다 더 큰 수는 1초씩 더 걸린다.
// 알파벳 대문자로 이루어진 단어가 주어졌을 때 전화를 걸기 위해서 최소 몇 초가 걸리는지 구하기
// A~Z까지 26개의 배열을 만들고 알파벳마다 걸리는 시간을 저장
// 입력된 문자열의 한 글자씩 c에 저장해서 arr[(int)c -65]를 해주면 그 알파벳은 전화를 거는데 몇 초 걸리는지 알 수 있음