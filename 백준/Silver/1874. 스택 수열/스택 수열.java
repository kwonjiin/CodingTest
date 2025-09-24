import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        
        int[] stack = new int[n];
        int top = -1;
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean possible = true;
        
        for(int i=0;i<n;i++){
            int target = arr[i];
            
            while(num <= target){
                stack[++top] = num++;
                sb.append("+\n");
            }
            
            if(stack[top] == target){
                top--;
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }
        
        System.out.println(possible ? sb.toString() : "NO");
    }
}
