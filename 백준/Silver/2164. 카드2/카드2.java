import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int pow = 1;
        while (pow * 2 <= N) pow *= 2; // 2^k 찾기

        int lastCard;
        if (N == pow) {
            lastCard = N; // N이 2의 거듭제곱이면 그대로
        } else {
            lastCard = 2 * (N - pow);
        }

        System.out.println(lastCard);
    }
}
