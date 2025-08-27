import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();
            int count = 0;
            boolean isValid = true;

            for (char ch : str.toCharArray()) {
                if (ch == '(') count++;
                else count--;

                if (count < 0) { // 닫는 괄호가 먼저 나오면 실패
                    isValid = false;
                    break;
                }
            }

            if (count != 0) isValid = false;

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
