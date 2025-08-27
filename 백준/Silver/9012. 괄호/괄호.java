import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        while (T-- > 0) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char ch : str.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch); // 열린 괄호 추가
                } else { // ')'
                    if (stack.isEmpty()) {
                        isValid = false; // 닫을 괄호가 없음
                        break;
                    }
                    stack.pop(); // 짝 맞춰 제거
                }
            }

            if (!stack.isEmpty()) isValid = false; // 다 닫히지 않음

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
