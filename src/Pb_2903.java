import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int point = 2;
        int count = 1;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            point += count;
            count = count * 2;
        }
        System.out.println(point * point);
    }
}
