import java.io.*;
import java.util.StringTokenizer;

public class Pb_15552 { // readLine 사용 시 예외처리 해줘야 함.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // BufferedReader로 정수 입력 받기
        // readLine은 return값이 String이라 다른 타입 받으려면 형 변환 필요

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write((A + B) + "\n");
            // println과 달리 개행 기능이 없어서 \n 따로 써줘야 함
        }
        br.close();
        bw.flush(); // 남아있는 데이터 모두 출력
        bw.close(); // 스트림 닫기
    }
}
// a+b를 빠르게 출력해야 함. Scanner, System.out.println 대신 BufferedReader, BufferedWriter 사용하기
// readLine으로 읽은 데이터를 공백단위로 구분 : StringTokenizer의 nextToken
// 또는 String.split()함수로 구분해 배열에 저장