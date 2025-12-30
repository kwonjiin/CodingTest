import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        if(n < 6){
            System.out.println("Oh My God!");
        } else {
            System.out.println("Success!");
        }
    }
}