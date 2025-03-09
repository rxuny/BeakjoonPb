import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int N = 26;
        int[] location = new int[N]; // a~z 26개
        for(int i = 0; i < N; i++) location[i] = -1; // 미포함된 알파벳을 확인하기 위해 전체 -1로 초기화

        for(int i = 0; i < N; i++) { // a~z까지 반복
            char alphabet = (char) (i+'a'); // 알파벳의 아스키코드를 문자로 변환해서 문자형 변수에 저장
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == alphabet && location[i] == -1) { // alphabet이 단어에 포함되는지 확인
        // 같은 알파벳이 두번 포함된 경우, 첫 등장 위치가 저장된 이후엔 변동이 없게끔 location[i]가 -1인지 확인
                    location[i] = j;
                }
            }
        }
        br.close();
        for (int i = 0; i < N; i++) System.out.print(location[i] + " ");
    }
}
// 입력된 단어 S에 포함되는 알파벳을 찾고, 그 알파벳이 단어 S에 처음 등장하는 위치를 출력하기
// 단어 S의 첫 번째 글자는 0번째 위치임
// 알파벳이 단어에 포함되어 있지 않으면 -1을 출력