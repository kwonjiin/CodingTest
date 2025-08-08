import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<Integer, String> numToName = new HashMap<>();
        HashMap<String, Integer> nameToNum = new HashMap<>();
        
        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            numToName.put(i, name);
            nameToNum.put(name, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= M; i++){
            String s = br.readLine();
            if(49<= s.charAt(0)&& s.charAt(0)<= 57){
                sb.append(numToName.get(Integer.parseInt(s))).append("\n");
            } else {
                sb.append(nameToNum.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}