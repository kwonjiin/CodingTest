import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] bucket = new int[n + 1];
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            for(int idx = start; idx <= end; idx++){
                bucket[idx] = num;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int idx = 1; idx <= n; idx++){
            sb.append(bucket[idx]).append(" ");
        }
        System.out.println(sb);
    }
}