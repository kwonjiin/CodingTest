import java.io.*;

public class Main {
    static int[] stair, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        stair = new int[N + 1];
        dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
            dp[i] = -1;
        }

        System.out.println(solve(N));
    }

    static int solve(int n) {
        if (n == 1) return stair[1];
        if (n == 2) return stair[1] + stair[2];
        if (n == 3) return Math.max(stair[1] + stair[3], stair[2] + stair[3]);

        if (dp[n] != -1) return dp[n];

        dp[n] = Math.max(solve(n - 2) + stair[n], solve(n - 3) + stair[n - 1] + stair[n]);
        return dp[n];
    }
}
