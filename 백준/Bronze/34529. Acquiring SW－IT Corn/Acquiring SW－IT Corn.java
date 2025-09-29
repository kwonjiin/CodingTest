import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); // A사 100g 가격
        int Y = sc.nextInt(); // B사 50g 가격
        int Z = sc.nextInt(); // C사 20g 가격

        int U = sc.nextInt(); // A사 구매량 (g)
        int V = sc.nextInt(); // B사 구매량 (g)
        int W = sc.nextInt(); // C사 구매량 (g)

        int costA = (U / 100) * X;
        int costB = (V / 50) * Y;
        int costC = (W / 20) * Z;

        int total = costA + costB + costC;

        System.out.println(total);
    }
}
