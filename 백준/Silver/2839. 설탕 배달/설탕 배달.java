import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = n/5; 

        for(int i = result; i >= 0; i--) {

            int mid = n-(5*result);
            if (mid%3 == 0) {
                System.out.println(result+(mid/3));
                break;
            }
            if(i == 0){
                System.out.println(-1);
                break;
            }
            result --;
        }

    }
}