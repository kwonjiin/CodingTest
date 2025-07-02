import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String isbn = br.readLine();
        int index = isbn.indexOf("*");
        int sum = 0;
        
        for (int i = 0; i < 13; i++){
            if(i == index){
                continue;
            } else if(i % 2 == 0){
                sum += isbn.charAt(i) - '0';
            } else {
                sum += (isbn.charAt(i) - '0') * 3;
            }
        }
        for(int i = 0; i < 10; i ++){
            if (index % 2 == 0){
                if ((sum + i)%10 == 0){
                    System.out.println(i);
                } 
            } else {
                if ((sum + i * 3) % 10 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}