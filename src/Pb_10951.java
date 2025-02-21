import java.util.Scanner;

public class Pb_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) { // 입력값이 정수일 경우 true(계속 입력), 아니면 false(종료)
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }
}
// EOF(End Of File) : 입력에서 읽을 수 있는 데이터가 더 이상 존재하지 않을 때. 즉, 파일의 끝을 말함.
// Scanner에 읽을 데이터가 없으면 NoSuchElementException이라는 예외를 발생시켜 반복문 종료
// 백준에서는 더 이상 데이터를 보내지 않음으로 NoSuchElementException을 발생시킬 수 있지만,
// 사용자가 IDE나 터미널에서 입력할 때는 space나 enter를 입력해도 데이터로 인식해 예외가 발생되지 않음.
// 사용자 입장에서 위의 반복문을 종료하려면 정수가 아닌 다른 타입을 입력하는 식의 방법으로 예외를 던져줘야 함.
