import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String line = br.readLine();
            if (line.equals(".")) break; // 종료 조건
            
            Deque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;
            
            for (char ch : line.toCharArray()) {
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                } else if (ch == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if (!stack.isEmpty()) isBalanced = false;
            sb.append(isBalanced ? "yes\n" : "no\n");
        }
        
        System.out.print(sb);
    }
}
