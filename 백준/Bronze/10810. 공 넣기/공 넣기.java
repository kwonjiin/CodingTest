import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N + 1];

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            // Arrays.fill을 사용해 i~j까지 한 번에 채움
            Arrays.fill(bucket, start, end + 1, num);
        }

        StringBuilder sb = new StringBuilder();
        for (int idx = 1; idx <= N; idx++) {
            sb.append(bucket[idx]).append(" ");
        }
        System.out.print(sb);
    }
}