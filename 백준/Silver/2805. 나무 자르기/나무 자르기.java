import java.io.*;
import java.util.*;
    
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = 0;
        
        int[] trees = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, trees[i]);
        }
        
        long left = 0, right = max;
        long answer = 0;
        
        while(left <= right){
            long H = (left + right)/2;
            long sum = 0;
            
            for(int tree: trees){
                if(tree > H){
                    sum += tree - H;
                }
            }
            if(sum >= M){
                answer = H;
                left = H + 1;
            } else {
                right = H - 1;
            }
        }
            
        System.out.println(answer);
    }
}