import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int g = gcd(A, B);
        int l = (A * B) / g;

        System.out.println(g);
        System.out.println(l);
    }
}
