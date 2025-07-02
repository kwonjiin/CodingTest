import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N/4; i++){
            st = new StringTokenizer("long");
            bw.write(st.nextToken() + " ");
        }
        bw.write("int");
        
        br.close();
        bw.flush();
        bw.close();
    }
}