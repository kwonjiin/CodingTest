import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 할인율 (0 ~ 100)
        int M = sc.nextInt();  // M+1 할인 조건
        long S = sc.nextLong(); // 상품 가격

        // 1. 무인 할인 가격
        long unmanned = (long)(M + 1) * S * (100 - N) / 100;

        // 2. M+1 할인 가격
        long mplus1 = (long) M * S;

        // 3. 더 작은 값 출력
        System.out.println(Math.min(unmanned, mplus1));
    }
}
