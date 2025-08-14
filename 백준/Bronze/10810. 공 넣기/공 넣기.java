import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N + 1];

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // Arrays.fill을 사용해 i~j까지 한 번에 채움
            Arrays.fill(basket, i, j + 1, k);
        }

        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= N; idx++) {
            sb.append(basket[idx]).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
