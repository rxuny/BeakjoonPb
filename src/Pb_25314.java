import java.util.Scanner;

public class Pb_25314 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 4의 배수인 정수 N이 주어짐
        for(int i = 0; i < N/4; i++) {
            System.out.print("long ");
        }
        sc.close();
        System.out.print("int");
    }
}
// 문제 기준 long int는 4바이트, long long int는 8바이트까지 저장한다고 가정
// 출력 시 long 다음에 공백이 하나씩 들어가야함