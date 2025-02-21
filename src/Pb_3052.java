import java.util.Scanner;

// A를 B로 나눈 몫이 C이고 나머지가 R이면 A = BC + R 이라는 식이 성립함
// 1을 42로 나눈 몫 0, 나머지 1 -> 1 = (42 * 0) + 1
// 어떤 자연수를 42로 나누었을 때 나올 수 있는 나머지는 0부터 41까지임
public class Pb_3052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        boolean[] remain = new boolean[42]; // boolean형 배열을 처음 선언하면 자동으로 false로 채워짐

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt()%42;
            if (!remain[num]) { // remain[num] == false 와 같은 의미임
                remain[num] = true; // num번째 방이 false면(새로운 나머지가 들어오면) true로 바꿔주고 count 1 증가
                count++;
            }
        }

        input.close();
        System.out.println(count);
    }
}
