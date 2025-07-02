import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        
        int[] arr = new int[31];
        
        for (int i = 1; i <= 28; i++){
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        
        for(int i = 1; i <= 30; i++){
            if(arr[i] == 0){
                st.append(i).append("\n");
            }
        }
        br.close();
        System.out.println(st);
    }
}