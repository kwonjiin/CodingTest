import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[3];
        
        String[] str = br.readLine().split(" ");
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        
        if(arr[0] == arr[1] && arr[1] == arr[2]){
            System.out.println(10000 + arr[1] * 1000);
        } else if (arr[0] == arr[1] || arr[1] == arr[2]){
            System.out.println(1000 + arr[1] * 100);
        } else {
            System.out.println(arr[2] * 100);
        }
    }
}