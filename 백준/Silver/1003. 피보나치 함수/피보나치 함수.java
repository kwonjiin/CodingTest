import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] zero = new int[41]; // n 최대 40
        int[] one = new int[41];

        // 초기값
        zero[0] = 1; one[0] = 0;
        zero[1] = 0; one[1] = 1;

        // 점화식 계산
        for (int i = 2; i <= 40; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }

        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println(zero[n] + " " + one[n]);
        }
    }
}
