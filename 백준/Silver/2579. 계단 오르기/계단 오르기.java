import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stair = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(stair[1]);
            return;
        } else if (N == 2) {
            System.out.println(stair[1] + stair[2]);
            return;
        }

        int prev3 = stair[1];
        int prev2 = stair[1] + stair[2];
        int prev1 = Math.max(stair[1] + stair[3], stair[2] + stair[3]);

        if (N == 3) {
            System.out.println(prev1);
            return;
        }

        for (int i = 4; i <= N; i++) {
            int current = Math.max(prev2 + stair[i], prev3 + stair[i - 1] + stair[i]);
            prev3 = prev2;
            prev2 = prev1;
            prev1 = current;
        }

        System.out.println(prev1);
    }
}
