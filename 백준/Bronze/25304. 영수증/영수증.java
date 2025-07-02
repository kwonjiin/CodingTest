import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        int[] money = new int[n];
        int[] num = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            money[i] = Integer.parseInt(st.nextToken());
            num[i] = Integer.parseInt(st.nextToken());
            
            sum += money[i] * num[i];
        }
        
        if(sum == x){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}