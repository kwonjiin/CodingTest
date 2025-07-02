import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        
        Arrays.fill(arr, -1);
        
        String s = br.readLine();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }
        
        for(int i = 0; i< 26; i++){
            System.out.print(arr[i] + " ");
        }
                        
    }
}