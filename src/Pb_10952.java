import java.util.Scanner;

public class Pb_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }
        sc.close();
    }
}
// 정수 a,b 입력 계속 받다가 0 두개 입력하면 반복문 빠져나와서 a+b 출력