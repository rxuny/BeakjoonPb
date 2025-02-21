import java.util.Scanner;

public class Pb_2525 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cook = sc.nextInt();
        sc.close();

        int totalMinute = 0;

        totalMinute = (hour * 60) + minute + cook;

        hour = totalMinute / 60;
        minute = totalMinute % 60;

        if (hour > 23) hour -= 24;

        System.out.print(hour + " " + minute);
    }
}
// 요리가 끝나는 시각 계산하기
