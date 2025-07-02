import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        String[] str = br.readLine().split(" ");
        Double[] arr = new Double[N];
            
        for (int i = 0; i< N; i++){
            arr[i] = Double.parseDouble(str[i]);
        }
        
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        System.out.println(sum / arr[N-1] * 100 / N);
    }
}