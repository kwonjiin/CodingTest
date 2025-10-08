import java.io.*;

public class Main {
    // 문자열 s를 count번 반복해서 반환 (Java 8 호환)
    private static String repeat(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(repeat(" ", N - i));
            sb.append(repeat("*", 2 * i - 1)).append("\n");
        }

        for (int i = N - 1; i >= 1; i--) {
            sb.append(repeat(" ", N - i));
            sb.append(repeat("*", 2 * i - 1)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
