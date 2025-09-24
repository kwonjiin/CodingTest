import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean possible = true;
        
        for(int i=0;i<n;i++){
            int target = arr[i];
            
            while(num <= target){
                stack.push(num++);
                sb.append("+\n");
            }
            
            if(stack.peek() == target){
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }
        
        System.out.println(possible ? sb.toString() : "NO");
    }
}
