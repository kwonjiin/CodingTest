import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[] stack = new int[K];
        int top = -1;
        
        for(int i=0;i<K;i++){
            int num = sc.nextInt();
            if(num == 0){
                top--; // 최근 값 제거
            } else {
                stack[++top] = num;
            }
        }
        
        long sum = 0; // 값 합이 클 수 있으므로 long
        for(int i=0;i<=top;i++){
            sum += stack[i];
        }
        System.out.println(sum);
    }
}
