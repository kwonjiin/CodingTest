import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0;i<K;i++){
            int num = sc.nextInt();
            if(num == 0){
                stack.pollLast(); // 최근 값 제거
            } else {
                stack.addLast(num);
            }
        }
        
        long sum = 0;
        for(int val : stack){
            sum += val;
        }
        System.out.println(sum);
    }
}
