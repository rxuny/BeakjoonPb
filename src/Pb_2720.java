import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int a;
        int b;
        int c;
        int d;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            a = change / quarter;
            b = (change % quarter) / dime;
            c = ((change % quarter) % dime) / nickel;
            d = (change % nickel) / penny;
            if (change % quarter == 0) {
                b = c = d = 0;
                System.out.print(a + " " + b + " " + c + " " + d);
            } else {
                System.out.print(a + " " + b + " " + c + " " + d);
            }
            System.out.println();
        }
    }
}
