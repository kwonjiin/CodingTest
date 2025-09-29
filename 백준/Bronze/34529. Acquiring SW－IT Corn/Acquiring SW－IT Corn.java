import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
        int U = sc.nextInt(), V = sc.nextInt(), W = sc.nextInt();

        int total = (U / 100) * X + (V / 50) * Y + (W / 20) * Z;
        System.out.println(total);
    }
}
