import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        float[] arr = new float[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++){
            arr[i] = (arr[i] / arr[n-1]) * 100;
        }
        
        float sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        
        System.out.println(sum / n);
    }
}