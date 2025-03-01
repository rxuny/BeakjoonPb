import java.util.Scanner;

public class Pb_2588 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int temp1 = num2 % 10;
        int temp2 = (num2 % 100) / 10;
        int temp3 = num2 / 100;

        temp1 = num1 * temp1;
        temp2 = num1 * temp2;
        temp3 = num1 * temp3;

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.print(temp1 + (temp2 * 10) + (temp3 * 100));

    }
}
// 세 자리 수끼리 곱하는 과정과 그 결과 구하기
// num2의 수를 1의자리, 10의자리, 100의자리 수로 나눠서 num1과 계산