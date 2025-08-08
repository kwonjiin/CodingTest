import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
 //       첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

//예제 입력 1 
//11
//1 4 1 2 4 2 4 2 3 4 4
//2
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        
        int count = 0;
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            if (arr[i] == v){
                count ++;
            }
        }
        System.out.println(count);
    }
}