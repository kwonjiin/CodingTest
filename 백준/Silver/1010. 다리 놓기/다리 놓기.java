import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            sb.append(comb(m, n)).append("\n");
        }
        System.out.println(sb);
            
    }
    static long comb(int a, int b) {
        long result = 1;
        for(int i = 1; i <= b; i++) {
            result = result * (a - i + 1) / i;
        }
        return result;
    }
}
