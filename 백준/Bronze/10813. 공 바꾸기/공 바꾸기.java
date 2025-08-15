import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];

        for(int i = 1; i < n+1; i++){
            arr[i] = i;
        }


        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
