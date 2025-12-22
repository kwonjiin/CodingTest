import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long U = Long.parseLong(st.nextToken());
        long O = Long.parseLong(st.nextToken());
        long S = Long.parseLong(st.nextToken());

        // 최적 교환 횟수
        long x = 0;
        if (U > S) {
            x = Math.min((U - S) / 3, U / 2);
        }

        long finalU = U - 2 * x;
        long finalS = S + x;

        long answer = Math.min(O, Math.min(finalU, finalS));
        System.out.println(answer);
    }
}
