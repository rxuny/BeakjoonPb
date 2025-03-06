import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float max = -1;
        float sum = 0;

        int N = Integer.parseInt(br.readLine());
        float[] score = new float[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, score[i]);
        }

        for (int i = 0; i < N; i++) {
            sum += (score[i] / max) * 100;
        }
        br.close();
        System.out.print(sum/N);
    }
}
