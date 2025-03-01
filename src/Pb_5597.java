import java.util.Scanner;

public class Pb_5597 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] attendance = new int[30];
        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = i + 1;
        }
        for (int i = 0; i < 28; i++) {
            int stdNum = input.nextInt();
            attendance[stdNum - 1] = 0; // 과제 낸 학생의 번호 표시
        }
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] != 0) {
                System.out.println(attendance[i]);
            }
        }
        input.close();
    }
}
// 학생이 30명인 교실에서 28명이 과제를 낸 상황. 안 낸 두명의 출석번호 구하기
// attendance 출석
