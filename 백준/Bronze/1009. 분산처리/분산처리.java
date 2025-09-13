import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            a %= 10; // 일의 자리만 필요

            if (a == 0) {
                sb.append(10).append("\n");
                continue;
            }

            // cycle 찾기
            int cur = a;
            int count = 1; // 반복 주기 길이
            while (true) {
                cur = (cur * a) % 10;
                if (cur == a) break;
                count++;
            }

            // b-1 인덱스 이용
            int exp = (b - 1) % count;
            cur = a;
            for (int i = 0; i < exp; i++) {
                cur = (cur * a) % 10;
            }

            sb.append(cur).append("\n");
        }

        System.out.print(sb);
    }
}
