import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> listener = new HashSet<>();
        
        for(int i = 1; i <= N; i++){
            listener.add(br.readLine());
        }
        
        ArrayList<String> result = new ArrayList<>();
        
        for(int i = 1; i <= M; i++){
            String view = br.readLine();
            if(listener.contains(view)){
                result.add(view);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(String s : result){
            System.out.println(s);
        }
    }
}