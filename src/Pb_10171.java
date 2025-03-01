public class Pb_10171 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder(); // 가변 문자열 StringBuilder

        sb.append("\\    /\\\n"); // 역슬래시(\)를 출력하려면 두번 써줘야함
        sb.append(" )  ( ')\n");
        sb.append("(  /  )\n");
        sb.append(" \\(__)|");
        System.out.println(sb);

    }
}
