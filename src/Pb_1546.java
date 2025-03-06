import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float max = -1;
        float sum = 0;  // 출력값이 실수여서 실수형 변수 선언. 정수형으로 계산하면 결과 다르게 나옴

        int N = Integer.parseInt(br.readLine()); // 과목 수 입력
        float[] score = new float[N]; // 과목별 점수를 배열에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, score[i]); // 가장 높은 점수를 max값에 저장
        }

        for (int i = 0; i < N; i++) {
            sum += (score[i] / max) * 100;
        }
        br.close();
        System.out.print(sum/N); // 평균 구하기
    }
}
